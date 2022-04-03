package com.example.ramadanguide.ui.home;

import static androidx.core.content.ContextCompat.getSystemService;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.ramadanguide.R;
import com.example.ramadanguide.RecyclercontactAdapter;
import com.example.ramadanguide.contactModel;
import com.example.ramadanguide.databinding.FragmentHomeBinding;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class HomeFragment extends Fragment{


        private FragmentHomeBinding binding;


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        HomeViewModel homeViewModel = new ViewModelProvider(this, (ViewModelProvider.Factory) new ViewModelProvider.NewInstanceFactory()).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


            return root;

        }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}