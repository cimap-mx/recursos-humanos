package cimap.recursos_humanos.api;

import java.util.List;

public class FilterOptions {

	private String search;

	private List<FilterOperator> operators;

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public List<FilterOperator> getOperators() {
		return operators;
	}

	public void setOperators(List<FilterOperator> operators) {
		this.operators = operators;
	}
}
