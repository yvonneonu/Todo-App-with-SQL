package com.example.todolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class todoAdapter extends RecyclerView.Adapter<todoAdapter.taskHolder>{
    List<TodoModel>tasks;
    Context context;

    public todoAdapter(List<TodoModel> task1, Context context1){
        tasks = task1;
        context = context1;

    }

    @NonNull
    @Override
    public taskHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.displaylayout, parent, false);
        return new taskHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull taskHolder holder, int position) {
        TodoModel todoModels = tasks.get(position);
        holder.title.setText(todoModels.getTitle());
        holder.description.setText(todoModels.getDescription());
        holder.time.setText(todoModels.getTime());
        holder.box.setChecked(todoModels.getCheck());
        Glide.with(context)
                .asBitmap()
                .load(todoModels.getImage())
                .placeholder(R.drawable.ramage)
                .into(holder.image);


}

    @Override
    public int getItemCount() {
        return tasks.size();
    }

       public class taskHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView title;
        TextView description;
        TextView time;
        CheckBox box;
        CardView cardView;


        public taskHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageView);
            title = itemView.findViewById(R.id.textTitle);
            description = itemView.findViewById(R.id.textDescription);
            time = itemView.findViewById(R.id.textTime);
            box = itemView.findViewById(R.id.checkBox);
            cardView = itemView.findViewById(R.id.cardView);

        }

    }


}
