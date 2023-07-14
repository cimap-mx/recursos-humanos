package cimap.recursos_humanos.api;

import java.util.List;

public class PageRequest {

	public static final int PAGE_SIZE = 25;

	private String search;
	
	private Integer pageNumber;
	
	private FilterOptions filterOptions;
	
	private List<SortOption> sortOptions;

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public Integer getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public FilterOptions getFilterOptions() {
		return filterOptions;
	}

	public void setFilterOptions(FilterOptions filterOptions) {
		this.filterOptions = filterOptions;
	}

	public List<SortOption> getSortOptions() {
		return sortOptions;
	}

	public void setSortOptions(List<SortOption> sortOptions) {
		this.sortOptions = sortOptions;
	}
}
