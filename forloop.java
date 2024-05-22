public class forloop {
    public static void main(String[] args) 
    {
        //Ex:1
        // for(int i=1;i<=5;i++){
        //     System.out.println("HI "+ i);
        // }

        //Ex:2
        // for(int i=4;i>=1;i--){
        //     System.out.println(i);
        // }
        
        // Ex:3
        // for(int i=0;i<4;i++){
        //     System.out.println(i);
        // }

        //Ex:4
        int i;
        for (i=1; i<=20;i++){
                        if (i%3 == 0){ //skips: 3,6,9,12,15,18
                            continue;
                        }
                        else if(i%7==0){//skips: 7,14
                            continue;
                        }
                        System.out.println(i);
                    }
    }
}
