package model;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class CrimeLab {

    private static  CrimeLab sCrimeLab;
    private List<Crime> mcrimes;

   public static  CrimeLab get (Context context){
       if (sCrimeLab == null){
           sCrimeLab = new CrimeLab(context);
       }
       return  sCrimeLab;
   }

    private CrimeLab(Context context){
        mcrimes = new ArrayList<>();
        for (int i =1; i<= 100; i++){
            Crime crime = new Crime();
            crime.setTitle("Crime @"+ i);
            crime.setSolved(i+2==0);
            mcrimes.add(crime);

        }
    }

}
