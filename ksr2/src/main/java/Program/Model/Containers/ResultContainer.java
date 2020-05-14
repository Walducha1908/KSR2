package Program.Model.Containers;

import Program.Model.Record;
import Program.Model.Result;
import Program.Settings;

import java.util.LinkedList;

public class ResultContainer {
    public static LinkedList<Result> results;

    public static void addResult(Result result) {
        if (results == null) {
            results = new LinkedList<>();
        }
        results.add(result);
    }

    public static LinkedList<Result> getOnlyTrue() {
        LinkedList<Result> trueResults = new LinkedList<>();
        for (Result result: results) {
            if (result.getDegreeOfTruth() >= Settings.trueSentenceCutOffPoint) {
                trueResults.add(result);
            }
        }
        return trueResults;
    }
}
