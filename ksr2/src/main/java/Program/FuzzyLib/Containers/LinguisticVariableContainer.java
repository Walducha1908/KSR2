package Program.FuzzyLib.Containers;

import Program.FuzzyLib.Logic.LinguisticLabel;
import Program.FuzzyLib.Membership.TrapezoidFunction;
import Program.Model.Columns;
import Program.Model.Seasons;

import java.util.*;

public class LinguisticVariableContainer {
    public static HashMap<String, LinguisticLabel> linguisticVariables;

    public static void prepareLinguisticVariables() {
        linguisticVariables = new HashMap<String, LinguisticLabel>();

        /* Column FG */
        LinguisticLabel GentleFG = new LinguisticLabel(
            "gentle",
                Columns.FG,
            null,
            new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(5.0, 5.0, 21.0, 28.0))));
        linguisticVariables.put("GentleFG", GentleFG);

        LinguisticLabel ModerateFG = new LinguisticLabel(
                "moderate",
                Columns.FG,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(23.0, 32.0, 47.0, 56.0))));
        linguisticVariables.put("ModerateFG", ModerateFG);

        LinguisticLabel StrongFG = new LinguisticLabel(
                "strong",
                Columns.FG,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(50.0, 75.0, 157.0, 157.0))));
        linguisticVariables.put("StrongFG", StrongFG);

        /* Column FHX */
        LinguisticLabel GentleFHX = new LinguisticLabel(
                "gentle",
                Columns.FHX,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(10.0, 10.0, 30.0, 40.0))));
        linguisticVariables.put("GentleFHX", GentleFHX);

        LinguisticLabel ModerateFHX = new LinguisticLabel(
                "moderate",
                Columns.FHX,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(30.0, 45.0, 75.0, 90.0))));
        linguisticVariables.put("ModerateFHX", ModerateFHX);

        LinguisticLabel StrongFHX = new LinguisticLabel(
                "strong",
                Columns.FHX,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(80.0, 100.0, 150.0, 180.0))));
        linguisticVariables.put("StrongFHX", StrongFHX);

        LinguisticLabel VeryStrongFHX = new LinguisticLabel(
                "very strong",
                Columns.FHX,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(150.0, 180.0, 240.0, 240.0))));
        linguisticVariables.put("VeryStrongFHX", VeryStrongFHX);

        /* Column FHN */
        LinguisticLabel GentleFHN = new LinguisticLabel(
                "gentle",
                Columns.FHN,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(0.0, 0.0, 10.0, 15.0))));
        linguisticVariables.put("GentleFHN", GentleFHN);

        LinguisticLabel ModerateFHN = new LinguisticLabel(
                "moderate",
                Columns.FHN,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(10.0, 18.0, 28.0, 36.0))));
        linguisticVariables.put("ModerateFHN", ModerateFHN);

        LinguisticLabel StrongFHN = new LinguisticLabel(
                "strong",
                Columns.FHN,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(30.0, 38.0, 55.0, 65.0))));
        linguisticVariables.put("StrongFHN", StrongFHN);

        LinguisticLabel VeryStrongFHN = new LinguisticLabel(
                "very strong",
                Columns.FHN,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(50.0, 70.0, 140.0, 140.0))));
        linguisticVariables.put("VeryStrongFHN", VeryStrongFHN);

        /* Column FXX */
        LinguisticLabel GentleFXX = new LinguisticLabel(
                "gentle",
                Columns.FXX,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(20.0, 20.0, 50.0, 60.0))));
        linguisticVariables.put("GentleFXX", GentleFXX);

        LinguisticLabel ModerateFXX = new LinguisticLabel(
                "moderate",
                Columns.FXX,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(50.0, 65.0, 100.0, 120.0))));
        linguisticVariables.put("ModerateFXX", ModerateFXX);

        LinguisticLabel StrongFXX = new LinguisticLabel(
                "strong",
                Columns.FXX,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(100.0, 130.0, 200.0, 250.0))));
        linguisticVariables.put("StrongFXX", StrongFXX);

        LinguisticLabel VeryStrongFXX = new LinguisticLabel(
                "very strong",
                Columns.FXX,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(200.0, 275.0, 390.0, 390.0))));
        linguisticVariables.put("VeryStrongFXX", VeryStrongFXX);

        /* Column TG - winter */
        LinguisticLabel ColdTGW = new LinguisticLabel(
                "cold",
                Columns.TG,
                Seasons.winter,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(-81.0, -81.0, -10.0, 20.0))));
        linguisticVariables.put("ColdTGW", ColdTGW);

        LinguisticLabel WarmTGW = new LinguisticLabel(
                "warm",
                Columns.TG,
                Seasons.winter,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(10.0, 40.0, 90.0, 120.0))));
        linguisticVariables.put("WarmTGW", WarmTGW);

        LinguisticLabel HotTGW = new LinguisticLabel(
                "hot",
                Columns.TG,
                Seasons.winter,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(100.0, 150.0, 306.0, 306.0))));
        linguisticVariables.put("HotTGW", HotTGW);

        /* Column TG - spring and autumn */
        LinguisticLabel ColdTGSA = new LinguisticLabel(
                "cold",
                Columns.TG,
                Seasons.spring_autumn,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(-81.0, -81.0, 35.0, 85.0))));
        linguisticVariables.put("ColdTGSA", ColdTGSA);

        LinguisticLabel WarmTGSA = new LinguisticLabel(
                "warm",
                Columns.TG,
                Seasons.spring_autumn,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(70.0, 100.0, 150.0, 180.0))));
        linguisticVariables.put("WarmTGSA", WarmTGSA);

        LinguisticLabel HotTGSA = new LinguisticLabel(
                "hot",
                Columns.TG,
                Seasons.spring_autumn,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(160.0, 200.0, 306.0, 306.0))));
        linguisticVariables.put("HotTGSA", HotTGSA);

        /* Column TG - summer */
        LinguisticLabel ColdTGS = new LinguisticLabel(
                "cold",
                Columns.TG,
                Seasons.summer,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(-81.0, -81.0, 100.0, 150.0))));
        linguisticVariables.put("ColdTGS", ColdTGS);

        LinguisticLabel WarmTGS = new LinguisticLabel(
                "warm",
                Columns.TG,
                Seasons.summer,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(130.0, 150.0, 230.0, 250.0))));
        linguisticVariables.put("WarmTGS", WarmTGS);

        LinguisticLabel HotTGS = new LinguisticLabel(
                "hot",
                Columns.TG,
                Seasons.summer,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(240.0, 260.0, 306.0, 306.0))));
        linguisticVariables.put("HotTGS", HotTGS);

        /* Column TN - winter */
        LinguisticLabel ColdTNW = new LinguisticLabel(
                "cold",
                Columns.TN,
                Seasons.winter,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(-108.0, -108.0, -40.0, -20.0))));
        linguisticVariables.put("ColdTNW", ColdTNW);

        LinguisticLabel WarmTNW = new LinguisticLabel(
                "warm",
                Columns.TN,
                Seasons.winter,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(-40.0, -10.0, 60.0, 80.0))));
        linguisticVariables.put("WarmTNW", WarmTNW);

        LinguisticLabel HotTNW = new LinguisticLabel(
                "hot",
                Columns.TN,
                Seasons.winter,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(60.0, 100.0, 244.0, 244.0))));
        linguisticVariables.put("HotTNW", HotTNW);

        /* Column TN - spring and autumn */
        LinguisticLabel ColdTNSA = new LinguisticLabel(
                "cold",
                Columns.TN,
                Seasons.spring_autumn,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(-108.0, -108.0, 0.0, 30.0))));
        linguisticVariables.put("ColdTNSA", ColdTNSA);

        LinguisticLabel WarmTNSA = new LinguisticLabel(
                "warm",
                Columns.TN,
                Seasons.spring_autumn,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(10.0, 50.0, 110.0, 140.0))));
        linguisticVariables.put("WarmTNSA", WarmTNSA);

        LinguisticLabel HotTNSA = new LinguisticLabel(
                "hot",
                Columns.TN,
                Seasons.spring_autumn,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(110.0, 160.0, 244.0, 244.0))));
        linguisticVariables.put("HotTNSA", HotTNSA);

        /* Column TN - summer */
        LinguisticLabel ColdTNS = new LinguisticLabel(
                "cold",
                Columns.TN,
                Seasons.summer,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(-108.0, -108.0, 70.0, 100.0))));
        linguisticVariables.put("ColdTNS", ColdTNS);

        LinguisticLabel WarmTNS = new LinguisticLabel(
                "warm",
                Columns.TN,
                Seasons.summer,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(80.0, 130.0, 180.0, 200.0))));
        linguisticVariables.put("WarmTNS", WarmTNS);

        LinguisticLabel HotTNS = new LinguisticLabel(
                "hot",
                Columns.TN,
                Seasons.summer,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(175.0, 210.0, 244.0, 244.0))));
        linguisticVariables.put("HotTNS", HotTNS);

        /* Column TX - winter */
        LinguisticLabel ColdTXW = new LinguisticLabel(
                "cold",
                Columns.TX,
                Seasons.winter,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(-60.0, -60.0, 10.0, 30.0))));
        linguisticVariables.put("ColdTXW", ColdTXW);

        LinguisticLabel WarmTXW = new LinguisticLabel(
                "warm",
                Columns.TX,
                Seasons.winter,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(10.0, 50.0, 100.0, 130.0))));
        linguisticVariables.put("WarmTXW", WarmTXW);

        LinguisticLabel HotTXW = new LinguisticLabel(
                "hot",
                Columns.TX,
                Seasons.winter,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(100.0, 150.0, 376.0, 376.0))));
        linguisticVariables.put("HotTXW", HotTXW);

        /* Column TX - spring and autumn */
        LinguisticLabel ColdTXSA = new LinguisticLabel(
                "cold",
                Columns.TX,
                Seasons.spring_autumn,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(-60.0, -60.0, 60.0, 80.0))));
        linguisticVariables.put("ColdTXSA", ColdTXSA);

        LinguisticLabel WarmTXSA = new LinguisticLabel(
                "warm",
                Columns.TX,
                Seasons.spring_autumn,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(60.0, 100.0, 190.0, 225.0))));
        linguisticVariables.put("WarmTXSA", WarmTXSA);

        LinguisticLabel HotTXSA = new LinguisticLabel(
                "hot",
                Columns.TX,
                Seasons.spring_autumn,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(180.0, 250.0, 376.0, 376.0))));
        linguisticVariables.put("HotTXSA", HotTXSA);

        /* Column TX - summer */
        LinguisticLabel ColdTXS = new LinguisticLabel(
                "cold",
                Columns.TX,
                Seasons.summer,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(-60.0, -60.0, 160.0, 190.0))));
        linguisticVariables.put("ColdTXS", ColdTXS);

        LinguisticLabel WarmTXS = new LinguisticLabel(
                "warm",
                Columns.TX,
                Seasons.summer,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(170.0, 210.0, 270.0, 300.0))));
        linguisticVariables.put("WarmTXS", WarmTXS);

        LinguisticLabel HotTXS = new LinguisticLabel(
                "hot",
                Columns.TX,
                Seasons.summer,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(280.0, 300.0, 376.0, 376.0))));
        linguisticVariables.put("HotTXS", HotTXS);

        /* Column T10NW - winter */
        LinguisticLabel ColdT10NW = new LinguisticLabel(
                "cold",
                Columns.T10N,
                Seasons.winter,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(-138.0, -138.0, -60.0, -30.0))));
        linguisticVariables.put("ColdT10NW", ColdT10NW);

        LinguisticLabel WarmT10NW = new LinguisticLabel(
                "warm",
                Columns.T10N,
                Seasons.winter,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(-50.0, -10.0, 40.0, 60.0))));
        linguisticVariables.put("WarmT10NW", WarmT10NW);

        LinguisticLabel HotT10NW = new LinguisticLabel(
                "hot",
                Columns.T10N,
                Seasons.winter,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(45.0, 75.0, 232.0, 232.0))));
        linguisticVariables.put("HotT10NW", HotT10NW);

        /* Column T10NSA - spring and autumn */
        LinguisticLabel ColdT10NSA = new LinguisticLabel(
                "cold",
                Columns.T10N,
                Seasons.spring_autumn,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(-138.0, -138.0, -20.0, 20.0))));
        linguisticVariables.put("ColdT10NSA", ColdT10NSA);

        LinguisticLabel WarmT10NSA = new LinguisticLabel(
                "warm",
                Columns.T10N,
                Seasons.spring_autumn,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(0.0, 30.0, 100.0, 130.0))));
        linguisticVariables.put("WarmT10NSA", WarmT10NSA);

        LinguisticLabel HotT10NSA = new LinguisticLabel(
                "hot",
                Columns.T10N,
                Seasons.spring_autumn,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(100.0, 140.0, 232.0, 232.0))));
        linguisticVariables.put("HotT10NSA", HotT10NSA);

        /* Column T10NS - summer */
        LinguisticLabel ColdT10NS = new LinguisticLabel(
                "cold",
                Columns.T10N,
                Seasons.summer,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(-138.0, -138.0, 50.0, 70.0))));
        linguisticVariables.put("ColdT10NS", ColdT10NS);

        LinguisticLabel WarmT10NS = new LinguisticLabel(
                "warm",
                Columns.T10N,
                Seasons.summer,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(50.0, 80.0, 160.0, 180.0))));
        linguisticVariables.put("WarmT10NS", WarmT10NS);

        LinguisticLabel HotT10NS = new LinguisticLabel(
                "hot",
                Columns.T10N,
                Seasons.summer,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(150.0, 190.0, 232.0, 232.0))));
        linguisticVariables.put("HotT10NS", HotT10NS);

        /* Column Q */
        LinguisticLabel OvercastQ = new LinguisticLabel(
                "overcast",
                Columns.Q,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(24.0, 24.0, 350.0, 500.0))));
        linguisticVariables.put("OvercastQ", OvercastQ);

        LinguisticLabel CloudyQ = new LinguisticLabel(
                "cloudy",
                Columns.Q,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(400.0, 700.0, 1300.0, 1600.0))));
        linguisticVariables.put("CloudyQ", CloudyQ);

        LinguisticLabel SunnyQ = new LinguisticLabel(
                "sunny",
                Columns.Q,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(1400.0, 1900.0, 3145.0, 3145.0))));
        linguisticVariables.put("SunnyQ", SunnyQ);

        /* Column RH */
        LinguisticLabel NoneRH = new LinguisticLabel(
                "none",
                Columns.RH,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(-1.0, -1.0, 5.0, 7.0))));
        linguisticVariables.put("NoneRH", NoneRH);

        LinguisticLabel LowRH = new LinguisticLabel(
                "low",
                Columns.RH,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(5.0, 10.0, 35.0, 45.0))));
        linguisticVariables.put("LowRH", LowRH);

        LinguisticLabel HighRH = new LinguisticLabel(
                "high",
                Columns.RH,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(40.0, 60.0, 120.0, 175.0))));
        linguisticVariables.put("HighRH", HighRH);

        LinguisticLabel DownpourRH = new LinguisticLabel(
                "downpour",
                Columns.RH,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(150.0, 180.0, 776.0, 776.0))));
        linguisticVariables.put("DownpourRH", DownpourRH);

        // No qualifier - "all objects"
        LinguisticLabel All = new LinguisticLabel(
                "",
                null,
                null,
                new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(-1.0, -1.0, -1.0, -1.0))));
        linguisticVariables.put("NoQualifier", All);

        sortLinguisticVariables();
    }

    public static void sortLinguisticVariables() {
        // Sort linguistic variable map with columns (variables)
        Comparator<Map.Entry<String, LinguisticLabel>> valueComparator = new Comparator<Map.Entry<String,LinguisticLabel>>() {
            @Override
            public int compare(Map.Entry<String, LinguisticLabel> e1, Map.Entry<String, LinguisticLabel> e2) {
                if (e1.getValue().getColumn() == null)
                    return -1;
                if (e2.getValue().getColumn() == null)
                    return 1;
                String s1 = e1.getValue().getColumn().toString() + e1.getValue().getQuantifierName();
                String s2 = e2.getValue().getColumn().toString() + e2.getValue().getQuantifierName();
                return s1.compareTo(s2);
            }
        };

        Set<Map.Entry<String, LinguisticLabel>> entries = linguisticVariables.entrySet();
        List<Map.Entry<String, LinguisticLabel>> listOfEntries = new ArrayList<Map.Entry<String, LinguisticLabel>>(entries);

        Collections.sort(listOfEntries, valueComparator);

        LinkedHashMap<String, LinguisticLabel> sortedByValue = new LinkedHashMap<String, LinguisticLabel>(listOfEntries.size());

        for(Map.Entry<String, LinguisticLabel> entry : listOfEntries){
            sortedByValue.put(entry.getKey(), entry.getValue());
        }

        linguisticVariables = sortedByValue;
    }
}
