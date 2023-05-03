package kz.almaty.bcc.demoall.domain.services

import jakarta.persistence.EntityNotFoundException
import kz.almaty.bcc.demoall.domain.entities.Message
import kz.almaty.bcc.demoall.domain.repositories.MessageRepository
import org.hibernate.service.spi.ServiceException
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.dao.DataIntegrityViolationException
import org.springframework.stereotype.Service

/**
 * github iamdartau
 * Когда мы используем @Autowired над конструктором класса, мы говорим Spring Framework,
 * что нужно автоматически связать параметры конструктора с подходящими зависимостями
 *
 * помечен аннотацией @Autowired в конструкторе, что говорит Spring автоматически связать бин типа MessageRepository с классом.
 * Это делает экземпляр MessageRepository доступным для класса MessageServiceImpl через поле repository.
 *
 * Этот код определяет класс с именем `MessageServiceImpl`, который реализует интерфейс `MessageService`.
 * Класс помечен аннотацией `@Service`, которая является аннотацией фреймворка Spring, указывающей,
 * что этот класс является сервисным компонентом.
 */
@Service
class MessageServiceImpl @Autowired constructor(
    private val repository: MessageRepository
) : MessageService {

    /**
     * companion object - это объект, объявленный внутри класса, который может использоваться для определения методов
     * и свойств, которые могут быть вызваны на классе, а не на его экземплярах.
     * */

    companion object {
        const val MESSAGE_NOT_FOUND = "There is no member found with id: "
    }

    private val log: Logger = LoggerFactory.getLogger(this.javaClass)

    override fun create(entity: Message): Message {
        try {
            return repository.save(entity)
        } catch (e: Exception) {
            log.error("Error persisting a new Message: {}", e.message, e)
            throw ServiceException("Error persisting a new Message", e)
        }
    }

    override fun update(id: Long, entity: Message): Message {
        try {
            val persistedEntity = repository.findById(id).orElseThrow { EntityNotFoundException(MESSAGE_NOT_FOUND + id) }
            updateFields(persistedEntity, entity)
            persistedEntity.id = id
            return repository.save(persistedEntity);
        } catch (e: Exception) {
            log.error("Error updating a Message: {}", e.message, e)
            throw ServiceException("Error updating a Message", e)
        }
    }

    override fun findById(id: Long): Message {
        return repository.findById(id).orElseThrow { EntityNotFoundException(MESSAGE_NOT_FOUND + id) }
    }

    override fun findAll(): List<Message> {
        try {
            val messages = repository.findAll()
            return messages.toList();
        } catch (e: Exception) {
            log.error("Error retrieving all existing messages: {}", e.message, e)
            throw ServiceException("Error retrieving all existing messages", e)
        }
    }

    override fun deleteById(id: Long) {
        repository.findById(id).orElseThrow { EntityNotFoundException(MESSAGE_NOT_FOUND + id) }
        try {
            repository.deleteById(id)
        } catch (e: DataIntegrityViolationException) {
            log.error("Error deleting Message with id: " + id + " - " + e.message, e)
        }
    }

    private fun updateFields(persistedEntity: Message, newEntity: Message) {
        persistedEntity.message = newEntity.message
    }
}