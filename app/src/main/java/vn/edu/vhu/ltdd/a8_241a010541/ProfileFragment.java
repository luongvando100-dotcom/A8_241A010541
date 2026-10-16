package vn.edu.vhu.ltdd.a8_241a010541;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

public class ProfileFragment extends Fragment {
    public ProfileFragment() {
        super(R.layout.fragment_profile);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        MainViewModel viewModel = new ViewModelProvider(requireActivity()).get(MainViewModel.class);

        viewModel.getUserName().observe(getViewLifecycleOwner(), name -> {
            ((TextView) view.findViewById(R.id.tvTen)).setText(name);
        });

        viewModel.getUserMssv().observe(getViewLifecycleOwner(), mssv -> {
            ((TextView) view.findViewById(R.id.tvMssv)).setText(
                    getString(R.string.profile_mssv, mssv));
        });
    }
}
