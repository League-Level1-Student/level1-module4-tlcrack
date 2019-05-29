import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class GetLatestTweet implements ActionListener {
	JFrame fra = new JFrame();
	JPanel pan = new JPanel();
	JButton but = new JButton();
	JTextField tex = new JTextField();
	JLabel lab = new JLabel();

	public static void main(String[] args) {
		GetLatestTweet GLT = new GetLatestTweet();
		GLT.searcher();
	}

	void searcher() {
		fra.add(pan);
		pan.add(tex);
		pan.add(but);
		pan.add(lab);

		fra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fra.setVisible(true);
		fra.setTitle("The Amazing Tweet Reviewer");

		tex.setPreferredSize(new Dimension(200, 20));
		but.setPreferredSize(new Dimension(200, 20));
		but.setText("Search the Twitterverse");
		but.addActionListener(this);

		fra.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
lab.setText(getLatestTweet(tex.getText()));
	fra.pack();
	}

	private String getLatestTweet(String searchingFor) {

		Twitter twitter = new TwitterFactory().getInstance();

		AccessToken accessToken = new AccessToken("2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
				"vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
		twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN", "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
		twitter.setOAuthAccessToken(accessToken);

		Query query = new Query(searchingFor);
		try {
			QueryResult result = twitter.search(query);
			return result.getTweets().get(0).getText();
		} catch (Exception e) {
			System.err.print(e.getMessage());
			return "What the heck is that?";
		}
	}

}
