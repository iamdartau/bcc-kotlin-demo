package kz.almaty.bcc.demoall.domain.services

import jakarta.persistence.EntityNotFoundException
import kz.almaty.bcc.demoall.domain.entities.BaseEntity
import org.hibernate.service.spi.ServiceException
import org.springframework.dao.DataIntegrityViolationException
import java.io.Serializable

/**
 * github iamdartau
 */
/**
 * Данный код представляет собой определение интерфейса BaseService,
 * который определяет методы для работы с сущностями (объектами), наследующими класс BaseEntity.
 *
 * В данном коде также используется аннотация @Throws, которая указывает,
 * что метод может генерировать исключения типа ServiceException, EntityNotFoundException и DataIntegrityViolationException.
 * Это означает, что при вызове методов интерфейса, вызывающий код должен обрабатывать эти исключения.
 *
 * <E : BaseEntity> является обобщением (generics) и определяет параметризованный тип (parameterized type) E,
 * который наследует класс BaseEntity. Таким образом, тип E может быть любым классом, который наследует BaseEntity
 * */
interface BaseService <E : BaseEntity> : Serializable {

    @Throws(ServiceException::class)
    fun create(entity: E): E

    @Throws(ServiceException::class)
    fun update(id: Long, entity: E): E

    @Throws(EntityNotFoundException::class)
    fun findById(id: Long): E

    @Throws(ServiceException::class)
    fun findAll(): List<E>

    @Throws(EntityNotFoundException::class, DataIntegrityViolationException::class)
    fun deleteById(id: Long)
}