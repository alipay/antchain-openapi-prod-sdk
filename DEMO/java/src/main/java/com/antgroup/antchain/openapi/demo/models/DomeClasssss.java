// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class DomeClasssss extends TeaModel {
    // test
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static DomeClasssss build(java.util.Map<String, ?> map) throws Exception {
        DomeClasssss self = new DomeClasssss();
        return TeaModel.build(map, self);
    }

    public DomeClasssss setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
