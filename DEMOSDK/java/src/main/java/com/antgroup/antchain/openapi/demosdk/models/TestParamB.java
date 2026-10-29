// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdk.models;

import com.aliyun.tea.*;

public class TestParamB extends TeaModel {
    // string_param
    /**
     * <strong>example:</strong>
     * <p>string_param</p>
     */
    @NameInMap("string_param")
    public String stringParam;

    // number_param
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("number_param")
    public Long numberParam;

    // boolean_param
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("boolean_param")
    public Boolean booleanParam;

    // date_param
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("date_param")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String dateParam;

    // struct_param
    @NameInMap("struct_param")
    @Validation(required = true)
    public TestParamC structParam;

    // aa
    /**
     * <strong>example:</strong>
     * <p>3000</p>
     */
    @NameInMap("struct_list_b")
    public TestParamC structListB;

    public static TestParamB build(java.util.Map<String, ?> map) throws Exception {
        TestParamB self = new TestParamB();
        return TeaModel.build(map, self);
    }

    public TestParamB setStringParam(String stringParam) {
        this.stringParam = stringParam;
        return this;
    }
    public String getStringParam() {
        return this.stringParam;
    }

    public TestParamB setNumberParam(Long numberParam) {
        this.numberParam = numberParam;
        return this;
    }
    public Long getNumberParam() {
        return this.numberParam;
    }

    public TestParamB setBooleanParam(Boolean booleanParam) {
        this.booleanParam = booleanParam;
        return this;
    }
    public Boolean getBooleanParam() {
        return this.booleanParam;
    }

    public TestParamB setDateParam(String dateParam) {
        this.dateParam = dateParam;
        return this;
    }
    public String getDateParam() {
        return this.dateParam;
    }

    public TestParamB setStructParam(TestParamC structParam) {
        this.structParam = structParam;
        return this;
    }
    public TestParamC getStructParam() {
        return this.structParam;
    }

    public TestParamB setStructListB(TestParamC structListB) {
        this.structListB = structListB;
        return this;
    }
    public TestParamC getStructListB() {
        return this.structListB;
    }

}
