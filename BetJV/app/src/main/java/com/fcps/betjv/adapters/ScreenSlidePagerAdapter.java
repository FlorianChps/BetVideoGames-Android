package com.fcps.betjv.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.fcps.betjv.fragments.ContactFragment;

/**
 * Created by Flo on 13/01/2017.
 */

public class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {

    public ScreenSlidePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new ContactFragment();
    }

    @Override
    public int getCount() {
        return 5;
    }
}
