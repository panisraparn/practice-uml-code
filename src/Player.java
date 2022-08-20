public class Player {
    private String name;
    private Piece piece; //player มี เบี้ย 1 ตัว
    private Board board;
    private Die[] dice;
    public void takeTurn(){
        int fvTot = 0;
        for (Die die:dice) {
            die.roll();
            //หลังจาก roll แล้ว อยากทราบว่าหน้าลูกเต๋าออกอะไร

//            int fv = die.getFaceValue(); //เป็น getFaceValue ของลูกเต๋า
//            fvTot += fv; //บวกแต้มลูกเต๋าสองลูก

            //optional
            fvTot +=die.getFaceValue();
        }
        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc,fvTot);
        piece.setLocation(newLoc);


    }
}
