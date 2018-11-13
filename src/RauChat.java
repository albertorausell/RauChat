import javax.swing.JFrame;

public class RauChat extends JFrame{
	public RauChat() {
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("RauChat");
		setBounds(400,200,1000,800);
		add(new RauChatPanel());
		setVisible(true);
		setResizable(false);
	}
}
