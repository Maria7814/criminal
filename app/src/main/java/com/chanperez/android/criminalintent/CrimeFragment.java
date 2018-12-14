package com.aldaircasanova.android.criminalintent;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import model.Crime;


public class CrimeFragment extends Fragment {
    private Crime mCrime;
    private EditText mtitleField;
    private Button mDateButton;
    private CheckBox mSolvedCheckbox;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      View v = inflater.inflate(R.layout.fragment_crime,container,false);

      mtitleField=v.findViewById(R.id.crime_title);
      mDateButton=v.findViewById(R.id.crime_date);
      mSolvedCheckbox=v.findViewById(R.id.crime_solved);

      mDateButton.setText(mCrime.getDate().toString());
      mDateButton.setEnabled(false);

      mtitleField.addTextChangedListener(new TextWatcher() {
          @Override
          public void beforeTextChanged(CharSequence s, int start, int count, int after) {

          }

          @Override
          public void onTextChanged(CharSequence s, int start, int before, int count) {
            mCrime.setTitle(mtitleField.getText().toString());
          }

          @Override
          public void afterTextChanged(Editable s) {

          }
      });

            mSolvedCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    mCrime.setSolved(mSolvedCheckbox.isChecked());
                }
            });

        return v;
    }
}


