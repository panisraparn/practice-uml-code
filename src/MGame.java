public class MGame {
    private int roundCnt; //นับรอบการเล่น
    private Player[] players; //สร้างเป็น array เป็น Composition
    private Board board; // 1 game has 1 board เป็น composition
    private Die[] dice; //ลูกเต๋า
    private static final int N =20;

    public void playGame(){
        for(roundCnt = 0; roundCnt < N; roundCnt++){
            //ไปเรียก methode playRound();
            playRound();
        }
    }

    private void playRound(){
        //วน for loop playRound ตาม players
        for (Player player: players) {
            //เรียก method take turn จาก players
            player.takeTurn();
        }
    }
}
