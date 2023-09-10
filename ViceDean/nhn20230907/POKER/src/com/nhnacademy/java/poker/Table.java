package com.nhnacademy.java.poker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Table {

    private int playerNumber;
    private Deck deck;
    private Player[] player;

    public Table() throws IOException {
        this.playerNumber = 0;
        guidePrint();
        if (playerNumber >= 2) {
            gameStart(playerNumber);
        }
    }

    public void gameStart(int playerNumber) throws IOException {
        // player 수 만큼 생성 본인은 1번쨰 Plyaer[0]
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        player = new Player[playerNumber];
        for (int i = 0; i < player.length; i++) {
            player[i] = new Player();
        }

        // 1이면 시작 이외의 값은 종료
        String gameStartButton = "1";
        int count = 0;
        while (gameStartButton.equals("1")) {
            reGame();
            deck = new Deck();
            System.out.println(
                    "==========================================================================================");
            System.out.println("게임을 시작합니다.");
            System.out.println(
                    "===========================================================================================");
            // 5장 게임 기존 과제
            startFiveCard(); // 카드 나눠줌
            // made 확인
            madeCheck(); // made 확인
            System.out.println();
            printMyCard(player[0]); // 나의 카드 출력
            PrintSpecificRank(player[0]); // 랭크 출력
            System.out.println();
            System.out.println(
                    "===========================================================================================");
            System.out.println("현재 점수 : " + count);
            System.out.println("승리 +1, 패배 -1, die 0");
            System.out.println(
                    "===========================================================================================");
            System.out.println();
            System.out.println("진행하시겠습니까?");
            System.out.println("1. 진행, 아무키 종료, 입력 : ");
            String continueGamge = br.readLine();
            System.out.println(
                    "===========================================================================================");

            if (continueGamge.equals("1")) {
                System.out.println("전체 카드 패");
                for (int i = 0; i < player.length; i++) {
                    System.out.print("[Player " + (i + 1) + "] ");
                    printMyCard(player[i]);
                    System.out.println();
                }
                System.out.println(
                        "===========================================================================================");

                Player WinnerPlayer = WinnerCheck();
                if (WinnerPlayer.equals(player[0])) {
                    count++;
                    System.out.println("축하합니다 승리하셨습니다 +1");
                } else {
                    count--;
                    System.out.println("아쉽지만 패배...");
   System.out.println(
                    "===========================================================================================");
                    System.out.print("승리 ");
                    printMyCard(WinnerPlayer);
                }
            } else {
                System.out.println("die!");
                System.out.println();
            }

            // 7 장 게임
            // startCard(); // 3장씩 지급

            System.out.println(
                    "===========================================================================================");
            System.out.print("다음 게임 시작 : 1, 나가기 : 아무 키, 입력 : ");
            gameStartButton = br.readLine();
            if (!gameStartButton.equals("1")) {
                System.out.println(
                        "==========================================================================================");
                System.out.println("게임을 종료합니다.");
            }
        }
        System.out.println("최종 점수 : " + count);
    }

    private void guidePrint() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out
                .println("==========================================================================================");
        System.out.println();
        System.out.println("NHNPokerGame에 오신 것을 환영합니다");
        System.out.println();
        System.out
                .println("==========================================================================================");
        System.out.println();
        System.out.println("게임을 시작하시겠습니까?");
        System.out.print("1. game start,  2. exit  입력 : ");

        String input = br.readLine();
        System.out.println();
        System.out
                .println("==========================================================================================");

        if (!input.equals("1")) {
            System.out.println("안녕히 가십시오");
        } else {
            System.out.println();
            System.out.print("인원을 선택하세요(본인을 포함한 초기값으로 변경할 수 없습니다. 최대 5명) 입력 : ");
            playerNumber = Integer.valueOf(br.readLine());
            if (playerNumber < 2 && playerNumber > 5) {
                System.out.println("player는 두명 이상 필요");
            }
            System.out.println();
        }

    }

    // GameRestart
    private void reGame() {
        deck = new Deck();
        for (int i = 0; i < player.length; i++) {
            player[i].init();
        }
    }

    // madeCheck
    private void madeCheck() {
        for (int i = 0; i < player.length; i++) {
            MadeCheck.PairCheck(player[i]);
        }
    }

    // 승자 확인
    private Player WinnerCheck() {
        Player max = player[0];

        for (int i = 1; i < player.length; i++) {

            // 페어로 분별
            if (max.getPlayerRank().getRankCount() < player[i].getPlayerRank().getRankCount()) {
                max = player[i];
            }

            // 만약 페어가 같다면
            else if (max.getPlayerRank().getRankCount() == player[i].getPlayerRank().getRankCount()) {
                // 노 페어가 아닐시
                // NOPAIR = 1 =>1 보다 크다면 노페어가 아님
                if (1 < player[i].getPlayerRank().getRankCount()) {
                    // 가장 높은 메이드 체크;
                    if (max.getMadeCard().getStringCardName().getCardRank() < player[i].getMadeCard()
                            .getStringCardName().getCardRank()) {
                        max = player[i];
                    }
                    // 만약 메이드가 같다면
                    else if (max.getMadeCard().getStringCardName().getCardRank() == player[i].getMadeCard()
                            .getStringCardName().getCardRank()) {

                        // 두번째 메이드 체크 투페어 일시
                        if (player[i].getPlayerRank().getRankName().equals("TWOPAIR")) {
                            if (max.getMadeCard2().getStringCardName().getCardRank() < player[i]
                                    .getMadeCard2()
                                    .getStringCardName().getCardRank()) {
                                max = player[i];
                            }

                            // 투페어일때 두번째 메이드마저 같다면
                            else if (max.getMadeCard2().getStringCardName().getCardRank() == player[i]
                                    .getMadeCard2()
                                    .getStringCardName().getCardRank()) {
                                // 전부 같다면
                                if (compareNormalCard(max, player[i]) == null) {
                                    // 패턴 비교
                                    if (max.getMadeCard().getPattern().getPatternRank() < player[i].getMadeCard()
                                            .getPattern().getPatternRank()) {
                                        max = player[i];
                                    }
                                }
                                // 누군지 가려졌으면
                                else {
                                    max = compareNormalCard(max, player[i]);
                                }
                            }
                        }
                        // 풀하우스는 트리플이기 때문에 같을 수 없다. 투페어가 아니면 원페어
                        else {
                            // 전부 같다면
                            if (compareNormalCard(max, player[i]) == null) {
                                // 패턴 비교
                                if (max.getMadeCard().getPattern().getPatternRank() < player[i].getMadeCard()
                                        .getPattern().getPatternRank()) {
                                    max = player[i];
                                }
                            }
                            // 누군지 가려졌으면
                            else {
                                max = compareNormalCard(max, player[i]);
                            }
                        }
                    }
                }

                // 남은 카드 노페어일 시
                else {
                    // 전부같다면
                    if (compareNormalCard(max, player[i]) == null) {
                        // 패턴 비교
                        if (max.getMadeCard().getPattern().getPatternRank() < player[i].getMadeCard().getPattern()
                                .getPatternRank()) {
                            max = player[i];
                        }
                    }
                    // 누군지 가려졌으면
                    else {
                        max = compareNormalCard(max, player[i]);
                    }
                }
            }

        }
        return max;
    }

    private Player compareNormalCard(Player max, Player comparePlayer) {
        for (int j = 0; j < max.getNormalList().size(); j++) {
            // 남은 카드 각각 비교 만약 i의 카드가 크다면
            if (max.getNormalList().get(j).getStringCardName().getCardRank() < comparePlayer
                    .getNormalList().get(j).getStringCardName().getCardRank()) {
                return comparePlayer;
            } // 반대라면 유지
            else if (max.getNormalList().get(j).getStringCardName().getCardRank() > comparePlayer
                    .getNormalList().get(j).getStringCardName().getCardRank()) {
                return max;
            }
            // 같다면 계속 진행
        }
        // 모두 같다면
        return null;
    }

    // 기존의 과제 코드 5명 -> 7명
    private void startFiveCard() {
        for (int i = 0; i < 7; i++) { // 7장씩
            for (int j = 0; j < player.length; j++) { // 플레이어마다
                player[j].drowCardPlayer(deck.drow());
            }
        }
    }

    // 나의 카드 출력
    private void printMyCard(Player player) {
        System.out.print("카드 패 :   ");
        for (Card card : player.getPlayerDeck()) {
            System.out.print(card + "   ");
        }

        // 메이드 카드 확인
        System.out.print(player.getPlayerRank().getRankName()); // 나의 랭크 출력
        System.out.println();
        System.out.print("made Card : ");
        if (player.getMadeList().size() == 0) {
            System.out.print("NONE");
        }
        for (Card card : player.getMadeList()) {
            System.out.print(card + "   ");
        }
        System.out.println();

        // 나머지 카드 확인
        // System.out.println();
        // System.out.print("Normal Card : ");
        // for (Card card : player.getNormalList()) {
        // System.out.print(card + " ");
        // }
        // System.out.println();
    }

    // 1번째 player전용 Made 출력물
    private void PrintSpecificRank(Player player) { // 메이드 일시만 알려줌 노페어 알알려줌
        // NOPAIR가 아닐때만
        if (!player.getPlayerRank().equals(Rank.NOPAIR)) {
            System.out.print("MADE!!!! MADE NAME : ");
            System.out.println(player.getPlayerRank().getRankName());
        }

    }
}
