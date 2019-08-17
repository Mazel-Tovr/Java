public class Person
{
    private String name;
    private Integer age;
    public String getName(){return name;}
    public Integer getAge(){return age;}

    public void ChangeDate(String name,Integer age)
    {
        this.name = name == null ? this.name : name;
        this.age = age == null ? this.age : age;
    }

    Person(String name ,Integer age)
    {
        this.name = name;
        this.age = age;
    }

}
