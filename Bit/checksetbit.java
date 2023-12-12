public class checksetbit  {
    public static void main(String[] args) {
int n=18;
int pos = 0;
       while(n>0){
      pos++;
            if((n&1)==1){
                System.out.println(pos);
                break;
            }
            
            n=n>>1;
           

        }
        
    }
}
