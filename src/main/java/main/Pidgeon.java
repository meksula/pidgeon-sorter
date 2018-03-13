package main;

/**
 * @author Karol Meksuła
 * 13-03-2018
 * */

public class Pidgeon {
    private static int lp = 1;
    private RingID ringID;
    private String sex;
    private String color;

    public String getSex() {
        return sex;
    }

    public Pidgeon() {
        lp++;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public RingID getRingID() {
        return ringID;
    }

    public void setRingID(RingID ringID) {
        this.ringID = ringID;
    }

    @Override
    public String toString() {
        return lp + " | " + getRingID().toString() + " | " + getSex() + " | " + getColor();
    }
}

class RingID {
    private String countryId;
    private String year;
    private String number;

    public String getYear() {
        return year;
    }

    public String getNumber() {
        return number;
    }

    public RingID(String countryId, String year, String number) {
        this.countryId = countryId;
        this.year = year;
        this.number = number;
    }

    @Override
    public String toString() {
        return countryId + "." + year + "." + number;
    }
}
