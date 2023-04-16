package ru.netology.Radio;

public class Radio {



        private int numberStation = 10;
        private int maxStation = 9;
        private int minStation = 0;
        private int currentStation = minStation;
        private int maxVolume = 100;
        private int minVolume = 0;
        private int currentVolume;
        public Radio (int numberStation) {
            this.minStation = 0;
            this.maxStation = numberStation - 1;
            this.numberStation = numberStation;
        }
        public Radio () {

        }
        public int getNumberStation() {
            return numberStation;
        }

        public int getCurrentStation() {
            return currentStation;
        }
        public int getMaxStation() {
            return maxStation;
        }
        public int getMinStation() {
            return minStation;
        }

        public void setCurrentStation(int newCurrentStation) {
            if (newCurrentStation < minStation) {
                return;
            }
            if (newCurrentStation > maxStation) {
                return;
            }
            currentStation = newCurrentStation;
        }

        public int getCurrentVolume() {
            return currentVolume;
        }
        public int getMaxVolume() {
            return maxVolume;
        }
        public int getMinVolume() {
            return minVolume;
        }

        public void setCurrentVolume(int newCurrentVolume) {
            if (newCurrentVolume < minVolume) {
                return;
            }
            if (newCurrentVolume > maxVolume) {
                return;
            }
            currentVolume = newCurrentVolume;
        }

        public void stationNext() {
            if (currentStation == maxStation) {
                currentStation = minStation;
            } else {
                currentStation++;
            }
        }

        public void stationPrev() {
            if (currentStation == minStation) {
                currentStation = maxStation;
            } else {
                currentStation--;
            }
        }

        public void increaseVolume() {
            if (currentVolume < maxVolume) {
                currentVolume = currentVolume + 1;
            }
        }

        public void downgradeVolume() {
            if (currentVolume > minVolume) {
                currentVolume = currentVolume - 1;
            }
        }
}
