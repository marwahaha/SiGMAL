package sigmal.runtime;

import sigmal.utils.Point;
import sigmal.utils.Direction;

public class SiGMALCamera{
    private Point pos;
    private Direction dir;
    private boolean activity;

    public SiGMALCamera(){
        pos = new Point(0, 0, 0);
        dir = new Direction(0, 0);
        activity = false;
    }

    public Point getPos(){
        return pos;
    }
    
    public void setActivity(boolean state){
        activity = state;
    }
    public boolean isActive(){
        return activity;
    }
}
