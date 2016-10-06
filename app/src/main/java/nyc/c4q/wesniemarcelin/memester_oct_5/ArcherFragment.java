package nyc.c4q.wesniemarcelin.memester_oct_5;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by wesniemarcelin on 10/5/16.
 */

public class ArcherFragment extends Fragment {
    public ArcherFragment(){
        //default constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_chooser, container, false);
    }
}
