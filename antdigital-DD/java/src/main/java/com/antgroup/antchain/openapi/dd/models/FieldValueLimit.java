// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class FieldValueLimit extends TeaModel {
    // 枚举值，计量项为配置项的时候使用
    /**
     * <strong>example:</strong>
     * <p>code,中文名</p>
     */
    @NameInMap("value_list")
    public java.util.List<StringMap> valueList;

    // 范围value
    @NameInMap("range_value")
    public RangeValue rangeValue;

    // 范围类型
    /**
     * <strong>example:</strong>
     * <p>num</p>
     */
    @NameInMap("value_data_type")
    public String valueDataType;

    public static FieldValueLimit build(java.util.Map<String, ?> map) throws Exception {
        FieldValueLimit self = new FieldValueLimit();
        return TeaModel.build(map, self);
    }

    public FieldValueLimit setValueList(java.util.List<StringMap> valueList) {
        this.valueList = valueList;
        return this;
    }
    public java.util.List<StringMap> getValueList() {
        return this.valueList;
    }

    public FieldValueLimit setRangeValue(RangeValue rangeValue) {
        this.rangeValue = rangeValue;
        return this;
    }
    public RangeValue getRangeValue() {
        return this.rangeValue;
    }

    public FieldValueLimit setValueDataType(String valueDataType) {
        this.valueDataType = valueDataType;
        return this;
    }
    public String getValueDataType() {
        return this.valueDataType;
    }

}
