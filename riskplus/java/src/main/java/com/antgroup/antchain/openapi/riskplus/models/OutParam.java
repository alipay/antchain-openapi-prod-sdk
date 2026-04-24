// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class OutParam extends TeaModel {
    // 输出参数名称
    /**
     * <strong>example:</strong>
     * <p>creditLimit</p>
     */
    @NameInMap("name")
    public String name;

    // 输出参数值
    /**
     * <strong>example:</strong>
     * <p>19000</p>
     */
    @NameInMap("value")
    public String value;

    public static OutParam build(java.util.Map<String, ?> map) throws Exception {
        OutParam self = new OutParam();
        return TeaModel.build(map, self);
    }

    public OutParam setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OutParam setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
