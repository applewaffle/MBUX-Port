
package com.rndash.mbheadunit.nativeCan.canC

import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for MS_APPL4 (ID 0x0633)
**/

object MS_APPL4 {

    	/** Gets application **/
	fun get_appl4() : Int = CanBusNative.getECUParameterC(CanCAddrs.MS_APPL4, 0, 64)
	
	
}
