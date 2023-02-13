public class Main {
    public static void main(String[] args) {

        test1();

    }

    public static void test1(){
        double[][] coeffs = {{3,1},{0,2}};
        double[] answers = {10,2};

        backsub(coeffs,answers);
    }

//backsub takes a set of coeffs from an equation and the solution to the equation and should return the solutions 'x' and 'y'
    public static double[] backsub(double[][] equations, double solutions[]){
        double[] ret = new double[equations[0].length];

        //The code is very not abstract

        //ok so first bottom row find y assuming x=0
        ret[1] = solutions[1]/equations[1][1];

        //now change top row solution without y
        solutions[0] -= ret[1]*equations[0][1];

        //now divide solution by the coeff

        solutions[0] /= equations[0][0];
        //now ret should be okay
       // return ret;

        for(int b = equations.length-1; b>=0;b--){

        }
        /*
        This code was my attempt at abstracting it
        for(int k = solutions.length-1;k>=0;k--){
            for(int i = solutions.length-k;i>0;i--){
                ret[k] = solutions[1]/equations[1][k];
            }

            //epic equation to get the first number
            ret[k] = solutions[k]/equations[k][k];
        }

         */
    }

    public static void GaussianElim(double[][] equations, double solutions[]){
        /*
        [3 1] [x] = 10
        [1 2] [y] = 5

        3x + 1y = 10
        1x + 2y = 5

        x + 1/3 y = 10/3
        0 + 2/3 y = 5/3

         */

        //first multiply top row by bottomleft/topleft
        double topmultiply = equations[1][0]/equations[0][0];
        for(int i = 0; i< equations[0].length;i++){
            equations[0][i] = equations[0][i]*topmultiply;
        }
        //now minus the bottom by top which should get rid of x

        for(int i = 0; i<equations[1].length;i++){
            equations[1][i] = equations[1][i]-equations[0][i];
        }
        //now x should be 0

    }
}
