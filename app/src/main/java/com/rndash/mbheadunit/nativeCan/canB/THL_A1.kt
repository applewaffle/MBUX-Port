
package com.rndash.mbheadunit.nativeCan.canB

import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for THL_A1 (ID 0x009A)
**/

object THL_A1 {

    	/** Gets rear left window regulator larger short stroke position **/
	fun get_fhl_kzhb() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.THL_A1, 3, 1) != 0
	
	/** Gets rear left window open **/
	fun get_fhl_auf() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.THL_A1, 2, 1) != 0
	
	/** Gets Window lifter blocked at the rear left **/
	fun get_fhl_block() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.THL_A1, 1, 1) != 0
	
	/** Gets Window lifter at the rear left standardized **/
	fun get_fhl_norm() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.THL_A1, 0, 1) != 0
	
	/** Gets window position rear left UNIT: 1 / anchor turn **/
	fun get_feste_hl() : Int = CanBusNative.getECUParameterB(CanBAddrs.THL_A1, 4, 12)
	
	
}
