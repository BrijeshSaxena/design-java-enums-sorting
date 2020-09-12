package org.trishinfotech.javaenums.sorting;

import java.util.ArrayList;
import java.util.List;

public class SortingFieldsOrderBean {
      private List<SortingFieldOrder> fieldsOrder = new ArrayList<SortingFieldOrder>();
      public SortingFieldsOrderBean() {
      super();
      }
      // To Create SortingFieldOrder in ASC or DESC order
      public synchronized SortingFieldsOrderBean addField(final SortingFieldOrder fieldOrder) {
            // contains will check the implemented equals method of SortingFieldOrder
            // and will make sure that we have not added any SortingField twice.
            if (!fieldsOrder.contains(fieldOrder)) {
            fieldsOrder.add(fieldOrder);
            }
            return this;
      }
      // To Create SortingFieldOrder in ASC order
      public synchronized SortingFieldsOrderBean addField(final SortingField field) {
            SortingFieldOrder fieldOrder = new SortingFieldOrder(field);
            if (!fieldsOrder.contains(fieldOrder)) {
            fieldsOrder.add(fieldOrder);
            }
            return this;
      }
      // To Create SortingFieldOrder in ASC or DESC order
      public synchronized SortingFieldsOrderBean addField(final SortingField field, final SortingOrder order) {
            SortingFieldOrder fieldOrder = new SortingFieldOrder(field, order);
            if (!fieldsOrder.contains(fieldOrder)) {
            fieldsOrder.add(fieldOrder);
            }
            return this;
      }
      public List<SortingFieldOrder> getFieldsInOrder() {
      return fieldsOrder;
      }
      @Override
      public String toString() {
      return "SortingFieldsOrderBean [fieldsOrder=" + fieldsOrder + "]";
      }
}
