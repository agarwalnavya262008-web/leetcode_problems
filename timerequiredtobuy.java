import java.util.*;
class five {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n=tickets.length;
        Queue<Integer> q=new LinkedList<>();
        for(int i= 0; i<n; i++){
            q.offer(i);
        }

    int c=0;
        while( true){
           int person= q.poll();
           tickets[person]--;
           c++;
           if(tickets[person]>0){
            q.offer(person);
           }
           if( person ==k && tickets[person]==0){
            return c;
           }
        }
        
    }
    void main(){
        int []t={2,3,2};
        int k=2;
      int ans=  timeRequiredToBuy(t, k) ;
        System.out.println(ans);
       
    }
}