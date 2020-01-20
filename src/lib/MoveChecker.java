package lib;

import java.util.List;

public class MoveChecker {
    public static boolean isValidMove(List<String> player,String move,String firstMove,List cardsPlayed) throws Exception{
        //TODO

        if(!player.contains(move) || cardsPlayed.contains(move))
            throw new Exception("Illegal move");

        if(firstMove.equals("")){
            return player.contains(move);
        }else{
            int type=-1;
            switch (firstMove.charAt(utils.SUIT_INDEX)){
                case utils.SPADES:
                    type=0;
                    break;
                case utils.CLUBS:
                    type=1;
                    break;
                case utils.HEARTS:
                    type=2;
                    break;
                case utils.DIAMONDS:
                    type=3;
                    break;
            }
            if(type==-1){
                throw new Exception("Illegal move String");
            }

            if(move.charAt(utils.SUIT_INDEX) == firstMove.charAt(utils.SUIT_INDEX)){
                return true;
            }else{
                for(String card: player){
                   if(card.endsWith(""+firstMove.charAt(utils.SUIT_INDEX))){
                       return false;
                   }
                }
                return true;
            }
        }
    }

    public static int getWinner(String moveP1,String moveP2,String moveP3,String moveP4,int move,int trump){
        //TODO
        return 0;
    }

}
