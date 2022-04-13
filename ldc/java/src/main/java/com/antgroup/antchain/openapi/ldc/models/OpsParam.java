// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class OpsParam extends TeaModel {
    // 部署参数键值
    @NameInMap("key")
    public String key;

    // 部署参数值
    @NameInMap("value")
    public String value;

    public static OpsParam build(java.util.Map<String, ?> map) throws Exception {
        OpsParam self = new OpsParam();
        return TeaModel.build(map, self);
    }

    public OpsParam setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public OpsParam setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
