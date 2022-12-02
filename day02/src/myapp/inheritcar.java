package myapp;

public class inheritcar extends getsetcar {
    public inheritcar(String register) {
        super(register);
    }

    //don't get this part
    public Boolean getTurbo() {return ttt;}
    public void setTurbo(Boolean turbo)
    {this.turbo = ttt;}
    


    @Override
    public void accele() {
        super.accele();
        super.accele();
        super.accele();
        System.out.println("fast");
        
    } else {
        super.accele();
        System.out.println("slow");

    }
}
