// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_9620cd2b3b2f441d90280aee41564281.models;

import com.aliyun.tea.*;

public class NameValuePair extends TeaModel {
    // 键名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 键值
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
