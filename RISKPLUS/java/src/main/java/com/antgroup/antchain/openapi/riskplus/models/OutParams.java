// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class OutParams extends TeaModel {
    // 输出参数
    /**
     * <strong>example:</strong>
     * <p>rate</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 参数描述
    /**
     * <strong>example:</strong>
     * <p>率利</p>
     */
    @NameInMap("desc")
    @Validation(required = true)
    public String desc;

    // 参数值
    /**
     * <strong>example:</strong>
     * <p>accept</p>
     */
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static OutParams build(java.util.Map<String, ?> map) throws Exception {
        OutParams self = new OutParams();
        return TeaModel.build(map, self);
    }

    public OutParams setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OutParams setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public OutParams setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
