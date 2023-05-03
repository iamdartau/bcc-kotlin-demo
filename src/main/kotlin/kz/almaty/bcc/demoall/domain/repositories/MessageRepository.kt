package kz.almaty.bcc.demoall.domain.repositories

import kz.almaty.bcc.demoall.domain.entities.Message
import org.springframework.data.repository.CrudRepository

/**
 * github iamdartau
 */
/**
 * interface MessageRepository нужен для взаимодействия с БД и сущностью Message,
 * Long указывается в качестве типа Id у Message
 * */
interface MessageRepository : CrudRepository<Message, Long> {
}