package designpatterns.factory.databases.queries;

public class SQLQuery implements Query{
    private String query;

    @Override
    public String getQuery() {
        return query;
    }
}
