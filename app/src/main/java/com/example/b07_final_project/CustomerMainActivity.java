package com.example.b07_final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CustomerMainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_main);

        TextView name = (TextView) findViewById(R.id.customerName);
        Customer c = new Customer("lol@gmail.com", "kek", "LMAO"); //placeholder
        name.setText(c.getName());

        Button logout = (Button) findViewById(R.id.logout);
        logout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.logout:
                startActivity(new Intent(this, LoginActivity.class));
                break;

        }
    }

    @Override
    public void onBackPressed() {
    }

}