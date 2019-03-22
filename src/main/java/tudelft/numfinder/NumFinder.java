package tudelft.numfinder;

public class NumFinder {
    private int smallest = Integer.MAX_VALUE;
    private int largest = Integer.MIN_VALUE;

    public void find(int[] nums) {
        for(int n : nums) {

//            System.out.println(String.format("Min %s y max %s", Integer.MIN_VALUE, Integer.MAX_VALUE));

            if(n < smallest)
                smallest = n;
            if (n > largest)
//            if (n > largest)
                largest = n;

        }
    }

    public int getSmallest () {
        return smallest;
    }

    public int getLargest () {
        return largest;
    }
}
