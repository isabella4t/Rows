public class Main {
    public static void main(String[] args) {

    }

    public static double[] row(double[][] equations, double solutions[]){
        //I am a little confused
        //Answer to two systems of equations
        /*

        3x + y = 9
        -1/4y = -21/4

        we do multiplication

        3x + y = 4
        y = 5
        soo

        [-1/3]
        [5]


         */



        double[] ret = new double[2];
        /*
        [3 1]  [4]  []
        [1 0]  [5]  [5]

         */
        //I did not make this code abstract

        //It looks for the nonzero and substitutes it up
        if(equations[1][0]!=0) {
            //x is filled
            ret[1] = solutions[1] / equations[1][0];
            ret[0] = (solutions[0]-(equations[0][0]*ret[1]))/equations[0][1];

        }

        if(equations[1][1]!=0) {
            //x is filled
            ret[1] = solutions[1] / equations[1][1];
            ret[0] = (solutions[0]-(equations[0][1]*ret[1]))/equations[0][0];

        }

        return ret;

    }

    public static void backsub(double[][] equations, double solutions[]){
        double[] x = new double[solutions.length];
        for(int k = solutions.length-1;k>=0;k--){
            for(int i = solutions.length-k;i>0;i--){
                x[k] = solutions[k]/equations[k][k];
            }

            //epic equation to get the first number
            x[k] = solutions[k]/equations[k][k];
        }
    }
}
