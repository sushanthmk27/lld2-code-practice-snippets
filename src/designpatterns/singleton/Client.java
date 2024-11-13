package designpatterns.singleton;

public class Client {
    public static void main(String [] args){
/*            DatabaseConnection db1 = new DatabaseConnection();
            DatabaseConnection db2 = new DatabaseConnection();*/

        DatabaseConnection db1 = DatabaseConnection.createNewInstanceToAchieveSingleton();      // Instance is created by calling the static method from DbConnection class
        DatabaseConnection db2 = DatabaseConnection.createNewInstanceToAchieveSingleton();      // Once the instance is created the same instance is referred again and again, the address of the instance remains the same
            if(db1 == db2){
                System.out.println("Objects are same");
            }
            else{
                System.out.println("Objects are different");
            }

            System.out.println(db1 + "  "+ db2 );
    }
}
