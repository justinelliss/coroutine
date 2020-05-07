package com.launchpad.coroutine.ui.main

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.launchpad.coroutine.R
import com.launchpad.coroutine.models.Todo
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment() {

  companion object {
    fun newInstance() = MainFragment()
  }

  private lateinit var viewModel: LifeGoalViewModel

  override fun onCreateView(
      inflater: LayoutInflater, container: ViewGroup?,
      savedInstanceState: Bundle?
  ): View {
    return inflater.inflate(R.layout.main_fragment, container, false)
  }

  override fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)

    viewModel = ViewModelProvider(this).get(LifeGoalViewModel::class.java)

    viewModel.firstTodo.observe(viewLifecycleOwner, Observer{
      populateTodo(it)
    })

  }

  @SuppressLint("SetTextI18n")
  private fun populateTodo(it: Todo) {
    message.text = "Result: " + it.title
  }
}
