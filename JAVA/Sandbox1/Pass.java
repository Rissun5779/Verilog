public class Pass{
    public static void main(String args[]){
        int a=88;
        pass pa = new pass();
        pa.score=a;
        pa.dispose();

        String b = pa.result;
        System.out.println(b);
    }
}

class pass {
    pass(){
    }

    int score;
    String result;
    
    void dispose(){
        result="不及格";
        if(score>=60){
            result="及格";
        }
    }
}
