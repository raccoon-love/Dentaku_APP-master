package com.example.orixb.dentaku_app;
import java.text.DecimalFormat;



public class Calc {

    private String total;
    private String input;
    private int operatorId;


    public Calc() {}
    public Calc(String total, String input) {
        this.total = total;
        this.input = input;
    }

    public String inputData(String data) {
        if (data.equals(".")) {
            if(input.indexOf(".") == -1) {
                input += ".";
            }
        } else {
            if(data.equals("0")) {
                if(!input.equals("0")) {
                    input += data;
                }
            } else {
                if(input.equals("0")) {
                    input = data;
                } else {
                    input += data;
                }
            }
        }

        return input;
    }

    public String clear() {
        total = "0";
        input = "0";
        //小数点の桁数を設定
        DecimalFormat df = new DecimalFormat("0.##################");
        //整数の最大桁数を設定
        df.setMaximumIntegerDigits(17);
        ////出力はdoubleに戻す
        return df.format(Double.parseDouble(total));
    }

    public void onOperatorButtonClick(int operatorId) {
        this.operatorId = operatorId;
        total = !total.equals("0") ? total : input;
        input = "0";
    }

    public String doCalc() {
        double result = Double.parseDouble(total);
        switch(operatorId) {
            case 1 : result *= Double.parseDouble(input); break;
            case 2 : result /= Double.parseDouble(input); break;
            case 3 : result += Double.parseDouble(input); break;
            case 4 : result -= Double.parseDouble(input); break;
        }
        input = "0";
        total = Double.toString(result);
        DecimalFormat df = new DecimalFormat("0.##################");
        df.setMaximumIntegerDigits(17);
        return df.format(result);
    }
}