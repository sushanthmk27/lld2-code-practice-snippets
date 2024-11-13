package designpatterns.singleton;

public class DatabaseConnection {
    private static DatabaseConnection dbConnInstance = null;        // create a private static variable of type DatabaseConnection assign
                                                                    // the address of the newly created instance

    String url;
    String name;
    String password;


    private DatabaseConnection() {          // private empty constructor is created so that we wont be able to create instance of the class using the new keyword
    }

    public static DatabaseConnection createNewInstanceToAchieveSingleton(){     // A static method is created for the purpose of creating single instance
        if(dbConnInstance == null){                         // conditional check to see if an instance is already created
            dbConnInstance =  new DatabaseConnection();     //  create a new instance when dbConnInstance is null
            return dbConnInstance;
        }
        return dbConnInstance;
    }
}
