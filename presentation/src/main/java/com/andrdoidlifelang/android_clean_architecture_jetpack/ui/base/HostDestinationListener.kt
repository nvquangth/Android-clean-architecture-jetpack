package com.andrdoidlifelang.android_clean_architecture_jetpack.ui.base

import androidx.appcompat.widget.Toolbar

/**
 * This classes is used by components that is host by top-level destination in the drawer.
 */
interface HostDestinationListener {

    // Called by BaseHostFragment's children to setup their toolbar with the Main's drawer
    fun registerToolbarWithNavigation(toolbar: Toolbar)
}
