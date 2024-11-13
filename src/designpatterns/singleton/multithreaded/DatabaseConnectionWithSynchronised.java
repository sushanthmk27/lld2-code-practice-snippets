package designpatterns.singleton.multithreaded;

public class DatabaseConnectionWithSynchronised {
    private static volatile DatabaseConnectionWithSynchronised dbConnInstanceSynchronised = null;


    String url;
    String name;
    String password;


    private DatabaseConnectionWithSynchronised() {
    }

    public static synchronized DatabaseConnectionWithSynchronised createNewInstanceToAchieveSingleton(){
        if(dbConnInstanceSynchronised == null){                            // double lock check method to efficiently use Singleton pattern in multithreaded scenario
            synchronized(DatabaseConnectionWithSynchronised.class){              // creation of lock here
                if(dbConnInstanceSynchronised == null){                                                   // We won't create an instance here, rather we return the reference variable
                    dbConnInstanceSynchronised =  new DatabaseConnectionWithSynchronised();
                    return dbConnInstanceSynchronised;
                }
            }
        }
        return dbConnInstanceSynchronised;
    }
}
