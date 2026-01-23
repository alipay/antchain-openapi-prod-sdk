// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class TestParentParent extends TeaModel {
    // fff
    /**
     * <strong>example:</strong>
     * <p>fff</p>
     */
    @NameInMap("ssss")
    @Validation(required = true)
    public TestParent ssss;

    public static TestParentParent build(java.util.Map<String, ?> map) throws Exception {
        TestParentParent self = new TestParentParent();
        return TeaModel.build(map, self);
    }

    public TestParentParent setSsss(TestParent ssss) {
        this.ssss = ssss;
        return this;
    }
    public TestParent getSsss() {
        return this.ssss;
    }

}
