package Project;

public class Calculator {

    public String calculateRoot(Double val){
        return String.valueOf(Math.sqrt(val));
    }

    public String calculateFactorial(int val){
        int i = (int) Math.round(val);
        return String.valueOf(factorial(i));


    }

    private int factorial(int i){
        if(i==0 || i==1){
            return 1;
        }
        else{
            return i*factorial(i-1);
        }
    }

    public String calculateLog(Double val){
        return String.valueOf(Math.log(val));
    }
    public String calculatePower(Double x,Double b){
        return String.valueOf(Math.pow(x,b));
    }


}
