package nl.vanhal.rancher.coins

import java.io.Serializable

/**
 * @author vanhal
 */
data class Coin(val name: String, val value: Double, val color: String) : Serializable