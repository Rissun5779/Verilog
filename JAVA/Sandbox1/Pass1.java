public class Pass1 {
    int A;
    double Score;

    Pass1(int number, double Value){
        A=number;
        Score=Value;
    }

    public static void main(String args[]){
        pass pa = new pass(0, 3.45);
        System.out.printf("number: %d, Score: %05.2f ", pa.a, pa.Score);
        pa.dispose();
        System.out.println(pa.result);

        pa.a=2;
        pa.Score=88.45;
        System.out.printf("number: %d, Score: %05.2f ", pa.a, pa.Score);
        pa.dispose();
        System.out.println(pa.result);
    }

    static class pass{
        int a;
        double Score;
        String result;

        pass(int number, double Value){
            a = number;
            Score = Value;
        }

        void dispose(){
            result="不及格";
            if (Score>=60) {
                result="及格";
            }
        }
    }
}
