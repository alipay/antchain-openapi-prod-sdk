// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class LeaseOrderExtra extends TeaModel {
    // 额外信息的主键
    /**
     * <strong>example:</strong>
     * <p>&quot;key&quot;</p>
     */
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // 额外信息的值
    /**
     * <strong>example:</strong>
     * <p>&quot;value&quot;</p>
     */
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static LeaseOrderExtra build(java.util.Map<String, ?> map) throws Exception {
        LeaseOrderExtra self = new LeaseOrderExtra();
        return TeaModel.build(map, self);
    }

    public LeaseOrderExtra setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public LeaseOrderExtra setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
