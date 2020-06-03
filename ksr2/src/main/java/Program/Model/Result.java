package Program.Model;

import java.text.DecimalFormat;

public class Result {
    private String sentence;
    private int recordsUsed;

    // Measures
    private double degreeOfTruth;
    private double degreeOfImprecision;
    private double degreeOfCovering;
    private double degreeOfAppropriateness;
    private double lengthOfSummary;
    private double degreeOfQuantifierImprecision;
    private double degreeOfQuantifierCardinality;
    private double degreeOfSummarizerCardinality;
    private double degreeOfQualifierImprecision;
    private double degreeOfQualifierCardinality;
    private double lengthOfQualifier;
    private double optimumMeasure;

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.000");
        return "\n" + sentence + "\n[" +
                "Ts = " + df.format(optimumMeasure) +
                " T1 = " + df.format(degreeOfTruth) +
                " T2 = " + df.format(degreeOfImprecision) +
                " T3 = " + df.format(degreeOfCovering) +
                " T4 = " + df.format(degreeOfAppropriateness) +
                " T5 = " + df.format(lengthOfSummary) +
                " T6 = " + df.format(degreeOfQuantifierImprecision) +
                " T7 = " + df.format(degreeOfQuantifierCardinality) +
                " T8 = " + df.format(degreeOfSummarizerCardinality) +
                " T9 = " + df.format(degreeOfQualifierImprecision) +
                " T10 = " + df.format(degreeOfQualifierCardinality) +
                " T11 = " + df.format(lengthOfQualifier) +
                "]\n";
    }

    public Result(String sentence, int recordsUsed, double degreeOfTruth, double degreeOfImprecision,
                  double degreeOfCovering, double degreeOfAppropriateness, double lengthOfSummary,
                  double degreeOfQuantifierImprecision, double degreeOfQuantifierCardinality,
                  double degreeOfSummarizerCardinality, double degreeOfQualifierImprecision,
                  double degreeOfQualifierCardinality, double lengthOfQualifier) {
        this.sentence = sentence;
        this.recordsUsed = recordsUsed;
        this.degreeOfTruth = degreeOfTruth;
        this.degreeOfImprecision = degreeOfImprecision;
        this.degreeOfCovering = degreeOfCovering;
        this.degreeOfAppropriateness = degreeOfAppropriateness;
        this.lengthOfSummary = lengthOfSummary;
        this.degreeOfQuantifierImprecision = degreeOfQuantifierImprecision;
        this.degreeOfQuantifierCardinality = degreeOfQuantifierCardinality;
        this.degreeOfSummarizerCardinality = degreeOfSummarizerCardinality;
        this.degreeOfQualifierImprecision = degreeOfQualifierImprecision;
        this.degreeOfQualifierCardinality = degreeOfQualifierCardinality;
        this.lengthOfQualifier = lengthOfQualifier;
        if (degreeOfImprecision >= 0) {
            this.optimumMeasure = degreeOfTruth + degreeOfImprecision + degreeOfCovering
                    + degreeOfAppropriateness + lengthOfSummary + degreeOfQuantifierImprecision +
                    degreeOfQuantifierCardinality + degreeOfSummarizerCardinality +
                    degreeOfQualifierImprecision + degreeOfQualifierCardinality + lengthOfQualifier;
            this.optimumMeasure /= 11;
        } else {
            this.optimumMeasure = degreeOfTruth;
        }
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

    public double getDegreeOfImprecision() {
        return degreeOfImprecision;
    }

    public double getDegreeOfCovering() {
        return degreeOfCovering;
    }

    public double getDegreeOfAppropriateness() {
        return degreeOfAppropriateness;
    }

    public double getLengthOfSummary() {
        return lengthOfSummary;
    }

    public double getDegreeOfQuantifierImprecision() {
        return degreeOfQuantifierImprecision;
    }

    public double getDegreeOfQuantifierCardinality() {
        return degreeOfQuantifierCardinality;
    }

    public double getDegreeOfSummarizerCardinality() {
        return degreeOfSummarizerCardinality;
    }

    public double getDegreeOfQualifierImprecision() {
        return degreeOfQualifierImprecision;
    }

    public double getDegreeOfQualifierCardinality() {
        return degreeOfQualifierCardinality;
    }

    public double getLengthOfQualifier() {
        return lengthOfQualifier;
    }

    public double getOptimumMeasure() {
        return optimumMeasure;
    }

    public void setOptimumMeasure(double optimumMeasure) {
        this.optimumMeasure = optimumMeasure;
    }
}
