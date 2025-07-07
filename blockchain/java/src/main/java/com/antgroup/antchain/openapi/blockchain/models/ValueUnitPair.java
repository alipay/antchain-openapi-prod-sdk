// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ValueUnitPair extends TeaModel {
    // 数值
    @NameInMap("value")
    @Validation(required = true)
    public Long value;

    // 单位
    /**
     * <strong>example:</strong>
     * <p>d</p>
     */
    @NameInMap("unit")
    @Validation(required = true)
    public String unit;

    public static ValueUnitPair build(java.util.Map<String, ?> map) throws Exception {
        ValueUnitPair self = new ValueUnitPair();
        return TeaModel.build(map, self);
    }

    public ValueUnitPair setValue(Long value) {
        this.value = value;
        return this;
    }
    public Long getValue() {
        return this.value;
    }

    public ValueUnitPair setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

}
