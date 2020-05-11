package Program.FuzzyLib.Logic;

import Program.FuzzyLib.Membership.MembershipFunction;

import java.util.LinkedList;

public class LinguisticVariable {
    private String quantifierName;
    private String memberToExtract;
    private boolean absolute;
    private MembershipFunction membershipFunction;

    public LinguisticVariable(String quantifierName, String memberToExtract, boolean absolute, MembershipFunction membershipFunction) {
        this.quantifierName = quantifierName;
        this.memberToExtract = memberToExtract;
        this.absolute = absolute;
        this.membershipFunction = membershipFunction;
    }

    public double getMembership(double x) {
        return membershipFunction.getMembership(x);
    }

    public double cardinality() {
        return membershipFunction.cardinality();
    }

    public LinkedList<Double> support(LinkedList<Double> values) {
        LinkedList<Double> supported = new LinkedList<Double>();

        for (int i = 0; i < values.size(); i++) {
            if (getMembership(values.get(i)) > 0) {
                supported.add(values.get(i));
            }
        }
        return supported;
    }

    public double degreeOfFuzziness(LinkedList<Double> values) {
        return (double) support(values).size() / values.size();
    }

    @Override
    public String toString() {
        return quantifierName + " " + memberToExtract;
    }

    public String getQuantifierName() {
        return quantifierName;
    }

    public void setQuantifierName(String quantifierName) {
        this.quantifierName = quantifierName;
    }

    public String getMemberToExtract() {
        return memberToExtract;
    }

    public void setMemberToExtract(String memberToExtract) {
        this.memberToExtract = memberToExtract;
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
}
