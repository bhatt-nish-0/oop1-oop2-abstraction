import java.util.*;

public class triplet {

    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};

        List<List<Integer>> a = new ArrayList<>();

        for (int i =0; i< nums.length; i ++) {
            for (int j= i+1; j<nums.length; j++) {
                for (int k = j + 1; k < nums.length ; k++) {
                    if (((i != j) && (i != k) && (j !=k)) && (nums[i] + nums[j] + nums[k] == 0)) {
                        ArrayList<Integer> b = new ArrayList<>();
                        b.add(nums[i]);
                        b.add(nums[j]);
                        b.add(nums[k]);


                        a.add(b);
                    }
                }
            }
        }


        for (int i =0; i<a.size(); i++) {
            Collections.sort(a.get(i));
        }

        System.out.println(a);

        Set<List<Integer>> uniqueSet = new HashSet<>();

        for (List<Integer> sublist : a) {
            uniqueSet.add(new ArrayList<>(sublist));
        }

        a.clear();
        a.addAll(uniqueSet);

        System.out.println(a);
    }
}
