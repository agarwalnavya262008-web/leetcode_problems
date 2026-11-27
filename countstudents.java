import java.util.*;
class six {
    public int countStudents(int[] students, int[] sandwiches) {
       // Stack<Integer> s=new Stack<>();
        Queue<Integer> q=new LinkedList<>();
        for(int i=0; i<students.length; i++){
            q.offer(students[i]);
        }
             
                int c=0;
                int j=0;
       while(! q.isEmpty()  && c<q.size()) {
        if(q.peek()==sandwiches[j]){
            j++;
            q.poll();
            c=0;
            
        }
        else{
            q.offer(q.poll());
            c++;

        }

       }
       return q.size();
    }
    void main(){
    int []students={1,1,1,0,0,1};
    int []sandwiches={1,0,0,0,1,1};
    int ans= countStudents(students,sandwiches);
    System.out.println(ans);
    }
}