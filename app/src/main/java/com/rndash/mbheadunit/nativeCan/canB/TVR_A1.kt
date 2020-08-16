
package com.rndash.mbheadunit.nativeCan.canB

import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for TVR_A1 (ID 0x0290)
**/

object TVR_A1 {

    	/** Gets seat front right **/
	fun get_svr_vor() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A1, 7, 1) != 0
	
	/** Gets seat front right **/
	fun get_svr_zur() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A1, 6, 1) != 0
	
	/** Gets seat front right **/
	fun get_svr_hi_auf() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A1, 5, 1) != 0
	
	/** Gets seat front right **/
	fun get_svr_hi_ab() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A1, 4, 1) != 0
	
	/** Gets front right seat **/
	fun get_svr_tgl() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A1, 0, 1) != 0
	
	/** Gets seat front right **/
	fun get_svr_le_vor() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A1, 13, 1) != 0
	
	/** Gets front right seat **/
	fun get_svr_le_zur() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A1, 12, 1) != 0
	
	/** Gets seat front right **/
	fun get_svr_vo_auf() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A1, 11, 1) != 0
	
	/** Gets seat in front right **/
	fun get_svr_vo_ab() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A1, 10, 1) != 0
	
	/** Gets front right seat **/
	fun get_svr_kst_auf() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A1, 9, 1) != 0
	
	/** Gets front right seat **/
	fun get_svr_kst_ab() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A1, 8, 1) != 0
	
	/** Gets steering column up **/
	fun get_ls_auf_rl() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A1, 19, 1) != 0
	
	/** Gets steering column down **/
	fun get_ls_ab_rl() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A1, 18, 1) != 0
	
	/** Gets steering column forward **/
	fun get_ls_vor_rl() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A1, 17, 1) != 0
	
	/** Gets steering column to the rear (towards the driver) **/
	fun get_ls_zurueck_rl() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A1, 16, 1) != 0
	
	/** Gets memory front right **/
	fun get_mvr_p1_en() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A1, 31, 1) != 0
	
	/** Gets memory front right **/
	fun get_mvr_p2_en() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A1, 30, 1) != 0
	
	/** Gets memory front right **/
	fun get_mvr_p3_en() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A1, 29, 1) != 0
	
	/** Gets front right memory **/
	fun get_mvr_p1_sp() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A1, 28, 1) != 0
	
	/** Gets memory front right **/
	fun get_mvr_p2_sp() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A1, 27, 1) != 0
	
	/** Gets memory front right **/
	fun get_mvr_p3_sp() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A1, 26, 1) != 0
	
	/** Gets Save left exterior mirror parking position **/
	fun get_spi_li_sp() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A1, 25, 1) != 0
	
	/** Gets front right memory **/
	fun get_mvr_tgl() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A1, 24, 1) != 0
	
	/** Gets outside mirror left to left (not 203) **/
	fun get_spi_li_n_li() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A1, 39, 1) != 0
	
	/** Gets outside mirror left to right (not 203) **/
	fun get_spi_li_n_re() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A1, 38, 1) != 0
	
	/** Gets Left outside mirror up (not 203) **/
	fun get_spi_li_n_ob() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A1, 37, 1) != 0
	
	/** Gets Left outside mirror down (not 203) **/
	fun get_spi_li_n_un() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A1, 36, 1) != 0
	
	/** Gets outside mirror left after garage position (not 203) **/
	fun get_spi_li_garage() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A1, 35, 1) != 0
	
	/** Gets Outside mirror left after driving position (not 203) **/
	fun get_spi_li_fahren() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A1, 34, 1) != 0
	
	/** Gets Mirror adjustment switch actuated **/
	fun get_spvs_bet_rl() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A1, 32, 1) != 0
	
	
}
