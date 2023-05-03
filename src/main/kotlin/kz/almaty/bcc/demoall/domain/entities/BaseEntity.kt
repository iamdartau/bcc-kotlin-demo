package kz.almaty.bcc.demoall.domain.entities

import jakarta.persistence.*
import java.time.LocalDateTime

/**
 * github iamdartau
 */
/**
 * @MappedSuperclass является базовым классом для других сущностей и не представляет собой конкретную таблицу в базе данных
 * open позволяет наследоваться от класса
 * Serializable - интерфейс маркер для jvm, указывает, что класс возможно сериализировать, нужно для ORM
 */
@MappedSuperclass
open class BaseEntity:java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, insertable = false)
    var id: Long? = null

    @Column(name = "created_at", updatable = false)
    var createdAt: LocalDateTime? = null

    /**
     * Аннотация @PrePersist указывает на то, что данный метод должен быть вызван перед сохранением объекта в базу данных
     *
     * Метод prePersist() устанавливает значение поля createdAt на текущее время в виде объекта класса LocalDateTime,
     * если оно ранее не было установлено.
     * Это позволяет автоматически заполнять данное поле при сохранении новых объектов в базу данных.
     * */

    @PrePersist
    protected fun prePersist() {
        if (createdAt == null) createdAt = LocalDateTime.now()
    }
}