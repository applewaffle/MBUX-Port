
package com.rndash.mbheadunit.nativeCan.canB

import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for DBE_A1 (ID 0x0014)
**/

object DBE_A1 {

    	/** Gets Switch on the exit light at the rear right **/
	fun get_al_hr() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.DBE_A1, 3, 1) != 0
	
	/** Gets Switch on the exit light at the rear left **/
	fun get_al_hl() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.DBE_A1, 2, 1) != 0
	
	/** Gets Switch on the exit light at the front right **/
	fun get_al_vr() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.DBE_A1, 1, 1) != 0
	
	/** Gets Switch on the exit light at the front left **/
	fun get_al_vl() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.DBE_A1, 0, 1) != 0
	
	/** Gets Inside temperature UNIT: ° C **/
	fun get_t_innen() : Int = CanBusNative.getECUParameterB(CanBAddrs.DBE_A1, 8, 8)
	
	/** Gets LS initialization is running **/
	fun get_init_ls_akt() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.DBE_A1, 23, 1) != 0
	
	/** Gets Light sensor: Dusk **/
	fun get_daemmer() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.DBE_A1, 21, 1) != 0
	
	/** Gets Light sensor: tunnel **/
	fun get_tunnel() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.DBE_A1, 20, 1) != 0
	
	/** Gets light sensor defective **/
	fun get_lisr_def() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.DBE_A1, 18, 1) != 0
	
	/** Gets day / night signal **/
	fun get_night() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.DBE_A1, 17, 1) != 0
	
	/** Gets AFL request: switch on low beam **/
	fun get_afl_abl_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.DBE_A1, 16, 1) != 0
	
	/** Gets Sunroof status **/
	fun get_shd_st() : SHD_ST = when(CanBusNative.getECUParameterB(CanBAddrs.DBE_A1, 29, 3)) {
		 0 -> SHD_ST.SHD_ST_ZU
		 1 -> SHD_ST.SHD_ST_AUF
		 2 -> SHD_ST.HUB_ST_AUF
		 3 -> SHD_ST.SHD_ST_ST
		 4 -> SHD_ST.SHD_ST_AW
		 5 -> SHD_ST.SHD_ST_ZW
		 6 -> SHD_ST.HUB_ST_ZW
		 7 -> SHD_ST.SNV
		 else -> throw Exception("Invalid raw value for SHD_ST")
	}
	
	/** Gets Switch on the charging lamp **/
	fun get_lade_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.DBE_A1, 27, 1) != 0
	
	/** Gets convertible top locked (with W, S, C, CL = [1]) **/
	fun get_verd_zu() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.DBE_A1, 26, 1) != 0
	
	/** Gets Convertible top in catch position **/
	fun get_verd_fangpos() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.DBE_A1, 25, 1) != 0
	
	/** Gets Interior protection glass breakage triggered **/
	fun get_irs_gb() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.DBE_A1, 33, 1) != 0
	
	/** Gets Interior protection triggered **/
	fun get_irs_alm() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.DBE_A1, 32, 1) != 0
	
	/** Gets front left footwell lighting on **/
	fun get_frbl_vl() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.DBE_A1, 52, 1) != 0
	
	/** Gets Brightness of footwell lighting UNIT:% **/
	fun get_frbl_hell() : Int = CanBusNative.getECUParameterB(CanBAddrs.DBE_A1, 56, 8)
	
	
}
