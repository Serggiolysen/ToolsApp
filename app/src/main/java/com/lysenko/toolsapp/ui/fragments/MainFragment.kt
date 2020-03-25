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
import com.lysenko.myapplication.ui.viewModels.MainViewModel
import com.lysenko.toolsapp.R
import com.lysenko.toolsapp.remote.models.MachineToolApi
import com.lysenko.toolsapp.ui.adapters.Adapter
import com.lysenko.toolsapp.ui.adapters.ItemClickHandler
import com.lysenko.toolsapp.ui.helpers.Keys
import kotlinx.android.synthetic.main.fragment_main.*


class MainFragment : Fragment() {

    private lateinit var mainViewModel: MainViewModel
    private lateinit var adapter: Adapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        mainViewModel.fetchMachineToolsList()
            .observe(viewLifecycleOwner, androidx.lifecycle.Observer {
                setupAdapter()
                adapter.setData(it)
            })
    }

    private fun setupAdapter() {
        adapter = Adapter()

        recyclerList.layoutManager =
            GridLayoutManager(context, 2, GridLayoutManager.VERTICAL, false)
        recyclerList.addItemDecoration(DividerItemDecoration(context, LinearLayoutManager.VERTICAL))
        recyclerList.adapter = adapter

        adapter.attachClickHandler(object : ItemClickHandler {
            override fun onItemClick(item: MachineToolApi) {
                val bundle = Bundle()
                bundle.putParcelable(Keys.MacineTools.title, item)
                recyclerList.findNavController().navigate(R.id.detailsFragment, bundle)
            }
        })
    }
}