package strings;

public class SubString {
    public static void main(String[] args) {
        String s1="sahil";
        String s2="hil";
        int M = s1.length();
        int N=s2.length();

        for(int i=0;i<N-M;i++){
            int j;
            for (j = 0; j < M; j++)
                if (s2.charAt(i + j) != s1.charAt(j))
                    break;

            if (j == M)
                System.out.println(i);
        }
        System.out.println(-1);
    }
}
