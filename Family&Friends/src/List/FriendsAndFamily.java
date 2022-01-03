package List;


import java.util.Scanner;

/**
 * 
 * @author oriana.cruz
 */
public class FriendsAndFamily {

    public static void main(String[] args) {
         //User warning
        System.out.println("(Warning: When prompted for choice of \"Friend\" or \"Family\", anything"
                + "other than friend or family will end the program)\n");

        //Variables 
        Scanner scan = new Scanner(System.in);
        Object[] friendsAndFamily = getSize(scan);
        Friend fri;
        Family fam;
        String name, relation;
        int timeKnown, type;
        
        //for loop
        for (int i = 0; i < friendsAndFamily.length; i++) {
            type = friendOrFamily(scan);
            if(type == 0){
                name = getName(scan, type);
                timeKnown = getTimeKnown(scan, name);
                fri = new Friend(name,timeKnown);
                friendsAndFamily[i]= fri;
            }
            else if(type ==1){
                name = getName(scan, type);
                relation = getRelation(scan, name);
                fam = new Family(name,relation);
                friendsAndFamily[i] = fam;
            }
            else{
               System.err.println("The program is ending due to invalid input");
               System.exit(0);
            }
        }
        display(friendsAndFamily);
       }
    
    //GetSize
    public static Object[] getSize(Scanner sc){
        System.out.print("How many friends & family do you wish to enter? --> ");
        int size = sc.nextInt(); 
        //validating for positive number
        while(size <= 0){
            System.out.print("How many friends & family do you wish to enter? --> ");
            size = sc.nextInt();
        }
        Object[] array = new Object[size];
        return array;
    }
    
    //FriendOrFamily 
    public static int friendOrFamily(Scanner sc){
        System.out.print("\nAre you entering a friend or family member? --> ");
        String t = sc.next();
        String f = "friend";
        String fam = "family";
        int ans;
        if(t.equalsIgnoreCase(f)){
            ans = 0;
        }
        else if(t.equalsIgnoreCase(fam)){
            ans = 1;
        }
        else{
            ans = 2;
        }
        return ans;
    }
    
    //GetName
    public static String getName(Scanner sc, int t){  
      
        if(t==0){
            System.out.print("Enter the name of this friend --> ");
            
        }
        else if (t==1){
            System.out.print("Enter the name of this family member --> ");
        
        }
       else{
           System.err.println("Invalid input. Program ending SEE YA");
           System.exit(0);
        }
         String name = sc.next();
        //clearing the buffer
        sc.nextLine();
        
        return name;
    }
    
    //GetRelation
    public static String getRelation(Scanner sc, String n){
        System.out.print("What's your relation with "+ n + " --> ");
        n = sc.nextLine();
        return n;
    }
    
    //GetTimeKnown
    public static int getTimeKnown(Scanner sc, String n){
        System.out.print("For how long have you known "+ n + " --> ");
        int tk = sc.nextInt();
        return tk;
    }
    
    //Display
    public static void display(Object[]faf){
        for (Object object : faf) {
            System.out.println("\n"+object.toString());
        }
 
    }

}
