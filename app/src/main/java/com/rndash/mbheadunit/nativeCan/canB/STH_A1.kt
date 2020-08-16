
package com.rndash.mbheadunit.nativeCan.canB

import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for STH_A1 (ID 0x0094)
**/

object STH_A1 {

    	/** Gets transmitter learning mode on **/
	fun get_sendlm_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.STH_A1, 7, 1) != 0
	
	/** Gets Switch on auxiliary heater LED **/
	fun get_zh_led_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.STH_A1, 6, 1) != 0
	
	/** Gets Open the preset time menu **/
	fun get_vwz_menue() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.STH_A1, 5, 1) != 0
	
	/** Gets Switch on the vehicle fan **/
	fun get_fan_on() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.STH_A1, 4, 1) != 0
	
	/** Gets Switching on heating manually **/
	fun get_sthzg_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.STH_A1, 3, 1) != 0
	
	/** Gets Switch on ventilation manually **/
	fun get_stlft_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.STH_A1, 2, 1) != 0
	
	/** Gets switch off auxiliary heating / ventilation **/
	fun get_sthl_aus() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.STH_A1, 1, 1) != 0
	
	/** Gets switch on auxiliary heating / ventilation **/
	fun get_sthl_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.STH_A1, 0, 1) != 0
	
	
}
