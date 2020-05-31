package Program.FuzzyLib.Logic;

import Program.FuzzyLib.Membership.MembershipFunction;
import Program.FuzzyLib.Summaries.SentenceMaker;
import Program.Model.Columns;
import Program.Model.Record;
import Program.Model.Seasons;

import java.util.LinkedList;

public class LinguisticLabel {
    private String quantifierName;
    private boolean absolute;
    private MembershipFunction membershipFunction;
    private Columns column;
    private Seasons season;

    /* Variables constructor */
    public LinguisticLabel(String quantifierName, Columns column, Seasons season, MembershipFunction membershipFunction) {
        this.quantifierName = quantifierName;
        this.absolute = false;
        this.membershipFunction = membershipFunction;
        this.column = column;
        this.season = season;
    }

    /* Quantifiers constructor */
    public LinguisticLabel(String quantifierName, boolean absolute, MembershipFunction membershipFunction) {
        this.quantifierName = quantifierName;
        this.absolute = absolute;
        this.membershipFunction = membershipFunction;
        this.column = null;
        this.season = null;
    }

    public LinguisticLabel() {
        this.quantifierName = null;
        this.absolute = false;
        this.membershipFunction = null;
        this.column = null;
    }

    public double getMembership(double x) {
        return membershipFunction.getMembership(x);
    }

    public double getMembershipWithRecord(Record record) {
        if (column == null) {
            return 1;
        }
        double x = getValueFromColumn(record);
        return getMembership(x);
    }

    public double getValueFromColumn(Record record) {
        switch (column) {
            case FG:
                return record.getFG();
            case FHX:
                return record.getFHX();
            case FHN:
                return record.getFHN();
            case FXX:
                return record.getFXX();
            case TG:
                return record.getTG();
            case TN:
                return record.getTN();
            case TX:
                return record.getTX();
            case T10N:
                return record.getT10N();
            case Q:
                return record.getQ();
            case RH:
                return record.getRH();
        }
        return -1;
    }

    public double cardinality() {
        return membershipFunction.cardinality();
    }

    public LinkedList<Record> support(LinkedList<Record> records) {
        LinkedList<Record> supported = new LinkedList<Record>();

        for (int i = 0; i < records.size(); i++) {
            if (getMembershipWithRecord((records.get(i))) > 0) {
                supported.add(records.get(i));
            }
        }
        return supported;
    }

    public double degreeOfFuzziness(LinkedList<Record> records) {
        return (double) this.support(records).size() / records.size();
    }

    @Override
    public String toString() {
        return quantifierName + " " + SentenceMaker.columnDictionary(column);
    }

    public String getQuantifierName() {
        return quantifierName;
    }

    public void setQuantifierName(String quantifierName) {
        this.quantifierName = quantifierName;
    }

    public boolean isAbsolute() {
        return absolute;
    }

    public void setAbsolute(boolean absolute) {
        this.absolute = absolute;
    }

    public MembershipFunction getMembershipFunction() {
        return membershipFunction;
    }

    public void setMembershipFunction(MembershipFunction membershipFunction) {
        this.membershipFunction = membershipFunction;
    }

    public Columns getColumn() {
        return column;
    }

    public void setColumn(Columns column) {
        this.column = column;
    }

    public Seasons getSeason() {
        return season;
    }

    public void setSeason(Seasons season) {
        this.season = season;
    }

    public LinkedList<LinguisticLabel> getAllLinguisticLabels() {
        LinkedList<LinguisticLabel> variables = new LinkedList<>();
        variables.add(this);
        return variables;
    }
}
