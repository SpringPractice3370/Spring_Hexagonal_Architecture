package com.example.adapter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@EnableJpaAuditing
@SpringBootApplication(scanBasePackages = ["com.example"])
@EnableJpaRepositories(basePackages = ["com.example"])
@EntityScan(basePackages = ["com.example"])
class HexagonalArchitectureApplication

fun main(args: Array<String>) {
	runApplication<HexagonalArchitectureApplication>(*args)
}
