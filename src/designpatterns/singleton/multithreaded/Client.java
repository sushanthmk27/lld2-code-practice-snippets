package designpatterns.singleton.multithreaded;


import designpatterns.singleton.DatabaseConnection;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String [] args) throws InterruptedException {

        // Set<DatabaseConnectionWithEagerLoading> databaseConnectionSet = new HashSet<>();

        Set<DatabaseConnectionWithSynchronised> databaseConnectionSet = new HashSet<>();
        ExecutorService executorService = Executors.newCachedThreadPool();

        for(int i=0; i<=1000; i++){
            executorService.submit(
                    /*() -> databaseConnectionSet.add(DatabaseConnection.createNewInstanceToAchieveSingleton())*/
                    () -> databaseConnectionSet.add(DatabaseConnectionWithSynchronised.createNewInstanceToAchieveSingleton())
            );
        }

        Thread.sleep(6000);
        System.out.println("Size of the databaseConnectionSet = " + databaseConnectionSet.size());
        executorService.shutdown();
    }
}