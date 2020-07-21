package com.rndash.mbheadunit.canData.canB

import com.rndash.mbheadunit.canData.ECUFrame
import com.rndash.mbheadunit.canData.FrameSignal
import com.rndash.mbheadunit.canData.UnVerifiedValue

@ExperimentalUnsignedTypes
class KLA_A1 : ECUFrame() {
    enum class FlapPosition() {
        OPEN,
        CLOSED,
        PARTIAL,
        UNKNOWN
    }

    override val name: String = "KLA_A1"
    override val dlc: Int = 8 // Full frame is 8, my unit only car 5 bytes??
    override val id: Int = 0x0030
    override val signals: List<FrameSignal> = listOf(
            FrameSignal("HHS_EIN", 0, 1),
            FrameSignal("EC_AKT", 1, 1),
            FrameSignal("IFG_EIN", 2, 1),
            FrameSignal("ZWP_EIN", 3, 1),
            FrameSignal("ZH_EIN_OK", 4, 1),
            FrameSignal("LL_DZA", 5, 1),
            FrameSignal("HEIZEN", 6, 1),
            FrameSignal("LUEFTEN", 7, 1),
            FrameSignal("NLFTS", 8, 8),
            FrameSignal("M_KOMP", 16, 8),
            FrameSignal("KOMP_STELL", 24, 8),
            FrameSignal("FSB_HZG_EIN", 32, 1),
            FrameSignal("G_ANF_KUEHL_KLA", 33, 1),
            FrameSignal("GEB_LSTG", 40, 8),
            FrameSignal("UL_AKT_KLA", 48, 1),
            FrameSignal("G_ANF_KLA", 49, 1),
            FrameSignal("LKO_VORN", 50, 2),
            FrameSignal("LKM_VORN", 52, 2),
            FrameSignal("LKU_VORN", 54, 2),
            FrameSignal("T_INNEN_KLA", 56, 8)
    )

    override fun toString(): String {
        return """
            KLA_A1
            Heated rear windows?: ${isHeatedRearWindow()}
            EC Mode active?: ${isECModeActive()}
            Heater on?: ${isHeaterOn()}
            Fan speed percent: ${getFanSpeedPercent()}
            Flap (UP) position: ${getUpFlapPosition()}
            Flap (CENT) position: ${getCenterFlapPosition()}
            Flap (LOW) position: ${getLowerFlapPosition()}
            Interior Temperature: ${getInteriorTemp()} Celsius
        """.trimIndent()
    }

    /**
     * Returns if the rear windshield is being heated
     */
    fun isHeatedRearWindow(): Boolean = signals[0].getValue() != 0

    /**
     * Returns if EC Mode is active on supported AC Controllers
     */
    fun isECModeActive(): Boolean = signals[1].getValue() != 0

    /**
     * Returns if the Blower fan is on or not
     */
    fun isInternalFanOn(): Boolean = signals[2].getValue() != 0

    /**
     * Returns if the AUX Water pump is on (Only on some cars)
     */
    fun isWaterPumpOn(): Boolean = signals[3].getValue() != 0

    /**
     * Returns if the heater can be enabled or not. Heater won't be enabled if the engine
     * temperature is too cold to warm up the heater core
     */
    fun isHeaterAllowed(): Boolean = signals[4].getValue() != 0

    /**
     * Returns if the engine has to raise its RPM to compensate for the load
     * generated by the AC compressor
     */
    fun isRPMCompensation(): Boolean = signals[5].getValue() != 0

    /**
     * Returns if the heater is active or not
     */
    fun isHeaterOn(): Boolean = signals[6].getValue() != 0

    /**
     * Returns if the heater is actively having air passed through it
     */
    fun isHeaterVent(): Boolean = signals[7].getValue() != 0

    /**
     * Returns the target blower fan speed percentage as set by the AC control panel
     */
    fun getFanSpeedTargetPercent(): Int = signals[8].getValue()

    /**
     * Returns the amount of torque in Nm that the AC compressor is stealing from the engine
     */
    fun getTorqueAbsorbtion(): Int = signals[9].getValue()

    /**
     * Returns the Percentage that the AC compressor is working
     */
    fun getCompressorPercent(): Int = signals[10].getValue()

    /**
     * Returns the current blower fan speed percentage
     */
    fun getFanSpeedPercent(): Int = signals[13].getValue()

    /**
     * ??
     */
    @UnVerifiedValue
    fun isConvection(): Boolean = signals[14].getValue() != 0

    /**
     * Returns the position of the Flap that allows air to flow onto the front windshield
     */
    @UnVerifiedValue
    fun getUpFlapPosition(): FlapPosition = getFlapPos(signals[17].getValue())

    /**
     * Returns the position of the flap that allows air onto the passengers front
     */
    @UnVerifiedValue
    fun getCenterFlapPosition(): FlapPosition = getFlapPos(signals[17].getValue())

    /**
     * Returns the position of the flap that allows air onto the passengers feet
     */
    @UnVerifiedValue
    fun getLowerFlapPosition(): FlapPosition = getFlapPos(signals[18].getValue())

    fun getInteriorTemp(): Int = signals[19].getValue()

    private fun getFlapPos(raw: Int) : FlapPosition {
        return when(raw) {
            0 -> FlapPosition.PARTIAL
            1 -> FlapPosition.CLOSED
            2 -> FlapPosition.OPEN
            else -> FlapPosition.UNKNOWN
        }
    }
}