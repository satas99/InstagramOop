package InstagramOop;

public class Page { //Tüm sayfalarý bir sýnýfta topladýk

	private String pageName;

	public Page() {
		super();
	}

	public Page(String pageName) {
		super();
		this.pageName = pageName;
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}
	
}
