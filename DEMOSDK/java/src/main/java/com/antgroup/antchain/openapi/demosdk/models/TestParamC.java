// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdk.models;

import com.aliyun.tea.*;

public class TestParamC extends TeaModel {
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

    // string
    @NameInMap("array_param")
    public java.util.List<String> arrayParam;

    public static TestParamC build(java.util.Map<String, ?> map) throws Exception {
        TestParamC self = new TestParamC();
        return TeaModel.build(map, self);
    }

    public TestParamC setStringParam(String stringParam) {
        this.stringParam = stringParam;
        return this;
    }
    public String getStringParam() {
        return this.stringParam;
    }

    public TestParamC setNumberParam(Long numberParam) {
        this.numberParam = numberParam;
        return this;
    }
    public Long getNumberParam() {
        return this.numberParam;
    }

    public TestParamC setBooleanParam(Boolean booleanParam) {
        this.booleanParam = booleanParam;
        return this;
    }
    public Boolean getBooleanParam() {
        return this.booleanParam;
    }

    public TestParamC setDateParam(String dateParam) {
        this.dateParam = dateParam;
        return this;
    }
    public String getDateParam() {
        return this.dateParam;
    }

    public TestParamC setArrayParam(java.util.List<String> arrayParam) {
        this.arrayParam = arrayParam;
        return this;
    }
    public java.util.List<String> getArrayParam() {
        return this.arrayParam;
    }

}
