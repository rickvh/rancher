package nl.vanhal.rancher.coins

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

/**
 * @author vanhal
 */
@RestController
class CoinController(val coinRepository: CoinRepository) {

    @GetMapping("/")
    fun findAll() = coinRepository.findAll()

    @GetMapping("/{name}")
    fun findByName(@PathVariable name: String) = coinRepository.findByName(name)
}