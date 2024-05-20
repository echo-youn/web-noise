package com.nexon.noa.webnoise

import org.springframework.data.jpa.repository.JpaRepository

interface SampleRepository: JpaRepository<SampleTable, Long> {
    fun findAllByIdIsIn(ids: Collection<Long>): List<SampleTable>
}
