        /**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle moon;
    private Square grass;
    private Circle sun;
    private Person persona;
    private Person persona2;
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    
    {
    grass = new Square();
    grass.moveVertical(125);
    grass.moveHorizontal(-500);
    grass.makeVisible();
    grass.changeColor("green");
    grass.changeSize(1000); 
          
    wall = new Square();
    wall.moveHorizontal(-140);
    wall.moveVertical(20);
    wall.changeSize(120);
    wall.makeVisible();
        
    window = new Square();
    window.changeColor("black");
    window.moveHorizontal(-120);
    window.moveVertical(40);
    window.changeSize(40);
    window.makeVisible();

    roof = new Triangle();  
    roof.changeSize(60, 180);
    roof.moveHorizontal(20);
    roof.moveVertical(-60);
    roof.makeVisible();

    sun = new Circle();
    sun.changeColor("yellow");
    sun.moveHorizontal(100);
    sun.moveVertical(-40);
    sun.changeSize(80);
    sun.makeVisible();
    sun.slowMoveVertical(250);
        
        
    moon = new Circle();
    moon.changeColor("magenta");
    moon.changeSize(40);
    moon.makeVisible();
    moon.moveHorizontal(-150);
    

    
   
    }
    public void amanecer(){
    sun.slowMoveVertical(-250);
    moon.makeInvisible();
    
    persona = new Person();
    persona.makeVisible();
    persona.moveHorizontal(-180);
    persona.moveVertical(25);
    persona.slowMoveHorizontal(50);
    
    
    persona2 = new Person();
    persona2.makeVisible();
    persona2.moveVertical(25);
    persona2.moveHorizontal(80);
    persona2.slowMoveHorizontal(-50);
   
    }
    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            moon.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            moon.changeColor("yellow");
        }
    }
}
