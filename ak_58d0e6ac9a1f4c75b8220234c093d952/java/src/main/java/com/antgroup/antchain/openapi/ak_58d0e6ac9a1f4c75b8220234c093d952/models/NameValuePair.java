// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_58d0e6ac9a1f4c75b8220234c093d952.models;

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
