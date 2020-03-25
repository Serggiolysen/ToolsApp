package com.lysenko.toolsapp.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.lysenko.myapplication.ui.viewModels.MainViewModel
import com.lysenko.toolsapp.R
import com.lysenko.toolsapp.remote.models.MachineToolApi
import com.lysenko.toolsapp.ui.adapters.Adapter
import com.lysenko.toolsapp.ui.adapters.ItemClickHandler
import com.lysenko.toolsapp.ui.helpers.Keys
import kotlinx.android.synthetic.main.fragment_details.*
import kotlinx.android.synthetic.main.fragment_main.*


class DetailsFragment : Fragment() {

    private var machineArgs: MachineToolApi? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        machineArgs = arguments?.getParcelable(Keys.MacineTools.title)

        Glide.with(context!!)
            .load(machineArgs!!.video1)
            .fitCenter()
            .into(imageView_fragment_details)

        textView_fragment_machine_title.text = machineArgs!!.model

        textView_fragment_details_description_1.text =
            "${resources.getString(R.string.machinelocation)}:  ${machineArgs!!.machinelocation}"
        textView_fragment_details_description_2.text =
            "${resources.getString(R.string.moving)}, X,Y,Z:  ${machineArgs!!.x}x${machineArgs!!.y}x${machineArgs!!.z}"
        textView_fragment_details_description_3.text =
            "${resources.getString(R.string.table_size)}:  ${machineArgs!!.xtable}x${machineArgs!!.ytable} mm"
        textView_fragment_details_description_4.text =
            "${resources.getString(R.string.axiscount)}й:  ${machineArgs!!.axiscount}"
        textView_fragment_details_description_5.text =
            "${resources.getString(R.string.machinecondition)}:  ${machineArgs!!.machinecondition}"


    }


}