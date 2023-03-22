package com.example.businesscard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class EmploymentHistory extends AppCompatActivity {

    String[] employmentHistory = {"Java Developer at ABC Corporation (2010-2012)",
            "Senior Java Engineer at XYZ Solutions (2013-2015)",
            "Java Architect at DEF Corporation (2016-2017)",
            "Java Team Lead at GHI Systems (2018-2019)",
            "Java Software Engineer at JKL Technologies (2020-2021)",
            "Java Full-Stack Developer at MNO Enterprises (2022-present)",
            "Java Consultant at PQR Consulting (2014-2015)",
            "Java Programmer at STU Corporation (2016-2018)",
            "Java Technical Lead at VWX Systems (2019-2021)",
            "Java Solution Architect at YZA Technologies (2021-present)"};

    private ListView employmentListView;


    private Button goBackButton;
    private Button goToEducationHistoryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employmenthistory);

        employmentListView = findViewById(R.id.employmentList);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, employmentHistory);

        employmentListView.setAdapter(adapter);

        goBackButton = findViewById(R.id.backToMainButton1);
        goBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        goToEducationHistoryButton = findViewById(R.id.educationButton);
        goToEducationHistoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmploymentHistory.this, EducationHistory.class);
                startActivity(intent);
            }
        });





    }

}