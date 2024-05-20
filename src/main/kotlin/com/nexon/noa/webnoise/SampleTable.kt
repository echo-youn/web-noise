package com.nexon.noa.webnoise

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity(name = "SampleTable")
data class SampleTable(
    val name: String,
    @Id
    val id: Long = 0,
)
