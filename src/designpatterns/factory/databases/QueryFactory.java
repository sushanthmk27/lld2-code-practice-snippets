package designpatterns.factory.databases;

import designpatterns.factory.databases.queries.NoSQLQuery;
import designpatterns.factory.databases.queries.Query;
import designpatterns.factory.databases.queries.SQLQuery;

public class QueryFactory {

    public static Query getQueryByDatabase(Database database){
            Query query = null;
            if(database instanceof MySql ){
                query = new SQLQuery();
            }
            else if(database instanceof PGSql){
                query = new NoSQLQuery();
            }
            return query;
    }
}
