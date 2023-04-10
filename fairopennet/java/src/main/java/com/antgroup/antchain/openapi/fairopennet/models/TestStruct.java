// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class TestStruct extends TeaModel {
    // 测试名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 消息体
    @NameInMap("msg")
    @Validation(required = true)
    public String msg;

    public static TestStruct build(java.util.Map<String, ?> map) throws Exception {
        TestStruct self = new TestStruct();
        return TeaModel.build(map, self);
    }

    public TestStruct setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TestStruct setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

}
