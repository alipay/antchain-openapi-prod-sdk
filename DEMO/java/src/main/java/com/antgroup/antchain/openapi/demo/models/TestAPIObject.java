// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class TestAPIObject extends TeaModel {
    // test
    /**
     * <strong>example:</strong>
     * <p>21</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    public static TestAPIObject build(java.util.Map<String, ?> map) throws Exception {
        TestAPIObject self = new TestAPIObject();
        return TeaModel.build(map, self);
    }

    public TestAPIObject setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
