package InstagramOop;

public class ReelsPage extends Page { //Reels Sayfasý
	private String video;
	private String videoDescription;
	private String senderName;
	private int like;
	private String[] comments;
	private String send;
	public ReelsPage() {
		super();
	}
	public ReelsPage(String pageName, String video, String videoDescription, String senderName, int like, String[] comments,
			String send) {
		super(pageName);
		this.video = video;
		this.videoDescription = videoDescription;
		this.senderName = senderName;
		this.like = like;
		this.comments = comments;
		this.send = send;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	public String getVideoDescription() {
		return videoDescription;
	}
	public void setVideoDescription(String videoDescription) {
		this.videoDescription = videoDescription;
	}
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}
	public String[] getComments() {
		return comments;
	}
	public void setComments(String[] comments) {
		this.comments = comments;
	}
	public String getSend() {
		return send;
	}
	public void setSend(String send) {
		this.send = send;
	}
	
}
