package kz.almaty.bcc.demoall.contrlooer

import kz.almaty.bcc.demoall.domain.entities.Message
import kz.almaty.bcc.demoall.domain.services.MessageService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 * github iamdartau
 * Аннотации @RestController и @RequestMapping указывают, что это REST-контроллер и что все URL его конечных точек
 * будут иметь префикс /api/messages.
 *
 * MessageService, помеченный аннотацией @Autowired, что означает,
 * что он будет автоматически создан spring для внедрения.
 */
@RestController
@RequestMapping("api/messages")
class MessageController
@Autowired constructor(private val messageService: MessageService)
{

    @GetMapping
    fun findAll(): List<Message> {
        return messageService.findAll()
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): Message {
        return messageService.findById(id)
    }

    @PostMapping
    fun create(@RequestBody message: Message): Message {
        return messageService.create(message)
    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody message: Message): Message {
        return messageService.update(id, message)
    }

    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable id: Long) {
        messageService.deleteById(id)
    }
}