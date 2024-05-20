package com.nexon.noa.webnoise

import io.ktor.client.*
import io.ktor.client.request.*
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.elasticsearch.ElasticsearchProperties.Restclient
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.stereotype.Service
import kotlin.math.log

@Service
class WorkerService(
    private val ktor: HttpClient,
    private val sampleRepository: SampleRepository
) {
    val logger = LoggerFactory.getLogger(this::class.java)
    fun test() {
//        val start = System.currentTimeMillis()
//        runBlocking(IO) {
//            repeat(100) {
//                launch {
//                    val a =  sampleRepository.findAllByIdIsIn(listOf(1,2,3,4,5,6,7,8,9,10,11))
//                    logger.info("$a")
//                }
//            }
//        }
//        val end = System.currentTimeMillis() - start
//        logger.info("et: $end")
//        Thread.sleep(3000)
        val start2 = System.currentTimeMillis()
        repeat(100) {
            test2()
        }
        val end2 = System.currentTimeMillis() - start2
        logger.info("et2: $end2")
    }

    fun test2() {
        val a =  sampleRepository.findAllByIdIsIn(listOf(1,2,3,4,5,6,7,8,9,10,11))
        logger.info("$a")
    }
}
