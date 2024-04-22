package dw.model;

public class Mileage {
    private int mileageGrade;
    private int lowLimit;
    private int highLimit;

    public Mileage() {
    }

    public Mileage(int mileageGrade, int lowLimit, int highLimit) {
        this.mileageGrade = mileageGrade;
        this.lowLimit = lowLimit;
        this.highLimit = highLimit;
    }

    public int getMileageGrade() {
        return mileageGrade;
    }

    public void setMileageGrade(int mileageGrade) {
        this.mileageGrade = mileageGrade;
    }

    public int getLowLimit() {
        return lowLimit;
    }

    public void setLowLimit(int lowLimit) {
        this.lowLimit = lowLimit;
    }

    public int getHighLimit() {
        return highLimit;
    }

    public void setHighLimit(int highLimit) {
        this.highLimit = highLimit;
    }
}
