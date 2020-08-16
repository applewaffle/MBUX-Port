
package com.rndash.mbheadunit.nativeCan.canC

import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for KLA_40Eh (ID 0x040E)
**/

object KLA_40Eh {

    	/** Gets Heating power requirement **/
	fun get_hzl_anf() : Int = CanBusNative.getECUParameterC(CanCAddrs.KLA_40Eh, 0, 8)
	
	
}
