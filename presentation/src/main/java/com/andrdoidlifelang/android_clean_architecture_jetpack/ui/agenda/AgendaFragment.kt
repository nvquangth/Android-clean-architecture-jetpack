package com.andrdoidlifelang.android_clean_architecture_jetpack.ui.agenda

import androidx.fragment.app.viewModels
import com.andrdoidlifelang.android_clean_architecture_jetpack.R
import com.andrdoidlifelang.android_clean_architecture_jetpack.databinding.FragmentAgendaBinding
import com.andrdoidlifelang.android_clean_architecture_jetpack.ui.base.BaseHostFragment

class AgendaFragment : BaseHostFragment<FragmentAgendaBinding, AgendaViewModel>() {

    override val viewModel by viewModels<AgendaViewModel>()

    override val layoutId: Int = R.layout.fragment_agenda
}
