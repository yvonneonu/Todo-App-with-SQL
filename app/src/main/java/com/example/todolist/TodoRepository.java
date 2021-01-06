package com.example.todolist;

import android.content.Context;

import androidx.lifecycle.LiveData;

import java.util.ArrayList;
import java.util.List;

public class TodoRepository {
    private List<TodoModel> todoModels;
    private LiveData<List<TodoModel>> models;
    private TodoDAO todoDAO;
    private static TodoRepository todoRepository;



    private TodoRepository(Context context){
        TodoDatabase todoDatabase = TodoDatabase.todoDatabaseInstance(context);
        todoDAO = todoDatabase.TodoDao();
        todoModels = new ArrayList<>();
    }
     static TodoRepository getTodoRepositoryInstance(){

     return todoRepository;
    }


}
