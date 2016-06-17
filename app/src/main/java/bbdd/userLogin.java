package bbdd;


public class userLogin {
    //Clase userLogin
    String user;
    String pass;

    public userLogin(String user, String pass){
        this.user = user;
        this.pass = pass;
    }

    public String getAccess(){
        int id = (this.user == "m" && this.pass == "m") ? 1 : -1;

        return "{'id': "+id+"}";
    }

}


