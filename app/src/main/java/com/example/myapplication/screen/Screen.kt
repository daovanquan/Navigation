package com.example.myapplication.screen

import com.example.myapplication.R
import com.example.myapplication.utils.Constant

sealed class Screen(val route: String, val image: Int){
    data object ModelScreen: Screen(route = Constant.MODEL_NAME, R.drawable.model)
    data object DefrostScreen: Screen(route = Constant.DEFROST, R.drawable.defrost)
    data object HeaterScreen: Screen(route = Constant.HEATER, R.drawable.heater)
    data object SeatScreen: Screen(route = Constant.SEAT, R.drawable.seat)
    data object DriverTempScreen: Screen(route = Constant.DRIVER_TEMP, R.drawable.drivertemp)
    data object FanScreen: Screen(route = Constant.FAN_LEVEL, R.drawable.fanlevel)
    data object PassengerTempScreen: Screen(route = Constant.PASSENGER_TEMP, R.drawable.passengertemp)
    data object Seat2Screen: Screen(route = Constant.SEAT2, R.drawable.seat_2)
    data object MusicScreen: Screen(route = Constant.MUSIC, R.drawable.music)
    data object PhoneScreen: Screen(route = Constant.PHONE, R.drawable.phone)
    data object VolumeScreen: Screen(route = Constant.VOLUME, R.drawable.volume)

}

val bottomNavBarTab = listOf(
    Screen.ModelScreen,
    Screen.DefrostScreen,
    Screen.HeaterScreen,
    Screen.SeatScreen,
    Screen.DriverTempScreen,
    Screen.FanScreen,
    Screen.PassengerTempScreen,
    Screen.Seat2Screen,
    Screen.MusicScreen,
    Screen.PhoneScreen,
    Screen.VolumeScreen
)