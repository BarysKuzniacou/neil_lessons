package enum_pack;

public enum Season {
    WINTER(-15), SPRING(15), SUMMER(23), AUTUMN(12);

    private int avgTemperature;

    Season(int avgTemperature) {
        this.avgTemperature = avgTemperature;
    }

    public int getAvgTemperature() {
        return avgTemperature;
    }
}
