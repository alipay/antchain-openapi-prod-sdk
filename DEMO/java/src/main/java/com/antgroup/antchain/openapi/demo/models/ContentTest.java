// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class ContentTest extends TeaModel {
    // name
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static ContentTest build(java.util.Map<String, ?> map) throws Exception {
        ContentTest self = new ContentTest();
        return TeaModel.build(map, self);
    }

    public ContentTest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
