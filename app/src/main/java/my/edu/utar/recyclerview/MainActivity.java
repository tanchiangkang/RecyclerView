package my.edu.utar.recyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] dataset = {"Curry mee", "Hokkien mee", "Char Kuey Teow", "Satay", "Fried rice",
                            "Char Siew Pau", "Spaghetti Bolognese", "Roti Canai", "Kuih", "Beef Burger"};
        CustomAdapter customAdapter = new CustomAdapter(dataset);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(customAdapter);

        if (savedInstanceState != null) {
            counter = savedInstanceState.getInt("MyCounter");
        } else {
            counter = 0;
        }
        counter++;
        Log.i(TAG, "onCreate() " + counter);
    }

    @Override
    protected void onStart() {
        super.onStart();

        counter++;
        Log.i(TAG, "onStart() " + counter);
    }

    @Override
    protected void onResume() {
        super.onResume();

        counter++;
        Log.i(TAG, "onResume() " + counter);
    }

    @Override
    protected void onPause() {
        super.onPause();

        counter++;
        Log.i(TAG, "onPause() " + counter);
    }

    @Override
    protected void onStop() {
        super.onStop();

        counter++;
        Log.i(TAG, "onStop() " + counter);
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        counter++;
        Log.i(TAG, "onRestart() " + counter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        counter++;
        Log.i(TAG, "onDestroy() " + counter);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("MyCounter", counter);

        Log.i(TAG, "onSaveInstanceState " + counter);
    }

//    @Override
//    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
//        super.onRestoreInstanceState(savedInstanceState);
//
//        counter = savedInstanceState.getInt("MyCounter");
//    }
}