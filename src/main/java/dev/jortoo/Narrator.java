package dev.jortoo;

import java.util.ArrayList;

public class Narrator {

    private static ArrayList<Sentences> sentences = new ArrayList<>();

    public static void narrator() {

        sentences.add(new Sentences("Testing 1!", 100));
        sentences.add(new Sentences("Testing 2!", 1000));

        for (int i = 0; i < sentences.size(); i++) {

            String s = sentences.get(i).sentence;
            int delay = sentences.get(i).delay;

            char[] sChars = s.toCharArray();

            for (char sChar : sChars) {

                try {
                    System.out.print(sChar);
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("");

        }

    }

}
