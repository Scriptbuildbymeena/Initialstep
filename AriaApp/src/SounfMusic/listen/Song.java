package SounfMusic.listen;

class Song {
	 private String title;
	    private String category;
	    private double duration; // in minutes

	    public Song(String title, String category, double duration) {
	        this.title = title;
	        this.category = category;
	        this.duration = duration;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getCategory() {
	        return category;
	    }

	    public double getDuration() {
	        return duration;
	    }

	    @Override
	    public String toString() {
	        return "Title: " + title + ", Category: " + category + ", Duration: " + duration + " mins";
	    }

}
