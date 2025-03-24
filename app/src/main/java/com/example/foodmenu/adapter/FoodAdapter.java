package com.example.foodmenu.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodmenu.R;
import com.example.foodmenu.model.FoodItem;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {
    private List<FoodItem> foodList;

    public FoodAdapter(List<FoodItem> foodList) {
        this.foodList = foodList;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_food, parent, false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        FoodItem foodItem = foodList.get(position);
        holder.foodName.setText(foodItem.getName());
        holder.foodPrice.setText(foodItem.getPrice());
        holder.foodImage.setImageResource(foodItem.getImageResId());
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }

    static class FoodViewHolder extends RecyclerView.ViewHolder {
        TextView foodName, foodPrice;
        ImageView foodImage;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            foodName = itemView.findViewById(R.id.tvFoodName);
            foodPrice = itemView.findViewById(R.id.tvFoodPrice);
            foodImage = itemView.findViewById(R.id.imgFood);
        }
    }
}

