/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author zsolt
 */
public class CompoundFigure extends Figure {
    
    private List<Figure> list = new ArrayList<Figure>();
    
    public CompoundFigure() {
        super(0, 0);
        
    }
    
    public void add(Figure figure) {
        list.add(figure);
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Figure b : list) {
            b.move(dx, dy); 
        }       
    }
    
    @Override
    public void draw(Graphics graphics) {
        
        for (Figure b : list) {
            b.draw(graphics);
        }
    }
    
}
