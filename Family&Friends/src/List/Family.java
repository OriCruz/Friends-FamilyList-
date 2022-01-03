package List;

/**
 *
 * @author oriana.cruz
 */
public class Family {
    //Variables 
    private String name;
    private String relation;
    
    //Constructor
    public Family(String n, String r){
        name = n;
        relation = r;
    }
    
    //Printing Info
    @Override
    public String toString(){
        return name+" is part of your family, the relationship is, "
                + relation;
     }
    
}
