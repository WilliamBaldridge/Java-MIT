import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Marathon {

    public static void main (String[] arguments) {

//        String[] names = {
//            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
//            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
//            "Aaron", "Kate"
//        };
//
//        int[] times = {
//            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
//            343, 317, 265
//        };
//
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i] + ": " + times[i]);
//        }

        HashMap<String, Integer> marathonResults = new HashMap<String, Integer>();

        marathonResults.put("Elena", 341);
        marathonResults.put("Thomas", 273);
        marathonResults.put("Hamilton", 278);
        marathonResults.put("Suzie", 329);
        marathonResults.put("Phil", 445);
        marathonResults.put("Matt", 402);
        marathonResults.put("Alex", 388);
        marathonResults.put("Emma", 275);
        marathonResults.put("John", 343);
        marathonResults.put("James", 334);
        marathonResults.put("Jane", 412);
        marathonResults.put("Emily", 393);
        marathonResults.put("Daniel", 299);
        marathonResults.put("Neda", 343);
        marathonResults.put("Aaron", 317);
        marathonResults.put("Kate", 265);

        System.out.println(marathonResults.size());
        System.out.println(marathonResults.keySet());
//        System.out.println(marathonResults.entrySet());

//        Integer time = 0;
//
//        marathonResults.forEach(
//                (key, value)
//                        -> {
//                    if (value == null) {
//                        System.out.println("Unfinished");
//                    } else {
//                        Integer lowerTime = value < time ? value : time;
////                        time = lowerTime;
//                    }
//                });

        Integer lowestValue = Collections.min(marathonResults.values());
        System.out.println(lowestValue);

//        for (Map.Entry<String, Integer> new_Map : marathonResults.entrySet()) {
//
//           if (new_Map.getValue() < new_Map.getValue()) {
//               System.out.println(new_Map.getValue());
//           }
//        }








    }


} 