package com.example.alumnos.criminalintent;

import android.support.v4.app.Fragment;

public class CrimeListActivity extends SingleFragmentActivity {

    //Implementacion del metodo createFragment()
    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}