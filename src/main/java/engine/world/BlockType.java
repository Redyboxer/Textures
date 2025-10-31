package engine.world;

public enum BlockType {
    // We should do this in a more organized way...
	AIR(null, null, null, null, null, null),
    DIRT("dirt.png", "dirt.png", "dirt.png", "dirt.png", "dirt.png", "dirt.png"),
    GRASS("grass_top.png", "dirt.png", "grass_side.png", "grass_side.png", "grass_side.png", "grass_side.png"),
    STONE("stone.png", "stone.png", "stone.png", "stone.png", "stone.png", "stone.png");

    public final String top, bottom, left, right, front, back;

    BlockType(String top, String bottom, String left, String right, String front, String back) {
        this.top = top;
        this.bottom = bottom;
        this.left = left;
        this.right = right;
        this.front = front;
        this.back = back;
    }

    public String getTextureForFace(int face) {
        switch(face) {
            case 0: return top;
            case 1: return bottom;
            case 2: return left;
            case 3: return right;
            case 4: return front;
            case 5: return back;
            default: return top;
        }
    }
}