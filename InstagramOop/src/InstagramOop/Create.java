package InstagramOop;

public class Create {//instagram oluþtur kýsmý
	private String shipment;
	private String reelsVideos;
	private String story;
	private String live;
	public Create() {
		super();
	}
	public Create(String shipment, String reelsVideos, String story, String live) {
		super();
		this.shipment = shipment;
		this.reelsVideos = reelsVideos;
		this.story = story;
		this.live = live;
	}
	public String getShipment() {
		return shipment;
	}
	public void setShipment(String shipment) {
		this.shipment = shipment;
	}
	public String getReelsVideos() {
		return reelsVideos;
	}
	public void setReelsVideos(String reelsVideos) {
		this.reelsVideos = reelsVideos;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	public String getLive() {
		return live;
	}
	public void setLive(String live) {
		this.live = live;
	}
	
}
