package List;

/**
 *
 * @author oriana.cruz
 */
public class Friend {
    //Variables 
    private String name; 
    private int timeKnown;
    
    //Constructor 
    public Friend(String n, int tk){
        name = n;
        timeKnown = validateTimeKnown(tk);
    }
    
    //Method
    public int validateTimeKnown(int tk){
        if(tk < 0 ){
            tk = 0;
        }
        else {
            timeKnown = tk;
        }
        return tk;
    }
    
    //Printing info
    @Override
    public String toString(){
        return  name +" and you have been friends for "+ timeKnown + " year(s).";
    }
}
