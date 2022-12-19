import org.json.JSONPropertyName;

public class MetroStationInfo {

    private String stationName;
    private String openingDate;
    private String URLLink;
    private String[] info;


    public String[] info(String stationName, String openingDate, String URLLink) {

        return info(getStationName(), getOpeningDate(), getURLLink() );
    }


    public String[] getStationInfo() {
        getStationName();
        getOpeningDate();
        getURLLink();
        return info;
    }

    public void setStationInfo(String[] stationInfo) {
        this.info = stationInfo;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }


    public String getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(String openingDate) {
        this.openingDate = openingDate;
    }

    @JSONPropertyName("also-link")
    public String getURLLink() {
        return URLLink;
    }

    @JSONPropertyName("also-link")
    public void setURLLink(String URLLink) {
        this.URLLink = URLLink;
    }


}
