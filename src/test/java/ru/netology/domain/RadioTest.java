//package ru.netology.domain;
//
//import org.junit.jupiter.api.Test;
//
//class RadioTest {
//    Radio volume = new Radio();
//    Radio station = new Radio();
//
//    Radio radio = new Radio(25, 0, 0, 100,
//            0, 9, true);
//
//
//    @Test
//    public void sholdincreaseVolumeOutOfRangeMax() {
//
//        volume.setIncreaseVolume(101);
//        int expected = 0;
//        int actual = volume.getIncreaseVolume();
//        assertEquals(expected, actual);
//    }
//
//
//    @Test
//    public void setVolume(Radio volume) {
//        this.volume = volume;
//    }
//
//    public void setStation(Radio station) {
//        this.station = station;
//    }
//
//    public Radio getVolume() {
//        return volume;
//    }
//
//    public Radio getStation() {
//        return station;
//    }
//
//    @Test
//    public void sholdincreaseVolumeOutOfRangeMax() {
//
//        volume.setIncreaseVolume(101);
//        int expected = 0;
//        int actual = volume.getIncreaseVolume();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void sholdincreaseVolumeMax() {
//
//        volume.setIncreaseVolume(100);
//        int expected = 100;
//        int actual = volume.getIncreaseVolume();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void sholdincreaseVolumeMin() {
//
//        volume.setIncreaseVolume(0);
//        int expected = 0;
//        int actual = volume.getIncreaseVolume();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void sholdincreaseVolumeOutOfRangeMin() {
//
//        volume.setIncreaseVolume(-1);
//        int expected = 0;
//        int actual = volume.getIncreaseVolume();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void sholdincreaseVolumeInOfRange() {
//
//        volume.setIncreaseVolume(5);
//        int expected = 5;
//        int actual = volume.getIncreaseVolume();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void sholdCurrentStation() {
//
//        station.setCurrentStation(5);
//        int expected = 5;
//        int actual = station.getCurrentStation();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void sholdCurrentStationOutOfRangeMax() {
//
//        station.setCurrentStation(10);
//        int expected = 0;
//        int actual = station.getCurrentStation();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void sholdCurrentStationOutOfRangeMin() {
//
//        station.setCurrentStation(-1);
//        int expected = 9;
//        int actual = station.getCurrentStation();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void sholdIncreaseVolumeByOneForward() {
//
//        volume.setIncreaseVolume(100);
//
//        int expected = 100;
//        int actual = volume.getIncreaseVolume();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void sholdIncreaseVolumeByOneForwardBonder() {
//
//        volume.setIncreaseVolume(0);
//
//        int expected = 1;
//        int actual = volume.getIncreaseVolume();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void sholdIncreaseVolumeByOneForwardBonderMin() {
//
//        volume.setIncreaseVolume(-1);
//
//        int expected = 1;
//        int actual = volume.getIncreaseVolume();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void sholdIncreaseVolumeByOneForwardBonderMax() {
//
//        volume.setIncreaseVolume(100);
//
//        int expected = 100;
//        int actual = volume.getIncreaseVolume();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void sholdIncreaseVolumeByOneForwardAvg() {
//
//        volume.setIncreaseVolume(5);
//
//        int expected = 6;
//        int actual = volume.getIncreaseVolume();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void sholdIncreaseVolumeByOneBack() {
//
//        volume.setIncreaseVolume(1);
//
//        int expected = 0;
//        int actual = volume.getIncreaseVolume();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void sholdIncreaseVolumeByOneBackBonderMax() {
//
//        volume.setIncreaseVolume(100);
//
//        int expected = 99;
//        int actual = volume.getIncreaseVolume();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void sholdIncreaseVolumeByOneBackBonderMin() {
//
//        volume.setIncreaseVolume(0);
//
//        int expected = 0;
//        int actual = volume.getIncreaseVolume();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void sholdCurrentStationByOneForward() {
//
//        station.setCurrentStation(7);
//
//        int expected = 8;
//        int actual = station.getCurrentStation();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void sholdCurrentStationByOneForwardBonderMin() {
//
//        station.setCurrentStation(0);
//
//        int expected = 1;
//        int actual = station.getCurrentStation();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void sholdCurrentStationByOneForwardBonderMax() {
//
//        station.setCurrentStation(9);
//
//        int expected = 9;
//        int actual = station.getCurrentStation();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void sholdCurrentStationByOneBack() {
//
//        station.setCurrentStation(7);
//
//        int expected = 6;
//        int actual = station.getCurrentStation();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void sholdCurrentStationByOneBackBonderMax() {
//
//        station.setCurrentStation(9);
//
//        int expected = 8;
//        int actual = station.getCurrentStation();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void sholdCurrentStationByOneBackBonderMin() {
//
//        station.setCurrentStation(0);
//
//        int expected = 0;
//        int actual = station.getCurrentStation();
//        assertEquals(expected, actual);
//    }
//}
