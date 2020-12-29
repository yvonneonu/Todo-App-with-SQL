package com.example.todolist;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface TodoDAO {
    @Query("SELECT * FROM task")
    LiveData<List<TodoModel>>getAllTasks();

    @Insert
    void Insert (TodoModel todoModel);

}
