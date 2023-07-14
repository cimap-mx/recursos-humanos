package cimap.recursos_humanos.api;

import java.util.ArrayList;
import java.util.List;

public class PageList<T> {

private Integer pageIndex;
	
	private Integer totalPages;
	
	private Integer totalElements;
		
	private List<T> items = new ArrayList<>();

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public Integer getTotalItems() {
		return items.size();
	}

	public List<T> getItems() {
		return items;
	}
	
	public void setItems(List<T> items) {
		this.items = items;
	}

	public Integer getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(Integer totalElements) {
		this.totalElements = totalElements;
	}
}
