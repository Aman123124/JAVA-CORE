public class Video {
    private int videoId;
    private String title;
    private int views;
    private int likes;
    private static int totalVideos;

    public Video(String title) {
        this.videoId = ++totalVideos;
        this.title = title;
        this.views = 0;
        this.likes = 0;
    }

    public int getVideoId() {
        return videoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public static int getTotalVideos() {
        return totalVideos;
    }

    public static void main(String[] args) {
        // Creating video objects
        Video video1 = new Video("Java Basics");
        Video video2 = new Video("Data Structures");
        
        // Setting properties
        video1.setViews(1000);
        video1.setLikes(250);
        
        video2.setViews(500);
        video2.setLikes(100);

        // Getting properties
        System.out.println("Video 1: " + video1.getTitle());
        System.out.println("Video 1 Views: " + video1.getViews());
        System.out.println("Video 1 Likes: " + video1.getLikes());

        System.out.println("Video 2: " + video2.getTitle());
        System.out.println("Video 2 Views: " + video2.getViews());
        System.out.println("Video 2 Likes: " + video2.getLikes());

        System.out.println("Total Videos: " + Video.getTotalVideos()); // Output: 2
    }
}
