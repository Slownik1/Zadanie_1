public final class Solution {

    public static int solution(int N){

        int result=0;
        int tmp =0;
        N=Math.abs(N);
        String number = Integer.toString(N);
        boolean[] tab = new boolean[10];

        for(int i=0; i<number.length(); i++){
            tmp =Integer.parseInt(String.valueOf(number.charAt(i)));
            if(tab[tmp]==false)
                tab[tmp]=true;
        }

        for(Boolean i : tab){
            if(i != false)
                result++;
        }

        return result;

    }

}
