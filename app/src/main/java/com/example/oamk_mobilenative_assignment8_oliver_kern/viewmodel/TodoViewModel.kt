package com.example.oamk_mobilenative_assignment8_oliver_kern.viewmodel

import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.oamk_mobilenative_assignment8_oliver_kern.model.Todo
import com.example.oamk_mobilenative_assignment8_oliver_kern.model.TodosApi
import kotlinx.coroutines.launch

class TodoViewModel : ViewModel() {
    var todos = mutableStateListOf<Todo>()
        private set


    init {
        getTodosList()
    }

    private fun getTodosList() {
        viewModelScope.launch {
            val todosApi: TodosApi?
            try {
                todosApi = TodosApi.getInstance()
                todos.clear()
                todos.addAll(todosApi.getTodos())
            } catch (e: Exception) {
                Log.d("TODOVIEWMODEL", e.message.toString())
            }
        }
    }
}
