package com.rndash.mbheadunit.nativeCan.canB


import com.rndash.mbheadunit.nativeCan.CanBAddrs
import com.rndash.mbheadunit.nativeCan.CanBusNative



/**
 *    GENERATED BY parse_kt.py
 *    Decoder class for ECU Frame SAM_V_A1 (ID: 0x000A)
**/
object SAM_V_A1 {

	/** terminal 61 **/
	fun get_kl_61_ein() : Boolean = getParam(0, 1) != 0

	/** Injection active headlamps **/
	fun get_swa_akt() : Boolean = getParam(1, 1) != 0

	/** Reverse gear engaged (for NSG / KSG) **/
	fun get_rg_sam_v() : Boolean = getParam(2, 1) != 0

	/** Mirror adjustment in position right **/
	fun get_spvs_st_r() : Boolean = getParam(3, 1) != 0

	/** Signal horn is activated **/
	fun get_sgh_st_ein() : Boolean = getParam(4, 1) != 0

	/** High beam is turned on **/
	fun get_fl_st_ein() : Boolean = getParam(5, 1) != 0

	/** Fog lights are turned on **/
	fun get_nsw_st_ein() : Boolean = getParam(6, 1) != 0

	/** Outside light activated by light sensor **/
	fun get_afl_akt() : Boolean = getParam(7, 1) != 0

	/** Switch rear fog light **/
	fun get_nsl_ein() : Boolean = getParam(8, 1) != 0

	/** switch on low beam **/
	fun get_abl_ein() : Boolean = getParam(10, 1) != 0

	/** Switch on parking lights **/
	fun get_stl_ein() : Boolean = getParam(11, 1) != 0

	/** Turn right parking light **/
	fun get_pl_re_ein() : Boolean = getParam(13, 1) != 0

	/** Left parking light switch **/
	fun get_pl_li_ein() : Boolean = getParam(14, 1) != 0

	/** Auxiliary water pump runs **/
	fun get_zwp_lft() : Boolean = getParam(16, 1) != 0

	/** Refrigeration compressor runs **/
	fun get_komp_lft() : Boolean = getParam(17, 1) != 0

	/** Hand brake applied (control light) **/
	fun get_has_kl() : Boolean = getParam(18, 1) != 0

	/** Air compressor switched **/
	fun get_komp_ein() : Boolean = getParam(19, 1) != 0

	/** C compressor drive current output defective **/
	fun get_komp_def() : Boolean = getParam(20, 1) != 0

	/** Terminal 15 is activated via diagnostics **/
	fun get_diag_15_ein() : Boolean = getParam(21, 1) != 0

	/** Terminal 15R via diagnostic activated **/
	fun get_diag_15r_ein() : Boolean = getParam(22, 1) != 0

	/** Brake fluid level warning light **/
	fun get_bfl_kl() : Boolean = getParam(24, 1) != 0

	/** Wash water level too low pilot light **/
	fun get_wws_kl() : Boolean = getParam(25, 1) != 0

	/** Cooling water level too low pilot light **/
	fun get_kws_kl() : Boolean = getParam(26, 1) != 0

	/** Left fog defective **/
	fun get_nsw_def_l() : Boolean = getParam(32, 1) != 0

	/** High beam left defective **/
	fun get_fl_def_l() : Boolean = getParam(33, 1) != 0

	/** Low beam left defective **/
	fun get_abl_def_l() : Boolean = getParam(34, 1) != 0

	/** Front left parking light defective **/
	fun get_pl_def_vl() : Boolean = getParam(35, 1) != 0

	/** Indicator front left defective **/
	fun get_bli_def_vl() : Boolean = getParam(36, 1) != 0

	/** Side Marker front left defective **/
	fun get_sm_def_vl() : Boolean = getParam(37, 1) != 0

	/** Instrument illumination from **/
	fun get_instr_aus() : Boolean = getParam(39, 1) != 0

	/** Right fog defective **/
	fun get_nsw_def_r() : Boolean = getParam(40, 1) != 0

	/** Right high beam defect **/
	fun get_fl_def_r() : Boolean = getParam(41, 1) != 0

	/** Low beam right defective **/
	fun get_abl_def_r() : Boolean = getParam(42, 1) != 0

	/** front right parking light defective **/
	fun get_pl_def_vr() : Boolean = getParam(43, 1) != 0

	/** Indicator front left defective **/
	fun get_bli_def_vr() : Boolean = getParam(44, 1) != 0

	/** Side Marker front right defective **/
	fun get_sm_def_vr() : Boolean = getParam(45, 1) != 0

	/** Messg. Steering fluid too low **/
	fun get_lenk_oel_kl() : Boolean = getParam(47, 1) != 0

	/** Replacement Indicator front left active **/
	fun get_bli_ers_vl() : Boolean = getParam(48, 1) != 0

	/** Replacement Parking light front left active **/
	fun get_pl_ers_vl() : Boolean = getParam(49, 1) != 0

	/** Start Xenon4 diagnostic procedure driver's side **/
	fun get_diag_x4_f() : Boolean = getParam(50, 1) != 0

	/** Replacement Indicator front left active **/
	fun get_bli_ers_vr() : Boolean = getParam(52, 1) != 0

	/** Replacement parking light front right active **/
	fun get_pl_ers_vr() : Boolean = getParam(53, 1) != 0

	/** Start Xenon4 diagnostic procedure passenger side **/
	fun get_diag_x4_b() : Boolean = getParam(54, 1) != 0

	override fun toString(): String {
		return """
			KL_61_EIN: ${get_kl_61_ein()}
			SWA_AKT: ${get_swa_akt()}
			RG_SAM_V: ${get_rg_sam_v()}
			SPVS_ST_R: ${get_spvs_st_r()}
			SGH_ST_EIN: ${get_sgh_st_ein()}
			FL_ST_EIN: ${get_fl_st_ein()}
			NSW_ST_EIN: ${get_nsw_st_ein()}
			AFL_AKT: ${get_afl_akt()}
			NSL_EIN: ${get_nsl_ein()}
			ABL_EIN: ${get_abl_ein()}
			STL_EIN: ${get_stl_ein()}
			PL_RE_EIN: ${get_pl_re_ein()}
			PL_LI_EIN: ${get_pl_li_ein()}
			ZWP_LFT: ${get_zwp_lft()}
			KOMP_LFT: ${get_komp_lft()}
			HAS_KL: ${get_has_kl()}
			KOMP_EIN: ${get_komp_ein()}
			KOMP_DEF: ${get_komp_def()}
			DIAG_15_EIN: ${get_diag_15_ein()}
			DIAG_15R_EIN: ${get_diag_15r_ein()}
			BFL_KL: ${get_bfl_kl()}
			WWS_KL: ${get_wws_kl()}
			KWS_KL: ${get_kws_kl()}
			NSW_DEF_L: ${get_nsw_def_l()}
			FL_DEF_L: ${get_fl_def_l()}
			ABL_DEF_L: ${get_abl_def_l()}
			PL_DEF_VL: ${get_pl_def_vl()}
			BLI_DEF_VL: ${get_bli_def_vl()}
			SM_DEF_VL: ${get_sm_def_vl()}
			INSTR_AUS: ${get_instr_aus()}
			NSW_DEF_R: ${get_nsw_def_r()}
			FL_DEF_R: ${get_fl_def_r()}
			ABL_DEF_R: ${get_abl_def_r()}
			PL_DEF_VR: ${get_pl_def_vr()}
			BLI_DEF_VR: ${get_bli_def_vr()}
			SM_DEF_VR: ${get_sm_def_vr()}
			LENK_OEL_KL: ${get_lenk_oel_kl()}
			BLI_ERS_VL: ${get_bli_ers_vl()}
			PL_ERS_VL: ${get_pl_ers_vl()}
			DIAG_X4_F: ${get_diag_x4_f()}
			BLI_ERS_VR: ${get_bli_ers_vr()}
			PL_ERS_VR: ${get_pl_ers_vr()}
			DIAG_X4_B: ${get_diag_x4_b()}
		""".trimIndent()
	}


	private fun getParam(o: Int, l: Int) : Int = CanBusNative.getECUParameterB(CanBAddrs.SAM_V_A1, o, l)
}