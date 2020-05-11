package Program;

import Program.FuzzyLib.Containers.LinguisticVariableContainer;

public class Manager {
    public static void prepareLinguisticVariables() {
        LinguisticVariableContainer linguisticVariableContainer = new LinguisticVariableContainer();
        System.out.println(linguisticVariableContainer.linguisticVariables);
    }
}
