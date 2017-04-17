package com.example.amrit.emex.fragment;
/**
 * Created by amrit on 15/4/17.
 */

import android.support.v4.app.Fragment;
import android.os.Bundle;
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
 * Job missed details
 */

public class JobMissedFragment extends Fragment {
    private static final int MODE = 001;
    private ArrayList<JobHistory> jobHistoryArrayList = new ArrayList<>();
    private RecyclerView rv;

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup viewGroup, final Bundle savedInstanceState) {
        final View view;
        view = inflater.inflate(R.layout.frag_job_miss, viewGroup, false);
        JobHistory jobHistoryModal = new JobHistory("rajan", "007A", "26/07/2016 08:00", "20km");
        jobHistoryArrayList.add(jobHistoryModal);

        MyAdapter adapter = new MyAdapter(jobHistoryArrayList, MODE);
        rv = (RecyclerView) view.findViewById(R.id.rv_display);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv.setAdapter(adapter);
        rv.setHasFixedSize(true);
        return view;

    }

}

