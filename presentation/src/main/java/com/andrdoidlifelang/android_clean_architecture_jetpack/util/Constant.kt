package com.andrdoidlifelang.android_clean_architecture_jetpack.util

import com.andrdoidlifelang.android_clean_architecture_jetpack.R

object Constant {

    // Common
    const val CHROME_PACKAGE = "com.android.chrome"

    // Navigation
    const val NAV_ID_NONE = -1
    val HOST_DESTINATIONS = setOf(
        R.id.home_dest,
        R.id.schedule_dest,
        R.id.agenda_dest,
        R.id.map_dest,
        R.id.info_dest,
        R.id.setting_dest
    )
}
