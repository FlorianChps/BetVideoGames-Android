package com.fcps.betjv;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Flo on 14/01/2017.
 */

public class FragmentsUtils {

    public static void switchFragment(AppCompatActivity activityCompat, Fragment toFragment) {
        FragmentManager fragmentManager = activityCompat.getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();


        transaction.add(R.id.fragment_container, toFragment);

        // Replace whatever is in the fragment_container view with this fragment,
        // and add the transaction to the back stack so the user can navigate back
        transaction.replace(R.id.fragment_container, toFragment);
        transaction.addToBackStack(null);

        transaction.commit();
    }

}
