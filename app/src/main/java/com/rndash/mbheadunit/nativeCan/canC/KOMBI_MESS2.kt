
package com.rndash.mbheadunit.nativeCan.canC

import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for KOMBI_MESS2 (ID 0x0681)
**/

object KOMBI_MESS2 {

    	/** Gets measured values **/
	fun get_mess2() : Int = CanBusNative.getECUParameterC(CanCAddrs.KOMBI_MESS2, 0, 64)
	
	
}
