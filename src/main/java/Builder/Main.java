package Builder;

/**
 * @author 712
 * @function:  一个对象非常复杂，分模块一步步链式构建
 * @create 2021/4/15 20:44
 */
public class Main {
    public static void main(String[] args) {
        ComplexTerrainBuilder builder = new ComplexTerrainBuilder();
        Terrain terrain = builder.buildFort().buildMine().buildWall().build();   //链条式的编程模式，得到整个复杂对象

        //一个复杂对象，只指定用到的部分，不用部分可以不指定
        Person person = new Person.PersonBuilder()
                .basicInfo(1,"qingqing")
                .homeInfo("shenzhen","pingshan")   //不想指定或者信息不全的部分可以省略
                .scoreInfo(100)
                .build();
        System.out.println(person.toString());
    }
}
