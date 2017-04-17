package com.example.amrit.emex.fragment;

/**
 * Created by amrit on 15/4/17.
 */

import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.amrit.emex.R;

/**
 * HomeFrag activity
 */
public class HomeFragment extends Fragment {
    private ImageView imageView;


    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup viewGroup, final Bundle savedInstanceState) {
        final View view;
        view = inflater.inflate(R.layout.frag_main, viewGroup, false);

        imageView = (ImageView) view.findViewById(R.id.iv_back_button);
        imageView.setImageResource(R.drawable.ic_menu);

        TextView tvcustomtext = (TextView) view.findViewById(R.id.tv_custom_text);
        tvcustomtext.setText("Job History");

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                DrawerLayout drawerLayout = (DrawerLayout) getActivity().findViewById(R.id.drawer_layout);
                drawerLayout.openDrawer(Gravity.START);
            }
        });

        return view;
    }

    /**
     * @param savedInstanceState asd
     */
    public void onActivityCreated(final Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        final Button btnjobhistory = (Button) getActivity().findViewById(R.id.btn_job_history);
        final Button btnmissedjobs = (Button) getActivity().findViewById(R.id.btn_missed_jobs);
        btnjobhistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {

                btnjobhistory.setBackgroundResource(R.color.colorPrimary);
                btnmissedjobs.setBackgroundResource(R.color.colorPrimaryDark);
                JobFragment jobFragment = new JobFragment();
                FragmentManager fmjob = getChildFragmentManager();
                FragmentTransaction ftjob = fmjob.beginTransaction();
                ftjob.replace(R.id.fl_display, jobFragment);
                ftjob.commit();
            }
        });

        btnmissedjobs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {

                btnjobhistory.setBackgroundResource(R.color.colorPrimaryDark);
                btnmissedjobs.setBackgroundResource(R.color.colorPrimary);
                JobMissedFragment missedjobFragment = new JobMissedFragment();
                FragmentManager fmjob = getChildFragmentManager();
                FragmentTransaction ftjob = fmjob.beginTransaction();
                ftjob.replace(R.id.fl_display, missedjobFragment);
                ftjob.commit();
            }
        });
    }
}

