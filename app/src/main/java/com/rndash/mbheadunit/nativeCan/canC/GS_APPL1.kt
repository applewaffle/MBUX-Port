
@file:Suppress("unused", "FunctionName")
package com.rndash.mbheadunit.nativeCan.canC
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for GS_APPL1 (ID 0x051C)
**/

object GS_APPL1 {

    	/** Gets application **/
	fun get_appl1() : Int = CanBusNative.getECUParameterC(CanCAddrs.GS_APPL1, 0, 64)
	
	/** Sets application **/
	fun set_appl1(f: CanFrame, p: Int) = CanBusNative.setFrameParameter(f, 0, 64, p)
	
	
}