/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huige1
 */
abstract class PayCalculator
{


    protected double payRate;


    public double computePay(int hours){
    
        return hours*payRate;
}
}
    class RegularPay extends PayCalculator{

        public RegularPay(double payRate){

            this.payRate = payRate;
    }
}


    class HazardPay extends RegularPay{

        public HazardPay(double payRate){
            super(payRate);
}

    public double computePay(int hours){
        return hours*payRate*1.5;
    }
}


