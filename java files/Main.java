import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;


public class Main {

    public static void main(String[] args) throws IOException {
        int runs = 10;
        int rounds = 10000;
        double[] run1 = new double[rounds];
        double[] run2 = new double[rounds];
        double[] run3 = new double[rounds];
        double[] run4 = new double[rounds];
        double[] run5 = new double[rounds];
        double[] run6 = new double[rounds];
        double[] run7 = new double[rounds];
        double[] run8 = new double[rounds];
        double[] run9 = new double[rounds];
        double[] run10 = new double[rounds];

        double[] probabilities = new double[1000];

        double play8VsKeep8_min = 1;
        double play8VsSave8_min = 1;
        double keep8VsSave8_min = 1;
        double keep8VsPlay8_min = 1;
        double save8VsPlay8_min = 1;
        double save8VsKeep8_min = 1;
        double play8_min = 1;
        double keep8_min = 1;
        double save8_min = 1;
        double play8rot_min = 1;
        double keep8rot_min = 1;
        double save8rot_min = 1;

        double save8rot_max = 0;
        double keep8rot_max = 0;
        double play8rot_max = 0;
        double play8_max = 0;
        double keep8_max = 0;
        double save8_max = 0;
        double play8VsKeep8_max = 0;
        double play8VsSave8_max = 0;
        double keep8VsSave8_max = 0;
        double keep8VsPlay8_max = 0;
        double save8VsPlay8_max = 0;
        double save8VsKeep8_max = 0;

            Game game = new Game();

            for(int k = 0; k < runs; k++){
                //runs rounds # of trials to see how the strategies compare to themselves
                int play8vsKeep8_wins = 0;
                int play8vsSave8_wins = 0;
                int keep8vsSave8_wins = 0;
                int keep8VsPlay8_wins = 0;
                int save8VsPlay8_wins = 0;
                int save8VsKeep8_wins = 0;
                int play8_wins = 0;
                int play8rot_wins = 0;
                int keep8_wins = 0;
                int keep8rot_wins = 0;
                int save8_wins = 0;
                int save8rot_wins = 0;

                for (int j = 0; j < rounds; j++) {
                    if (game.testPlay8s() == 1) {
                        play8_wins++;
                    }
                    if (game.testKeep8s() == 1) {
                        keep8_wins++;
                    }
                    if (game.testSave8s() == 1) {
                        save8_wins++;
                    }
                    if (k == 0) {
                        run1[j] = ((double)play8_wins) / (j+1);
                    } else if (k == 1) {
                        run2[j] = ((double)play8_wins) / (j+1);
                    } else if (k == 2) {
                        run3[j] = ((double)play8_wins) / (j+1);
                    } else if (k == 3) {
                        run4[j] = ((double)play8_wins) / (j+1);
                    } else if (k == 4) {
                        run5[j] = ((double)play8_wins) / (j+1);
                    } else if (k == 5) {
                        run6[j] = ((double)play8_wins) / (j+1);
                    } else if (k == 6) {
                        run7[j] = ((double)play8_wins) / (j+1);
                    } else if (k == 7) {
                        run8[j] = ((double)play8_wins) / (j+1);
                    } else if (k == 8) {
                        run9[j] = ((double)play8_wins) / (j+1);
                    } else {
                        run10[j] = ((double)play8_wins) / (j+1);
                    }


                }

                //runs rounds trials to see how strategies cojmpare to eachother
                //runs 4 rounds per loop because rotate which strategy starts
                for (int j = 0; j < rounds / 4; j++) {
                    if (game.testPlay8s() == 1) {
                        play8rot_wins++;
                    }
                    if (game.testPlay8s() == 2) {
                        play8rot_wins++;
                    }
                    if (game.testPlay8s() == 3) {
                        play8rot_wins++;
                    }
                    if (game.testPlay8s() == 4) {
                        play8rot_wins++;
                    }
                    if (game.testKeep8s() == 1) {
                        keep8rot_wins++;
                    }
                    if (game.testKeep8s() == 2) {
                        keep8rot_wins++;
                    }
                    if (game.testKeep8s() == 3) {
                        keep8rot_wins++;
                    }
                    if (game.testKeep8s() == 4) {
                        keep8rot_wins++;
                    }
                    if (game.testSave8s() == 1) {
                        save8rot_wins++;
                    }
                    if (game.testSave8s() == 2) {
                        save8rot_wins++;
                    }
                    if (game.testSave8s() == 3) {
                        save8rot_wins++;
                    }
                    if (game.testSave8s() == 4) {
                        save8rot_wins++;
                    }
                    if (game.testPlay8sVsKeep8s_1()) {
                        play8vsKeep8_wins++;
                    }
                    if (game.testPlay8sVsKeep8s_2()) {
                        play8vsKeep8_wins++;
                    }
                    if (game.testPlay8sVsKeep8s_3()) {
                        play8vsKeep8_wins++;
                    }
                    if (game.testPlay8sVsKeep8s_4()) {
                        play8vsKeep8_wins++;
                    }
                    if (game.testKeep8sVsPlay8s_1()) {
                        keep8VsPlay8_wins++;
                    }
                    if (game.testKeep8sVsPlay8s_2()) {
                        keep8VsPlay8_wins++;
                    }
                    if (game.testKeep8sVsPlay8s_3()) {
                        keep8VsPlay8_wins++;
                    }
                    if (game.testKeep8sVsPlay8s_4()) {
                        keep8VsPlay8_wins++;
                    }
                    if (game.testKeep8sVsSave8s_1()) {
                        keep8vsSave8_wins++;
                    }
                    if (game.testKeep8sVsSave8s_2()) {
                        keep8vsSave8_wins++;
                    }
                    if (game.testKeep8sVsSave8s_3()) {
                        keep8vsSave8_wins++;
                    }
                    if (game.testKeep8sVsSave8s_4()) {
                        keep8vsSave8_wins++;
                    }
                    if (game.testSave8sVsKeep8s_1()) {
                        save8VsKeep8_wins++;
                    }
                    if (game.testSave8sVsKeep8s_2()) {
                        save8VsKeep8_wins++;
                    }
                    if (game.testSave8sVsKeep8s_3()) {
                        save8VsKeep8_wins++;
                    }
                    if (game.testSave8sVsKeep8s_4()) {
                        save8VsKeep8_wins++;
                    }
                    if (game.testPlay8sVsSave8s_1()) {
                        play8vsSave8_wins++;
                    }
                    if (game.testPlay8sVsSave8s_2()) {
                        play8vsSave8_wins++;
                    }
                    if (game.testPlay8sVsSave8s_3()) {
                        play8vsSave8_wins++;
                    }
                    if (game.testPlay8sVsSave8s_4()) {
                        play8vsSave8_wins++;
                    }
                    if (game.testSave8sVsPlay8s_1()) {
                        save8VsPlay8_wins++;
                    }
                    if (game.testSave8sVsPlay8s_2()) {
                        save8VsPlay8_wins++;
                    }
                    if (game.testSave8sVsPlay8s_3()) {
                        save8VsPlay8_wins++;
                    }
                    if (game.testSave8sVsPlay8s_4()) {
                        save8VsPlay8_wins++;
                    }

                }

                play8_max = Math.max(play8_max, ((double) play8_wins) / rounds);
                play8rot_max = Math.max(play8rot_max, ((double) play8rot_wins) / rounds);
                keep8_max = Math.max(keep8_max, ((double) keep8_wins) / rounds);
                save8_max = Math.max(save8_max, ((double) save8_wins) / rounds);
                keep8rot_max = Math.max(keep8rot_max, ((double) keep8rot_wins) / rounds);
                save8rot_max = Math.max(save8rot_max, ((double) save8rot_wins) / rounds);
                play8VsKeep8_max = Math.max(play8VsKeep8_max, ((double) play8vsKeep8_wins) / rounds);
                play8VsSave8_max = Math.max(play8VsSave8_max, ((double) play8vsSave8_wins) / rounds);
                keep8VsSave8_max = Math.max(keep8VsSave8_max, ((double) keep8vsSave8_wins) / rounds);
                keep8VsPlay8_max = Math.max(keep8VsPlay8_max, ((double) keep8VsPlay8_wins) / rounds);
                save8VsPlay8_max = Math.max(save8VsPlay8_max, ((double) save8VsPlay8_wins) / rounds);
                save8VsKeep8_max = Math.max(save8VsKeep8_max, ((double) save8VsKeep8_wins) / rounds);

                play8_min = Math.min(play8_min, ((double) play8_wins) / rounds);
                play8rot_min = Math.min(play8rot_min, ((double) play8rot_wins) / rounds);
                keep8_min = Math.min(keep8_min, ((double) keep8_wins) / rounds);
                save8_min = Math.min(save8_min, ((double) save8_wins) / rounds);
                keep8rot_min = Math.min(keep8rot_min, ((double) keep8rot_wins) / rounds);
                save8rot_min = Math.min(save8rot_min, ((double) save8rot_wins) / rounds);
                play8VsKeep8_min = Math.min(play8VsKeep8_min, ((double) play8vsKeep8_wins) / rounds);
                play8VsSave8_min = Math.min(play8VsSave8_min, ((double) play8vsSave8_wins) / rounds);
                keep8VsSave8_min = Math.min(keep8VsSave8_min, ((double) keep8vsSave8_wins) / rounds);
                keep8VsPlay8_min = Math.min(keep8VsPlay8_min, ((double) keep8VsPlay8_wins) / rounds);
                save8VsPlay8_min = Math.min(save8VsPlay8_min, ((double) save8VsPlay8_wins) / rounds);
                save8VsKeep8_min = Math.min(save8VsKeep8_min, ((double) save8VsKeep8_wins) / rounds);
            }


        for (int i = 0; i < 1000; i++) {
            int count = 0;
            for (int j = 0; j < 1000; j++) {
                if(game.testPlay8s() == 1){
                    count++;
                }
            }
            probabilities[i] = ((double)count) /1000;
        }

        BufferedWriter bw1 = new BufferedWriter(
                new FileWriter("/Users/nicolegooding/Desktop/Autumn 2021/" +
                        "Math 381/math381-a6/R files/convergence.csv"));

        bw1.write("\"run1\", \"run2\", \"run3\", \"run4\", \"run5\", \"run6\", \"run7\", \"run8\", \"run9\"," +
                " \"run10\"\n");
        for (int i = 0; i < run1.length-1; i++) {
            bw1.write(run1[i] + ", " + run2[i] + ", " + run3[i] + ", " + run4[i] + ", " + run5[i] + ", " +
                    run6[i] + ", " + run7[i] + ", " + run8[i] + ", " + run9[i] + ", " + run10[i] + "\n");

        }
        bw1.write(run1[run1.length-1] + ", " + run2[run1.length-1] + ", " + run3[run1.length-1] + ", " +
                run4[run1.length-1] + ", " + run5[run1.length-1] + ", " + run6[run1.length-1] + ", " +
                run7[run1.length-1] + ", " + run8[run1.length-1] + ", " + run9[run1.length-1] + ", " + run10[run1.length-1]);
        bw1.close();

        BufferedWriter bw2 = new BufferedWriter(
                new FileWriter("/Users/nicolegooding/Desktop/Autumn 2021/" +
                        "Math 381/math381-a6/R files/histogram.csv"));
        bw2.write("\"probability histogram\"\n");
        for (int i = 0; i < probabilities.length-1; i++) {
            bw2.write(probabilities[i] + "\n");
        }
        bw2.write(String.valueOf(probabilities[probabilities.length-1]));
        bw2.close();

        BufferedWriter bw3 = new BufferedWriter(
                new FileWriter("/Users/nicolegooding/Desktop/Autumn 2021/" +
                        "Math 381/math381-a6/outputs/confidence-intervals.txt"));

        bw3.write("The interval for the keep8 strategy without rotating is (" + keep8_min + ", " + keep8_max +
                ")\n");
        bw3.write("The interval for the keep8 strategy when rotating is (" + keep8rot_min + ", " +
                keep8rot_max + ")\n");
        bw3.write("The interval for the save8 strategy without rotating is (" + save8_min + ", " + save8_max +
                ")\n");
        bw3.write("The interval for the save8 strategy when rotating is (" + save8rot_min + ", " +
                save8rot_max + ")\n");
        bw3.write("The interval for the play8 strategy without rotating is (" + play8_min + ", " + play8_max +
                ")\n");
        bw3.write("The interval for the play8 strategy when rotating is (" + play8rot_min + ", " +
                play8rot_max + ")\n");
        bw3.write("The interval for the keep8 strategy vs the play8 strategies is: (" + keep8VsPlay8_min + ", "
                + keep8VsPlay8_max + ")\n");
        bw3.write("The interval for the play8 strategy vs the keep8 strategies is: (" + play8VsKeep8_min + ", "
                + play8VsKeep8_max + ")\n");
        bw3.write("The interval for the keep8 strategy vs the save8 strategies is: (" + keep8VsSave8_min + ", "
                + keep8VsSave8_max + ")\n");
        bw3.write("The interval for the save8 strategy vs the keep8 strategies is: (" + save8VsKeep8_min + ", "
                + save8VsKeep8_max + ")\n");
        bw3.write("The interval for the play8 strategy vs the save8 strategies is: (" + play8VsSave8_min + ", "
                + play8VsSave8_max + ")\n");
        bw3.write("The interval for the save8 strategy vs the play8 strategies is: (" + save8VsPlay8_min + ", "
                + save8VsPlay8_max + ")\n");
        bw3.close();
    }
}