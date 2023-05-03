package kz.almaty.bcc.demoall.domain.services

import kz.almaty.bcc.demoall.domain.entities.Message

/**
 * github iamdartau
 */

/**
 * Интерфейс с именем MessageService расширяет (extends) интерфейс BaseService
 * и указывает, что тип сущности, на которой он оперирует, является Message.
 * */

interface MessageService : BaseService<Message> {
}
