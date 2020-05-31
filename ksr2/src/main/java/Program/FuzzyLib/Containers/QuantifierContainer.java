package Program.FuzzyLib.Containers;

import Program.FuzzyLib.Logic.LinguisticLabel;
import Program.FuzzyLib.Membership.TrapezoidFunction;
import Program.FuzzyLib.Membership.TriangularFunction;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class QuantifierContainer {
    public static HashMap<String, LinguisticLabel> nonAbsoluteQuantifiersMap;
    public static LinkedList<LinguisticLabel> nonAbsoluteQuantifiersList;

    public static HashMap<String, LinguisticLabel> absoluteQuantifiersMap;
    public static LinkedList<LinguisticLabel> absoluteQuantifiersList;

    public static void prepareNonAbsoluteQuantifiers() {
        nonAbsoluteQuantifiersMap = new HashMap<String, LinguisticLabel>();
        nonAbsoluteQuantifiersList = new LinkedList<LinguisticLabel>();

        /* None */
        LinguisticLabel none = new LinguisticLabel(
                "None",
                false,
                new TriangularFunction(new LinkedList<Double>(Arrays.asList(0.0, 0.0, 0.1))));
        nonAbsoluteQuantifiersMap.put("none", none);
        nonAbsoluteQuantifiersList.add(none);

        /* Less than quarter */
        LinguisticLabel lessThanQuarter  = new LinguisticLabel(
                "Less than quarter",
                false,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(0.0, 0.10, 0.25, 0.3))));
        nonAbsoluteQuantifiersMap.put("lessThanQuarter", lessThanQuarter);
        nonAbsoluteQuantifiersList.add(lessThanQuarter);

        /* Some */
        LinguisticLabel some = new LinguisticLabel(
                "Some",
                false,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(0.15, 0.2, 0.35, 0.4))));
        nonAbsoluteQuantifiersMap.put("some", some);
        nonAbsoluteQuantifiersList.add(some);

        /* About one thirds */
        LinguisticLabel aboutOneThirds = new LinguisticLabel(
                "About one thirds",
                false,
                new TriangularFunction(new LinkedList<Double>(Arrays.asList(0.23, 0.33, 0.43))));
        nonAbsoluteQuantifiersMap.put("aboutOneThirds", aboutOneThirds);
        nonAbsoluteQuantifiersList.add(aboutOneThirds);

        /* About half */
        LinguisticLabel aboutHalf = new LinguisticLabel(
                "About half",
                false,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(0.4, 0.45, 0.55, 0.6))));
        nonAbsoluteQuantifiersMap.put("aboutHalf", aboutHalf);
        nonAbsoluteQuantifiersList.add(aboutHalf);

        /* About two thirds */
        LinguisticLabel aboutTwoThirds = new LinguisticLabel(
                "About two thirds",
                false,
                new TriangularFunction(new LinkedList<Double>(Arrays.asList(0.56, 0.66, 0.76))));
        nonAbsoluteQuantifiersMap.put("aboutTwoThirds", aboutTwoThirds);
        nonAbsoluteQuantifiersList.add(aboutTwoThirds);

        /* Majority */
        LinguisticLabel majority = new LinguisticLabel(
                "Majority",
                false,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(0.7, 0.75, 0.85, 0.9))));
        nonAbsoluteQuantifiersMap.put("majority", majority);
        nonAbsoluteQuantifiersList.add(majority);

        /* Almost all */
        LinguisticLabel almostAll = new LinguisticLabel(
                "Almost all",
                false,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(0.85, 0.9, 1.0, 1.01))));
        nonAbsoluteQuantifiersMap.put("almostAll", almostAll);
        nonAbsoluteQuantifiersList.add(almostAll);
    }

    public static void prepareAbsoluteQuantifiers() {
        absoluteQuantifiersMap = new HashMap<String, LinguisticLabel>();
        absoluteQuantifiersList = new LinkedList<LinguisticLabel>();

        /* Less than 200 */
        LinguisticLabel lessThan200 = new LinguisticLabel(
                "Less than 200",
                true,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(0.0, 0.0, 200.0, 220.0))));
        absoluteQuantifiersMap.put("lessThan200", lessThan200);
        absoluteQuantifiersList.add(lessThan200);

        /* About 500 */
        LinguisticLabel about500 = new LinguisticLabel(
                "About 500",
                true,
                new TriangularFunction(new LinkedList<Double>(Arrays.asList(350.0, 500.0, 650.0))));
        absoluteQuantifiersMap.put("about500", about500);
        absoluteQuantifiersList.add(about500);

        /* About 1000 */
        LinguisticLabel about1000 = new LinguisticLabel(
                "About 1000",
                true,
                new TriangularFunction(new LinkedList<Double>(Arrays.asList(700.0, 1000.0, 1300.0))));
        absoluteQuantifiersMap.put("about1000", about1000);
        absoluteQuantifiersList.add(about1000);

        /* About 2000 */
        LinguisticLabel about2000 = new LinguisticLabel(
                "About 2000",
                true,
                new TriangularFunction(new LinkedList<Double>(Arrays.asList(1700.0, 2000.0, 2300.0))));
        absoluteQuantifiersMap.put("about2000", about2000);
        absoluteQuantifiersList.add(about2000);

        /* About 3000 */
        LinguisticLabel about3000 = new LinguisticLabel(
                "About 3000",
                true,
                new TriangularFunction(new LinkedList<Double>(Arrays.asList(2600.0, 3000.0, 3400.0))));
        absoluteQuantifiersMap.put("about3000", about3000);
        absoluteQuantifiersList.add(about3000);

        /* About 5000 */
        LinguisticLabel about5000 = new LinguisticLabel(
                "About 5000",
                true,
                new TriangularFunction(new LinkedList<Double>(Arrays.asList(4500.0, 5000.0, 5500.0))));
        absoluteQuantifiersMap.put("about5000", about5000);
        absoluteQuantifiersList.add(about5000);

        /* More than 6000 */
        LinguisticLabel moreThan6000 = new LinguisticLabel(
                "More than 6000",
                true,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(5500.0, 6000.0, 17000.0, 17000.1))));
        absoluteQuantifiersMap.put("moreThan6000", moreThan6000);
        absoluteQuantifiersList.add(moreThan6000);
    }
}
