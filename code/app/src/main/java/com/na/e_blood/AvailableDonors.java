package com.na.e_blood;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class AvailableDonors extends AppCompatActivity {

    private ListView listView;
    DatabaseReference databaseReference;
    private List<DataToRegister> dataToRegisterList;
    private Custom_adapter custom_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available_donors);

        databaseReference = FirebaseDatabase.getInstance().getReference("Donor");

        dataToRegisterList = new ArrayList<>();
        custom_adapter = new Custom_adapter(AvailableDonors.this, dataToRegisterList);

        listView = (ListView)findViewById(R.id.listViewId);
    }

    @Override
    protected void onStart() {

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                dataToRegisterList.clear();
                for(DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()){
                    DataToRegister dataToRegister = dataSnapshot1.getValue(DataToRegister.class);
                    dataToRegisterList.add(dataToRegister);
                }

                listView.setAdapter(custom_adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        super.onStart();
    }
}
