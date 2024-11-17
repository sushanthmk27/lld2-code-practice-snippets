package designpatterns.factory.databases;

import designpatterns.factory.databases.queries.NoSQLQuery;
import designpatterns.factory.databases.queries.Query;
import designpatterns.factory.databases.queries.SQLQuery;
import designpatterns.factory.databases.transactions.Transcations;
import designpatterns.factory.databases.updators.Updator;

public class UserService {

    private Database database;

    UserService(Database database){
        this.database = database;
    }

    public void createUser(User user){
/*        Query q = null;
        if(database instanceof MySql ){
            q = new SQLQuery();
        }
        else if(database instanceof PGSql){
            q = new NoSQLQuery();
        }*/

        //** SIMPLE FACTORY   **//
        Query query = QueryFactory.getQueryByDatabase(database);    // Here we use a class to call the getQueryByDatabase() method
    }

    public void deleteUser(User user){
        //** SINGLE FACTORY **//
       /* Query query = database.createQuery();*/
    }

    public void updateUser(User user){
        // Here we use Runtime polymorphism and call the create query function.
        // The create query function is called based on the type of the database object.
        // If it is MySql/MongoDb/PGSql accordingly its method implementations will get invoked respectively and the object of Query will be created.
/*        Query query = database.createQuery();
        Transcations transcations = database.createTransaction();
        Updator updator = database.createUpdator();*/

/*        DatabaseFactory databaseFactory = null;
        if(database instanceof MySql){
            databaseFactory = new MySQLFactory();
        }
        else if (database instanceof MongoDB){
            databaseFactory = new MongoDBFactory();
        }
        else if (database instanceof PGSql){
            databaseFactory = new MongoDBFactory();
        }*/

        //** ABSTRACT FACTORY   **//
        // Here when the Factory method increased we moved to create a new Factory interface which manages all these Factories methods, using the database we will help us to get the factory objects
        DatabaseFactory databaseFactory = database.createDatabaseFactory();

        Query query = databaseFactory.createQuery();
        Transcations transcations = databaseFactory.createTransaction();
        Updator updator = databaseFactory.createUpdator();
    }
}
