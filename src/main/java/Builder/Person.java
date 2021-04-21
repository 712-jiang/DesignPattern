package Builder;

/**
 * @author 712
 * @function:
 * @create 2021/4/15 21:11
 */
public class Person {
    int id;
    String name;
    String city;
    String department;
    double score;
    private Person(){};  //外部不能通过new Person()调用构造对象，只有通过内部类PersonBuilder初始化Pershon对象
    public static class PersonBuilder{
        Person p = new Person();
        public PersonBuilder basicInfo(int id, String name){
            p.id = id;
            p.name = name;
            return this;
        }
        public PersonBuilder homeInfo(String city, String department){
            p.city = city;
            p.department = department;
            return this;
        }
        public PersonBuilder scoreInfo(double score){
            p.score =score;
            return this;
        }
        public Person build(){
            return p;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", department='" + department + '\'' +
                ", score=" + score +
                '}';
    }
}
