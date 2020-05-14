package com.launchpad.coroutine.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.launchpad.coroutine.repository.TodoRepository
import kotlinx.coroutines.Dispatchers

class LifeGoalViewModel : ViewModel() {
  private val repository: TodoRepository = TodoRepository()

  val firstTodo = liveData(Dispatchers.IO) {
    val retrivedTodo = repository.getTodo(1)
    emit(retrivedTodo)
  }

}
