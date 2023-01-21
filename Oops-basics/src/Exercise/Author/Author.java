package Exercise.Author;

public class Author {
    String name;
    String email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author[" +
                "name=" + this.name +" "+","+
                "email=" + this.email +" "+
                "]";
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String mail){
        this.email = mail;
    }


}
