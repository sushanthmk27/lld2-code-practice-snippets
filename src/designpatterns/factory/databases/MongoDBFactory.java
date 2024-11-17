package designpatterns.factory.databases;

import designpatterns.factory.databases.queries.Query;
import designpatterns.factory.databases.queries.SQLQuery;
import designpatterns.factory.databases.transactions.Transcations;
import designpatterns.factory.databases.updators.Updator;

public class MongoDBFactory implements DatabaseFactory{
    @Override
    public Query createQuery() {
        return new SQLQuery();
    }

    @Override
    public Transcations createTransaction() {
        return null;
    }

    @Override
    public Updator createUpdator() {
        return null;
    }
}
