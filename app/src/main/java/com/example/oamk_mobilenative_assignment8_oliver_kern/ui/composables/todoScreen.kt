package com.example.oamk_mobilenative_assignment8_oliver_kern.ui.composables

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.oamk_mobilenative_assignment8_oliver_kern.viewmodel.TodoViewModel

@Composable
fun TodoScreen(todoViewModel: TodoViewModel = viewModel()) {
    TodoList(todos = todoViewModel.todos)
}
