
package com.rndash.mbheadunit.nativeCan.canB

import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for TELEAID_POS4 (ID 0x03E8)
**/

object TELEAID_POS4 {

    	/** Gets Dead reckoning / map matching latitude (- means south) UNIT: mas **/
	fun get_dr_mm_lat() : Int = CanBusNative.getECUParameterB(CanBAddrs.TELEAID_POS4, 0, 32)
	
	/** Gets Dead reckoning / map matching longtitude (- means west) UNIT: mas **/
	fun get_dr_mm_long() : Int = CanBusNative.getECUParameterB(CanBAddrs.TELEAID_POS4, 32, 32)
	
	
}
