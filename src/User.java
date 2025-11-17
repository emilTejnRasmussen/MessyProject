import java.util.Objects;

public class User
{
    private int id;
    private String name;
    private String address;

    public User(String name, int id){
        this.id = id;
        this.name = name;
        if(name.length() > 100)
        {
            this.name = name.substring(0, 100);
        }
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
    public boolean equals(Object other)
    {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        User user = (User) other;
        return id == user.id;
    }

    @Override
    public int hashCode()
    {
        return Objects.hashCode(id);
    }

    @Override
    public String toString()
    {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
