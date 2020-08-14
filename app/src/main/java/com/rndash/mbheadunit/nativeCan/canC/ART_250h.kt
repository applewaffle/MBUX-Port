package com.rndash.mbheadunit.nativeCan.canC


import com.rndash.mbheadunit.nativeCan.CanCAddrs
import com.rndash.mbheadunit.nativeCan.CanBusNative



/**
 *    GENERATED BY parse_kt.py
 *    Decoder class for ECU Frame ART_250h (ID: 0x0250)
**/
object ART_250h {

	/** Switching line shift ART **/
	fun get_slv_art() : Int = getParam(0, 4)

	/** ART fine **/
	fun get_art_ok() : Boolean = getParam(4, 1) != 0

	/** ART brakes **/
	fun get_art_bre() : Boolean = getParam(5, 1) != 0

	/** Brake light suppression **/
	fun get_bl_unt() : Boolean = getParam(6, 1) != 0

	/** Suppression dynamic Vollastrückschaltung **/
	fun get_dyn_unt() : Boolean = getParam(7, 1) != 0

	/** Engine torque request parity (even parity) **/
	fun get_mpar_art() : Boolean = getParam(8, 1) != 0

	/** Engine torque request Dynamic **/
	fun get_mdyn_art() : Boolean = getParam(9, 1) != 0

	/** City assistant controls **/
	fun get_cas_reg() : Boolean = getParam(10, 1) != 0

	/** limiter regulates **/
	fun get_lim_reg() : Boolean = getParam(17, 1) != 0

	/** ART regulates **/
	fun get_art_reg() : Boolean = getParam(18, 1) != 0

	/** Geford. engine torque **/
	fun get_m_art() : Int = getParam(19, 13)

	/** message count **/
	fun get_bz250h() : Int = getParam(32, 4)

	/** Braking torque (0000h: Passive value) **/
	fun get_mbre_art() : Int = getParam(36, 12)

	/** ART-wish: "Active downshift" **/
	fun get_akt_r_art() : Boolean = getParam(48, 1) != 0

	/** Target gear, upper limit **/
	fun get_gmax_art() : Int = getParam(50, 3)

	/** Target gear, lower limit **/
	fun get_gmin_art() : Int = getParam(53, 3)

	override fun toString(): String {
		return """
			SLV_ART: ${get_slv_art()}
			ART_OK: ${get_art_ok()}
			ART_BRE: ${get_art_bre()}
			BL_UNT: ${get_bl_unt()}
			DYN_UNT: ${get_dyn_unt()}
			MPAR_ART: ${get_mpar_art()}
			MDYN_ART: ${get_mdyn_art()}
			CAS_REG: ${get_cas_reg()}
			LIM_REG: ${get_lim_reg()}
			ART_REG: ${get_art_reg()}
			M_ART: ${get_m_art()}
			BZ250h: ${get_bz250h()}
			MBRE_ART: ${get_mbre_art()}
			AKT_R_ART: ${get_akt_r_art()}
			GMAX_ART: ${get_gmax_art()}
			GMIN_ART: ${get_gmin_art()}
		""".trimIndent()
	}


	private fun getParam(o: Int, l: Int) : Int = CanBusNative.getECUParameterC(CanCAddrs.ART_250h, o, l)
}