package Program.FuzzyLib.Containers;

import Program.FuzzyLib.Logic.LinguisticVariable;
import Program.FuzzyLib.Membership.TrapezoidFunction;
import Program.Model.Columns;
import Program.Model.Seasons;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class LinguisticVariableContainer {
    public static HashMap<String, LinguisticVariable> linguisticVariables;

    public static void prepareLinguisticVariables() {
        linguisticVariables = new HashMap<String, LinguisticVariable>();

        /* Column FG */
        LinguisticVariable GentleFG = new LinguisticVariable(
            "gentle",
                Columns.FG,
            null,
            new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(5.0, 5.0, 21.0, 28.0))));
        linguisticVariables.put("GentleFG", GentleFG);

        LinguisticVariable ModerateFG = new LinguisticVariable(
                "moderate",
                Columns.FG,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(23.0, 32.0, 47.0, 56.0))));
        linguisticVariables.put("ModerateFG", ModerateFG);

        LinguisticVariable StrongFG = new LinguisticVariable(
                "strong",
                Columns.FG,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(50.0, 75.0, 157.0, 157.0))));
        linguisticVariables.put("StrongFG", StrongFG);

        /* Column FHX */
        LinguisticVariable GentleFHX = new LinguisticVariable(
                "gentle",
                Columns.FHX,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(10.0, 10.0, 30.0, 40.0))));
        linguisticVariables.put("GentleFHX", GentleFHX);

        LinguisticVariable ModerateFHX = new LinguisticVariable(
                "moderate",
                Columns.FHX,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(30.0, 45.0, 75.0, 90.0))));
        linguisticVariables.put("ModerateFHX", ModerateFHX);

        LinguisticVariable StrongFHX = new LinguisticVariable(
                "strong",
                Columns.FHX,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(80.0, 100.0, 150.0, 180.0))));
        linguisticVariables.put("StrongFHX", StrongFHX);

        LinguisticVariable VeryStrongFHX = new LinguisticVariable(
                "very strong",
                Columns.FHX,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(150.0, 180.0, 240.0, 240.0))));
        linguisticVariables.put("VeryStrongFHX", VeryStrongFHX);

        /* Column FHN */
        LinguisticVariable GentleFHN = new LinguisticVariable(
                "gentle",
                Columns.FHN,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(0.0, 0.0, 10.0, 15.0))));
        linguisticVariables.put("GentleFHN", GentleFHN);

        LinguisticVariable ModerateFHN = new LinguisticVariable(
                "moderate",
                Columns.FHN,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(10.0, 18.0, 28.0, 36.0))));
        linguisticVariables.put("ModerateFHN", ModerateFHN);

        LinguisticVariable StrongFHN = new LinguisticVariable(
                "strong",
                Columns.FHN,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(30.0, 38.0, 55.0, 65.0))));
        linguisticVariables.put("StrongFHN", StrongFHN);

        LinguisticVariable VeryStrongFHN = new LinguisticVariable(
                "very strong",
                Columns.FHN,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(50.0, 70.0, 140.0, 140.0))));
        linguisticVariables.put("VeryStrongFHN", VeryStrongFHN);

        /* Column FXX */
        LinguisticVariable GentleFXX = new LinguisticVariable(
                "gentle",
                Columns.FXX,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(20.0, 20.0, 50.0, 60.0))));
        linguisticVariables.put("GentleFXX", GentleFXX);

        LinguisticVariable ModerateFXX = new LinguisticVariable(
                "moderate",
                Columns.FXX,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(50.0, 65.0, 100.0, 120.0))));
        linguisticVariables.put("ModerateFXX", ModerateFXX);

        LinguisticVariable StrongFXX = new LinguisticVariable(
                "strong",
                Columns.FXX,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(100.0, 130.0, 200.0, 250.0))));
        linguisticVariables.put("StrongFXX", StrongFXX);

        LinguisticVariable VeryStrongFXX = new LinguisticVariable(
                "very strong",
                Columns.FXX,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(200.0, 275.0, 390.0, 390.0))));
        linguisticVariables.put("VeryStrongFXX", VeryStrongFXX);

        /* Column TG - winter */
        LinguisticVariable ColdTGW = new LinguisticVariable(
                "cold",
                Columns.TG,
                Seasons.winter,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(-81.0, -81.0, -10.0, 20.0))));
        linguisticVariables.put("ColdTGW", ColdTGW);

        LinguisticVariable WarmTGW = new LinguisticVariable(
                "warm",
                Columns.TG,
                Seasons.winter,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(10.0, 40.0, 90.0, 120.0))));
        linguisticVariables.put("WarmTGW", WarmTGW);

        LinguisticVariable HotTGW = new LinguisticVariable(
                "hot",
                Columns.TG,
                Seasons.winter,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(100.0, 150.0, 306.0, 306.0))));
        linguisticVariables.put("HotTGW", HotTGW);

        /* Column TG - spring and autumn */
        LinguisticVariable ColdTGSA = new LinguisticVariable(
                "cold",
                Columns.TG,
                Seasons.spring_autumn,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(-81.0, -81.0, 35.0, 85.0))));
        linguisticVariables.put("ColdTGSA", ColdTGSA);

        LinguisticVariable WarmTGSA = new LinguisticVariable(
                "warm",
                Columns.TG,
                Seasons.spring_autumn,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(70.0, 100.0, 150.0, 180.0))));
        linguisticVariables.put("WarmTGSA", WarmTGSA);

        LinguisticVariable HotTGSA = new LinguisticVariable(
                "hot",
                Columns.TG,
                Seasons.spring_autumn,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(160.0, 200.0, 306.0, 306.0))));
        linguisticVariables.put("HotTGSA", HotTGSA);

        /* Column TG - summer */
        LinguisticVariable ColdTGS = new LinguisticVariable(
                "cold",
                Columns.TG,
                Seasons.summer,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(-81.0, -81.0, 100.0, 150.0))));
        linguisticVariables.put("ColdTGS", ColdTGS);

        LinguisticVariable WarmTGS = new LinguisticVariable(
                "warm",
                Columns.TG,
                Seasons.summer,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(130.0, 150.0, 230.0, 250.0))));
        linguisticVariables.put("WarmTGS", WarmTGS);

        LinguisticVariable HotTGS = new LinguisticVariable(
                "hot",
                Columns.TG,
                Seasons.summer,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(240.0, 260.0, 306.0, 306.0))));
        linguisticVariables.put("HotTGS", HotTGS);

        /* Column TN - winter */
        LinguisticVariable ColdTNW = new LinguisticVariable(
                "cold",
                Columns.TN,
                Seasons.winter,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(-108.0, -108.0, -40.0, -20.0))));
        linguisticVariables.put("ColdTNW", ColdTNW);

        LinguisticVariable WarmTNW = new LinguisticVariable(
                "warm",
                Columns.TN,
                Seasons.winter,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(-40.0, -10.0, 60.0, 80.0))));
        linguisticVariables.put("WarmTNW", WarmTNW);

        LinguisticVariable HotTNW = new LinguisticVariable(
                "hot",
                Columns.TN,
                Seasons.winter,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(60.0, 100.0, 244.0, 244.0))));
        linguisticVariables.put("HotTNW", HotTNW);

        /* Column TN - spring and autumn */
        LinguisticVariable ColdTNSA = new LinguisticVariable(
                "cold",
                Columns.TN,
                Seasons.spring_autumn,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(-108.0, -108.0, 0.0, 30.0))));
        linguisticVariables.put("ColdTNSA", ColdTNSA);

        LinguisticVariable WarmTNSA = new LinguisticVariable(
                "warm",
                Columns.TN,
                Seasons.spring_autumn,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(10.0, 50.0, 110.0, 140.0))));
        linguisticVariables.put("WarmTNSA", WarmTNSA);

        LinguisticVariable HotTNSA = new LinguisticVariable(
                "hot",
                Columns.TN,
                Seasons.spring_autumn,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(110.0, 160.0, 244.0, 244.0))));
        linguisticVariables.put("HotTNSA", HotTNSA);

        /* Column TN - summer */
        LinguisticVariable ColdTNS = new LinguisticVariable(
                "cold",
                Columns.TN,
                Seasons.summer,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(-108.0, -108.0, 70.0, 100.0))));
        linguisticVariables.put("ColdTNS", ColdTNS);

        LinguisticVariable WarmTNS = new LinguisticVariable(
                "warm",
                Columns.TN,
                Seasons.summer,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(80.0, 130.0, 180.0, 200.0))));
        linguisticVariables.put("WarmTNS", WarmTNS);

        LinguisticVariable HotTNS = new LinguisticVariable(
                "hot",
                Columns.TN,
                Seasons.summer,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(175.0, 210.0, 244.0, 244.0))));
        linguisticVariables.put("HotTNS", HotTNS);

        /* Column TX - winter */
        LinguisticVariable ColdTXW = new LinguisticVariable(
                "cold",
                Columns.TX,
                Seasons.winter,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(-60.0, -60.0, 10.0, 30.0))));
        linguisticVariables.put("ColdTXW", ColdTXW);

        LinguisticVariable WarmTXW = new LinguisticVariable(
                "warm",
                Columns.TX,
                Seasons.winter,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(10.0, 50.0, 100.0, 130.0))));
        linguisticVariables.put("WarmTXW", WarmTXW);

        LinguisticVariable HotTXW = new LinguisticVariable(
                "hot",
                Columns.TX,
                Seasons.winter,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(100.0, 150.0, 376.0, 376.0))));
        linguisticVariables.put("HotTXW", HotTXW);

        /* Column TX - spring and autumn */
        LinguisticVariable ColdTXSA = new LinguisticVariable(
                "cold",
                Columns.TX,
                Seasons.spring_autumn,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(-60.0, -60.0, 60.0, 80.0))));
        linguisticVariables.put("ColdTXSA", ColdTXSA);

        LinguisticVariable WarmTXSA = new LinguisticVariable(
                "warm",
                Columns.TX,
                Seasons.spring_autumn,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(60.0, 100.0, 190.0, 225.0))));
        linguisticVariables.put("WarmTXSA", WarmTXSA);

        LinguisticVariable HotTXSA = new LinguisticVariable(
                "hot",
                Columns.TX,
                Seasons.spring_autumn,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(180.0, 250.0, 376.0, 376.0))));
        linguisticVariables.put("HotTXSA", HotTXSA);

        /* Column TX - summer */
        LinguisticVariable ColdTXS = new LinguisticVariable(
                "cold",
                Columns.TX,
                Seasons.summer,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(-60.0, -60.0, 160.0, 190.0))));
        linguisticVariables.put("ColdTXS", ColdTXS);

        LinguisticVariable WarmTXS = new LinguisticVariable(
                "warm",
                Columns.TX,
                Seasons.summer,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(170.0, 210.0, 270.0, 300.0))));
        linguisticVariables.put("WarmTXS", WarmTXS);

        LinguisticVariable HotTXS = new LinguisticVariable(
                "hot",
                Columns.TX,
                Seasons.summer,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(280.0, 300.0, 376.0, 376.0))));
        linguisticVariables.put("HotTXS", HotTXS);

        /* Column T10NW - winter */
        LinguisticVariable ColdT10NW = new LinguisticVariable(
                "cold",
                Columns.T10N,
                Seasons.winter,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(-138.0, -138.0, -60.0, -30.0))));
        linguisticVariables.put("ColdT10NW", ColdT10NW);

        LinguisticVariable WarmT10NW = new LinguisticVariable(
                "warm",
                Columns.T10N,
                Seasons.winter,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(-50.0, -10.0, 40.0, 60.0))));
        linguisticVariables.put("WarmT10NW", WarmT10NW);

        LinguisticVariable HotT10NW = new LinguisticVariable(
                "hot",
                Columns.T10N,
                Seasons.winter,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(45.0, 75.0, 232.0, 232.0))));
        linguisticVariables.put("HotT10NW", HotT10NW);

        /* Column T10NSA - spring and autumn */
        LinguisticVariable ColdT10NSA = new LinguisticVariable(
                "cold",
                Columns.T10N,
                Seasons.spring_autumn,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(-138.0, -138.0, -20.0, 20.0))));
        linguisticVariables.put("ColdT10NSA", ColdT10NSA);

        LinguisticVariable WarmT10NSA = new LinguisticVariable(
                "warm",
                Columns.T10N,
                Seasons.spring_autumn,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(0.0, 30.0, 100.0, 130.0))));
        linguisticVariables.put("WarmT10NSA", WarmT10NSA);

        LinguisticVariable HotT10NSA = new LinguisticVariable(
                "hot",
                Columns.T10N,
                Seasons.spring_autumn,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(100.0, 140.0, 232.0, 232.0))));
        linguisticVariables.put("HotT10NSA", HotT10NSA);

        /* Column T10NS - summer */
        LinguisticVariable ColdT10NS = new LinguisticVariable(
                "cold",
                Columns.T10N,
                Seasons.summer,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(-138.0, -138.0, 50.0, 70.0))));
        linguisticVariables.put("ColdT10NS", ColdT10NS);

        LinguisticVariable WarmT10NS = new LinguisticVariable(
                "warm",
                Columns.T10N,
                Seasons.summer,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(50.0, 80.0, 160.0, 180.0))));
        linguisticVariables.put("WarmT10NS", WarmT10NS);

        LinguisticVariable HotT10NS = new LinguisticVariable(
                "hot",
                Columns.T10N,
                Seasons.summer,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(150.0, 190.0, 232.0, 232.0))));
        linguisticVariables.put("HotT10NS", HotT10NS);

        /* Column Q */
        LinguisticVariable OvercastQ = new LinguisticVariable(
                "overcast",
                Columns.Q,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(24.0, 24.0, 350.0, 500.0))));
        linguisticVariables.put("OvercastQ", OvercastQ);

        LinguisticVariable CloudyQ = new LinguisticVariable(
                "cloudy",
                Columns.Q,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(400.0, 700.0, 1300.0, 1600.0))));
        linguisticVariables.put("CloudyQ", CloudyQ);

        LinguisticVariable SunnyQ = new LinguisticVariable(
                "sunny",
                Columns.Q,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(1400.0, 1900.0, 3145.0, 3145.0))));
        linguisticVariables.put("SunnyQ", SunnyQ);

        /* Column RH */
        LinguisticVariable NoneRH = new LinguisticVariable(
                "none",
                Columns.RH,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(-1.0, -1.0, 5.0, 7.0))));
        linguisticVariables.put("NoneRH", NoneRH);

        LinguisticVariable LowRH = new LinguisticVariable(
                "low",
                Columns.RH,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(5.0, 10.0, 35.0, 45.0))));
        linguisticVariables.put("LowRH", LowRH);

        LinguisticVariable HighRH = new LinguisticVariable(
                "high",
                Columns.RH,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(40.0, 60.0, 120.0, 175.0))));
        linguisticVariables.put("HighRH", HighRH);

        LinguisticVariable DownpourRH = new LinguisticVariable(
                "downpour",
                Columns.RH,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(150.0, 180.0, 776.0, 776.0))));
        linguisticVariables.put("DownpourRH", DownpourRH);

        // No qualifier - "all objects"
        LinguisticVariable All = new LinguisticVariable(
                "",
                null,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(-1.0, -1.0, -1.0, -1.0))));
        linguisticVariables.put("All", All);

    }
}
