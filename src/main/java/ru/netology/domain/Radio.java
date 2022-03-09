package ru.netology.domain;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int increaseVolume;
    private int currentStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int minStation = 0;
    private int maxStation = 9;
    private boolean on;
}





