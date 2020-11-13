package me.mrbluesky.todolist.code.model

import javax.persistence.*

@Entity
@Table(name = "CODE")
data class Code(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        var id: Int,

        @Column(name = "cd_grp")
        var cdGrp: String,

        @Column(name = "cd_key")
        var cdKey: String,

        @Column(name = "cd_val")
        var cdVal: String
){
}