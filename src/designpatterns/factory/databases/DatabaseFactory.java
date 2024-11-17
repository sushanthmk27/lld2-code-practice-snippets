package designpatterns.factory.databases;

import designpatterns.factory.databases.queries.Query;
import designpatterns.factory.databases.transactions.Transcations;
import designpatterns.factory.databases.updators.Updator;

public interface DatabaseFactory {
    Query createQuery();
    Transcations createTransaction();
    Updator createUpdator();
}
