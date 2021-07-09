package Java;

class Account {
    Integer id;
    String name;
    String document;
    String email;
    String password;    

    public Account (String name, String document) { //Metodo constructor para account
        
        this.name = name;
        this.document = document;
    }
}
