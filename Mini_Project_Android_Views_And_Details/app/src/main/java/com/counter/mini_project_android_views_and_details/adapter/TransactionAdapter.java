package com.counter.mini_project_android_views_and_details.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.counter.mini_project_android_views_and_details.Transactions;

import java.util.ArrayList;

public class TransactionAdapter {

    ArrayList<Transactions> transactionsList;
    public TransactionAdapter (ArrayList<Transactions> currencyList){
        this.transactionsList = currencyList;

    }
    @NonNull
    @Override
    public TransactionsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.transaction_item, parent,false);
        return new TransactionsViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull TransactionAdapter.TransactionsViewHolder holder, int position) {
        Transactions transactions1 = transactionsList.get(position);
        holder.dateTextView.setText(Transactions.getDate());
        holder.typeTextView.setText(Transactions.getType());
        holder.amountTextView.setText(String.valueOf(transactions1.getAmount()));
        holder.balanceTextView.setText(String.valueOf(transactions1.getBalance()));

    }
}
