package com.example.customlists;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity {
    ArrayList<Product> products = new ArrayList<Product>();
    BoxAdapter boxAdapter;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fillData();
        boxAdapter = new BoxAdapter(this, products);
        ListView lvMain = (ListView)findViewById(R.id.lvMain);
        lvMain.setAdapter(boxAdapter);
    }
    void fillData() {
        for (int i = 1; i <= 20; i++) {
            products.add(new Product("Product " + i, i * 1000, R.drawable.ic_launcher_background, false));
        }
    }
    public void showResult(View v) {
        String result = "Produsele selectate";
        for (Product p : boxAdapter.getBox()) {
            if (p.box)
                result += "\n" + p.name;
        }
        Toast.makeText(this, result, Toast.LENGTH_LONG).show();
    }
}