
package com.rndash.mbheadunit.nativeCan.canB

import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for MSSK_A1 (ID 0x0046)
**/

object MSSK_A1 {

    	/** Gets direction flashing left **/
	fun get_bli_li_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 4, 1) != 0
	
	/** Gets right direction flashing **/
	fun get_bli_re_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 3, 1) != 0
	
	/** Gets switch on high beam **/
	fun get_fl_ein_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 2, 1) != 0
	
	/** Gets switch on headlight flasher **/
	fun get_lhp_ein_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 1, 1) != 0
	
	/** Gets switch on the horn **/
	fun get_sgh_ein_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 0, 1) != 0
	
	/** Gets Switch on tap wiping **/
	fun get_tipp_wisch_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 12, 1) != 0
	
	/** Gets Switch on washing **/
	fun get_waschen_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 11, 1) != 0
	
	/** Gets MSSK in position I (rain sensor operation) **/
	fun get_sch_wi_int_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 10, 1) != 0
	
	/** Gets MSSK in position II (level 1) **/
	fun get_sch_wi_1_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 9, 1) != 0
	
	/** Gets MSSK in position III (level 2) **/
	fun get_sch_wi_2_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 8, 1) != 0
	
	/** Gets Switch on the rear fog light **/
	fun get_nsl_ein_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 22, 1) != 0
	
	/** Gets Switch on the fog lights **/
	fun get_nsw_ein_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 21, 1) != 0
	
	/** Gets switch on low beam **/
	fun get_abl_ein_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 20, 1) != 0
	
	/** Gets switch on parking lights **/
	fun get_stl_ein_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 19, 1) != 0
	
	/** Gets Hazard warning lights on **/
	fun get_wbl_ein_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 18, 1) != 0
	
	/** Gets Wipe / wash the rear window **/
	fun get_heck_wisch_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 17, 1) != 0
	
	/** Gets Intermittent wiping of the rear window **/
	fun get_heck_int_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 16, 1) != 0
	
	/** Gets Open the sunroof **/
	fun get_shd_auf_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 27, 1) != 0
	
	/** Gets Close the sunroof **/
	fun get_shd_zu_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 26, 1) != 0
	
	/** Gets Open the lifting roof **/
	fun get_hd_auf_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 25, 1) != 0
	
	/** Gets Sunroof stop **/
	fun get_shd_stop() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 24, 1) != 0
	
	
}
