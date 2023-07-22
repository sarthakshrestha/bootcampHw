package BookOrganizer;

public class Author {
    String name;
    String email;

    Author(String name, String email){
        this.name = name;
        this.email = email;
    }

    Author(){
        name = "Subhraj Gawaj";
        email = "subhraj@gmail.com";
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getName(){
        return  name;
    }

    public String getEmail(){
        return email;
    }

    @Override
    public String toString(){
        return "Author Name: " + name + " Author's email: " + email;
    }
}
