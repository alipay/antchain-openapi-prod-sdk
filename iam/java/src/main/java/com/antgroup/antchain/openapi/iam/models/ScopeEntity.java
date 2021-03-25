// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class ScopeEntity extends TeaModel {
    @NameInMap("key")
    public String key;

    @NameInMap("value")
    public String value;

    public static ScopeEntity build(java.util.Map<String, ?> map) throws Exception {
        ScopeEntity self = new ScopeEntity();
        return TeaModel.build(map, self);
    }

    public ScopeEntity setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ScopeEntity setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
