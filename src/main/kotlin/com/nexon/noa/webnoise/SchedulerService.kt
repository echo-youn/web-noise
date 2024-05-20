package com.nexon.noa.webnoise

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service

@Service
class SchedulerService(
    private val workerService: WorkerService
) {
    @Scheduled(fixedDelay = 20000, initialDelay = 2000)
    fun tesT() {
        workerService.test()
    }
}
