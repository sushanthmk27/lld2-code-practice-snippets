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

        Query query = QueryFactory.getQueryByDatabase(database);    // Here we use a class to call the getQueryByDatabase() method
    }

    public void updateUser(User user){

        // Here we use Runtime polymorphism and call the create query function.
        // The create query function is called based on the type of the database object.
        // If it is MySql/MongoDb/PGSql accordingly its method implementations will get invoked respectively and the object of Query will be created.
        Query query = database.createQuery();

        Transcations transcations = database.createTransaction();

        Updator updator = database.createUpdator();
    }
}
