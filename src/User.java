public class User
{
    public int id;
    public String name;
    public String address;

    public User(String name, int i){
        id = i;
        if(name.length() < 0 || name.length() > 100) // Testing length
        {
            return; //If string is invalid, we dont try to store it
        }
        this.name = name;
    }

    public void setName(String name)
    {
        if(name.length() < 0)
        {
            return; //If string is invalid, we dont try to store it
        }
        this.name = name;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public int getId(){ return id; }

    public String getName(){ return name; }

    public String getAddress(){ return "STREETNAME"; }

    @Override
    public boolean equals(Object other){
        if(other instanceof User user){
            return user.name == name;
        }
        return false;
    }
}
