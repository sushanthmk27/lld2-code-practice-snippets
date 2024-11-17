package designpatterns.factory.databases;

import designpatterns.factory.databases.queries.NoSQLQuery;
import designpatterns.factory.databases.queries.Query;
import designpatterns.factory.databases.queries.SQLQuery;

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

        Query query = QueryFactory.getQueryByDatabase(database);
    }
}
