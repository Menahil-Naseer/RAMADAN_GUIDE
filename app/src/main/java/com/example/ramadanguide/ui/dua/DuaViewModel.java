package com.example.ramadanguide.ui.dua;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DuaViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public DuaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is DUA fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
