package br.com.mouta.www.Decrescente;

public class Decrescente {
	int num1,num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public void decescente(){
        if(getNum1()>getNum2()){
            System.out.println("A ordem é "+getNum1()+" e "+getNum2());
        }else{
            System.out.println("A ordem é "+getNum2()+" e "+getNum1());
        }
    }
}
