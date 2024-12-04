public class Primes {
    public static void main(String[] args) {

        int size = Integer.parseInt(args[0]+ 1);
        boolean arr[] = new boolean [size];
        
        for(int i =2; i < arr.length; i++){
            
            arr[i] = true;
        }
          int primes = 0;
          int i = 2;

        while (i <= Math.sqrt(arr.length-1)) {
            if (arr[i] == true){
                System.out.println(i);
                for(int j = i*i; j < arr.length; j+=i){
                    arr[j] = false;
                }  
            }
           i++;
        }

        for(int x =0; x < arr.length; x++){
         
            if(arr[x]){

                primes++;
            }
         }
           
        
        System.out.println("There are " + primes + " primes between 2 and " + (arr.length-1)+ " (" +(int)(1.0*primes/(arr.length-1))*100+ "% are primes)");
     }
    }
