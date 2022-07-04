package ua.hillel.secondtask;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Score viewsScore = new Score();
        viewsScore.category = "views";

        Score actionsScore = new Score();
        actionsScore.category = "actions";

        Score sharingsScore = new Score();
        sharingsScore.category = "sharings";

        Score buyingsScore = new Score();
        buyingsScore.category = "buyings";

        for (int i = 0; i < viewsScore.statistic.length; i++) {
            actionsScore.statistic[i] = Math.random() * 100;
            viewsScore.statistic[i] = Math.random() * 100;
            sharingsScore.statistic[i] = Math.random() * 100;
            buyingsScore.statistic[i] = Math.random() * 100;
        }

        GlobalRating.data[0] = viewsScore;
        GlobalRating.data[1] = actionsScore;
        GlobalRating.data[2] = sharingsScore;
        GlobalRating.data[3] = buyingsScore;

        for (int i = 0; i < GlobalRating.data.length; i++) {
            System.out.println(GlobalRating.data[i].category + ": " + Arrays.toString(GlobalRating.data[i].statistic));
        }
    }
}
