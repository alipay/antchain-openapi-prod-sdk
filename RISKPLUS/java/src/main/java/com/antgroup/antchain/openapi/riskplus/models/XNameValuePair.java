// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class XNameValuePair extends TeaModel {
    // 键名
    /**
     * <strong>example:</strong>
     * <p>key</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 键值
    /**
     * <strong>example:</strong>
     * <p>value</p>
     */
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
