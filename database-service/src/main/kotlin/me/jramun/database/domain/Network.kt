package me.jramun.database.domain

import javax.persistence.Basic
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table
class Network : BaseEntity() {

    @Basic
    @Column
    var name: String? = null
}