package kz.almaty.bcc.demoall.domain.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table

/**
 * github iamdartau
 */
/**
 * @Entity для обозначения класса как сущности базы данных
 * @Table для управления созданием и маппингом таблицы.
 * */
@Entity
@Table(name = "message")
class Message :BaseEntity() {

    @Column(name = "message")
    var message: String? = null
}