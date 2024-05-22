interface Computer{
    void code();
}
class Laptop implements Computer{
    public void code(){
        System.out.println("code, compile, run");
    }
} 
class Desktop implements Computer{
    public void code(){
        System.out.println("code, compile, run: faster ");
    }
}
class Dveloper{
    public void devApp(Computer lap)
    {
        lap.code();
    }
}
public class InterfaceEx2 {
    public static void main(String[] args) {
        Computer lap = new Laptop();     
        Computer desk = new Desktop();     

        Dveloper sai = new Dveloper();
        sai.devApp(lap);
    }
}
