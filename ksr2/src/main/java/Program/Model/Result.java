package Program.Model;

import java.text.DecimalFormat;

public class Result {
    private String sentence;
    private double degreeOfTruth;
    private int recordsUsed;

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.000");

        return "\n" + sentence +
            " [T = " + df.format(degreeOfTruth) + "]" +
            " [Records used = " + recordsUsed + "]";
    }

    public Result(String sentence, double degreeOfTruth, int recordsUsed) {
        this.sentence = sentence;
        this.degreeOfTruth = degreeOfTruth;
        this.recordsUsed = recordsUsed;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public double getDegreeOfTruth() {
        return degreeOfTruth;
    }

    public void setDegreeOfTruth(double degreeOfTruth) {
        this.degreeOfTruth = degreeOfTruth;
    }

    public int getRecordsUsed() {
        return recordsUsed;
    }

    public void setRecordsUsed(int recordsUsed) {
        this.recordsUsed = recordsUsed;
    }
}
