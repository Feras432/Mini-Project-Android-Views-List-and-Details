package com.counter.mini_project_android_views_and_details;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView transactionsRecyclerView;
    ArrayList<Transactions> transaction = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        transactionsRecyclerView = findViewById(R.id.transactionsRecyclerView);
       transactionsRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        TransactionAdapter currencyAdapter = new TransactionAdapter(Transaction);


        transactionsRecyclerView.setAdapter(transactionAdapter);
        addTransaction();
    }
    private void addCurrency(){
        Transactions transaction1 = new Transactions();
       transaction.add(transaction1);
        Transactions transaction2 = new Transactions();
        transaction.add(transaction2);
        Transactions transaction3 = new Transactions();
        transaction.add(transaction3);
    }
}