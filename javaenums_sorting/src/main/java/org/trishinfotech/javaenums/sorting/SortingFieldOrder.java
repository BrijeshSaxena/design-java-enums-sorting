package org.trishinfotech.javaenums.sorting;

public class SortingFieldOrder {
	private SortingField sortingField;
	private SortingOrder sortingOrder;

	public SortingFieldOrder() {
		super();
	}

	public SortingFieldOrder(final SortingField sortingField) {
		this();
		this.sortingField = sortingField;
	}

	public SortingFieldOrder(final SortingField sortingField, final SortingOrder sortingOrder) {
		this(sortingField);
		this.sortingOrder = sortingOrder;
	}

	public SortingField getSortingField() {
		return sortingField;
	}

	public void setSortingField(SortingField sortingField) {
		this.sortingField = sortingField;
	}

	public SortingOrder getSortingOrder() {
		return sortingOrder;
	}

	public void setSortingOrder(SortingOrder sortingOrder) {
		this.sortingOrder = sortingOrder;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sortingField == null) ? 0 : sortingField.hashCode());
		return result;
	}

	// checked only for SortingField to make sure that we can't add any field twice.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SortingFieldOrder other = (SortingFieldOrder) obj;
		if (sortingField != other.sortingField)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SortingFieldOrder [sortingField=").append(sortingField).append(", sortingOrder=")
				.append(sortingOrder).append("]");
		return builder.toString();
	}
}