package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {


   @Test
    void setMaxStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(5);
        int excepted = 9;
        assertEquals(excepted, radio.getMaxStation());

    }

    @Test
    void setMinStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(2);
        int excepted = 0;
        assertEquals(excepted, radio.getMinStation());
    }

    @Test
    void setCurrentStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(3);
        int excepted = 3;
        assertEquals(excepted, radio.getCurrentStation());
    }

    @Test
    void setCurrentStationOverMaxStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(10);
        int excepted = 9;
        assertEquals(excepted, radio.getCurrentStation());
    }

    @Test
    void setCurrentStationEquallyMinStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(0);
        int excepted = 0;
        assertEquals(excepted, radio.getCurrentStation());
    }

    @Test
    void setCurrentStationUnderMinStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(-1);
        int excepted = 0;
        assertEquals(excepted, radio.getCurrentStation());
    }

    @Test
    void setMaxVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(4);
        int excepted = 10;
        assertEquals(excepted, radio.getMaxVolume());
    }

    @Test
    void setMinVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(8);
        int excepted = 0;
        assertEquals(excepted, radio.getMinVolume());
    }

    @Test
    void setCurrentVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(9);
        int excepted = 9;
        assertEquals(excepted, radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeOverMaxVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(12);
        int excepted = 10;
        assertEquals(excepted, radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeEquallyMinVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(0);
        int excepted = 0;
        assertEquals(excepted, radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeUnderMinVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(-2);
        int excepted = 0;
        assertEquals(excepted, radio.getCurrentVolume());
    }

    @Test
    void upVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(5);
        radio.upVolume();
        int excepted = 6;
        assertEquals(excepted, radio.getCurrentVolume());
    }

   @Test
    void upVolumeOverMaxVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(12);
        radio.upVolume();
        int excepted = 10;
        assertEquals(excepted, radio.getCurrentVolume());
    }

    @Test
    void downVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(5);
        radio.downVolume();
        int excepted = 4;
        assertEquals(excepted, radio.getCurrentVolume());
    }

    @Test
    void downVolumeOverMinVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(-5);
        radio.downVolume();
        int excepted = 0;
        assertEquals(excepted, radio.getCurrentVolume());
    }

    @Test
    void nextStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(3);
        radio.nextStation();
        int excepted = 4;
        assertEquals(excepted, radio.getCurrentStation());
    }

    @Test
    void nextStationAfterMaxStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(10);
        radio.nextStation();
        int excepted = 0;
        assertEquals(excepted, radio.getCurrentStation());
    }

   @Test
    void prevStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(3);
        radio.prevStation();
        int excepted = 2;
        assertEquals(excepted, radio.getCurrentStation());
    }
    @Test
    void prevStationAfterMinStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(-1);
        radio.prevStation();
        int excepted = 9;
        assertEquals(excepted, radio.getCurrentStation());
    }
}
