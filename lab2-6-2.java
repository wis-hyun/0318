// try-catch문

class NoTry{
    public static void main(String[] args)
    {
        String msg[] = {"sung", "hyun", "kim"};
        int n = msg.length;
        for (int i=0; i <= n; i++)
        {
            try{
                System.out.println(msg[i]);
            }
            catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("oops, sorry. there is an exception");
            }
        }
        System.out.println("every thing is done");
    }
}