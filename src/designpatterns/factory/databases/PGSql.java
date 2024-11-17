package designpatterns.factory.databases;

import designpatterns.factory.databases.queries.Query;
import designpatterns.factory.databases.queries.SQLQuery;
import designpatterns.factory.databases.transactions.Transcations;
import designpatterns.factory.databases.updators.Updator;

public class PGSql implements Database{ //, DatabaseFactory{
    @Override
    public void getVersion() {
    }

    @Override
    public DatabaseFactory createDatabaseFactory() {
        return new PGSqlFactory();
    }

    // Since the class have more number of methods, we are moving it to its respective Factory classes where we have the method implementations
    /*    @Override
    public Query createQuery() {
        return new SQLQuery();
    }

    @Override
    public Updator createUpdator() {
        return null;
    }

    @Override
    public Transcations createTransaction() {
        return null;
    }*/
}
