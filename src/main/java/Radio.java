public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStatios;

    public Radio() {
        this.maxStatios = 9;
    }

    public Radio(int stationsCount) {
        this.maxStatios = stationsCount - 1;
    }
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStatios) {
            return;
        }
    }

    public void next() {
        if (currentStation != maxStatios) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = maxStatios;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
    }
}


