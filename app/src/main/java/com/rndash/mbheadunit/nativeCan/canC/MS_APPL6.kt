
package com.rndash.mbheadunit.nativeCan.canC

import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for MS_APPL6 (ID 0x0610)
**/

object MS_APPL6 {

    	/** Gets application **/
	fun get_appl6() : Int = CanBusNative.getECUParameterC(CanCAddrs.MS_APPL6, 0, 64)
	
	
}
