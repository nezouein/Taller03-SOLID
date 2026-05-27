public class LogIn implements Authentication {
    private Database database;

    public LogIn(Database database) {
        this.database = database;
    }

    @Override
    public void log(User user) {
        System.out.println("Has access to the website");
        insertUserInDatabase(user);
        // Logic
    }

    public void insertUserInDatabase(User user) {
        database.insert("INSERT INTO users VALUES (...)");
    }
}

