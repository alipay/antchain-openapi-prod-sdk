// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_b08c548e3a88469c89fe27adc3d0b925.models;

import com.aliyun.tea.*;

public class NameValuePair extends TeaModel {
    // 字段名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 字段值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static NameValuePair build(java.util.Map<String, ?> map) throws Exception {
        NameValuePair self = new NameValuePair();
        return TeaModel.build(map, self);
    }

    public NameValuePair setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public NameValuePair setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
