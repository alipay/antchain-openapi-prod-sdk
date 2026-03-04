// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class TestClass extends TeaModel {
    // 字符串字段
    /**
     * <strong>example:</strong>
     * <p>string_param</p>
     */
    @NameInMap("string_param")
    @Validation(required = true)
    public String stringParam;

    // 数字字段
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("number_param")
    @Validation(required = true)
    public Long numberParam;

    // 布尔值参数
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("boolean_param")
    @Validation(required = true)
    public Boolean booleanParam;

    // 日期参数
    /**
     * <strong>example:</strong>
     * <p>2026-02-10T10:10:00Z</p>
     */
    @NameInMap("date_param")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String dateParam;

    // 数组参数
    /**
     * <strong>example:</strong>
     * <p>{a,b,c,d}</p>
     */
    @NameInMap("array_param")
    @Validation(required = true)
    public java.util.List<String> arrayParam;

    // 结构体参数
    @NameInMap("struct_param")
    @Validation(required = true)
    public DemoClass structParam;

    public static TestClass build(java.util.Map<String, ?> map) throws Exception {
        TestClass self = new TestClass();
        return TeaModel.build(map, self);
    }

    public TestClass setStringParam(String stringParam) {
        this.stringParam = stringParam;
        return this;
    }
    public String getStringParam() {
        return this.stringParam;
    }

    public TestClass setNumberParam(Long numberParam) {
        this.numberParam = numberParam;
        return this;
    }
    public Long getNumberParam() {
        return this.numberParam;
    }

    public TestClass setBooleanParam(Boolean booleanParam) {
        this.booleanParam = booleanParam;
        return this;
    }
    public Boolean getBooleanParam() {
        return this.booleanParam;
    }

    public TestClass setDateParam(String dateParam) {
        this.dateParam = dateParam;
        return this;
    }
    public String getDateParam() {
        return this.dateParam;
    }

    public TestClass setArrayParam(java.util.List<String> arrayParam) {
        this.arrayParam = arrayParam;
        return this;
    }
    public java.util.List<String> getArrayParam() {
        return this.arrayParam;
    }

    public TestClass setStructParam(DemoClass structParam) {
        this.structParam = structParam;
        return this;
    }
    public DemoClass getStructParam() {
        return this.structParam;
    }

}
