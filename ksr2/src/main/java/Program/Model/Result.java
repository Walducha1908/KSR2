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
        return "\n[" + sentence + "]\n[" +
                "recordsUsed = " + recordsUsed +
                " degreeOfTruth = " + df.format(degreeOfTruth) +
                " degreeOfImprecision = " + df.format(degreeOfImprecision) +
                " degreeOfCovering = " + df.format(degreeOfCovering) +
                " degreeOfAppropriateness = " + df.format(degreeOfAppropriateness) +
                " lengthOfSummary = " + df.format(lengthOfSummary) +
                " degreeOfQuantifierImprecision = " + df.format(degreeOfQuantifierImprecision) +
                " degreeOfQuantifierCardinality = " + df.format(degreeOfQuantifierCardinality) +
                " degreeOfSummarizerCardinality = " + df.format(degreeOfSummarizerCardinality) +
                " degreeOfQualifierImprecision = " + df.format(degreeOfQualifierImprecision) +
                " degreeOfQualifierCardinality = " + df.format(degreeOfQualifierCardinality) +
                " lengthOfQualifier = " + df.format(lengthOfQualifier) +
                " optimum = " + df.format(optimumMeasure) +
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
