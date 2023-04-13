package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();

        radio.setNumberRadioStation(5);

        int expected = 5;
        int actual = radio.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioStationOutsideOne() {
        Radio radio = new Radio();

        radio.setNext(10);

        int expected = 0;
        int actual = radio.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioStationOutsideTwo() {
        Radio radio = new Radio();

        radio.setPrev(-1);

        int expected = 9;
        int actual = radio.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IncreaseVolume() {
        Radio volume = new Radio();

        volume.setIncreaseVolume(50);

        int expected = 51;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ReductionVolume() {
        Radio volume = new Radio();

        volume.setReductionVolume(48);

        int expected = 47;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaxVolumeOutside() {
        Radio volume = new Radio();

        volume.setMaxVolume(101);

        int expected = 100;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinVolumeOutside() {
        Radio volume = new Radio();

        volume.setMinVolume(-1);

        int expected = 0;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

}