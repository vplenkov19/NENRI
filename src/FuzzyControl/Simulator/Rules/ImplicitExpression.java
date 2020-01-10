package Simulator.Rules;

import Simulator.Helpers.MatrixMultiply;
import zad2.IFuzzySet;

public class ImplicitExpression{
    IRule antecedent;
    IFuzzySet konsekvens;

    public ImplicitExpression(IRule antecedent, IFuzzySet konsekvens) {
        super();

        this.antecedent = antecedent;
        this.konsekvens = konsekvens;
    }


    public IFuzzySet evaluate(int L, int D, int LK, int DK, int V, int S) {
        double value = antecedent.calculate(L, D, LK, DK, V, S);
        return MatrixMultiply.MatrixMultiply(konsekvens, value);
    }

    public IRule getAntecented() {
        return this.antecedent;
    }

    public IFuzzySet getKonsekvens() {
        return this.konsekvens;
    }
}
