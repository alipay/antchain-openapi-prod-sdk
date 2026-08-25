// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class Component extends TeaModel {
    // 名称
    /**
     * <strong>example:</strong>
     * <p>DATA_DISK_SIZE</p>
     */
    @NameInMap("name")
    public String name;

    // 单位
    /**
     * <strong>example:</strong>
     * <p>GB</p>
     */
    @NameInMap("unit")
    public String unit;

    // 值
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("value")
    public String value;

    public static Component build(java.util.Map<String, ?> map) throws Exception {
        Component self = new Component();
        return TeaModel.build(map, self);
    }

    public Component setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Component setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public Component setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
