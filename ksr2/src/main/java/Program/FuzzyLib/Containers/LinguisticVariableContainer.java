package Program.FuzzyLib.Containers;

import Program.FuzzyLib.Logic.LinguisticVariable;
import Program.FuzzyLib.Membership.TrapezoidFunction;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class LinguisticVariableContainer {
    public static HashMap<String, LinguisticVariable> linguisticVariables;

    public LinguisticVariableContainer() {
        linguisticVariables = new HashMap<String, LinguisticVariable>();

        /* Column FG */
        LinguisticVariable GentleFG = new LinguisticVariable(
            "Gentle",
            "FG",
            new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(5.0, 10.0, 21.0, 28.0))));
        linguisticVariables.put("GentleFG", GentleFG);

        LinguisticVariable ModerateFG = new LinguisticVariable(
                "Moderate",
                "FG",
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(23.0, 32.0, 47.0, 56.0))));
        linguisticVariables.put("ModerateFG", ModerateFG);

        LinguisticVariable StrongFG = new LinguisticVariable(
                "Strong",
                "FG",
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(50.0, 75.0, 125.0, 157.0))));
        linguisticVariables.put("StrongFG", StrongFG);

        /* Column TG - winter */
        LinguisticVariable ColdTGW = new LinguisticVariable(
                "Cold",
                "TGW",
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(-81.0, -60.0, -10.0, 20.0))));
        linguisticVariables.put("ColdTGW", ColdTGW);

        LinguisticVariable WarmTGW = new LinguisticVariable(
                "Warm",
                "TGW",
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(10.0, 40.0, 90.0, 120.0))));
        linguisticVariables.put("WarmTGW", WarmTGW);

        LinguisticVariable HotTGW = new LinguisticVariable(
                "Hot",
                "TGW",
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(100.0, 150.0, 270.0, 306.0))));
        linguisticVariables.put("HotTGW", WarmTGW);

        /* Column TG - spring and autumn */
        LinguisticVariable ColdTGSA = new LinguisticVariable(
                "Cold",
                "TGSA",
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(-81.0, -50.0, 35.0, 85.0))));
        linguisticVariables.put("ColdTGSA", ColdTGSA);

        LinguisticVariable WarmTGSA = new LinguisticVariable(
                "Warm",
                "TGSA",
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(70.0, 100.0, 150.0, 180.0))));
        linguisticVariables.put("WarmTGSA", WarmTGSA);

        LinguisticVariable HotTGSA = new LinguisticVariable(
                "Hot",
                "TGSA",
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(160.0, 200.0, 270.0, 306.0))));
        linguisticVariables.put("HotTGSA", HotTGSA);

        /* Column TG - summer */
        LinguisticVariable ColdTGS = new LinguisticVariable(
                "Cold",
                "TGS",
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(-81.0, -50.0, 100.0, 150.0))));
        linguisticVariables.put("ColdTGS", ColdTGS);

        LinguisticVariable WarmTGS = new LinguisticVariable(
                "Warm",
                "TGS",
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(130.0, 150.0, 230.0, 250.0))));
        linguisticVariables.put("WarmTGS", WarmTGS);

        LinguisticVariable HotTGS = new LinguisticVariable(
                "Hot",
                "TGS",
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(240.0, 260.0, 290.0, 306.0))));
        linguisticVariables.put("HotTGS", HotTGS);

        /* Column Q */
        LinguisticVariable OvercastQ = new LinguisticVariable(
                "Overcast",
                "Q",
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(24.0, 100.0, 350.0, 500.0))));
        linguisticVariables.put("OvercastQ", OvercastQ);

        LinguisticVariable CloudyQ = new LinguisticVariable(
                "Cloudy",
                "Q",
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(400.0, 700.0, 1300.0, 1600.0))));
        linguisticVariables.put("CloudyQ", CloudyQ);

        LinguisticVariable SunnyQ = new LinguisticVariable(
                "Sunny",
                "Q",
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(1400.0, 1900.0, 2700.0, 3145.0))));
        linguisticVariables.put("SunnyQ", SunnyQ);
    }
}
