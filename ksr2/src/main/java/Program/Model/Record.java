package Program.Model;

import java.util.Date;

public class Record {
    private double station;
    private Date date;

    private double FG;       // średnia prędkość wiatru przez cały dzień w 0.1 m/s
    private double FHX;      // najwyższa prędkość wiatru w ciągu jednej godziny 0.1 m/s
    private double FHN;      // najniższa prędkość wiatru w ciągu jednej godziny 0.1 m/s
    private double FXX;      // najszybszy podmuch wiatru 0.1 m/s
    private double TG;       // średnia dzienna temperatura w 0.1 stopnia Celsjusza
    private double TN;       // minimalna temperatura w 0.1 stopnia Celsjusza
    private double TX;       // maksymalna temperatura w 0.1 stopnia Celsjusza
    private double T10N;     // minimalna temperatura na wysokości 10 cm od gruntu w 0.1 stopnia Celsjusza
    private double Q;        // nasłonecznienie, energia słoneczna na powierzchnię w J/cm^2
    private double RH;       // suma opadów atmosferycznych jednego dnia w 0.1 mm.


    public Record() {

    }
    public Record(double station, Date date, double FG, double FHX, double FHN, double FXX, double TG, double TN, double TX, double t10N, double q, double RH) {
        this.station = station;
        this.date = date;
        this.FG = FG;
        this.FHX = FHX;
        this.FHN = FHN;
        this.FXX = FXX;
        this.TG = TG;
        this.TN = TN;
        this.TX = TX;
        this.T10N = t10N;
        this.Q = q;
        this.RH = RH;
    }

    @Override
    public String toString() {
        return "Record{" +
                "station=" + station +
                ", date=" + date +
                ", FG=" + FG +
                ", FHX=" + FHX +
                ", FHN=" + FHN +
                ", FXX=" + FXX +
                ", TG=" + TG +
                ", TN=" + TN +
                ", TX=" + TX +
                ", T10N=" + T10N +
                ", Q=" + Q +
                ", RH=" + RH +
                '}';
    }

    public double getStation() {
        return station;
    }

    public void setStation(int station) {
        this.station = station;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getFG() {
        return FG;
    }

    public void setFG(double FG) {
        this.FG = FG;
    }

    public double getFHX() {
        return FHX;
    }

    public void setFHX(double FHX) {
        this.FHX = FHX;
    }

    public double getFHN() {
        return FHN;
    }

    public void setFHN(double FHN) {
        this.FHN = FHN;
    }

    public double getFXX() {
        return FXX;
    }

    public void setFXX(double FXX) {
        this.FXX = FXX;
    }

    public double getTG() {
        return TG;
    }

    public void setTG(double TG) {
        this.TG = TG;
    }

    public double getTN() {
        return TN;
    }

    public void setTN(double TN) {
        this.TN = TN;
    }

    public double getTX() {
        return TX;
    }

    public void setTX(double TX) {
        this.TX = TX;
    }

    public double getT10N() {
        return T10N;
    }

    public void setT10N(double t10N) {
        T10N = t10N;
    }

    public double getQ() {
        return Q;
    }

    public void setQ(double q) {
        Q = q;
    }

    public double getRH() {
        return RH;
    }

    public void setRH(double RH) {
        this.RH = RH;
    }
}
