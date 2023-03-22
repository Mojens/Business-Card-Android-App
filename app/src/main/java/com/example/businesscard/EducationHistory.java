package com.example.businesscard;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EducationHistory extends AppCompatActivity {

    String[] educationHistory = {
            "High School Diploma (2005)",
            "Associate's Degree in Business Administration (2007)",
            "Bachelor's Degree in Marketing (2010)",
            "Master's Degree in Education (2014)",
            "Doctorate Degree in Psychology (2020)",
            "Professional Certification or License in Nursing (2012)",
            "Trade School or Vocational Training in Automotive Technology (2008)",
            "Online Courses or Certificates in Web Development (2016)",
            "Bootcamps or Intensive Training Programs in Data Science (2018)",
            "Language Classes or Immersion Programs in Spanish (2009)",
            "Study Abroad Program in Italy (2011)",
            "Military Training or Service in the Army (2006-2010)",
            "Apprenticeship Program in Carpentry (2013-2015)",
            "Continuing Education Courses or Workshops in Project Management (2017)"
    };

    private ListView educationListView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education_history);

        educationListView = findViewById(R.id.educationList);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, educationHistory);

        educationListView.setAdapter(adapter);


    }

    public void goBack(View view){
        finish();
    }
}