package com.example.cupcake.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OrderViewModel : ViewModel() {
    private val _quantity = MutableLiveData<Int>(0)
    private val _flavor = MutableLiveData<String>("")
    private val _date = MutableLiveData<String>("")
    private val _price = MutableLiveData<Double>(0.0)

    fun setQuantity(numberCupcakes: Int) {
        _quantity.value = numberCupcakes
    }

    fun setFlavor(desiredFlavor: String) {
        _flavor.value = desiredFlavor

    }

    fun setDate(pickupDate: String) {
        _date.value = pickupDate
    }
}