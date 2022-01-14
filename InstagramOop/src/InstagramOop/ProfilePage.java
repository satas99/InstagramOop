package InstagramOop;

public class ProfilePage extends Page { //Profil kýsmý
	private CreateProfile createProfile;// Profil içerisindeki oluþtur kýsmýný createProfile sýnýfýndan aldýk
	private int shipment;
	private int follower;
	private int followUp;
	private String[] shipmentImages;
	private String userName;
	private String profileImage;
	private String description;
	public ProfilePage() {
		super();
	}
	public ProfilePage(String pageName, CreateProfile createProfile, int shipment, int follower, int followUp, String[] shipmentImages,
			String userName, String profileImage, String description) {
		super(pageName);
		this.createProfile = createProfile;
		this.shipment = shipment;
		this.follower = follower;
		this.followUp = followUp;
		this.shipmentImages = shipmentImages;
		this.userName = userName;
		this.profileImage = profileImage;
		this.description = description;
	}
	public CreateProfile getCreateProfile() {
		return createProfile;
	}
	public void setCreateProfile(CreateProfile createProfile) {
		this.createProfile = createProfile;
	}
	public int getShipment() {
		return shipment;
	}
	public void setShipment(int shipment) {
		this.shipment = shipment;
	}
	public int getFollower() {
		return follower;
	}
	public void setFollower(int follower) {
		this.follower = follower;
	}
	public int getFollowUp() {
		return followUp;
	}
	public void setFollowUp(int followUp) {
		this.followUp = followUp;
	}
	public String[] getShipmentImages() {
		return shipmentImages;
	}
	public void setShipmentImages(String[] shipmentImages) {
		this.shipmentImages = shipmentImages;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getProfileImage() {
		return profileImage;
	}
	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	} 
	
}
