
package com.rndash.mbheadunit.nativeCan.canB

import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for KOMBI_A1 (ID 0x000C)
**/

object KOMBI_A1 {

    	/** Gets Brightness of instrument lighting UNIT:% **/
	fun get_kl_58d_b() : Int = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 0, 8)
	
	/** Gets vehicle speed UNIT: km / h **/
	fun get_v_signal() : Int = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 8, 8)
	
	/** Gets mirror in parking position **/
	fun get_sp_park_sperr() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 23, 1) != 0
	
	/** Gets key dependency on **/
	fun get_schlue_abh_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 22, 1) != 0
	
	/** Gets Switch on trailer monitoring **/
	fun get_anh_uebw() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 21, 1) != 0
	
	/** Gets daytime running lights on **/
	fun get_tfl_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 20, 1) != 0
	
	/** Gets temperature unit **/
	fun get_t_c() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 19, 1) != 0
	
	/** Gets Automatic door locking **/
	fun get_auto_tuer() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 18, 1) != 0
	
	/** Gets minimum tank level **/
	fun get_tfsm_b() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 17, 1) != 0
	
	/** Gets switch on roof sign (taxi) **/
	fun get_dz_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 16, 1) != 0
	
	/** Gets entry aid / autom. Positioning a **/
	fun get_esh_auto_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 31, 1) != 0
	
	/** Gets steering column adjustment with I / O help on **/
	fun get_esh_lenk_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 30, 1) != 0
	
	/** Gets Seat adjustment with I / O help on **/
	fun get_esh_sitz_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 29, 1) != 0
	
	/** Gets Seat adjustment path with I / O help on standard **/
	fun get_esh_pos_std() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 28, 1) != 0
	
	/** Gets Mirror folding in with vehicle locking **/
	fun get_sp_ankl_sperr() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 25, 1) != 0
	
	/** Gets Save longitudinal seat position for I / O help **/
	fun get_esh_pos_sp() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 24, 1) != 0
	
	/** Gets language **/
	fun get_language() : LANGUAGE = when(CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 36, 4)) {
		 0 -> LANGUAGE.GERMAN
		 1 -> LANGUAGE.ENGLISH
		 2 -> LANGUAGE.FRENCH
		 3 -> LANGUAGE.ITALIAN
		 4 -> LANGUAGE.SPANISH
		 5 -> LANGUAGE.JAPANESE
		 6 -> LANGUAGE.DUTCH
		 7 -> LANGUAGE.DAENISH
		 8 -> LANGUAGE.SWEDISH
		 9 -> LANGUAGE.PORTUGUESE
		 10 -> LANGUAGE.TURKISH
		 11 -> LANGUAGE.RUSSIAN
		 15 -> LANGUAGE.SNV
		 else -> throw Exception("Invalid raw value for LANGUAGE")
	}
	
	/** Gets Surrounding lighting on **/
	fun get_ufb_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 35, 1) != 0
	
	/** Gets Switching on the high beam is permitted **/
	fun get_fl_ok() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 34, 1) != 0
	
	/** Gets trip computer distance unit **/
	fun get_rr_km() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 33, 1) != 0
	
	/** Gets search run **/
	fun get_slf() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 32, 1) != 0
	
	/** Gets activate RDK **/
	fun get_rdk_akt() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 47, 1) != 0
	
	/** Gets Interior protection on when the convertible top is open **/
	fun get_irs_vdk_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 46, 1) != 0
	
	/** Gets Preselection time deactivated via MFL (LED off) **/
	fun get_vwz_aus_mfl() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 42, 1) != 0
	
	/** Gets preset time activated (LED on) **/
	fun get_vwz_akt() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 41, 1) != 0
	
	/** Gets switch on auxiliary heating / ventilation **/
	fun get_sthl_ein_kombi() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 40, 1) != 0
	
	/** Gets interior lighting afterglow time UNIT: s **/
	fun get_inli_nlz() : Int = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 48, 8)
	
	/** Gets parking light or fog light afterglow time (SWA) UNIT: s **/
	fun get_abl_nlz() : Int = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 56, 8)
	
	
}
