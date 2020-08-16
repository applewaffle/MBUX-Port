
package com.rndash.mbheadunit.nativeCan.canB

import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for UBF_A1 (ID 0x001A)
**/

object UBF_A1 {

    	/** Gets Radio activation button pressed **/
	fun get_fu_frsp_bet() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.UBF_A1, 7, 1) != 0
	
	/** Gets ASG sport mode on / off activated (ST2_LED_DL if ABC is available) **/
	fun get_asg_sport_bet() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.UBF_A1, 4, 1) != 0
	
	/** Gets ART distance warning on / off activated **/
	fun get_art_abw_bet() : ART_ABW_BET = when(CanBusNative.getECUParameterB(CanBAddrs.UBF_A1, 2, 2)) {
		 0 -> ART_ABW_BET.NDEF_NBET
		 1 -> ART_ABW_BET.AUS_NDEF
		 2 -> ART_ABW_BET.ON_BET
		 3 -> ART_ABW_BET.SNV
		 else -> throw Exception("Invalid raw value for ART_ABW_BET")
	}
	
	/** Gets distance factor **/
	fun get_art_abstand() : Int = CanBusNative.getECUParameterB(CanBAddrs.UBF_A1, 8, 8)
	
	/** Gets Authority radio button pressed **/
	fun get_bh_funk_bet() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.UBF_A1, 18, 1) != 0
	
	/** Gets LEDs for auxiliary heater defective **/
	fun get_led_sth_def() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.UBF_A1, 26, 1) != 0
	
	/** Gets Auxiliary heating switch actuated **/
	fun get_sthl_bet() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.UBF_A1, 24, 1) != 0
	
	
}
