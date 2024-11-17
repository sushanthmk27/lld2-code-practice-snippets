package designpatterns.factory.databases;

import designpatterns.factory.databases.queries.Query;
import designpatterns.factory.databases.transactions.Transcations;
import designpatterns.factory.databases.updators.Updator;

public interface Database {
    void getVersion();

    // Factory methods
/*    Query createQuery();
      Transcations createTransaction();   // Here since we are overloading the Database interface with too many factory methods, we will create a
      Updator createUpdator();*/         // separate DatabaseFactory interface and moe all the Factory methods to it


}
