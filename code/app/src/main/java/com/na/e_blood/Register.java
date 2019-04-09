package com.na.e_blood;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Register extends AppCompatActivity {

    private EditText nameET, bgET, districtET, locationET, phoneNoET;
    private Button registerBT;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        databaseReference = FirebaseDatabase.getInstance().getReference("Donor");

        nameET = (EditText)findViewById(R.id.ETname);
        bgET = (EditText)findViewById(R.id.ETbg);
        districtET = (EditText)findViewById(R.id.ETdistrict);
        locationET = (EditText)findViewById(R.id.ETlocation);
        phoneNoET = (EditText)findViewById(R.id.ETphoneNo);
        registerBT = (Button)findViewById(R.id.BTregister);

        registerBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
            }
        });
    }

    public void saveData(){
        String name = nameET.getText().toString().trim();
        String bg = bgET.getText().toString().trim();
        String district = districtET.getText().toString().trim();
        String location = locationET.getText().toString().trim();
        String phoneNo = phoneNoET.getText().toString().trim();

        String key = databaseReference.push().getKey();
        DataToRegister data = new DataToRegister(name,bg,district,location,phoneNo);
        databaseReference.child(key).setValue(data);
        Toast.makeText(getApplicationContext(),"Information successfully" +
                " registered",Toast.LENGTH_LONG).show();

        nameET.setText("");
        bgET.setText("");
        districtET.setText("");
        locationET.setText("");
        phoneNoET.setText("");
    }
}
