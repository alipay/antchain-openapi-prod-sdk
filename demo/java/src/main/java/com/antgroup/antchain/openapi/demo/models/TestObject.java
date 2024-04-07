// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class TestObject extends TeaModel {
    // 主键
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static TestObject build(java.util.Map<String, ?> map) throws Exception {
        TestObject self = new TestObject();
        return TeaModel.build(map, self);
    }

    public TestObject setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public TestObject setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
