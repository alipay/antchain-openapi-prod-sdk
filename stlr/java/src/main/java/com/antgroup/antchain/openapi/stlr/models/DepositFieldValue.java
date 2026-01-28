// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class DepositFieldValue extends TeaModel {
    // 存证数据字段名
    /**
     * <strong>example:</strong>
     * <p>distance</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 存证数据字段值
    /**
     * <strong>example:</strong>
     * <p>10.0</p>
     */
    @NameInMap("value")
    public String value;

    public static DepositFieldValue build(java.util.Map<String, ?> map) throws Exception {
        DepositFieldValue self = new DepositFieldValue();
        return TeaModel.build(map, self);
    }

    public DepositFieldValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DepositFieldValue setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
