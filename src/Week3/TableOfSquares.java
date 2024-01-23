package Week3;

public class TableOfSquares {
    public void Square(){

        for(int i=1; i< 21; i++)
        {
            int sq=i*i;
            System.out.println("The square of "+ i+" : "+ sq);
        }
    }
    public static void main(String[] args) {
        TableOfSquares ts=new TableOfSquares();
        ts.Square();

    }
}
