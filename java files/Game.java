import java.util.ArrayList;
import java.util.Collections;

public class Game {
    private static ArrayList<Card> deck;
    private static ArrayList<Card> discard;
    private static Hand p1;
    private static Hand p2;
    private static Hand p3;
    private static Hand p4;

    public Game(){
        newGame();
    }

    public void newGame(){
        deck = createDeck();
        p1 = new Hand(52); //player 1s hand
        p2 = new Hand(52); //player 2s hand
        p3 = new Hand(52); //player 3s hand
        p4 = new Hand(52); //player 4s hand
        discard = new ArrayList<>(); //discard pile

        //sets up game
        Collections.shuffle(deck); //shuffles the deck
        deal(p1, p2, p3, p4, deck); //deals the card
        discard.add(removeTop(deck));
    }

    public int testPlay8s(){
        newGame();
        //runs turns
        int count_turns = 0;
        while(count_turns <1000) {
            count_turns++;

            Card p1_card = play8s(p1, deck, discard);
            if(p1_card != null) {
                discard.add(0, p1_card);
            } if(p1.isEmpty()){
                break;
            }

            Card p2_card = play8s(p2, deck, discard);
            if(p2_card != null) {
                discard.add(0, p2_card);
            }if(p2.isEmpty()){
                break;
            }

            Card p3_card = play8s(p3, deck, discard);
            if(p3_card != null) {
                discard.add(0, p3_card);
            }if(p3.isEmpty()){
                break;
            }

            Card p4_card = play8s(p4, deck, discard);
            if(p4_card != null) {
                discard.add(0, p4_card);
            } if(p4.isEmpty()){
                break;
            }
        }

        if(p1.isEmpty()){
            return 1;
        } else if(p2.isEmpty()){
            return 2;
        } else if(p3.isEmpty()){
            return 3;
        } else {
            return 4;
        }
    }

    public int testKeep8s(){
        newGame();
        int count_turns = 0;
        while(count_turns <1000) {
            count_turns++;

            Card p1_card = keep8s(p1, deck, discard);
            if(p1_card != null) {
                discard.add(0, p1_card);
            } if(p1.isEmpty()){
                break;
            }

            Card p2_card = keep8s(p2, deck, discard);
            if(p2_card != null) {
                discard.add(0, p2_card);
            }if(p2.isEmpty()){
                break;
            }

            Card p3_card = keep8s(p3, deck, discard);
            if(p3_card != null) {
                discard.add(0, p3_card);
            }if(p3.isEmpty()){
                break;
            }

            Card p4_card = keep8s(p4, deck, discard);
            if(p4_card != null) {
                discard.add(0, p4_card);
            } if(p4.isEmpty()){
                break;
            }
        }

        if(p1.isEmpty()){
            return 1;
        } else if(p2.isEmpty()){
            return 2;
        } else if(p3.isEmpty()){
            return 3;
        } else {
            return 4;
        }
    }

    public int testSave8s(){
        newGame();
        int count_turns = 0;
        while(count_turns <1000) {
            count_turns++;

            Card p1_card = save8s(p1, deck, discard);
            if(p1_card != null) {
                discard.add(0, p1_card);
            } if(p1.isEmpty()){
                break;
            }

            Card p2_card = save8s(p2, deck, discard);
            if(p2_card != null) {
                discard.add(0, p2_card);
            }if(p2.isEmpty()){
                break;
            }

            Card p3_card = save8s(p3, deck, discard);
            if(p3_card != null) {
                discard.add(0, p3_card);
            }if(p3.isEmpty()){
                break;
            }

            Card p4_card = save8s(p4, deck, discard);
            if(p4_card != null) {
                discard.add(0, p4_card);
            } if(p4.isEmpty()){
                break;
            }
        }

        if(p1.isEmpty()){
            return 1;
        } else if(p2.isEmpty()){
            return 2;
        } else if(p3.isEmpty()){
            return 3;
        } else {
            return 4;
        }
    }

    //runs a game with 1 play8 strategy vs 3 keep8 strategy
    public boolean testPlay8sVsKeep8s_1(){
        newGame();
        //runs turns
        int count_turns = 0;
        while(count_turns <1000) {
            count_turns++;

            Card p1_card = play8s(p1, deck, discard);
            if(p1_card != null) {
                discard.add(0, p1_card);
            } if(p1.isEmpty()){
                break;
            }


            Card p2_card = keep8s(p2, deck, discard);
            if(p2_card != null) {
                discard.add(0, p2_card);
            }if(p2.isEmpty()){
                break;
            }

            Card p3_card = keep8s(p3, deck, discard);
            if(p3_card != null) {
                discard.add(0, p3_card);
            }if(p3.isEmpty()){
                break;
            }

            Card p4_card = keep8s(p4, deck, discard);
            if(p4_card != null) {
                discard.add(0, p4_card);
            } if(p4.isEmpty()){
                break;
            }
        }

        return p1.isEmpty();
    }

    public boolean testPlay8sVsKeep8s_2(){
        newGame();
        //runs turns
        int count_turns = 0;
        while(count_turns <1000) {
            count_turns++;

            Card p1_card = keep8s(p1, deck, discard);
            if(p1_card != null) {
                discard.add(0, p1_card);
            } if(p1.isEmpty()){
                break;
            }

            Card p2_card = play8s(p2, deck, discard);
            if(p2_card != null) {
                discard.add(0, p2_card);
            }if(p2.isEmpty()){
                break;
            }

            Card p3_card = keep8s(p3, deck, discard);
            if(p3_card != null) {
                discard.add(0, p3_card);
            }if(p3.isEmpty()){
                break;
            }

            Card p4_card = keep8s(p4, deck, discard);
            if(p4_card != null) {
                discard.add(0, p4_card);
            } if(p4.isEmpty()){
                break;
            }
        }

        return p2.isEmpty();
    }

    public boolean testPlay8sVsKeep8s_3(){
        newGame();
        //runs turns
        int count_turns = 0;
        while(count_turns <1000) {
            count_turns++;

            Card p1_card = keep8s(p1, deck, discard);
            if(p1_card != null) {
                discard.add(0, p1_card);
            } if(p1.isEmpty()){
                break;
            }

            Card p2_card = keep8s(p2, deck, discard);
            if(p2_card != null) {
                discard.add(0, p2_card);
            }if(p2.isEmpty()){
                break;
            }

            Card p3_card = play8s(p3, deck, discard);
            if(p3_card != null) {
                discard.add(0, p3_card);
            }if(p3.isEmpty()){
                break;
            }

            Card p4_card = keep8s(p4, deck, discard);
            if(p4_card != null) {
                discard.add(0, p4_card);
            } if(p4.isEmpty()){
                break;
            }
        }

        return p3.isEmpty();
    }

    public boolean testPlay8sVsKeep8s_4(){
        newGame();
        //runs turns
        int count_turns = 0;
        while(count_turns <1000) {
            count_turns++;

            Card p1_card = keep8s(p1, deck, discard);
            if(p1_card != null) {
                discard.add(0, p1_card);
            } if(p1.isEmpty()){
                break;
            }

            Card p2_card = keep8s(p2, deck, discard);
            if(p2_card != null) {
                discard.add(0, p2_card);
            }if(p2.isEmpty()){
                break;
            }

            Card p3_card = keep8s(p3, deck, discard);
            if(p3_card != null) {
                discard.add(0, p3_card);
            }if(p3.isEmpty()){
                break;
            }

            Card p4_card = play8s(p4, deck, discard);
            if(p4_card != null) {
                discard.add(0, p4_card);
            } if(p4.isEmpty()){
                break;
            }
        }

        return p4.isEmpty();
    }

    //runs a game with 1 keep8 strategy vs 3 play8 strategy
    public boolean testKeep8sVsPlay8s_1(){
        newGame();
        //runs turns
        int count_turns = 0;
        while(count_turns <1000) {
            count_turns++;

            Card p1_card = keep8s(p1, deck, discard);
            if(p1_card != null) {
                discard.add(0, p1_card);
            } if(p1.isEmpty()){
                break;
            }

            Card p2_card = play8s(p2, deck, discard);
            if(p2_card != null) {
                discard.add(0, p2_card);
            }if(p2.isEmpty()){
                break;
            }

            Card p3_card = play8s(p3, deck, discard);
            if(p3_card != null) {
                discard.add(0, p3_card);
            }if(p3.isEmpty()){
                break;
            }

            Card p4_card = play8s(p4, deck, discard);
            if(p4_card != null) {
                discard.add(0, p4_card);
            } if(p4.isEmpty()){
                break;
            }
        }

        return p1.isEmpty();
    }

    public boolean testKeep8sVsPlay8s_2(){
        newGame();
        //runs turns
        int count_turns = 0;
        while(count_turns <1000) {
            count_turns++;

            Card p1_card = play8s(p1, deck, discard);
            if(p1_card != null) {
                discard.add(0, p1_card);
            } if(p1.isEmpty()){
                break;
            }

            Card p2_card = keep8s(p2, deck, discard);
            if(p2_card != null) {
                discard.add(0, p2_card);
            }if(p2.isEmpty()){
                break;
            }

            Card p3_card = play8s(p3, deck, discard);
            if(p3_card != null) {
                discard.add(0, p3_card);
            }if(p3.isEmpty()){
                break;
            }

            Card p4_card = play8s(p4, deck, discard);
            if(p4_card != null) {
                discard.add(0, p4_card);
            } if(p4.isEmpty()){
                break;
            }
        }

        return p2.isEmpty();
    }

    public boolean testKeep8sVsPlay8s_3(){
        newGame();
        //runs turns
        int count_turns = 0;
        while(count_turns <1000) {
            count_turns++;

            Card p1_card = play8s(p1, deck, discard);
            if(p1_card != null) {
                discard.add(0, p1_card);
            } if(p1.isEmpty()){
                break;
            }

            Card p2_card = play8s(p2, deck, discard);
            if(p2_card != null) {
                discard.add(0, p2_card);
            }if(p2.isEmpty()){
                break;
            }

            Card p3_card = keep8s(p3, deck, discard);
            if(p3_card != null) {
                discard.add(0, p3_card);
            }if(p3.isEmpty()){
                break;
            }

            Card p4_card = play8s(p4, deck, discard);
            if(p4_card != null) {
                discard.add(0, p4_card);
            } if(p4.isEmpty()){
                break;
            }
        }

        return p3.isEmpty();
    }

    public boolean testKeep8sVsPlay8s_4(){
       newGame();

        int count_turns = 0;
        while(count_turns <1000) {
            count_turns++;

            Card p1_card = play8s(p1, deck, discard);
            if(p1_card != null) {
                discard.add(0, p1_card);
            } if(p1.isEmpty()){
                break;
            }

            Card p2_card = play8s(p2, deck, discard);
            if(p2_card != null) {
                discard.add(0, p2_card);
            }if(p2.isEmpty()){
                break;
            }

            Card p3_card = play8s(p3, deck, discard);
            if(p3_card != null) {
                discard.add(0, p3_card);
            }if(p3.isEmpty()){
                break;
            }

            Card p4_card = keep8s(p4, deck, discard);
            if(p4_card != null) {
                discard.add(0, p4_card);
            } if(p4.isEmpty()){
                break;
            }
        }

        return p4.isEmpty();
    }

    //runs a game with 1 save8 strategy vs 3 play8 strategies
    public boolean testSave8sVsPlay8s_1(){
        newGame();

        //runs turns
        int count_turns = 0;
        while(!p1.isEmpty() && !p2.isEmpty() && !p3.isEmpty() && !p4.isEmpty() && count_turns <100) {
            count_turns++;
            Card p1_card = save8s(p1, deck, discard);
            if(p1_card != null) {
                discard.add(0, p1_card);
            }if(p1.isEmpty()){
                break;
            }
            Card p2_card = play8s(p2, deck, discard);
            if(p2_card != null) {
                discard.add(0, p2_card);
            }if(p2.isEmpty()){
                break;
            }
            Card p3_card = play8s(p3, deck, discard);
            if(p3_card != null) {
                discard.add(0, p3_card);
            }if(p3.isEmpty()){
                break;
            }
            Card p4_card = play8s(p4, deck, discard);
            if(p4_card != null) {
                discard.add(0, p4_card);
            }if(p4.isEmpty()){
                break;
            }
        }

        return p1.isEmpty();
    }

    public boolean testSave8sVsPlay8s_2(){
        newGame();

        //runs turns
        int count_turns = 0;
        while(!p1.isEmpty() && !p2.isEmpty() && !p3.isEmpty() && !p4.isEmpty() && count_turns <100) {
            count_turns++;
            Card p1_card = play8s(p1, deck, discard);
            if(p1_card != null) {
                discard.add(0, p1_card);
            }if(p1.isEmpty()){
                break;
            }
            Card p2_card = save8s(p2, deck, discard);
            if(p2_card != null) {
                discard.add(0, p2_card);
            }if(p2.isEmpty()){
                break;
            }
            Card p3_card = play8s(p3, deck, discard);
            if(p3_card != null) {
                discard.add(0, p3_card);
            }if(p3.isEmpty()){
                break;
            }
            Card p4_card = play8s(p4, deck, discard);
            if(p4_card != null) {
                discard.add(0, p4_card);
            }if(p4.isEmpty()){
                break;
            }
        }

        return p2.isEmpty();
    }

    public boolean testSave8sVsPlay8s_3(){
       newGame();
        //runs turns
        int count_turns = 0;
        while(!p1.isEmpty() && !p2.isEmpty() && !p3.isEmpty() && !p4.isEmpty() && count_turns <100) {
            count_turns++;
            Card p1_card = play8s(p1, deck, discard);
            if(p1_card != null) {
                discard.add(0, p1_card);
            }if(p1.isEmpty()){
                break;
            }
            Card p2_card = play8s(p2, deck, discard);
            if(p2_card != null) {
                discard.add(0, p2_card);
            }if(p2.isEmpty()){
                break;
            }
            Card p3_card = save8s(p3, deck, discard);
            if(p3_card != null) {
                discard.add(0, p3_card);
            }if(p3.isEmpty()){
                break;
            }
            Card p4_card = play8s(p4, deck, discard);
            if(p4_card != null) {
                discard.add(0, p4_card);
            }if(p4.isEmpty()){
                break;
            }
        }

        return p3.isEmpty();
    }

    public boolean testSave8sVsPlay8s_4(){
        newGame();

        int count_turns = 0;
        while(!p1.isEmpty() && !p2.isEmpty() && !p3.isEmpty() && !p4.isEmpty() && count_turns <100) {
            count_turns++;
            Card p1_card = play8s(p1, deck, discard);
            if(p1_card != null) {
                discard.add(0, p1_card);
            }if(p1.isEmpty()){
                break;
            }
            Card p2_card = play8s(p2, deck, discard);
            if(p2_card != null) {
                discard.add(0, p2_card);
            }if(p2.isEmpty()){
                break;
            }
            Card p3_card = play8s(p3, deck, discard);
            if(p3_card != null) {
                discard.add(0, p3_card);
            }if(p3.isEmpty()){
                break;
            }
            Card p4_card = save8s(p4, deck, discard);
            if(p4_card != null) {
                discard.add(0, p4_card);
            }if(p4.isEmpty()){
                break;
            }
        }

        return p4.isEmpty();
    }

    //runs a game with 1 play8 strategy vs 3 save8 strategies
    public boolean testPlay8sVsSave8s_1(){
        newGame();
        int count_turns = 0;
        while(!p1.isEmpty() && !p2.isEmpty() && !p3.isEmpty() && !p4.isEmpty() && count_turns <100) {
            count_turns++;
            Card p1_card = play8s(p1, deck, discard);
            if(p1_card != null) {
                discard.add(0, p1_card);
            }if(p1.isEmpty()){
                break;
            }
            Card p2_card = save8s(p2, deck, discard);
            if(p2_card != null) {
                discard.add(0, p2_card);
            }if(p2.isEmpty()){
                break;
            }
            Card p3_card = save8s(p3, deck, discard);
            if(p3_card != null) {
                discard.add(0, p3_card);
            }if(p3.isEmpty()){
                break;
            }
            Card p4_card = save8s(p4, deck, discard);
            if(p4_card != null) {
                discard.add(0, p4_card);
            }if(p4.isEmpty()){
                break;
            }
        }

        return p1.isEmpty();
    }

    public boolean testPlay8sVsSave8s_2(){
        newGame();
        int count_turns = 0;
        while(!p1.isEmpty() && !p2.isEmpty() && !p3.isEmpty() && !p4.isEmpty() && count_turns <100) {
            count_turns++;
            Card p1_card = save8s(p1, deck, discard);
            if(p1_card != null) {
                discard.add(0, p1_card);
            }if(p1.isEmpty()){
                break;
            }
            Card p2_card = play8s(p2, deck, discard);
            if(p2_card != null) {
                discard.add(0, p2_card);
            }if(p2.isEmpty()){
                break;
            }
            Card p3_card = save8s(p3, deck, discard);
            if(p3_card != null) {
                discard.add(0, p3_card);
            }if(p3.isEmpty()){
                break;
            }
            Card p4_card = save8s(p4, deck, discard);
            if(p4_card != null) {
                discard.add(0, p4_card);
            }if(p4.isEmpty()){
                break;
            }
        }

        return p2.isEmpty();
    }

    public boolean testPlay8sVsSave8s_3(){
        newGame();
        int count_turns = 0;
        while(!p1.isEmpty() && !p2.isEmpty() && !p3.isEmpty() && !p4.isEmpty() && count_turns <100) {
            count_turns++;
            Card p1_card = save8s(p1, deck, discard);
            if(p1_card != null) {
                discard.add(0, p1_card);
            }if(p1.isEmpty()){
                break;
            }
            Card p2_card = save8s(p2, deck, discard);
            if(p2_card != null) {
                discard.add(0, p2_card);
            }if(p2.isEmpty()){
                break;
            }
            Card p3_card = play8s(p3, deck, discard);
            if(p3_card != null) {
                discard.add(0, p3_card);
            }if(p3.isEmpty()){
                break;
            }
            Card p4_card = save8s(p4, deck, discard);
            if(p4_card != null) {
                discard.add(0, p4_card);
            }if(p4.isEmpty()){
                break;
            }
        }

        return p3.isEmpty();
    }

    public boolean testPlay8sVsSave8s_4(){
        newGame();
        int count_turns = 0;
        while(!p1.isEmpty() && !p2.isEmpty() && !p3.isEmpty() && !p4.isEmpty() && count_turns <100) {
            count_turns++;
            Card p1_card = save8s(p1, deck, discard);
            if(p1_card != null) {
                discard.add(0, p1_card);
            }if(p1.isEmpty()){
                break;
            }
            Card p2_card = save8s(p2, deck, discard);
            if(p2_card != null) {
                discard.add(0, p2_card);
            }if(p2.isEmpty()){
                break;
            }
            Card p3_card = save8s(p3, deck, discard);
            if(p3_card != null) {
                discard.add(0, p3_card);
            }if(p3.isEmpty()){
                break;
            }
            Card p4_card = play8s(p4, deck, discard);
            if(p4_card != null) {
                discard.add(0, p4_card);
            }if(p4.isEmpty()){
                break;
            }
        }

        return p4.isEmpty();
    }

    //runs a game with 1 keep8 strategy vs 3 save8 strategies
    public boolean testKeep8sVsSave8s_1(){
       newGame();
        int count_turns = 0;
        while(!p1.isEmpty() && !p2.isEmpty() && !p3.isEmpty() && !p4.isEmpty() && count_turns <100) {
            count_turns++;
            Card p1_card = keep8s(p1, deck, discard);
            if(p1_card != null) {
                discard.add(0, p1_card);
            }if(p1.isEmpty()){
                break;
            }
            Card p2_card = save8s(p2, deck, discard);
            if(p2_card != null) {
                discard.add(0, p2_card);
            }if(p2.isEmpty()){
                break;
            }
            Card p3_card = save8s(p3, deck, discard);
            if(p3_card != null) {
                discard.add(0, p3_card);
            }if(p3.isEmpty()){
                break;
            }
            Card p4_card = save8s(p4, deck, discard);
            if(p4_card != null) {
                discard.add(0, p4_card);
            }if(p4.isEmpty()){
                break;
            }
        }

        return p1.isEmpty();
    }

    public boolean testKeep8sVsSave8s_2(){
        newGame();
        int count_turns = 0;
        while(!p1.isEmpty() && !p2.isEmpty() && !p3.isEmpty() && !p4.isEmpty() && count_turns <100) {
            count_turns++;
            Card p1_card = save8s(p1, deck, discard);
            if(p1_card != null) {
                discard.add(0, p1_card);
            }if(p1.isEmpty()){
                break;
            }
            Card p2_card = keep8s(p2, deck, discard);
            if(p2_card != null) {
                discard.add(0, p2_card);
            }if(p2.isEmpty()){
                break;
            }
            Card p3_card = save8s(p3, deck, discard);
            if(p3_card != null) {
                discard.add(0, p3_card);
            }if(p3.isEmpty()){
                break;
            }
            Card p4_card = save8s(p4, deck, discard);
            if(p4_card != null) {
                discard.add(0, p4_card);
            }if(p4.isEmpty()){
                break;
            }
        }

        return p2.isEmpty();
    }

    public boolean testKeep8sVsSave8s_3(){
       newGame();
        int count_turns = 0;
        while(!p1.isEmpty() && !p2.isEmpty() && !p3.isEmpty() && !p4.isEmpty() && count_turns <100) {
            count_turns++;
            Card p1_card = save8s(p1, deck, discard);
            if(p1_card != null) {
                discard.add(0, p1_card);
            }if(p1.isEmpty()){
                break;
            }
            Card p2_card = save8s(p2, deck, discard);
            if(p2_card != null) {
                discard.add(0, p2_card);
            }if(p2.isEmpty()){
                break;
            }
            Card p3_card = keep8s(p3, deck, discard);
            if(p3_card != null) {
                discard.add(0, p3_card);
            }if(p3.isEmpty()){
                break;
            }
            Card p4_card = save8s(p4, deck, discard);
            if(p4_card != null) {
                discard.add(0, p4_card);
            }if(p4.isEmpty()){
                break;
            }
        }

        return p3.isEmpty();
    }

    public boolean testKeep8sVsSave8s_4(){
       newGame();
        int count_turns = 0;
        while(!p1.isEmpty() && !p2.isEmpty() && !p3.isEmpty() && !p4.isEmpty() && count_turns <100) {
            count_turns++;
            Card p1_card = save8s(p1, deck, discard);
            if(p1_card != null) {
                discard.add(0, p1_card);
            }if(p1.isEmpty()){
                break;
            }
            Card p2_card = save8s(p2, deck, discard);
            if(p2_card != null) {
                discard.add(0, p2_card);
            }if(p2.isEmpty()){
                break;
            }
            Card p3_card = save8s(p3, deck, discard);
            if(p3_card != null) {
                discard.add(0, p3_card);
            }if(p3.isEmpty()){
                break;
            }
            Card p4_card = keep8s(p4, deck, discard);
            if(p4_card != null) {
                discard.add(0, p4_card);
            }if(p4.isEmpty()){
                break;
            }
        }

        return p4.isEmpty();
    }

    //runs a game with 1 save8 strategy vs 3 keep8 strategies
    public boolean testSave8sVsKeep8s_1(){
        newGame();
        int count_turns = 0;
        while(!p1.isEmpty() && !p2.isEmpty() && !p3.isEmpty() && !p4.isEmpty() && count_turns <100) {
            count_turns++;
            Card p1_card = save8s(p1, deck, discard);
            if(p1_card != null) {
                discard.add(0, p1_card);
            }if(p1.isEmpty()){
                break;
            }
            Card p2_card = keep8s(p2, deck, discard);
            if(p2_card != null) {
                discard.add(0, p2_card);
            }if(p2.isEmpty()){
                break;
            }
            Card p3_card = keep8s(p3, deck, discard);
            if(p3_card != null) {
                discard.add(0, p3_card);
            }if(p3.isEmpty()){
                break;
            }
            Card p4_card = keep8s(p4, deck, discard);
            if(p4_card != null) {
                discard.add(0, p4_card);
            }if(p4.isEmpty()){
                break;
            }
        }

        return p1.isEmpty();
    }

    public boolean testSave8sVsKeep8s_2(){
       newGame();
        int count_turns = 0;
        while(!p1.isEmpty() && !p2.isEmpty() && !p3.isEmpty() && !p4.isEmpty() && count_turns <100) {
            count_turns++;
            Card p1_card = keep8s(p1, deck, discard);
            if(p1_card != null) {
                discard.add(0, p1_card);
            }if(p1.isEmpty()){
                break;
            }
            Card p2_card = save8s(p2, deck, discard);
            if(p2_card != null) {
                discard.add(0, p2_card);
            }if(p2.isEmpty()){
                break;
            }
            Card p3_card = keep8s(p3, deck, discard);
            if(p3_card != null) {
                discard.add(0, p3_card);
            }if(p3.isEmpty()){
                break;
            }
            Card p4_card = keep8s(p4, deck, discard);
            if(p4_card != null) {
                discard.add(0, p4_card);
            }if(p4.isEmpty()){
                break;
            }
        }

        return p2.isEmpty();
    }

    public boolean testSave8sVsKeep8s_3(){
        newGame();
        int count_turns = 0;
        while(!p1.isEmpty() && !p2.isEmpty() && !p3.isEmpty() && !p4.isEmpty() && count_turns <100) {
            count_turns++;
            Card p1_card = keep8s(p1, deck, discard);
            if(p1_card != null) {
                discard.add(0, p1_card);
            }if(p1.isEmpty()){
                break;
            }
            Card p2_card = keep8s(p2, deck, discard);
            if(p2_card != null) {
                discard.add(0, p2_card);
            }if(p2.isEmpty()){
                break;
            }
            Card p3_card = save8s(p3, deck, discard);
            if(p3_card != null) {
                discard.add(0, p3_card);
            }if(p3.isEmpty()){
                break;
            }
            Card p4_card = keep8s(p4, deck, discard);
            if(p4_card != null) {
                discard.add(0, p4_card);
            }if(p4.isEmpty()){
                break;
            }
        }

        return p3.isEmpty();
    }

    public boolean testSave8sVsKeep8s_4(){
        newGame();
        int count_turns = 0;
        while(!p1.isEmpty() && !p2.isEmpty() && !p3.isEmpty() && !p4.isEmpty() && count_turns <100) {
            count_turns++;
            Card p1_card = keep8s(p1, deck, discard);
            if(p1_card != null) {
                discard.add(0, p1_card);
            }if(p1.isEmpty()){
                break;
            }
            Card p2_card = keep8s(p2, deck, discard);
            if(p2_card != null) {
                discard.add(0, p2_card);
            }if(p2.isEmpty()){
                break;
            }
            Card p3_card = keep8s(p3, deck, discard);
            if(p3_card != null) {
                discard.add(0, p3_card);
            }if(p3.isEmpty()){
                break;
            }
            Card p4_card = save8s(p4, deck, discard);
            if(p4_card != null) {
                discard.add(0, p4_card);
            }if(p4.isEmpty()){
                break;
            }
        }

        return p4.isEmpty();
    }


    private static ArrayList<Card> createDeck() {
        ArrayList<Card> deck = new ArrayList<>();
        for (int suit = 1; suit <= 4; suit++) {
            for(int rank = 1; rank <= 13; rank++){
                deck.add(new Card(rank, suit));
            }
        }
        return deck;
    }

    //removes top card from the deck
    private static Card removeTop(ArrayList<Card> deck) {
        return deck.remove(0);
    }

    //deals cards from deck to the 4 players
    private static void deal(Hand player1, Hand player2,
                            Hand player3, Hand player4,
                            ArrayList<Card> deck) {
        for (int i = 0; i < 5; i++) {
            player1.add(removeTop(deck));
            player2.add(removeTop(deck));
            player3.add(removeTop(deck));
            player4.add(removeTop(deck));
        }
    }

    //strategy of immediately play 8 when you have it
    private static Card play8s(Hand hand, ArrayList<Card> deck, ArrayList<Card> discard){
        Card curr_card = discard.get(0);
        int suit = curr_card.getSuit();
        int rank = curr_card.getRank();
        Card played;
        if(hand.containsRank(8)){ //play 8
            played = hand.remove(findCardFromRank(hand, 8));
            int maxSuit = indexOfMax(hand.getSuits()) + 1;
            played.changeSuit(maxSuit);
        } else if (hand.containsSuit(suit)) { //play suit
            played = hand.remove(findCardFromSuit(hand, suit));
        } else if (hand.containsRank(rank)) { //play rank
            played = hand.remove(findCardFromRank(hand, rank));
        } else { //draw
            played = drawCard(deck, hand, suit, rank, discard);
        }
        return played;
    }

    //strategy of save 8 unless you are about to draw
    //returns the card the player would play - returns null if the deck is empty and the player cannot play
    private static Card save8s(Hand hand, ArrayList<Card> deck, ArrayList<Card> discard){
        Card curr_card = discard.get(0);
        int suit = curr_card.getSuit();
        int rank = curr_card.getRank();
        Card played = null;
        if (hand.containsSuit(suit)) { //play suit
            int index = findCardFromSuit_keep8(hand, suit);
            if(index >= 0){
                played = hand.remove(index);
            }
        } else if (hand.containsRank(rank) && rank != 8) { //play rank
            played = hand.remove(findCardFromRank(hand, rank));
        }
        if(played == null && hand.containsRank(8)){ //play 8
            played = hand.remove(findCardFromRank(hand, 8));
            int maxSuit = indexOfMax(hand.getSuits()) + 1;
            played.changeSuit(maxSuit);
        } if(played == null) { //draw
            played = drawCard(deck, hand, suit, rank, discard);
        }
        return played;
    }

    //only plays an 8 if it is the only card(s) left in the players hand.
    private static Card keep8s(Hand hand, ArrayList<Card> deck, ArrayList<Card> discard) {
        Card curr_card = discard.get(0);
        int suit = curr_card.getSuit();
        int rank = curr_card.getRank();
        Card played = null;
        if(hand.size() == hand.getRanks()[7]){ //if size of hand = the number of 8s in the hand
            played = hand.remove(findCardFromRank(hand, 8)); //check this
        }
        if (played == null && (hand.containsSuit(suit))) { //play suit
            int index = findCardFromSuit_keep8(hand, suit);
            if(index >= 0){
                played = hand.remove(index);
            }
        }
        if (played == null && (hand.containsRank(rank) && rank != 8)) { //play rank (not 8s)
            played = hand.remove(findCardFromRank(hand, rank));
        }
        if(played == null){
            played = drawCardKeep8s(deck, hand, suit, rank, discard);
        }
        return played;
    }

    //draw card until player cannot play matching suit or rank, will keep an 8
    //returns the played card
    //if deck is empty, discard pile is shuffled and put back into deck
    private static Card drawCardKeep8s(ArrayList<Card> deck, Hand hand, int suit, int rank, ArrayList<Card> discard){
        Card played = null;
        boolean foundCard = false;
        while(!foundCard){
            if(deck.isEmpty()) {
                if(discard.size() == 1){
                    return null;
                }
                Card temp = discard.remove(0);
                while(!discard.isEmpty()) {
                    deck.add(discard.remove(0));
                }
                Collections.shuffle(deck);
                discard.add(temp);

            }
            Card newCard = removeTop(deck);
            if((newCard.getSuit() == suit || newCard.getRank() == rank) && newCard.getRank() != 8){
                played = newCard;
                foundCard = true;
            } else {
                hand.add(newCard);
            }
        }
        return played;
    }

    //draws card from deck until player can play matching suit rank or 8 and returns the played card
    //if deck is empty shuffles the discard pile back into the deck
    private static Card drawCard(ArrayList<Card> deck, Hand hand, int suit, int rank, ArrayList<Card> discard){
        Card played = null;
        boolean foundCard = false;
        while(!foundCard){
            if(deck.isEmpty()) {
                if(discard.size() == 1){
                    return null;
                }
                Card temp = discard.remove(0);
                while(!discard.isEmpty()) {
                    deck.add(discard.remove(0));
                }
                Collections.shuffle(deck);
                discard.add(temp);
            }
            Card newCard = removeTop(deck);
            if(newCard.getSuit() == suit || newCard.getRank() == rank || newCard.getRank() == 8){
                if(newCard.getRank() == 8){
                    int maxSuit = indexOfMax(hand.getSuits()) + 1;
                    newCard.changeSuit(maxSuit);
                }
                played = newCard;
                foundCard = true;
            } else {
                hand.add(newCard);
            }
        }
        return played;
    }

    //finds the first card in hand with matching suit, if not found returns -1
    private static int findCardFromSuit(Hand hand, int suit){
        int index = 0;
        boolean found = false;
        boolean atEnd = false;
        while(!found && !atEnd) {
            Card curr = hand.get(index);
            if(curr.getSuit() == suit) {
                found = true;
            } else if(index == hand.size() - 1){
                atEnd = true;
            } else {
                index++;
            }
        }
        if(found) {
            return index;
        }
        return -1;
    }

    private static int findCardFromSuit_keep8(Hand hand, int suit){
        int index = 0;
        boolean found = false;
        boolean atEnd = false;
        while(!found && !atEnd) {
            Card curr = hand.get(index);
            if(curr.getSuit() == suit && curr.getRank() != 8) {
                found = true;
            } else if(index == hand.size() - 1){
                atEnd = true;
            } else {
                index++;
            }
        }
        if(found) {
            return index;
        }
        return -1;
    }

    //finds the first card in hand with matching rank, if not found returns -1
    private static int findCardFromRank(Hand hand, int rank){
        int index = 0;
        boolean found = false;
        boolean atEnd = false;
        while(!found && !atEnd) {
            Card curr = hand.get(index);
            if(curr.getRank() == rank) {
                found = true;
            } else if(index == hand.size() - 1){
                atEnd = true;
            } else {
                index++;
            }
        }
        if(found) {
            return index;
        }
        return -1;
    }

    //finds the maximum value in the array and returns the
    //index of it
    private static int indexOfMax(int[] arr){
        int max = -1;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

}
