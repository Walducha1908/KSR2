package Program.FuzzyLib.Summaries;

import Program.FuzzyLib.Logic.LinguisticVariable;
import Program.Model.Columns;
import Program.Model.Seasons;

public class SentenceMaker {
    public static String makeSentence(LinguisticVariable quantifier, LinguisticVariable qualifier, LinguisticVariable summarizer) {
        String sentence = quantifier.toString();
        sentence += "of ";
        if (summarizer.getSeason() != null) {
            sentence += seasonDictionary(summarizer.getSeason()) + " ";
        } else if (qualifier.getSeason() != null) {
            sentence += seasonDictionary(qualifier.getSeason()) + " ";
        }
        sentence += "measures ";
        if (qualifier.getColumn() != null) {
            sentence += "with ";
            sentence += qualifier.toString();
            sentence += " ";
        }
        sentence += "have ";
        sentence += summarizer.toString();
        sentence += ".";

        return sentence;
    }

    public static String makeMultiSubjectSentence(LinguisticVariable quantifier, LinguisticVariable summarizer, Seasons season1, Seasons season2) {
        String sentence = quantifier.toString();
        sentence += "of ";
        sentence += seasonDictionary(season1) + " ";
        sentence += "measures compared to ";
        sentence += seasonDictionary(season2) + " ";
        sentence += "measures have ";
        sentence += summarizer.toString();
        sentence += ".";

        return sentence;
    }

    public static String columnDictionary(Columns column) {
        if (column != null) {
            switch (column) {
                case FG:
                    return "daily wind speed average";
                case FHX:
                    return "highest wind speed average during one hour";
                case FHN:
                    return "lowest wind speed average during one hour";
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
        } else {
            return "";
        }
    }

    public static String seasonDictionary(Seasons seasons) {
        switch (seasons) {
            case winter:
                return "winter";
            case spring_autumn:
                return "spring or autumn";
            case summer:
                return "summer";
            default:
                return "wrong column";
        }
    }
}
