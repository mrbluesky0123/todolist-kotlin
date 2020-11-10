package me.mrbluesky.todolist.todo.model

import org.springframework.format.annotation.DateTimeFormat
import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name="TODO")
data class Todo(
        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        @Column(name="id")
        var id: Int,
        @Column(name="pgm_sts")
        var pgmSts: String,

        @Column(name="reg_dt")
        var regDt: LocalDate,

        @Column(name="regr_id")
        var regrId: String,

        @Column(name="pgm_part")
        var pgmPart: String,

        @Column(name="pgm_id")
        var pgmId: String,

        @Column(name="pgm_nm")
        var pgmNm: String,

        @Column(name="pgm_hnm")
        var pgmHnm: String,

        @Column(name="dvlpr_id")
        var dvlprId: String,

        @Column(name="sprvsr_dscrptn", columnDefinition = "TEXT")
        var sprvsrDscrptn: String,

        @Column(name="dvlpr_dscrptn", columnDefinition = "TEXT")
        var dvlprDscrptn: String,

        @Column(name="actn_req_dy")
        @DateTimeFormat(pattern = "yyyy-MM-dd")
        var actnReqDy: LocalDate,

        @Column(name="actn_psb_dy")
        @DateTimeFormat(pattern = "yyyy-MM-dd")
        var actnPsbDy: LocalDate,

        @Column(name="actn_cmpl_dy")
        @DateTimeFormat(pattern = "yyyy-MM-dd")
        var actnCmplDy: LocalDate

)