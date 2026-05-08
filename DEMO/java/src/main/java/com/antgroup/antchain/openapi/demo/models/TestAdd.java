// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class TestAdd extends TeaModel {
    // 测试
    /**
     * <strong>example:</strong>
     * <p>测试</p>
     */
    @NameInMap("name")
    public String name;

    public static TestAdd build(java.util.Map<String, ?> map) throws Exception {
        TestAdd self = new TestAdd();
        return TeaModel.build(map, self);
    }

    public TestAdd setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
