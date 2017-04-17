package com.example.amrit.emex.adapter;
/**
 * Created by amrit on 14/4/17.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.amrit.emex.R;

import java.util.ArrayList;

import com.example.amrit.emex.modal.JobHistory;

/**
 * Adapter Activity
 */
public class MyAdapter extends android.support.v7.widget.RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private ArrayList<JobHistory> jobHistorylist;
    private JobHistory missedjobhistory;
    private int vpmode;

    /**
     * @param jobHistorylist arraylist
     * @param vpmode         view pager mode
     */
    public MyAdapter(final ArrayList<JobHistory> jobHistorylist, final int vpmode) {
        this.jobHistorylist = jobHistorylist;
        this.vpmode = vpmode;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        missedjobhistory = jobHistorylist.get(position);

        if (vpmode == 00) {
            holder.tvPickup.setText(missedjobhistory.getPickuploc());
            holder.tvName.setText(missedjobhistory.getName());
            holder.tvKm.setText(missedjobhistory.getKm());
            holder.tvDate.setText(missedjobhistory.getDate());
            holder.tvDestination.setText(missedjobhistory.getDestination());
            holder.tvDuration.setText(missedjobhistory.getDuration());
        } else {
            holder.tvPickup.setText(missedjobhistory.getPickuploc());
            holder.tvName.setText(missedjobhistory.getName());
            holder.tvKm.setText(missedjobhistory.getKm());
            holder.tvDate.setText(missedjobhistory.getDate());

        }
    }

    @Override
    public int getItemCount() {
        return jobHistorylist.size();
    }


    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {


        View convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.job_missed_histry, parent, false);
        ViewHolder viewHolder = new ViewHolder(convertView);
        /**
         * return view holder
         */
        return viewHolder;
    }


    /**
     * view holder
     */
    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvDate, tvKm, tvName, tvPickup, tvDestination, tvDuration, tvFare;
        private LinearLayout layoutl;

        /**
         * @param itemView item view
         */
        public ViewHolder(final View itemView) {
            super(itemView);
            tvDate = (TextView) itemView.findViewById(R.id.tv_date);
            tvName = (TextView) itemView.findViewById(R.id.tv_name);
            tvKm = (TextView) itemView.findViewById(R.id.tv_km);
            tvPickup = (TextView) itemView.findViewById(R.id.tv_pickup);
            tvDestination = (TextView) itemView.findViewById(R.id.tv_destination);
            tvFare = (TextView) itemView.findViewById(R.id.tv_fare);
            tvDuration = (TextView) itemView.findViewById(R.id.tv_duration);

            layoutl = (LinearLayout) itemView.findViewById(R.id.llayout);
            if (vpmode == 01) {
                tvDestination.setVisibility(View.INVISIBLE);
                layoutl.setVisibility(View.GONE);

            }

        }
    }
}

