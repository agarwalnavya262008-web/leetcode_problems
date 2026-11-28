import java.util.*;
class Seven {
    public String predictPartyVictory(String senate) {
        Queue<Integer> q1=new LinkedList<>();
         Queue<Integer> q2=new LinkedList<>();
        
        for(int i=0; i<senate.length(); i++){
            if(senate.charAt(i)=='R'){
                q1.offer(i);
            }
            else{
                q2.offer(i);
            }
        }
        while(!q2.isEmpty() && !q1.isEmpty()){
            if(q1.peek()<q2.peek() ){
                int r=q1.poll();
                q2.poll();
                 q1.offer(r+senate.length());
            }
            else {
                int d=q2.poll();
                q1.poll();
                q2.offer(d+senate.length());
            }
        }
        if(q1.isEmpty()){
            return "Dire";
        }
        else
        return "Radiant";
    }
    void main(){
        String senate="RDD";
        System.out.println(predictPartyVictory(senate));
    
    }
}