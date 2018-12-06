package b.com.jokeslib;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class MyClass {

   public static List<String> jokesList = asList(

            "As long as there are tests, there will be prayer in schools.",
            "What did one ocean say to the other ocean? Nothing, they just waved.",
            "Why did the scientist install a knocker on his door? He wanted to win the No-bell prize!",
            "When everything’s coming your way, you’re in the wrong lane.",
            "Why did the bee get married? Because he found his honey."
    );

    public static String getJoke(){

        Random random=new Random();

        return  jokesList.get(random.nextInt(jokesList.size()));


    }
}
