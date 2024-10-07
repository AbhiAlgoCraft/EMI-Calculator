package Emiapp;
import java.util.*;;


public class Model {
    double principal, anualRate, emi,Rate,Time;
    int  loanTenure;

    public Model(double principal, double anualRate ,int loanTenure){
               this.principal= principal;
               this.anualRate= anualRate;
               this.loanTenure= loanTenure;
    }

    public void setPrincipal(double principal){
         this.principal= principal;
    }

    public double getPrincipal(){
        return principal;
    }

    public void setAnualRate(double anualRate){
        this.anualRate = anualRate;
    }

    public double getAnualRate(){
        return anualRate;
    }

    public void setLoanTenure(int loanTenure){
        this.loanTenure= loanTenure;
    }

    public int getLoanTenure(){
        return loanTenure;
    }

    public void setEmi(double principal, double anualRate, int loanTenure){
        this.principal = principal;
        this.anualRate =anualRate;
        this.loanTenure= loanTenure;
        this.Rate= anualRate/(12*100);
        this.Time= loanTenure*12;
        emi = (principal*Rate*Math.pow(1+Rate, Time))/(Math.pow(1+Rate, Time) - 1);
    }

    public double getEmi(){
        return emi;
    }

}
