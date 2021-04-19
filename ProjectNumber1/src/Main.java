public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s){
        int answer = 0;
        int length = s.length();
        for (int i=0; i <= length - 1;i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                answer++;
            }
        }
        return answer;
    }
    //Code you problem number two here
    static int problemTwo(String s){
        int answer = 0;
        int length = s.length();
        for (int i=0; i <= length - 3;i++){
            if(s.substring(i, i + 3).equals("bob")){
                answer++;
            }
        }
        return answer;
    }
    //Code your solution to problem number 3 here
    static String problemThree(String s){
        int length = s.length();
        for (int i=0; i <= length-1;i++){
            for(int j=i+1;j<= length-1;j++){
                if(s.charAt(i)<=s.charAt(j)){
                    int x = i;
                    int y = j;
                    s= s.substring(x,y);//I couldn't solve this one
                }
            }
        }
        return s;
    }
    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
        String s;
    }
}
