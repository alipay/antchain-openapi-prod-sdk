// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class SLSLogContent extends TeaModel {
    // 键名
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // 键值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static SLSLogContent build(java.util.Map<String, ?> map) throws Exception {
        SLSLogContent self = new SLSLogContent();
        return TeaModel.build(map, self);
    }

    public SLSLogContent setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public SLSLogContent setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
