package InstagramOop;
//Ana Sayfa
public class HomePage extends Page {
	private Dm dm; //Anasayfadaki dm kutusunu dm sýnýfýndan aldýk
	private CreateHome createHome; // Anasayfa içerisindeki oluþtur kýsmýný CreateHome sýnýfýndan aldýk
	public HomePage() {
		super();
	}
	public HomePage(String pageName, Dm dm, CreateHome createHome) {
		super(pageName);
		this.dm = dm;
		this.createHome = createHome;
	}
	public Dm getDm() {
		return dm;
	}
	public void setDm(Dm dm) {
		this.dm = dm;
	}
	public CreateHome getCreateHome() {
		return createHome;
	}
	public void setCreateHome(CreateHome createHome) {
		this.createHome = createHome;
	}
	
}
