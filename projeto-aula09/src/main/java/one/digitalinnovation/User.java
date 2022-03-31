package one.digitalinnovation;

/**
 * Classe que representa o usuario
 */
public class User {

    private String username;

    private String password;

    private StatusUser status;

    public User(String username, String password, StatusUser status) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public StatusUser getStatus() {
        return status;
    }

    /**
     * Disabilita o usuario setando o status dele como DISABLED
     */
    public void disable(){
        this.status = StatusUser.DISABLED;
    }

    /**
     * Habilita o usuario setando o status dele como DISABLED
     */
    public void enable(){
        this.status = StatusUser.ENABLED;
    }

}
