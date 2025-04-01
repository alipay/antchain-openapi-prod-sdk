// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class XNameValuePair extends TeaModel {
    // 键名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 键值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static XNameValuePair build(java.util.Map<String, ?> map) throws Exception {
        XNameValuePair self = new XNameValuePair();
        return TeaModel.build(map, self);
    }

    public XNameValuePair setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public XNameValuePair setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
