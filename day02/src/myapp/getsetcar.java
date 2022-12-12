
import java.util.Date;

public class getsetcar {
    private String colour;
    private String make;
    private String register;
    private Integer accele;

    public getsetcar(String registration) 
    //


    // note: 'constructions' are 'methods' with the share/void-thing

    public String getColour() {
        return this.colour;
    }
    public void setColour (String ccc) {
        this.colour = ccc;
    }

    public String getMake() {
        return this.make;
    }
    public void setMake (String mmm) {
        switch (mmm) {
            case "honda":
            this.make = mmm;
            break;

            case "toyota":
            this.make = mmm;
            break;

            case "mazda":
            this.make = mmm;
            break;

            //aka same as [if make.equals("honda") or make.equals("toyota") or make.equals("mazda")]
            case "honda":
            case "toyota":
            case "mazda":
            this.make = mmm;
            break;
            // aka same as above version

            default:
        }
    }

    // use ctrl + shift + p & type "source action" to find the getter & setters
    public String getRegister() {
        return register;
    }
    public void setRegister(String register) {
        this.register = register;
    }

    public void getAccele(Integer aaa) {
        this.accele = aaa;
    }
        //onlt get, no set, so read only

    // behavior (method)
    public void accele() {
        if (this.accele < 200)
        this.accele = this.accele + 1 ;

    //overloding alternative to above

    }
    
}
