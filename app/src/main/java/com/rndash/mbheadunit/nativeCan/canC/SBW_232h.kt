package com.rndash.mbheadunit.nativeCan.canC


import com.rndash.mbheadunit.nativeCan.CanCAddrs
import com.rndash.mbheadunit.nativeCan.CanBusNative



/**
 *    GENERATED BY parse_kt.py
 *    Decoder class for ECU Frame SBW_232h (ID: 0x0232)
**/
object SBW_232h {

	/** sender ID **/
	fun get_sid_sbw() : Int = getParam(0, 2)

	/** Steering wheel buttons "+" **/
	fun get_lrt_pm3() : Int = getParam(5, 3)

	/** Shift-by-wire control element identification **/
	fun get_sbwb_id() : Int = getParam(8, 2)

	/** Shift-by-wire control element P button **/
	fun get_sbwb_st_p() : Int = getParam(10, 2)

	/** Shift-by-wire control element status RND **/
	fun get_sbwb_st_rnd() : Int = getParam(12, 4)

	/** message count **/
	fun get_bz232h() : Int = getParam(16, 4)

	override fun toString(): String {
		return """
			SID_SBW: ${get_sid_sbw()}
			LRT_PM3: ${get_lrt_pm3()}
			SBWB_ID: ${get_sbwb_id()}
			SBWB_ST_P: ${get_sbwb_st_p()}
			SBWB_ST_RND: ${get_sbwb_st_rnd()}
			BZ232h: ${get_bz232h()}
		""".trimIndent()
	}


	private fun getParam(o: Int, l: Int) : Int = CanBusNative.getECUParameterC(CanCAddrs.SBW_232h, o, l)
}