// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaasspi.models;

import com.aliyun.tea.*;

public class FilterCondition extends TeaModel {
    // 过滤列
    /**
     * <strong>example:</strong>
     * <p>biz_date</p>
     */
    @NameInMap("filter_column")
    @Validation(required = true)
    public String filterColumn;

    // 过滤方式
    /**
     * <strong>example:</strong>
     * <p>BETWEEN</p>
     */
    @NameInMap("filter_type")
    public String filterType;

    // 值列表
    /**
     * <strong>example:</strong>
     * <p>[&quot;20240303&quot;, &quot;20250303&quot;]</p>
     */
    @NameInMap("value_list")
    @Validation(required = true)
    public java.util.List<String> valueList;

    public static FilterCondition build(java.util.Map<String, ?> map) throws Exception {
        FilterCondition self = new FilterCondition();
        return TeaModel.build(map, self);
    }

    public FilterCondition setFilterColumn(String filterColumn) {
        this.filterColumn = filterColumn;
        return this;
    }
    public String getFilterColumn() {
        return this.filterColumn;
    }

    public FilterCondition setFilterType(String filterType) {
        this.filterType = filterType;
        return this;
    }
    public String getFilterType() {
        return this.filterType;
    }

    public FilterCondition setValueList(java.util.List<String> valueList) {
        this.valueList = valueList;
        return this;
    }
    public java.util.List<String> getValueList() {
        return this.valueList;
    }

}
