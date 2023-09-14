package com.nhnacademy.java.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MadeCheck {

    private MadeCheck() {
    };

    // PairCheck
    public static void PairCheck(Player player) {
        List<Card> cards = new ArrayList<>(player.getPlayerDeck());
        Collections.sort(cards);


        Set<Card> madeCard = new HashSet<>();
        // NOPAIR
        Rank rank = Rank.NO_PAIR;

        // 확인
        // System.out.println(card);
        for (int i = 0; i < cards.size() - 1; i++) {
            String currentCard = cards.get(i).getNumber().getCardNumber();
            String nextCard = cards.get(i + 1).getNumber().getCardNumber();

            if (currentCard.equals(nextCard)) { // 원페어


                // 원페어 유지 및 투페어
                if (rank.compareTo(Rank.ONE_PAIR) < 0) {
                    rank = Rank.ONE_PAIR;
                }

                else if (rank.compareTo(Rank.ONE_PAIR) == 0) { // 만약 같다면 투 페어 상승
                    rank = Rank.TWO_PAIR;
                }
                
                // // 이미 트리플이라면 트리플에 해당하는 아닌 카드가 원페어일때 풀하우스
                // else if(rank.compareTo(Rank.TRIPLE) == 0){
                //     // 이후에 저장하기 때문에 중복되지 않는다.
                //     // 페어 체크를 가장 먼저함 -> 이미 트리플이 들어온 상태로 넘어갔다면 다음 페어는 중복될 수가 없음
                //     rank = Rank.TRIPLE;

                // }

                madeCard.add(cards.get(i));
                madeCard.add(cards.get(i+1));
                
                // 트리플
                if ((i < (cards.size() - 2)) && nextCard.equals(cards.get(i + 2).getNumber().getCardNumber())) { // 트리플
                    if (rank.compareTo(Rank.TRIPLE) < 0) {
                        rank = Rank.TRIPLE;
                    }
                    
                    madeCard.add(cards.get(i+2));
                    String thirdCard = cards.get(i + 2).getNumber().getCardNumber();

                    // 포카드
                    if (i < (cards.size() - 3)
                            && thirdCard.equals(cards.get(i + 3).getNumber().getCardNumber())) {
                        if (rank.compareTo(Rank.FOUR_CARD) < 0) {
                            rank = Rank.FOUR_CARD;
                        }

                        madeCard.add(cards.get(i+3));
                    }
                }
            }
        }
        
        // madecard에서 제외
        for(Card c : madeCard){
            cards.remove(c);
        }
        player.setNormalList(cards);
        player.setRank(rank);
        player.setMadeList(new ArrayList<>(madeCard));

    }

}
