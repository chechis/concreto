package silicato_gris.myapplication.fragmento;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import silicato_gris.myapplication.R;

public class Cantidad extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.cantidad, container, false);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        getActivity().setTitle("Cantidad de material");
    }

}