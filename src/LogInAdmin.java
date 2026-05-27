public class LogInAdmin implements Authentication {
    private Database database;

    public LogInAdmin(Database database) {
        this.database = database;
    }

    @Override
    public void log(User user) {
        if (!verifyIfTheUserIsAdmin(user)) {
            throw new SecurityException("User is not admin");
        }
        System.out.println("Has access to the website in admin mode");
        database.insert("INSERT INTO admin_logs VALUES (...)");
        // Logic
    }

    private boolean verifyIfTheUserIsAdmin(User user) {
        // Do something
        return true;
    }
}

