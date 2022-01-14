package InstagramOop;

public class Dm { //Dm kýsmý
	private String chats;
	private String calls;
	private String wants;
	public Dm() {
		super();
	}
	public Dm(String chats, String calls, String wants) {
		super();
		this.chats = chats;
		this.calls = calls;
		this.wants = wants;
	}
	public String getChats() {
		return chats;
	}
	public void setChats(String chats) {
		this.chats = chats;
	}
	public String getCalls() {
		return calls;
	}
	public void setCalls(String calls) {
		this.calls = calls;
	}
	public String getWants() {
		return wants;
	}
	public void setWants(String wants) {
		this.wants = wants;
	}
	
}
