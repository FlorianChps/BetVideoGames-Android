package com.fcps.betjv;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.fcps.betjv.adapters.ScreenSlidePagerAdapter;
import com.fcps.betjv.animations.ZoomOutPageTransformer;
import com.fcps.betjv.fragments.BetFragment;
import com.fcps.betjv.fragments.ContactFragment;
import com.fcps.betjv.fragments.NotificationFragment;
import com.fcps.betjv.fragments.ProfileFragment;
import com.fcps.betjv.fragments.SettingsFragment;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindAndInitView();

        FragmentsUtils.switchFragment(this, new NotificationFragment());

    }
    private void initBottomNavView(final AppCompatActivity activity, BottomNavigationView navigationView) {
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                handleBottomNavItemSelected(item, activity);
                return true;
            }
        });
    }

    private void handleBottomNavItemSelected(@NonNull MenuItem item, AppCompatActivity activity) {
        switch (item.getItemId()) {
            case R.id.nav_bot_notif:
                FragmentsUtils.switchFragment(activity, new NotificationFragment());
                break;
            case R.id.nav_bot_profile:
                FragmentsUtils.switchFragment(activity, new ProfileFragment());
                break;
            case R.id.nav_bot_create_bet:
                FragmentsUtils.switchFragment(activity, new BetFragment());
                break;
            case R.id.nav_bot_settings:
                FragmentsUtils.switchFragment(activity, new SettingsFragment());
                break;
            case R.id.nav_bot_contact:
                FragmentsUtils.switchFragment(activity, new ContactFragment());
                break;
            case 0:
                break;
        }
    }

    private void bindAndInitView(){
        BottomNavigationView navigationView = (BottomNavigationView)
                findViewById(R.id.nav_bottom_view);

        initBottomNavView(this, navigationView);
    }
}
