package com.alyndroid.architecturepatternstutorialshomework.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.alyndroid.architecturepatternstutorialshomework.pojo.DataBase;
import com.alyndroid.architecturepatternstutorialshomework.pojo.NumberModel;

public class NumberViewModel extends ViewModel {
    public MutableLiveData<Integer> sumMutableLiveData = new MutableLiveData<>();
    public MutableLiveData<Integer> divMutableLiveData = new MutableLiveData<>();
    public MutableLiveData<Integer> mulMutableLiveData = new MutableLiveData<>();

    public void sumNumbers() {
        sumMutableLiveData.setValue(getNumbersFromDataBase().getFirstNum() + getNumbersFromDataBase().getSecondNum());
    }

    public void divNumbers() {
        divMutableLiveData.setValue(getNumbersFromDataBase().getFirstNum() / getNumbersFromDataBase().getSecondNum());
    }

    public void mulNumbers() {
        mulMutableLiveData.setValue(getNumbersFromDataBase().getFirstNum() * getNumbersFromDataBase().getSecondNum());
    }

    //    get values from database
    private NumberModel getNumbersFromDataBase() {
        return new DataBase().getNumbers();
    }
}
