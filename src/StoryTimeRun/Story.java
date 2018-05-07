package StoryTimeRun;

import java.io.Serializable;

public class Story implements Serializable {
	private String storyName;
	private String genre;
	private String format;
	public static int numOfStories = 0;

	public Story(String sName, String gen, String form) {
		storyName = sName;
		genre = gen;
		format = form;
		numOfStories++;
	}

	public String getStoryName() {
		return storyName;
	}

	public void setStoryName(String storyName) {
		this.storyName = storyName;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}
	
}
