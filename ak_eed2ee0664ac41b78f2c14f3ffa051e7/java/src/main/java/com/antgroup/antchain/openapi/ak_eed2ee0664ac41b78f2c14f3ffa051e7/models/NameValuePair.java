// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_eed2ee0664ac41b78f2c14f3ffa051e7.models;

import com.aliyun.tea.*;

public class NameValuePair extends TeaModel {
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
