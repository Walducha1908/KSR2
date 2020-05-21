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

        /* About one thirds */
        LinguisticVariable aboutOneThirds = new LinguisticVariable (
                "About one thirds",
                false,
                new TriangularFunction(new LinkedList<Double>(Arrays.asList(0.23, 0.33, 0.43))));
        nonAbsoluteQuantifiersMap.put("aboutOneThirds", aboutOneThirds);
        nonAbsoluteQuantifiersList.add(aboutOneThirds);

        /* About half */
        LinguisticVariable aboutHalf = new LinguisticVariable (
                "About half",
                false,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(0.4, 0.45, 0.55, 0.6))));
        nonAbsoluteQuantifiersMap.put("aboutHalf", aboutHalf);
        nonAbsoluteQuantifiersList.add(aboutHalf);

        /* About two thirds */
        LinguisticVariable aboutTwoThirds = new LinguisticVariable (
                "About two thirds",
                false,
                new TriangularFunction(new LinkedList<Double>(Arrays.asList(0.56, 0.66, 0.76))));
        nonAbsoluteQuantifiersMap.put("aboutTwoThirds", aboutTwoThirds);
        nonAbsoluteQuantifiersList.add(aboutTwoThirds);

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
        absoluteQuantifiersMap.put("lessThan200", lessThan200);
        absoluteQuantifiersList.add(lessThan200);

        /* About 500 */
        LinguisticVariable about500 = new LinguisticVariable(
                "About 500",
                true,
                new TriangularFunction(new LinkedList<Double>(Arrays.asList(350.0, 500.0, 650.0))));
        absoluteQuantifiersMap.put("about500", about500);
        absoluteQuantifiersList.add(about500);

        /* About 1000 */
        LinguisticVariable about1000 = new LinguisticVariable(
                "About 1000",
                true,
                new TriangularFunction(new LinkedList<Double>(Arrays.asList(700.0, 1000.0, 1300.0))));
        absoluteQuantifiersMap.put("about1000", about1000);
        absoluteQuantifiersList.add(about1000);

        /* About 2000 */
        LinguisticVariable about2000 = new LinguisticVariable(
                "About 2000",
                true,
                new TriangularFunction(new LinkedList<Double>(Arrays.asList(1700.0, 2000.0, 2300.0))));
        absoluteQuantifiersMap.put("about2000", about2000);
        absoluteQuantifiersList.add(about2000);

        /* About 3000 */
        LinguisticVariable about3000 = new LinguisticVariable(
                "About 3000",
                true,
                new TriangularFunction(new LinkedList<Double>(Arrays.asList(2600.0, 3000.0, 3400.0))));
        absoluteQuantifiersMap.put("about3000", about3000);
        absoluteQuantifiersList.add(about3000);

        /* About 5000 */
        LinguisticVariable about5000 = new LinguisticVariable(
                "About 5000",
                true,
                new TriangularFunction(new LinkedList<Double>(Arrays.asList(4500.0, 5000.0, 5500.0))));
        absoluteQuantifiersMap.put("about5000", about5000);
        absoluteQuantifiersList.add(about5000);

        /* More than 6000 */
        LinguisticVariable moreThan6000 = new LinguisticVariable(
                "More than 6000",
                true,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(5500.0, 6000.0, 8000.0, 8000.1))));
        absoluteQuantifiersMap.put("moreThan6000", moreThan6000);
        absoluteQuantifiersList.add(moreThan6000);
    }
}
