package ru.yandex.gb_2;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Telephonebook telephonebook = new Telephonebook();
        telephonebook.add("Sasha", "731026");
        telephonebook.add("Sveta", "725609");
        telephonebook.add("Vova", "751096");
        telephonebook.add("Ivan", "770906");
        telephonebook.add("Elena", "710309");
        telephonebook.add("Sasha", "731056");

        System.out.println(telephonebook.get("Oleg"));
        System.out.println(telephonebook.get("Sasha"));

        HashMap<String, Integer> hashMap = new HashMap<>();
        String[] strings = {"qwerty", "1589", "@%$&*", "tyu456", "234$%fgd",
                "1589", "@%$&*", "tyu456", "234$%fgd",
                "@%$&*", "tyu456", "234$%fgd",
                "tyu456", "234$%fgd",
                "234$%fgd"
        };

        for (String q : strings) {
            if (hashMap.get(q) == null) {
                hashMap.put(q, 1);
            } else {
                hashMap.put(q, hashMap.get(q) + 1);
            }
        }
        System.out.println(hashMap);

    }
}
