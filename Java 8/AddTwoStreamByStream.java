import java.util.*;

class AddTwoStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,2,1,4);
        
        int sum = list.stream().reduce(0,(x,y)->x+y);
        System.out.println(sum);
    }
}
