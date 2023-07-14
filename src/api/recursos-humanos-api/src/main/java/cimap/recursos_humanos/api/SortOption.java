package cimap.recursos_humanos.api;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

public class SortOption {

private String column;
	
	private SortOrder order;
	
	public static Sort toSort(List<SortOption> sortOptions) {
		Sort sort = null;
		for(SortOption sortOption : sortOptions) {
			Direction direction = Direction.ASC;
			if(sortOption.getOrder() == SortOrder.DESC) {
				direction = Direction.DESC;
			}
			String property = sortOption.getColumn();
			// Convertir la primera letra en minuscula
			property = property.substring(0, 1).toLowerCase() + property.substring(1);
			if(sort == null) {				
				sort = Sort.by(direction, property);
			} else {
				sort = sort.and(Sort.by(direction, property));
			}			
		}
		return sort;
	}

	public String getColumn() {
		return column;
	}

	public void setColumn(String column) {
		this.column = column;
	}

	public SortOrder getOrder() {
		return order;
	}

	public void setOrder(SortOrder order) {
		this.order = order;
	}
}
