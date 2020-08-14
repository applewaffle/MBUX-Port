package com.rndash.mbheadunit.nativeCan.canB


import com.rndash.mbheadunit.nativeCan.CanBAddrs
import com.rndash.mbheadunit.nativeCan.CanBusNative



/**
 *    GENERATED BY parse_kt.py
 *    Decoder class for ECU Frame EZS_A4 (ID: 0x0058)
**/
object EZS_A4 {

	/** Identification key for pre-filtering **/
	fun get_schlue_id() : Int = getParam(0, 32)

	/** (km) (Km) Mileage **/
	fun get_km_ezs() : Int = getParam(32, 24)

	override fun toString(): String {
		return """
			SCHLUE_ID: ${get_schlue_id()}
			KM_EZS: ${get_km_ezs()}
		""".trimIndent()
	}


	private fun getParam(o: Int, l: Int) : Int = CanBusNative.getECUParameterB(CanBAddrs.EZS_A4, o, l)
}