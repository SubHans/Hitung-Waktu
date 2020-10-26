package com.example.timecounter.viewModel;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.timecounter.model.Waktu;

public class ViewModelsWaktu extends ViewModel {
    public Waktu waktu = new Waktu();

    public void hitungTotal(){
        
        waktu.setTotal(waktu.getDetik()+(waktu.getMenit()*60)+(waktu.getJam()*3600));

    }

}
