package Builder;

/**
 * @author 712
 * @function:
 * @create 2021/4/15 20:49
 */
public interface TerrainBuilder {
    public TerrainBuilder buildFort();
    public TerrainBuilder buildMine();
    public TerrainBuilder buildWall();
    Terrain build();
}
