package org.trishinfotech.javaenums.sorting;

import java.util.Comparator;
import java.util.List;

public class StudentComparator implements Comparator<Student> {
	private SortingFieldsOrderBean orderBean;

	public StudentComparator(final SortingFieldsOrderBean orderBean) {
		super();
		if (orderBean == null || orderBean.getFieldsInOrder() == null || orderBean.getFieldsInOrder().isEmpty()) {
			throw new IllegalArgumentException("SortingFieldsOrderBean can't be null or empty");
		}
		this.orderBean = orderBean;
	}

	@Override
	public int compare(Student student1, Student student2) {
		List<SortingFieldOrder> orderFields = orderBean.getFieldsInOrder();
		return compareInFieldOrder(orderFields, student1, student2);
	}

	// recursive method to perform sorting on multiple fields and order.
	private int compareInFieldOrder(final List<SortingFieldOrder> orderFields, final Student student1,
			final Student student2) {
		SortingFieldOrder fieldOrder = orderFields.get(0);
		SortingField field = fieldOrder.getSortingField();
		SortingOrder order = fieldOrder.getSortingOrder();
		int comparisonResult = field.compare(student1, student2, order);
		// we check if the objects are same on the field comparison;
		// if yes and there are any remaining fields to compare
		// we call the method recursively by taking the sublist of order fields.
		if (comparisonResult == 0 && orderFields.size() > 1) {
			return compareInFieldOrder(orderFields.subList(1, orderFields.size()), student1, student2);
		}
		return comparisonResult;
	}
}