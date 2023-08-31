package Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stations {

    private String stationName;
    private String openingDate;
    @SerializedName("also-link")
    @Expose(serialize = false, deserialize = true)
    private String info;


    public Stations() {
    }

    public Stations(String stationName, String openingDate, String info) {
        this.stationName = stationName;
        this.openingDate = openingDate;
        this.info = info;
    }

    public Stations setStationName(String stationName) {
        this.stationName = stationName;
        return this;
    }

    public Stations setOpeningDate(String openingDate) {
        this.openingDate = openingDate;
        return this;
    }

    public Stations setInfo(String info) {
        this.info = info;
        return this;
    }

    public String getStationName() {
        return stationName;
    }

    public String getOpeningDate() {
        return openingDate;
    }

    public String getInfo() {
        return info;
    }


    @Override
    public String toString() {
        return "Station{" +
                "stationName='" + stationName + '\'' +
                ", openingDate='" + openingDate + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
