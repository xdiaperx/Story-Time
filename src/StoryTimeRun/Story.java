package StoryTimeRun;

public class Story {
	private String storyName;
	private String[] genre;
	
	public Story(String sName) {
		storyName = sName;
	}
	
	public void addGenre(String gen) {
		genre[genre.length] = gen;
	}
	
}
