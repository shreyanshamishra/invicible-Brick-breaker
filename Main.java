import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame obj =  new JFrame();
		Gameplay gameplay = new Gameplay();
		obj.setBounds(10, 10 ,700, 600);
		obj.setTitle("Invisible Brick Breaker"); 
		obj.setResizable(false);
		obj.setVisible(true);
		obj.add(gameplay);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
