package javaoop;

public class ThisKeyword {
    String rapper;
    ThisKeyword(String rapper){
        this.rapper = rapper;
        System.out.println("this reference = " + this);
    }


    private int a, b;

    private ThisKeyword(int x, int z){
        this.a = x;
        this.b = z;
    }
    private ThisKeyword(int x){
        this(x,x);
    }
    private ThisKeyword(){
        this(0);
    }
    @Override
    public String toString(){
        return this.a + " + " + this.b + "x";
    }


    public static void main(String[] args) {
        ThisKeyword thisKeyword = new ThisKeyword("Sheff G");
        System.out.println("This Keyword reference = " + thisKeyword);

        ThisKeyword k1 = new ThisKeyword(2, 3);
        ThisKeyword k2 = new ThisKeyword(3);
        ThisKeyword k3 = new ThisKeyword();
        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);
    }
}
