package com.example.todolist;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class TodoViewmodel extends AndroidViewModel {
    LiveData<List<TodoModel>> ListTodo;
    TodoRepository todoRepository;

    public TodoViewmodel(Application application){
        super(application);
        todoRepository = TodoRepository.getTodoRepositoryInstance();
    }
}
