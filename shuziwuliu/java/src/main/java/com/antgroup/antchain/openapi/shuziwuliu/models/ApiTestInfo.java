// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ApiTestInfo extends TeaModel {
    // 测试String
    @NameInMap("test_string")
    @Validation(required = true, maxLength = 100)
    public String testString;

    // 测试Int
    @NameInMap("test_int")
    @Validation(required = true, maximum = 100)
    public Long testInt;

    // 测试Integer
    @NameInMap("test_integer")
    @Validation(required = true, maximum = 100)
    public Long testInteger;

    // 测试Long
    @NameInMap("test_long")
    @Validation(required = true, maximum = 100)
    public Long testLong;

    // 测试Boolean
    @NameInMap("test_boolean")
    @Validation(required = true)
    public Boolean testBoolean;

    // 测试Date
    @NameInMap("test_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String testDate;

    public static ApiTestInfo build(java.util.Map<String, ?> map) throws Exception {
        ApiTestInfo self = new ApiTestInfo();
        return TeaModel.build(map, self);
    }

    public ApiTestInfo setTestString(String testString) {
        this.testString = testString;
        return this;
    }
    public String getTestString() {
        return this.testString;
    }

    public ApiTestInfo setTestInt(Long testInt) {
        this.testInt = testInt;
        return this;
    }
    public Long getTestInt() {
        return this.testInt;
    }

    public ApiTestInfo setTestInteger(Long testInteger) {
        this.testInteger = testInteger;
        return this;
    }
    public Long getTestInteger() {
        return this.testInteger;
    }

    public ApiTestInfo setTestLong(Long testLong) {
        this.testLong = testLong;
        return this;
    }
    public Long getTestLong() {
        return this.testLong;
    }

    public ApiTestInfo setTestBoolean(Boolean testBoolean) {
        this.testBoolean = testBoolean;
        return this;
    }
    public Boolean getTestBoolean() {
        return this.testBoolean;
    }

    public ApiTestInfo setTestDate(String testDate) {
        this.testDate = testDate;
        return this;
    }
    public String getTestDate() {
        return this.testDate;
    }

}
