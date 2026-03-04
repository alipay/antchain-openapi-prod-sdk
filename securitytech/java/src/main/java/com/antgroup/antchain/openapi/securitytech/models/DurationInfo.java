// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class DurationInfo extends TeaModel {
    // 时长
    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    // 时间单位
    /**
     * <strong>example:</strong>
     * <p>h</p>
     */
    @NameInMap("unit")
    @Validation(required = true)
    public String unit;

    public static DurationInfo build(java.util.Map<String, ?> map) throws Exception {
        DurationInfo self = new DurationInfo();
        return TeaModel.build(map, self);
    }

    public DurationInfo setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public DurationInfo setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

}
