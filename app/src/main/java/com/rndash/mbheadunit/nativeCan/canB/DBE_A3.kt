
package com.rndash.mbheadunit.nativeCan.canB

import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for DBE_A3 (ID 0x02D4)
**/

object DBE_A3 {

    	/** Gets mirror dimming UNIT: levels **/
	fun get_sp_abblend() : Int = CanBusNative.getECUParameterB(CanBAddrs.DBE_A3, 3, 5)
	
	
}
