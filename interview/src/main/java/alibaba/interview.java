package alibaba;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wuxiy
 * @date 2020/2/23
 */
public class interview {
    // 求众数

    public static void main(String[] strings) {
        int[] nums = new int[]{1,2,3,5,2,4,4,4,4,4,4};
        if(nums.length < 2) {
        }
        Map<Integer, Integer> map = new HashMap<>();
        int resultCount = 0;
        int resultInt = 0;
        for (int num : nums) {
            if(map.containsKey(num)){
                Integer count = map.get(num);
                map.put(num , ++count );
                if(count > resultCount) {
                    resultCount = count;
                    resultInt = num;
                }

            } else {
                map.put(num, 1);
            }
        }

        System.out.println(resultInt);

    }
}
