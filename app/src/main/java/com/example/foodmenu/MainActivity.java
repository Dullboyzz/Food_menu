package com.example.foodmenu;

import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodmenu.adapter.FoodAdapter;
import com.example.foodmenu.model.FoodItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private FoodAdapter adapter;
    private List<FoodItem> foodList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Food Menu");
        toolbar.setTitleTextColor(Color.WHITE);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.addItemDecoration(new ItemSpacingDecoration(16));

        foodList = new ArrayList<>();
        foodList.add(new FoodItem("Pizza", "₹ 250", R.drawable.pizza));
        foodList.add(new FoodItem("Burger", "₹ 150", R.drawable.burger));
        foodList.add(new FoodItem("Pasta", "₹ 200", R.drawable.pasta));
        foodList.add(new FoodItem("Sandwich", "₹ 120", R.drawable.sandwich));
        foodList.add(new FoodItem("Noodles", "₹ 180", R.drawable.noodles));
        foodList.add(new FoodItem("Sandwich", "₹ 180", R.drawable.sandwich));
        foodList.add(new FoodItem("Pizza", "₹ 180", R.drawable.pizza));
        foodList.add(new FoodItem("Pasta", "₹ 180", R.drawable.pasta));
        foodList.add(new FoodItem("Burger", "₹ 180", R.drawable.burger));
        foodList.add(new FoodItem("Noodles", "₹ 180", R.drawable.noodles));

        adapter = new FoodAdapter(foodList);
        recyclerView.setAdapter(adapter);
    }
}
