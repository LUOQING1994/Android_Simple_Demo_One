package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;

import android.app.Fragment;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment {

    public static FragmentOne newInstance() { return new FragmentOne();}
    private View root;
    private Button button;
    private ImageView imageView;
    private Context context;
    private Toast toast;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_one, container, false);
        button = root.findViewById(R.id.button);
        imageView = root.findViewById(R.id.imageView);
        context = getContext();
        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View view) {
                String tagName = (String) button.getText();
                if ( tagName.equals("隐藏")){
                    imageView.setVisibility(0x00000004);
                    button.setText("显示");
                    toast = Toast.makeText(context, "隐藏图片", Toast.LENGTH_SHORT);
                } else {
                    imageView.setVisibility(0x00000000);
                    button.setText("隐藏");
                    toast = Toast.makeText(context, "显示图片", Toast.LENGTH_SHORT);
                }
                toast.setGravity(Gravity.CENTER,10, 300);
                toast.show();
            }
        });

        return root;
    }
}
