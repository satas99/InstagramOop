package InstagramOop;

public class StorePage extends Page {//Maðaza sayfasý
	private String search;
	private String[] Categories;
	private String[] Products;
	public StorePage() {
		super();
	}
	public StorePage(String pageName, String search, String[] categories, String[] products) {
		super(pageName);
		this.search = search;
		Categories = categories;
		Products = products;
	}
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	public String[] getCategories() {
		return Categories;
	}
	public void setCategories(String[] categories) {
		Categories = categories;
	}
	public String[] getProducts() {
		return Products;
	}
	public void setProducts(String[] products) {
		Products = products;
	}
	
}
