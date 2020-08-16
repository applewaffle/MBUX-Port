
package com.rndash.mbheadunit.nativeCan.canC

import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for MS_308h (ID 0x0308)
**/

object MS_308h {

    	/** Gets cylinder deactivation conditions met **/
	fun get_zasbed() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.MS_308h, 7, 1) != 0
	
	/** Gets water in fuel control lamp (only CR2-USA) **/
	fun get_wks_kl() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.MS_308h, 6, 1) != 0
	
	/** Gets fuel filter clogged control lamp (only CR2-USA) **/
	fun get_ksf_kl() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.MS_308h, 5, 1) != 0
	
	/** Gets fuel cutoff full **/
	fun get_sasv() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.MS_308h, 4, 1) != 0
	
	/** Gets partial thrust cut-off **/
	fun get_sast() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.MS_308h, 3, 1) != 0
	
	/** Gets speed limitation function active **/
	fun get_n_max_bg() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.MS_308h, 2, 1) != 0
	
	/** Gets Req. Torque converter lock-up clutch "open" **/
	fun get_kueb_o_a() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.MS_308h, 1, 1) != 0
	
	/** Gets clutch pressed **/
	fun get_kpl() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.MS_308h, 0, 1) != 0
	
	/** Gets engine speed **/
	fun get_nmot() : Int = CanBusNative.getECUParameterC(CanCAddrs.MS_308h, 8, 16)
	
	/** Gets Tank cap open control lamp **/
	fun get_tank_kl() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.MS_308h, 31, 1) != 0
	
	/** Gets Diagnostic control lamp (OBD II) **/
	fun get_diag_kl() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.MS_308h, 30, 1) != 0
	
	/** Gets Oil level / oil pressure control lamp **/
	fun get_oel_kl() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.MS_308h, 29, 1) != 0
	
	/** Gets Pre-glow control lamp **/
	fun get_vgl_kl() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.MS_308h, 28, 1) != 0
	
	/** Gets air filter dirty control lamp (only diesel) **/
	fun get_lufi_kl() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.MS_308h, 27, 1) != 0
	
	/** Gets ethanol operation detected **/
	fun get_eoh() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.MS_308h, 26, 1) != 0
	
	/** Gets Warning message for the eco power steering pump **/
	fun get_elhp_warn() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.MS_308h, 25, 1) != 0
	
	/** Gets cooling water temperature too high **/
	fun get_temp_kl() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.MS_308h, 39, 1) != 0
	
	/** Gets speed limitation for display active (0 for CR) **/
	fun get_dbaa() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.MS_308h, 38, 1) != 0
	
	/** Gets Motor fan defective control lamp **/
	fun get_lueft_mot_kl() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.MS_308h, 37, 1) != 0
	
	/** Gets starter is running **/
	fun get_anl_lft() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.MS_308h, 36, 1) != 0
	
	/** Gets ADR defective control lamp (only commercial vehicles) **/
	fun get_adr_def_kl() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.MS_308h, 35, 1) != 0
	
	/** Gets ADR control lamp (commercial vehicles only) **/
	fun get_adr_kl() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.MS_308h, 34, 1) != 0
	
	/** Gets cylinder deactivation **/
	fun get_zas() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.MS_308h, 33, 1) != 0
	
	/** Gets engine oil temperature too high (overheating) **/
	fun get_uehitz() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.MS_308h, 32, 1) != 0
	
	/** Gets oil temperature **/
	fun get_t_oel() : Int = CanBusNative.getECUParameterC(CanCAddrs.MS_308h, 40, 8)
	
	/** Gets oil level **/
	fun get_oel_fs() : Int = CanBusNative.getECUParameterC(CanCAddrs.MS_308h, 48, 8)
	
	/** Gets oil quality **/
	fun get_oel_qual() : Int = CanBusNative.getECUParameterC(CanCAddrs.MS_308h, 56, 8)
	
	
}
