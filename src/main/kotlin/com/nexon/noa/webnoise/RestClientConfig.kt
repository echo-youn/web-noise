package com.nexon.noa.webnoise

import io.ktor.client.*
import io.ktor.client.engine.apache5.*
import org.apache.hc.client5.http.config.RequestConfig
import org.apache.hc.core5.http.HttpHost
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class RestClientConfig {
    @Bean
    fun ktor(): HttpClient {
        return HttpClient(Apache5) {
            engine {
                // this: Apache5EngineConfig
                followRedirects = true
                socketTimeout = 10_000
                connectTimeout = 10_000
                connectionRequestTimeout = 20_000
                customizeClient {
                    // this: HttpAsyncClientBuilder
//                    setProxy(HttpHost("127.0.0.1", 8080))
                    // ...
                }
                customizeRequest {
                    // this: RequestConfig.Builder
                }
            }
        }
    }
}
