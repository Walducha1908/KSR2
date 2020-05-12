package Program.Helper;

import Program.FuzzyLib.Logic.LinguisticVariable;
import Program.Model.Columns;

public class SentenceMaker {
    public static String makeSentence(LinguisticVariable quantifier, LinguisticVariable qualifier, LinguisticVariable summarizer) {
        String sentence = quantifier.toString();
        sentence += "measures with ";
        sentence += qualifier.toString();
        sentence += columnDictionary(qualifier.getColumn());
        sentence += " have ";
        sentence += summarizer.toString();
        sentence += columnDictionary(summarizer.getColumn());
        sentence += ".";

        return sentence;
    }

    public static String columnDictionary(Columns column) {
        switch (column) {
            case FG:
                return "daily average wind speed";
            case FHX:
                return "highest average wind speed during one hour";
            case FHN:
                return "lowest average wind speed during one hour";
            case FXX:
                return "strongest wind blow";
            case TG:
                return "daily average temperature";
            case TN:
                return "lowest temperature";
            case TX:
                return "highest temperature";
            case T10N:
                return "lowest temperature on 10cm over ground level";
            case Q:
                return "insolation";
            case RH:
                return "precipitation";
            default:
                return "wrong column";
        }
    }
}
