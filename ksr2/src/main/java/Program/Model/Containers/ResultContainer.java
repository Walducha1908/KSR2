package Program.Model.Containers;

import Program.Model.Result;

import java.util.LinkedList;

public class ResultContainer {
    public static LinkedList<Result> results;

    public static void addResult(Result result) {
        if (results == null) {
            results = new LinkedList<>();
        }
        results.add(result);
    }
}
