package ru.netology.Radio;

public class Radio {
    public int volume;

    public int getVolume() {
        return volume;
    }

    public int numberRadioStation;

    public int getNumberRadioStation() {
        return numberRadioStation;
    }

    public void setNumberRadioStation(int newNumberRadioStation) {
        if (numberRadioStation > 9) {
            return;
        }
        if (numberRadioStation < 0) {
            return;
        }
        numberRadioStation = newNumberRadioStation;

    }

    public int setNext(int newNumberRadioStation) {
        if (numberRadioStation > 9) {
            numberRadioStation = newNumberRadioStation;
        } else {
            numberRadioStation = 0;
        }
        return numberRadioStation;
    }

    public int setPrev(int newNumberRadioStation) {
        if (numberRadioStation < 0) {
            numberRadioStation = newNumberRadioStation;
        } else {
            numberRadioStation = 9;
        }
        return numberRadioStation;
    }

    public void setIncreaseVolume(int newVolume) {
        if (volume < 100) {
            volume = newVolume + 1;
        }
    }

    public void setReductionVolume(int newVolume) {
        if (volume < 100) {
            volume = newVolume - 1;
        }
    }

    public int setMaxVolume(int newVolume) {
        if (volume > 100) {
        }
        return volume = 100;
    }

    public int setMinVolume(int newVolume) {
        if (volume < 0) {
        }
        return volume = 0;
    }

}
