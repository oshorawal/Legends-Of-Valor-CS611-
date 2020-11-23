/**
 * @author: Zhuyun Chen date: 11/08/20 Class represent a Charactor in general
 *          Superclass of Hero and Monster
 **/

public abstract class Character{
    
    protected String name;
    protected Tile position;

    /* Default constructor */
    Character(){
        this.name = "No Name";
    }
    
    /* User defined constructor */
    Character(String name){
        this.name = name;
    }
    
    /**
     * Get name of the Charactor
     * @return String, name of char
     */
    public String getName(){
        return this.name;
    }
    
    /** Get position of the char */
    public Tile getPos(){ return this.position;}
    public void setPos(Tile position){ this.position = position;}
    
    /** Display information of the char */
    public abstract void display();
    
    public abstract char represent();
    
    /** move char to given tile */
    public void move(Tile destination){
        this.position = destination;
    }
}
