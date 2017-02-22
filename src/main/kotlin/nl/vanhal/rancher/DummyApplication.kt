package nl.vanhal.rancher

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan

@EnableAutoConfiguration
@ComponentScan
class DummyApplication

fun main(args: Array<String>) {
    SpringApplication.run(DummyApplication::class.java, *args)
}
