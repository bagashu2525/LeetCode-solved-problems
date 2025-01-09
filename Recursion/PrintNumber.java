public class PrintNumber {
    public void printNos(int n,int i) {
        if(i<=n) {
            System.out.print(i);
        printNos(n,i+1);
            
        }
        else{
            return;
        }
    }

    public void printNos(int n) {
        // Your code here
        int i=1;

        printNos(n,i) ;
    }
    public static void main(String[] args) {
        PrintNumber ob = new PrintNumber();
        ob.printNos(10);
    }
}
