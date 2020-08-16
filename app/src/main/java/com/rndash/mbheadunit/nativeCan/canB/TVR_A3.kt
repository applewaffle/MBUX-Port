
package com.rndash.mbheadunit.nativeCan.canB

import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for TVR_A3 (ID 0x0019)
**/

object TVR_A3 {

    	/** Gets trunk lid remote locking **/
	fun get_hfs_rl() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A3, 4, 1) != 0
	
	/** Gets additional right turn signal defective **/
	fun get_zblr_def() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A3, 3, 1) != 0
	
	/** Gets parental controls on **/
	fun get_kisi_ein_rl() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A3, 2, 1) != 0
	
	/** Gets trunk lid remote release **/
	fun get_hfe_rl() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A3, 1, 1) != 0
	
	/** Gets Mirror adjustment switch. in position. left (not 203) **/
	fun get_spvs_bf_rl() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A3, 0, 1) != 0
	
	/** Gets Front right window regulator larger short stroke position **/
	fun get_fvr_kzhb() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A3, 11, 1) != 0
	
	/** Gets window open **/
	fun get_fvr_auf() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A3, 10, 1) != 0
	
	/** Gets Front right window blocked **/
	fun get_fvr_block() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A3, 9, 1) != 0
	
	/** Gets normalized front right window **/
	fun get_fvr_norm() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVR_A3, 8, 1) != 0
	
	/** Gets window position front right UNIT: 1 / anchor turn **/
	fun get_feste_vr() : Int = CanBusNative.getECUParameterB(CanBAddrs.TVR_A3, 12, 12)
	
	
}
