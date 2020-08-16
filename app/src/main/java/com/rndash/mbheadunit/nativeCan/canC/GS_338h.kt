
package com.rndash.mbheadunit.nativeCan.canC

import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for GS_338h (ID 0x0338)
**/

object GS_338h {

    	/** Gets gearbox output speed (only 463/461, otherwise FFFFh) **/
	fun get_nab() : Int = CanBusNative.getECUParameterC(CanCAddrs.GS_338h, 0, 16)
	
	/** Gets turbine speed (EGS52-NAG, VGS-NAG2) **/
	fun get_nturbine() : Int = CanBusNative.getECUParameterC(CanCAddrs.GS_338h, 48, 16)
	
	
}
