package com.na.e_blood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class SearchActivity extends AppCompatActivity {
    Spinner bloodGroup;
    Spinner rhFactor;
    String[] stringBloodGroup;
    String[] stringRhFactor;

    Button searchButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        SetSpinnerFunction();

        searchButton = (Button) findViewById(R.id.search_blood);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchActivity.this, AvailableDonors.class);
                startActivity(intent);
            }
        });

    }

    private void SetSpinnerFunction() {
        stringBloodGroup  =getResources().getStringArray(R.array.bloodGroup);
        stringRhFactor =getResources().getStringArray(R.array.rhFactor);

        bloodGroup = (Spinner) findViewById(R.id.spinner_bloodGroup);
        rhFactor = (Spinner) findViewById(R.id.spinner_rhFactor);


        /*ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_view, R.id.spinner_view, stringBloodGroup);
        bloodGroup.setAdapter(adapter);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, R.layout.rh_spinner_view, R.id.rh_spinner_view, stringRhFactor);
         bloodGroup.setAdapter(adapter1);*/
    }


}
