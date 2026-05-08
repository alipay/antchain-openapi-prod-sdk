// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class Content extends TeaModel {
    // name
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 1
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    public static Content build(java.util.Map<String, ?> map) throws Exception {
        Content self = new Content();
        return TeaModel.build(map, self);
    }

    public Content setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Content setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
