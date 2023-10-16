import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleArray
	{
    public static void main(String[] args)
	{ 
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        Collections.shuffle(list);

        Integer[] shuffledArray = list.toArray(new Integer[0]);

        for (int value : shuffledArray) {
            System.out.print(value + " ");
        }
    }
}
