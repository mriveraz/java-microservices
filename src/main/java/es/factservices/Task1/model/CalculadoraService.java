package es.factservices.Task1.model;

import org.springframework.beans.factory.annotation.Autowired;

public class CalculadoraService implements CalculatoraRepository {

    @Autowired
    private CalculatoraRepository repository;

    public void setCalculatorService(CalculatoraRepository repository){
        this.repository  = repository;
    }


    @Override
    public double add(double input1, double input2) {

        return  input1 + input2 ;

    }

    @Override
    public double subtract(double input1, double input2)
    {
        return input1 - input2;
    }

    @Override
    public double multiply(double input1, double input2) {
        return input1 * input2;
    }

    @Override
    public double divide(double input1, double input2) {
        return input1 / input2;
    }
}
