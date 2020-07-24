package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter=new MyAdapter(this,getMyList());
        recyclerView.setAdapter(myAdapter);
    }

    private ArrayList<Model> getMyList()
    {
        ArrayList<Model> models=new ArrayList<>();



        Model m = new  Model();
        m.setTitleTV("Information Technology");
        m.setDescriptionTV("Innerwork Solution");
        m.setLocationTV("Banglore, Delhi, Hydrabad");
        m.setJobTV("Job/Internship");
        m.setStipentTV("15000");
        m.setEducationTV(" B.tech, M.tech, BCA, MCA");
        models.add(m);

        m = new  Model();
        m.setTitleTV("Graphics Design");
        m.setDescriptionTV("Innerwork Solution");
        m.setLocationTV("Noida, Delhi, Jaipur");
        m.setJobTV("Job/Internship");
        m.setStipentTV("14000");
        m.setEducationTV("Any Graduate and above");
        models.add(m);

        m = new  Model();
        m.setTitleTV("Business Development Executive");
        m.setDescriptionTV("Innerwork Solution");
        m.setLocationTV("Banglore, Indore, Pune");
        m.setJobTV("Job/Internship");
        m.setStipentTV("17000");
        m.setEducationTV("BBA, MBA, B.com, M.com");
        models.add(m);

        m = new  Model();
        m.setTitleTV("Content Manager");
        m.setDescriptionTV("Innerwork Solution");
        m.setLocationTV("Manglore, Kota, Goa");
        m.setJobTV("Job/Internship");
        m.setStipentTV("18000");
        m.setEducationTV("Any Graduate and above");
        models.add(m);

        m = new  Model();
        m.setTitleTV("Social Media");
        m.setDescriptionTV("Innerwork Solution");
        m.setLocationTV("Banglore, NCR, Hydrabad");
        m.setJobTV("Job/Internship");
        m.setStipentTV("15000");
        m.setEducationTV("Any Graduate and above");
        models.add(m);

        m = new  Model();
        m.setTitleTV("Human Resources");
        m.setDescriptionTV("Innerwork Solution");
        m.setLocationTV("Banglore, Delhi, Noida");
        m.setJobTV("Job/Internship");
        m.setStipentTV("18000");
        m.setEducationTV("BBA, MBA");
        models.add(m);

        return models;
    }
}
