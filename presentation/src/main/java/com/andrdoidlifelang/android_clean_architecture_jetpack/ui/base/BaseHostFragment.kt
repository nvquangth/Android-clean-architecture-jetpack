package com.andrdoidlifelang.android_clean_architecture_jetpack.ui.base

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import com.andrdoidlifelang.android_clean_architecture_jetpack.R
import com.andrdoidlifelang.android_clean_architecture_jetpack.ext.autoClear

abstract class BaseHostFragment<Binding : ViewDataBinding, VM : ViewModel> :
    BaseFragment<Binding, VM>() {

    private var navigationHost by autoClear<HostDestinationListener>()

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is HostDestinationListener) {
            navigationHost = context
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val toolbar = view.findViewById<Toolbar>(R.id.toolbar) ?: return
        navigationHost.registerToolbarWithNavigation(toolbar)
    }
}
