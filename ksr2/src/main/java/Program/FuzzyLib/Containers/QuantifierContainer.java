package Program.FuzzyLib.Containers;

import Program.FuzzyLib.Logic.LinguisticVariable;
import Program.FuzzyLib.Membership.TrapezoidFunction;
import Program.FuzzyLib.Membership.TriangularFunction;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class QuantifierContainer {
    public static HashMap<String, LinguisticVariable> quantifiersMap;
    public static LinkedList<LinguisticVariable> quantifiersList;

    public static void prepareQuantifiers() {
        quantifiersMap = new HashMap<String, LinguisticVariable>();
        quantifiersList = new LinkedList<LinguisticVariable>();

        /* None */
        LinguisticVariable none = new LinguisticVariable (
                "None",
                false,
                new TriangularFunction(new LinkedList<Double>(Arrays.asList(0.0, 0.0, 0.1))));
        quantifiersMap.put("none", none);
        quantifiersList.add(none);

        /* Less than quarter */
        LinguisticVariable lessThanQuarter  = new LinguisticVariable (
                "Less than quarter",
                false,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(0.0, 0.10, 0.25, 0.3))));
        quantifiersMap.put("lessThanQuarter", lessThanQuarter);
        quantifiersList.add(lessThanQuarter);

        /* Some */
        LinguisticVariable some = new LinguisticVariable (
                "Some",
                false,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(0.15, 0.2, 0.35, 0.4))));
        quantifiersMap.put("some", some);
        quantifiersList.add(some);

        /* Around one thirds */
        LinguisticVariable aroundOneThirds = new LinguisticVariable (
                "Around one thirds",
                false,
                new TriangularFunction(new LinkedList<Double>(Arrays.asList(0.23, 0.33, 0.43))));
        quantifiersMap.put("aroundOneThirds", aroundOneThirds);
        quantifiersList.add(aroundOneThirds);

        /* Around half */
        LinguisticVariable aroundHalf = new LinguisticVariable (
                "Around half",
                false,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(0.4, 0.45, 0.55, 0.6))));
        quantifiersMap.put("aroundHalf", aroundHalf);
        quantifiersList.add(aroundHalf);

        /* Around two thirds */
        LinguisticVariable aroundTwoThirds = new LinguisticVariable (
                "Around two thirds",
                false,
                new TriangularFunction(new LinkedList<Double>(Arrays.asList(0.56, 0.66, 0.76))));
        quantifiersMap.put("aroundTwoThirds", aroundTwoThirds);
        quantifiersList.add(aroundTwoThirds);

        /* Majority */
        LinguisticVariable majority = new LinguisticVariable (
                "Majority",
                false,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(0.7, 0.75, 0.85, 0.9))));
        quantifiersMap.put("majority", majority);
        quantifiersList.add(majority);

        /* Almost all */
        LinguisticVariable almostAll = new LinguisticVariable (
                "Almost all",
                false,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(0.85, 0.9, 1.0, 1.01))));
        quantifiersMap.put("almostAll", almostAll);
        quantifiersList.add(almostAll);
    }
}
