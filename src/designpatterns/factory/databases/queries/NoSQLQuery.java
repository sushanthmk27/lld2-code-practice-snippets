package designpatterns.factory.databases.queries;

public class NoSQLQuery implements Query{
    private String query;

    @Override
    public String getQuery() {
        return query;
    }
}
