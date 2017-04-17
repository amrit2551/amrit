package com.example.amrit.emex.ui;

/**
 * Created by amrit on 14/4/17.
 */

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.amrit.emex.R;
import com.example.amrit.emex.fragment.JobFragment;

/**
 * home screen activity containing drawer
 */
public class HomeActivity extends AppCompatActivity {

    private ImageView iv, ivcall, ivMail;
    private DrawerLayout drawerLayout;
    private TextView tvJob;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        iv = (ImageView) findViewById(R.id.iv_back_button);
        iv.setImageResource(R.drawable.ic_menu);

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
                drawerLayout.openDrawer(Gravity.START);
            }
        });

        ivcall = (ImageView) findViewById(R.id.iv_call);
        ivcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                ivcall.setImageResource(R.drawable.icon_support_call_pressed);
            }
        });
        ivMail = (ImageView) findViewById(R.id.iv_mail);
        ivMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                ivMail.setImageResource(R.drawable.icon_support_msg_normal);
            }
        });

        tvJob = (TextView) findViewById(R.id.tv_jobhistory);
        tvJob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {

                drawerLayout.closeDrawer(Gravity.START);

                JobFragment jobfragment = new JobFragment();

                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();

                ft.replace(R.id.frame_Layout, jobfragment);
                ft.commit();


            }
        });


    }
}

