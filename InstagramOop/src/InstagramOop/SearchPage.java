package InstagramOop;

public class SearchPage extends Page {//Arama sayfasý
	private String search;
	private String[] images;
	private String[] videos;
	private ReelsPage[] reels;
	public SearchPage() {
		super();
	}
	public SearchPage(String pageName, String search, String[] images, String[] videos, ReelsPage[] reels) {
		super(pageName);
		this.search = search;
		this.images = images;
		this.videos = videos;
		this.reels = reels;
	}
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	public String[] getImages() {
		return images;
	}
	public void setImages(String[] images) {
		this.images = images;
	}
	public String[] getVideos() {
		return videos;
	}
	public void setVideos(String[] videos) {
		this.videos = videos;
	}
	public ReelsPage[] getReels() {
		return reels;
	}
	public void setReels(ReelsPage[] reels) {
		this.reels = reels;
	}
	
	
}
