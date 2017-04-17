package com.example.amrit.emex.fragment;

/**
 * Created by amrit on 15/4/17.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.amrit.emex.R;

import java.util.ArrayList;

import com.example.amrit.emex.adapter.MyAdapter;
import com.example.amrit.emex.modal.JobHistory;

/**
 * job fragment
 */
public class JobFragment extends Fragment {

    private static final int MODE = 002;
    private ArrayList<JobHistory> jobHistoryModalArrayList = new ArrayList<>();
    private RecyclerView rv;

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup viewGroup, final Bundle savedInstanceState) {
        final View view;
        view = inflater.inflate(R.layout.frag_job, viewGroup, false);
        JobHistory jobHistory = new JobHistory("amrit", "343", "25/07/2016 05:50", "10.5km", "445", "4000", "40min");
        jobHistoryModalArrayList.add(jobHistory);

        MyAdapter adapter = new MyAdapter(jobHistoryModalArrayList, MODE);
        rv = (RecyclerView) view.findViewById(R.id.rv_display);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv.setAdapter(adapter);
        rv.setHasFixedSize(true);
        return view;

    }

}