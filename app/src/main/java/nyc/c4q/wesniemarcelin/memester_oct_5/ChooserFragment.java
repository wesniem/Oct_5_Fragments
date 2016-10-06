package nyc.c4q.wesniemarcelin.memester_oct_5;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
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
        View view = inflater.inflate(R.layout.fragment_chooser, container, false);
        getActivity();
        return view;
    }

    public void onViewCreated(View view, Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        meme1 = (Button) view.findViewById(R.id.meme1);
        meme2 = (Button) view.findViewById(R.id.meme2);
        meme3 = (Button) view.findViewById(R.id.meme3);
        meme4 = (Button) view.findViewById(R.id.meme4);


        meme1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Activity activity = getActivity();
                FragmentManager fragmentManager = activity.getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.activity_main, new ArcherFragment());
            }
        });
    }
}
