package bean;

public class Lost {
    private String LostDate;   //丢失日期
    private String LostLocation;   //丢失地点
    private String NowLocation;     //现在在何处
    private String name;   //失物名字

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Lost() {
    }

    public Lost(String lostDate, String lostLocation, String nowLocation) {
        LostDate = lostDate;
        LostLocation = lostLocation;
        NowLocation = nowLocation;
    }

    public String getLostDate() {
        return LostDate;
    }

    public void setLostDate(String lostDate) {
        LostDate = lostDate;
    }

    public String getLostLocation() {
        return LostLocation;
    }

    public void setLostLocation(String lostLocation) {
        LostLocation = lostLocation;
    }

    public String getNowLocation() {
        return NowLocation;
    }

    public void setNowLocation(String nowLocation) {
        NowLocation = nowLocation;
    }

}
