public class User
{
    private int id;
    private String name;
    private String address;

    public User(String name, int i){
        id = i;
        if(name.length() > 100)
        {
            return; // If name is too long, we don't save it
        }
        this.name = name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public int getId(){ return id; }

    public String getName(){ return name; }

    public String getAddress(){ return address; }

    @Override
    public boolean equals(Object other){
        if(other instanceof User user){
            return user.name == name;
        }
        return false;
    }
}
