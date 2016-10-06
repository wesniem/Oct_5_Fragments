package nyc.c4q.wesniemarcelin.memester_oct_5;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by wesniemarcelin on 10/5/16.
 */

public class ChooserFragment extends Fragment {
    public static String TAG = "ChooseMemes";
    Button meme1;
    Button meme2;
    Button meme3;
    Button meme4;

    public ChooserFragment(){
        //Default constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.button_chooser, container, false);
        getActivity();
        return view;
    }

    public void onViewCreated(View view, Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        meme1 = (Button) view.findViewById(R.id.meme1_btn);
        meme2 = (Button) view.findViewById(R.id.meme2_btn);
        meme3 = (Button) view.findViewById(R.id.meme3_btn);
        meme4 = (Button) view.findViewById(R.id.meme4_btn);


        meme1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Navigates to first meme
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                FragmentManager fragmentManager = activity.getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.main_container, new ArcherFragment(),TAG).commit();
            }
        });

        meme2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Navigates to second meme
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                FragmentManager fragmentManager = activity.getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.main_container, new CupcakeFragment(), TAG).commit();

            }
        });

        meme3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Navigates to third meme
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                FragmentManager fragmentManager = activity.getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.main_container, new ProgramMeme(),TAG).commit();
            }
        });

        meme4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Navigates to fourth meme
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                FragmentManager fragmentManager = activity.getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.main_container, new TravelMeme(), TAG).commit();
            }
        });
    }

}
