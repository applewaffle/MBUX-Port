
package com.rndash.mbheadunit.nativeCan.canB

import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for SB_A1 (ID 0x01B6)
**/

object SB_A1 {

    	/** Gets passenger seat backrest unlocked **/
	fun get_le_b_ent() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SB_A1, 4, 1) != 0
	
	
}
