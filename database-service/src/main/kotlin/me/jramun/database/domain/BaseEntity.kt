package me.jramun.database.domain

import javax.persistence.*

@MappedSuperclass
abstract class BaseEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

}