// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class BackflowEventRecordProperty extends TeaModel {
    // 属性code
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // 属性value，统一为字符串
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static BackflowEventRecordProperty build(java.util.Map<String, ?> map) throws Exception {
        BackflowEventRecordProperty self = new BackflowEventRecordProperty();
        return TeaModel.build(map, self);
    }

    public BackflowEventRecordProperty setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public BackflowEventRecordProperty setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
