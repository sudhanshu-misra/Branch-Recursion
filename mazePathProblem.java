import java.util.ArrayList;

public class mazePathProblem {

    static ArrayList<String> getMazePos(int Row , int Col, int endRow, int endCol){
        
        if(Col == endCol && Row == endRow){
            ArrayList<String> result = new ArrayList<>();
            result.add("");
            return result;
        }
        
        if(Col>endCol || Row>endRow){
            ArrayList<String> result = new ArrayList<>();
            return result;
        }
        
        ArrayList<String> finalResult = new ArrayList<>();
       
        ArrayList<String> rightResult = getMazePos(Row, Col+1, endRow, endCol);
        for(String t : rightResult){
            finalResult.add("R"+ t);
        }
       
        ArrayList<String> downResult = getMazePos(Row+1,Col, endRow, endCol);
        for(String t : downResult){
            finalResult.add("D"+ t);
        }
        return finalResult;
    }
    public static void main(String[] args) {
        ArrayList<String> result = getMazePos(0, 0, 2, 2);
        System.out.println(result);
    }
}
