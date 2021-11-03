package ru.yandex.gb_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Telephonebook {
    HashMap<String, ArrayList<String>> telephonsNames = new HashMap<>();


        public void add(String name, String telephone) {
            if(telephonsNames.get(name) == null) {
                ArrayList<String> telephones =  new ArrayList<>();
                telephones.add(telephone);
                telephonsNames.put(name, telephones);
            }
            else {
                telephonsNames.get(name).add(telephone);
            }
        }

        public ArrayList<String> get(String name) {
            return telephonsNames.get(name);
        }
    }

