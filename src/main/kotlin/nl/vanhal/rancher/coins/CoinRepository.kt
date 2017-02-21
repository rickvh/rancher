package nl.vanhal.rancher.coins

import org.springframework.stereotype.Component

/**
 * @author vanhal
 */
@Component
class CoinRepository {
    val coins = listOf(Coin("Gulden", 1.0, "Zilver"), Coin("Stuiver", 0.05, "Koper"))

    fun findAll() = coins

    fun findByName(name: String) = coins.find { c -> c.name == name }
}