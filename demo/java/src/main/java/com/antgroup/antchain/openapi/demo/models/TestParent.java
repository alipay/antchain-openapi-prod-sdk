// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class TestParent extends TeaModel {
    // d
    /**
     * <strong>example:</strong>
     * <p>d</p>
     */
    @NameInMap("bbb")
    @Validation(required = true)
    public Test bbb;

    public static TestParent build(java.util.Map<String, ?> map) throws Exception {
        TestParent self = new TestParent();
        return TeaModel.build(map, self);
    }

    public TestParent setBbb(Test bbb) {
        this.bbb = bbb;
        return this;
    }
    public Test getBbb() {
        return this.bbb;
    }

}
