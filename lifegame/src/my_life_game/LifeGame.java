package my_life_game;

import javax.swing.JFrame;




public class LifeGame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5889146085850370707L;

	LifeGame(){  
        this.setSize(630,600);  
        this.setTitle("…˙√¸”Œœ∑[LifeGame]DEMO");  
        this.add(new World());  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setLocationRelativeTo(null);  
        this.setResizable(false);  
    }  
	
	 public static void main(String[] args){
		LifeGame game = new LifeGame();  
        game.setVisible(true);  
	}

}
