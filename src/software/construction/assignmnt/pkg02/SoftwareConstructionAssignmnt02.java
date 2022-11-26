package software.construction.assignmnt.pkg02;
import java.util.Date;
import java.util.List;
 class User{
    public String Username;
    public String Password;
    public String Email;
    public String Last_Activity;
    public String Postal_Address;
    public boolean Loged_in;
    public boolean login(){
         System.out.println("User loged in successfully....");
         return true;
        
    }
     public boolean Logout(){
         System.out.println("User Logout successfully....");
         return false;
        
    }
}
class Admin extends User{
    Inventory inventory_items;
    Promotion Promotion_codes;
}
class Customer extends User{
    public boolean is_member;
}
class Inventory {
    List<Item> Items;//Aggregation concept
    public boolean purchase_item(){
        System.out.println("Item purchased successfully");
        return true;
    }
    public void add_item(){
        System.out.println("Item add successfully");
    }
    public void reOrder(){
        System.out.println("ReOrder Successfully");
    }
    public void Email(){
        System.out.println("Email sent about product order successfully");
    }
}
class Item{
    public int Barcode;
    public double price;
    public boolean ReOrder;
      public boolean ReOrder_Amount;
      public int Stock;
}
class Promotion{
    public String promotion_code;
    public Date Expiry_date;
    public void Email(){
        System.out.println("Promotion email sent successfully!!");
    }
}
class Shoping_Cart{
    List <Promotion> Promotion_code;
    List <Item> Shoping_Cart_items;
    public boolean Add_Promotion(){
        System.out.println("Promotion added in checkout amount");
        return true;
    }
    public void CheckOut(){
        System.out.println("Total price is 5000");
    }
    public void Add_Item(){
        System.out.println("Item add to shoping cart successfully");
    }
    public void Remove_Item(){
        System.out.println("Item remove to shoping cart successfully");
    }
    public void Email(){
        System.out.println("Email sent about product info....");
    }
}
class Transaction{
    public String Username;
    public String Transaction_data;
    public Date Transaction_date;
}
class transaction_log{
    
}

public class SoftwareConstructionAssignmnt02 {

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
