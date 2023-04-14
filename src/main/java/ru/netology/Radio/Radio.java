package ru.netology.Radio;

public class Radio {
        private int currentStation;
        private int currentVolume;

        public int getCurrentStation() {
            return currentStation;
        }

        public void setCurrentStation(int newCurrentStation) {
            if (newCurrentStation < 0) {
                return;
            }
            if (newCurrentStation > 9) {
                return;
            }
            currentStation = newCurrentStation;
        }

        public int getCurrentVolume() {
            return currentVolume;
        }

        public void setCurrentVolume(int newCurrentVolume) {
            if (newCurrentVolume < 0) {
                return;
            }
            if (newCurrentVolume > 100) {
                return;
            }
            currentVolume = newCurrentVolume;
        }

        public void stationNext() {
            if (currentStation == 9) {
                currentStation = 0;
            } else {
                currentStation++;
            }
        }

        public void stationPrev() {
            if (currentStation == 0) {
                currentStation = 9;
            } else {
                currentStation--;
            }
        }

        public void increaseVolume() {
            if (currentVolume < 100) {
                currentVolume = currentVolume + 1;
            }
        }

        public void downgradeVolume() {
            if (currentVolume > 0) {
                currentVolume = currentVolume - 1;
            }
        }
}
