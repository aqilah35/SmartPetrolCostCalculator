package com.example.smartpetrolcostcalculator;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Spinner spinnerPetrol;
    EditText etPrice, etFuel;
    RadioButton rbYes;
    Button btnCalculate;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        spinnerPetrol = findViewById(R.id.spinnerPetrol);
        etPrice = findViewById(R.id.etPrice);
        etFuel = findViewById(R.id.etFuel);
        rbYes = findViewById(R.id.rbYes);
        btnCalculate = findViewById(R.id.btnCalculate);
        tvResult = findViewById(R.id.tvResult);

        String[] petrolTypes = {
                "RON95",
                "RON97",
                "Diesel"
        };

        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(
                        this,
                        android.R.layout.simple_spinner_item,
                        petrolTypes);

        adapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);

        spinnerPetrol.setAdapter(adapter);

        btnCalculate.setOnClickListener(v -> {

            String petrol =
                    spinnerPetrol.getSelectedItem().toString();

            double price =
                    Double.parseDouble(
                            etPrice.getText().toString());

            double fuel =
                    Double.parseDouble(
                            etFuel.getText().toString());

            double totalCost = fuel * price;

            double rebate = 0;

            if (petrol.equals("RON95") && rbYes.isChecked()) {
                rebate = fuel * 1.99;
            }

            double saving = totalCost - rebate;

            tvResult.setText(
                    "Total Petrol Cost = RM "
                            + String.format("%.2f", totalCost)
                            + "\n\nBUDI Rebate = RM "
                            + String.format("%.2f", rebate)
                            + "\n\nTotal Saving = RM "
                            + String.format("%.2f", saving)
            );
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == R.id.menu_about){

            Intent intent =
                    new Intent(MainActivity.this,
                            AboutActivity.class);

            startActivity(intent);
            return true;

        }
        return super.onOptionsItemSelected(item);
    }

}