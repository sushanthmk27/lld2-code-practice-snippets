package designpatterns.singleton.multithreaded;

public class DatabaseConnectionWithEagerLoading {
    private static DatabaseConnectionWithEagerLoading dbConnInstanceEagerLoading = new DatabaseConnectionWithEagerLoading();        // Instance is created during class loading time - EagerLoading


    String url;
    String name;
    String password;


    private DatabaseConnectionWithEagerLoading() {
    }

    public static DatabaseConnectionWithEagerLoading createNewInstanceToAchieveSingleton(){
/*        if(dbConnInstance == null){                                                   // We won't create an instance here, rather we return the reference variable
            dbConnInstance =  new DatabaseConnectionWithEagerLoading();
            return dbConnInstance;
        }*/
        return dbConnInstanceEagerLoading;
    }
}
