package com.rndash.mbheadunit.nativeCan.canB


import com.rndash.mbheadunit.nativeCan.CanBAddrs
import com.rndash.mbheadunit.nativeCan.CanBusNative



/**
 *    GENERATED BY parse_kt.py
 *    Decoder class for ECU Frame UNKNOWN (ID: 0x0000)
**/
object EZS_A1 {

	/** Keyless Go terminal control active **/
	fun get_kg_kl_akt() : Boolean = getParam(0, 1) != 0

	/** Terminal 50 is turned on **/
	fun get_kl_50_ein() : Boolean = getParam(3, 1) != 0

	/** 15X terminal is turned on **/
	fun get_kl_15x_ein() : Boolean = getParam(4, 1) != 0

	/** Terminal 15 is turned on **/
	fun get_kl_15_ein() : Boolean = getParam(5, 1) != 0

	/** Terminal 15R is turned on **/
	fun get_kl_15r_ein() : Boolean = getParam(6, 1) != 0

	/** Message: "vehicle calculated Wait" **/
	fun get_fzg_rech() : Boolean = getParam(8, 1) != 0

	/** diagnosis toggle **/
	fun get_diag_tgl() : Boolean = getParam(9, 1) != 0

	/** Application ID's do not send just NM IDs **/
	fun get_appl_aus() : Boolean = getParam(10, 1) != 0

	/** Panic alarm by key **/
	fun get_pnk_alm_aus() : Boolean = getParam(11, 1) != 0

	/** Panic alarm by key **/
	fun get_pnk_alm_ein() : Boolean = getParam(12, 1) != 0

	/** Remote triggering MSS alarm **/
	fun get_fern_alarm() : Boolean = getParam(13, 1) != 0

	/** Message: renew key **/
	fun get_schlue_neu() : Boolean = getParam(16, 1) != 0

	/** closing passive **/
	fun get_zv_passiv() : Boolean = getParam(17, 1) != 0

	/** Game Protection active **/
	fun get_zv_spiel() : Boolean = getParam(18, 1) != 0

	/** Trunk lid stop **/
	fun get_hd_stopp() : Boolean = getParam(19, 1) != 0

	/** Current memory block number **/
	fun get_spei_nr() : Int = getParam(21, 3)

	/** perimeter security **/
	fun get_auss_sich() : Boolean = getParam(24, 1) != 0

	/** Außenentsicherung **/
	fun get_auss_entsi() : Boolean = getParam(25, 1) != 0

	/** secure ZV flasher feedback **/
	fun get_bli_sich() : Boolean = getParam(26, 1) != 0

	/** ZV flasher feedback unlock **/
	fun get_bli_entsi() : Boolean = getParam(27, 1) != 0

	/** Heckdeckelfernentriegelung **/
	fun get_hfe_ezs() : Boolean = getParam(32, 1) != 0

	/** secure boot lid **/
	fun get_hd_sich() : Boolean = getParam(33, 1) != 0

	/** Unlock the boot lid **/
	fun get_hd_entsi() : Boolean = getParam(34, 1) != 0

	/** locking gas cap (HSF / stackers) **/
	fun get_td_verri() : Boolean = getParam(35, 1) != 0

	/** unlock tank cap (HSF / trays) **/
	fun get_td_entri() : Boolean = getParam(36, 1) != 0

	/** ZV Nachverriegelung **/
	fun get_zv_nv() : Boolean = getParam(38, 1) != 0

	/** Mechanical / FB key active **/
	fun get_schl_bef() : Boolean = getParam(39, 1) != 0

	/** Right rear door lock **/
	fun get_thr_verri() : Boolean = getParam(40, 1) != 0

	/** Unlocking doors, rear right **/
	fun get_thr_entri() : Boolean = getParam(41, 1) != 0

	/** Left rear door lock **/
	fun get_thl_verri() : Boolean = getParam(42, 1) != 0

	/** Unlocking doors, rear left **/
	fun get_thl_entri() : Boolean = getParam(43, 1) != 0

	/** Right front door lock **/
	fun get_tvr_verri() : Boolean = getParam(44, 1) != 0

	/** Unlock Right front door **/
	fun get_tvr_entri() : Boolean = getParam(45, 1) != 0

	/** Left front door lock **/
	fun get_tvl_verri() : Boolean = getParam(46, 1) != 0

	/** Unlock Left front door **/
	fun get_tvl_entri() : Boolean = getParam(47, 1) != 0

	override fun toString(): String {
		return """
			KG_KL_AKT: ${get_kg_kl_akt()}
			KL_50_EIN: ${get_kl_50_ein()}
			KL_15X_EIN: ${get_kl_15x_ein()}
			KL_15_EIN: ${get_kl_15_ein()}
			KL_15R_EIN: ${get_kl_15r_ein()}
			FZG_RECH: ${get_fzg_rech()}
			DIAG_TGL: ${get_diag_tgl()}
			APPL_AUS: ${get_appl_aus()}
			PNK_ALM_AUS: ${get_pnk_alm_aus()}
			PNK_ALM_EIN: ${get_pnk_alm_ein()}
			FERN_ALARM: ${get_fern_alarm()}
			SCHLUE_NEU: ${get_schlue_neu()}
			ZV_PASSIV: ${get_zv_passiv()}
			ZV_SPIEL: ${get_zv_spiel()}
			HD_STOPP: ${get_hd_stopp()}
			SPEI_NR: ${get_spei_nr()}
			AUSS_SICH: ${get_auss_sich()}
			AUSS_ENTSI: ${get_auss_entsi()}
			BLI_SICH: ${get_bli_sich()}
			BLI_ENTSI: ${get_bli_entsi()}
			HFE_EZS: ${get_hfe_ezs()}
			HD_SICH: ${get_hd_sich()}
			HD_ENTSI: ${get_hd_entsi()}
			TD_VERRI: ${get_td_verri()}
			TD_ENTRI: ${get_td_entri()}
			ZV_NV: ${get_zv_nv()}
			SCHL_BEF: ${get_schl_bef()}
			THR_VERRI: ${get_thr_verri()}
			THR_ENTRI: ${get_thr_entri()}
			THL_VERRI: ${get_thl_verri()}
			THL_ENTRI: ${get_thl_entri()}
			TVR_VERRI: ${get_tvr_verri()}
			TVR_ENTRI: ${get_tvr_entri()}
			TVL_VERRI: ${get_tvl_verri()}
			TVL_ENTRI: ${get_tvl_entri()}
		""".trimIndent()
	}


	private fun getParam(o: Int, l: Int) : Int = CanBusNative.getECUParameterB(CanBAddrs.EZS_A1, o, l)
}