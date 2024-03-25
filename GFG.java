import java.awt.*;
import java.awt.event.*;

public class GFG extends Frame implements WindowListener,ActionListener {
        TextField text = new TextField(20);
        Button b;
        private int numClicks = 0;

        public static void main(String[] args) {
                GFG myWindow = new GFG("My first window");
                myWindow.setSize(350,100);
                myWindow.setVisible(true);
        }

        public GFG(String title) {

                super(title);
                setLayout(new FlowLayout());
                addWindowListener(this);
                b = new Button("Click me");
                add(b);
                add(text);
                b.addActionListener(this);
        }

        public void actionPerformed(ActionEvent e) {
                numClicks++;
                text.setText("Button Clicked " + numClicks + " times");
        }

        public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
        }

		@Override
		public void windowOpened(WindowEvent e) {

			throw new UnsupportedOperationException("Unimplemented method 'windowOpened'");
		}

		@Override
		public void windowClosed(WindowEvent e) {
			throw new UnsupportedOperationException("Unimplemented method 'windowClosed'");
		}

		@Override
		public void windowIconified(WindowEvent e) {

			throw new UnsupportedOperationException("Unimplemented method 'windowIconified'");
		}

		@Override
		public void windowDeiconified(WindowEvent e) {

			throw new UnsupportedOperationException("Unimplemented method 'windowDeiconified'");
		}

		@Override
		public void windowActivated(WindowEvent e) {

			throw new UnsupportedOperationException("Unimplemented method 'windowActivated'");
		}

		@Override
		public void windowDeactivated(WindowEvent e) {

			throw new UnsupportedOperationException("Unimplemented method 'windowDeactivated'");
		}
    }