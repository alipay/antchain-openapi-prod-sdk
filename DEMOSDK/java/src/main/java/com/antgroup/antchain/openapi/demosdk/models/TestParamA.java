// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdk.models;

import com.aliyun.tea.*;

public class TestParamA extends TeaModel {
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

    // struct_parama
    @NameInMap("struct_parama")
    @Validation(required = true)
    public TestParamB structParama;

    // 结构体列表a
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("struct_list_a")
    public java.util.List<TestParamB> structListA;

    public static TestParamA build(java.util.Map<String, ?> map) throws Exception {
        TestParamA self = new TestParamA();
        return TeaModel.build(map, self);
    }

    public TestParamA setStringParam(String stringParam) {
        this.stringParam = stringParam;
        return this;
    }
    public String getStringParam() {
        return this.stringParam;
    }

    public TestParamA setNumberParam(Long numberParam) {
        this.numberParam = numberParam;
        return this;
    }
    public Long getNumberParam() {
        return this.numberParam;
    }

    public TestParamA setBooleanParam(Boolean booleanParam) {
        this.booleanParam = booleanParam;
        return this;
    }
    public Boolean getBooleanParam() {
        return this.booleanParam;
    }

    public TestParamA setDateParam(String dateParam) {
        this.dateParam = dateParam;
        return this;
    }
    public String getDateParam() {
        return this.dateParam;
    }

    public TestParamA setStructParama(TestParamB structParama) {
        this.structParama = structParama;
        return this;
    }
    public TestParamB getStructParama() {
        return this.structParama;
    }

    public TestParamA setStructListA(java.util.List<TestParamB> structListA) {
        this.structListA = structListA;
        return this;
    }
    public java.util.List<TestParamB> getStructListA() {
        return this.structListA;
    }

}
