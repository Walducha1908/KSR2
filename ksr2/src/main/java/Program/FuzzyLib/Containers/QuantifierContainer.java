package Program.FuzzyLib.Containers;

import Program.FuzzyLib.Logic.LinguisticVariable;
import Program.FuzzyLib.Membership.TrapezoidFunction;
import Program.FuzzyLib.Membership.TriangularFunction;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class QuantifierContainer {
    public static HashMap<String, LinguisticVariable> nonAbsoluteQuantifiersMap;
    public static LinkedList<LinguisticVariable> nonAbsoluteQuantifiersList;

    public static HashMap<String, LinguisticVariable> absoluteQuantifiersMap;
    public static LinkedList<LinguisticVariable> absoluteQuantifiersList;

    public static void prepareNonAbsoluteQuantifiers() {
        nonAbsoluteQuantifiersMap = new HashMap<String, LinguisticVariable>();
        nonAbsoluteQuantifiersList = new LinkedList<LinguisticVariable>();

        /* None */
        LinguisticVariable none = new LinguisticVariable (
                "None",
                false,
                new TriangularFunction(new LinkedList<Double>(Arrays.asList(0.0, 0.0, 0.1))));
        nonAbsoluteQuantifiersMap.put("none", none);
        nonAbsoluteQuantifiersList.add(none);

        /* Less than quarter */
        LinguisticVariable lessThanQuarter  = new LinguisticVariable (
                "Less than quarter",
                false,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(0.0, 0.10, 0.25, 0.3))));
        nonAbsoluteQuantifiersMap.put("lessThanQuarter", lessThanQuarter);
        nonAbsoluteQuantifiersList.add(lessThanQuarter);

        /* Some */
        LinguisticVariable some = new LinguisticVariable (
                "Some",
                false,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(0.15, 0.2, 0.35, 0.4))));
        nonAbsoluteQuantifiersMap.put("some", some);
        nonAbsoluteQuantifiersList.add(some);

        /* Around one thirds */
        LinguisticVariable aroundOneThirds = new LinguisticVariable (
                "Around one thirds",
                false,
                new TriangularFunction(new LinkedList<Double>(Arrays.asList(0.23, 0.33, 0.43))));
        nonAbsoluteQuantifiersMap.put("aroundOneThirds", aroundOneThirds);
        nonAbsoluteQuantifiersList.add(aroundOneThirds);

        /* Around half */
        LinguisticVariable aroundHalf = new LinguisticVariable (
                "Around half",
                false,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(0.4, 0.45, 0.55, 0.6))));
        nonAbsoluteQuantifiersMap.put("aroundHalf", aroundHalf);
        nonAbsoluteQuantifiersList.add(aroundHalf);

        /* Around two thirds */
        LinguisticVariable aroundTwoThirds = new LinguisticVariable (
                "Around two thirds",
                false,
                new TriangularFunction(new LinkedList<Double>(Arrays.asList(0.56, 0.66, 0.76))));
        nonAbsoluteQuantifiersMap.put("aroundTwoThirds", aroundTwoThirds);
        nonAbsoluteQuantifiersList.add(aroundTwoThirds);

        /* Majority */
        LinguisticVariable majority = new LinguisticVariable (
                "Majority",
                false,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(0.7, 0.75, 0.85, 0.9))));
        nonAbsoluteQuantifiersMap.put("majority", majority);
        nonAbsoluteQuantifiersList.add(majority);

        /* Almost all */
        LinguisticVariable almostAll = new LinguisticVariable (
                "Almost all",
                false,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(0.85, 0.9, 1.0, 1.01))));
        nonAbsoluteQuantifiersMap.put("almostAll", almostAll);
        nonAbsoluteQuantifiersList.add(almostAll);
    }

    public static void prepareAbsoluteQuantifiers() {
        absoluteQuantifiersMap = new HashMap<String, LinguisticVariable>();
        absoluteQuantifiersList = new LinkedList<LinguisticVariable>();

        /* Less than 200 */
        LinguisticVariable lessThan200 = new LinguisticVariable(
                "Less than 200",
                true,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(0.0, 0.0, 200.0, 220.0))));
        nonAbsoluteQuantifiersMap.put("lessThan200", lessThan200);
        nonAbsoluteQuantifiersList.add(lessThan200);

        /* Around 500 */
        LinguisticVariable around500 = new LinguisticVariable(
                "Around 500",
                true,
                new TriangularFunction(new LinkedList<Double>(Arrays.asList(350.0, 500.0, 650.0))));
        nonAbsoluteQuantifiersMap.put("around500", around500);
        nonAbsoluteQuantifiersList.add(around500);

        /* Around 1000 */
        LinguisticVariable around1000 = new LinguisticVariable(
                "Around 1000",
                true,
                new TriangularFunction(new LinkedList<Double>(Arrays.asList(700.0, 1000.0, 1300.0))));
        nonAbsoluteQuantifiersMap.put("around1000", around1000);
        nonAbsoluteQuantifiersList.add(around1000);

        /* Around 2000 */
        LinguisticVariable around2000 = new LinguisticVariable(
                "Around 2000",
                true,
                new TriangularFunction(new LinkedList<Double>(Arrays.asList(1700.0, 2000.0, 2300.0))));
        nonAbsoluteQuantifiersMap.put("around2000", around2000);
        nonAbsoluteQuantifiersList.add(around2000);

        /* Around 3000 */
        LinguisticVariable around3000 = new LinguisticVariable(
                "Around 3000",
                true,
                new TriangularFunction(new LinkedList<Double>(Arrays.asList(2600.0, 3000.0, 3400.0))));
        nonAbsoluteQuantifiersMap.put("around3000", around3000);
        nonAbsoluteQuantifiersList.add(around3000);

        /* Around 5000 */
        LinguisticVariable around5000 = new LinguisticVariable(
                "Around 5000",
                true,
                new TriangularFunction(new LinkedList<Double>(Arrays.asList(4500.0, 5000.0, 5500.0))));
        nonAbsoluteQuantifiersMap.put("around5000", around5000);
        nonAbsoluteQuantifiersList.add(around5000);

        /* More than 6000 */
        LinguisticVariable moreThan6000 = new LinguisticVariable(
                "More than 6000",
                true,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(5500.0, 6000.0, 8000.0, 17000.0))));
        nonAbsoluteQuantifiersMap.put("moreThan6000", moreThan6000);
        nonAbsoluteQuantifiersList.add(moreThan6000);
    }
}
