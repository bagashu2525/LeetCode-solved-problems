public class PrintTxtNTimes {
    void printGfg(int N) {
        // code here
        if(N>0){
        System.out.print("GFG ");
        printGfg(N-1) ;
        }
        else{
            return;
        }
    }
    public static void main(String[] args) {
        PrintTxtNTimes ob=new PrintTxtNTimes();
        ob.printGfg(10); 
    }
}
