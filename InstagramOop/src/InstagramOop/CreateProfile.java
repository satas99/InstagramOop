package InstagramOop;

public class CreateProfile extends Create {//instagram profil oluþtur kýsmý Create sýnýfýndan kalýtým aldýk
	private String featuredStory;
	private String contact;
	public CreateProfile() {
		super();
	}
	public CreateProfile(String shipment,String reelsVideos, String story, String live,String featuredStory, String contact) {
		super(shipment,reelsVideos,story,live);
		this.featuredStory = featuredStory;
		this.contact = contact;
	}
	public String getFeaturedStory() {
		return featuredStory;
	}
	public void setFeaturedStory(String featuredStory) {
		this.featuredStory = featuredStory;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
}
