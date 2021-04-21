package Builder;

/**
 * @author 712
 * @function:
 * @create 2021/4/15 20:53
 */
public class ComplexTerrainBuilder implements TerrainBuilder{
    Terrain terrain = new Terrain();

    @Override
    public TerrainBuilder buildFort() {
        terrain.f = new Fort(10,10,40,40);
        return this;   //返回当前对象TerrainBuilder
    }

    @Override
    public TerrainBuilder buildMine() {
        terrain.m = new Mine(20,20,30,30);
        return this;
    }

    @Override
    public TerrainBuilder buildWall() {
        terrain.w = new Wall(30,30,50,50);
        return this;
    }

    @Override
    public Terrain build() {
        return terrain; //返回整个对象
    }
}
