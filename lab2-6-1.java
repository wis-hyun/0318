// test No-Try 
class NoTry{
    public static void main(String[] args)
    {
        String msg[] = {"sung", "hyun", "kim"};
        int n = msg.length;
        for (int i=0; i < n; i++)
        {
            System.out.println(msg[i]);
        }
        System.out.println("every thing is done");
    }
}

// 오류 해석 : 배열에대한 인덱스 오류, array index out of bounds exception
// 수정 : i<=n 에서 =를 없앰