package com.example.jmclaughlin6572.midterm;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class fragmentEditText extends Fragment {

    private OnFragmentInteractionListener mListener;
    private EditText name;
    private EditText comment;


    public interface OnFragmentInteractionListener {

        public void onFragmentInteraction(String name, String comment);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_edit_text, container, false);

        name = (EditText)view.findViewById(R.id.txtName);
        comment = (EditText)view.findViewById(R.id.txtComment);
        Button submit = (Button)view.findViewById(R.id.btnSubmit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                onButtonPressed(name.getText().toString(), comment.getText().toString());

            }
        });


        return view;
    }

    public void onButtonPressed(String name, String comment) {
        if (mListener != null) {
            mListener.onFragmentInteraction(name, comment);
        }
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            mListener = (OnFragmentInteractionListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + " must implement OnFragmentInteractionListener");
        }
    }




}
