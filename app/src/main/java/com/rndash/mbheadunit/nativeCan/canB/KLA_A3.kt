
package com.rndash.mbheadunit.nativeCan.canB

import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for KLA_A3 (ID 0x00F1)
**/

object KLA_A3 {

    	/** Gets Request heating power UNIT:% **/
	fun get_hzl_anf() : Int = CanBusNative.getECUParameterB(CanBAddrs.KLA_A3, 0, 8)
	
	/** Gets Outside air temperature for heat management UNIT: ° C **/
	fun get_t_aussen_wm() : Int = CanBusNative.getECUParameterB(CanBAddrs.KLA_A3, 8, 8)
	
	
}
