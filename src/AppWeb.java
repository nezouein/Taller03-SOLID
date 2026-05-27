public class AppWeb {
    private Authentication authentication;
    private Database database;
    
    public AppWeb(Authentication authentication, Database database) {
        this.authentication = authentication;
        this.database = database;
    }
    
    public void login(User user) {
        authentication.log(user);
    }
    
    public void connectToDatabase() {
        // Logic using database (abstraction)
    }
}

