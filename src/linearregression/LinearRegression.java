/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearregression;

/**
 *
 * @author Xcalaiberz
 */
public class LinearRegression {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x[] = {1.47 , 1.50 , 1.52 , 1.55 , 1.57 , 1.60 , 1.63 , 1.65 , 1.68 , 1.70 , 1.73 , 1.75 , 1.78 , 1.80 , 1.83};
        double y[] = {52.21 , 53.12 , 54.48 , 55.84 , 57.20 , 58.57 , 59.93 , 61.29 , 63.11 , 64.47 , 66.28 , 68.10 , 69.92 , 72.19 , 74.46};
        double Sum_X=0,Sum_Y=0,Sum_XX=0,Sum_XY=0,Sum_YY = 0;
        if((x.length!=y.length)){
            System.err.println("Length of Data Mismatch");
            System.exit(1);
        }
        int n=x.length;
        for(int i=0;i<x.length;i++){
            Sum_X = Sum_X + x[i];
        }
        for(int i=0;i<y.length;i++){
            Sum_Y = Sum_Y + y[i];
        }
        for(int i=0;i<x.length;i++){
            Sum_XX = Sum_XX + (x[i]*x[i]);
        }
        for(int i=0;i<y.length;i++){
            Sum_YY = Sum_YY + (y[i]*y[i]);
        }
        for(int i=0;i<y.length;i++){
            Sum_XY = Sum_XY + (x[i]*y[i]);
        }
        double Beta = (n*Sum_XY - Sum_X*Sum_Y)/(n*Sum_XX - Sum_X*Sum_X);
        double Alpha = (Sum_Y/n)-((Beta*Sum_X)/n);

        System.out.println("Hence The Equation of Linear Regression is : y = "+Alpha+"+"+Beta+"x ");
    }
    
}
