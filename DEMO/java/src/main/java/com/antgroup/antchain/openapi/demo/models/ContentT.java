// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class ContentT extends TeaModel {
    // 1
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static ContentT build(java.util.Map<String, ?> map) throws Exception {
        ContentT self = new ContentT();
        return TeaModel.build(map, self);
    }

    public ContentT setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
