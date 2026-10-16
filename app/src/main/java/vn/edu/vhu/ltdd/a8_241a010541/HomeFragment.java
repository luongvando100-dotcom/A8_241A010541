package vn.edu.vhu.ltdd.a8_241a010541;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {
    private static final String TAG = "A8_241A010541/Home";

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d(TAG, "onAttach – Fragment được gắn vào Activity");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate – Fragment được tạo");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView – Dựng cây View");
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(TAG, "onViewCreated – View đã sẵn sàng");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart – Fragment hiện ra");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume – Fragment nhận thao tác");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause – Fragment bị che");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop – Fragment dừng hiển thị");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "onDestroyView – View bị hủy (Fragment có thể vẫn còn sống)");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy – Fragment bị hủy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "onDetach – Gỡ khỏi Activity");
    }
}
