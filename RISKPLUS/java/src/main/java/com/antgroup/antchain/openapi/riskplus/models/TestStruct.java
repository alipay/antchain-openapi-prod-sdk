// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class TestStruct extends TeaModel {
    // 测试
    @NameInMap("test_field")
    @Validation(required = true)
    public java.util.List<SecurityScene> testField;

    public static TestStruct build(java.util.Map<String, ?> map) throws Exception {
        TestStruct self = new TestStruct();
        return TeaModel.build(map, self);
    }

    public TestStruct setTestField(java.util.List<SecurityScene> testField) {
        this.testField = testField;
        return this;
    }
    public java.util.List<SecurityScene> getTestField() {
        return this.testField;
    }

}
