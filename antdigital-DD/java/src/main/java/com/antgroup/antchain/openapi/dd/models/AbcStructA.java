// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class AbcStructA extends TeaModel {
    // string_a
    /**
     * <strong>example:</strong>
     * <p>string</p>
     */
    @NameInMap("string_param_a")
    public String stringParamA;

    // number_a
    /**
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("number_param_a")
    public Long numberParamA;

    // boolean_a
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("boolean_param_a")
    public Boolean booleanParamA;

    // date_a
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("date_param_a")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String dateParamA;

    // struct_a
    /**
     * <strong>example:</strong>
     * <p>struct_param</p>
     */
    @NameInMap("struct_param_a")
    public AbcStructB structParamA;

    public static AbcStructA build(java.util.Map<String, ?> map) throws Exception {
        AbcStructA self = new AbcStructA();
        return TeaModel.build(map, self);
    }

    public AbcStructA setStringParamA(String stringParamA) {
        this.stringParamA = stringParamA;
        return this;
    }
    public String getStringParamA() {
        return this.stringParamA;
    }

    public AbcStructA setNumberParamA(Long numberParamA) {
        this.numberParamA = numberParamA;
        return this;
    }
    public Long getNumberParamA() {
        return this.numberParamA;
    }

    public AbcStructA setBooleanParamA(Boolean booleanParamA) {
        this.booleanParamA = booleanParamA;
        return this;
    }
    public Boolean getBooleanParamA() {
        return this.booleanParamA;
    }

    public AbcStructA setDateParamA(String dateParamA) {
        this.dateParamA = dateParamA;
        return this;
    }
    public String getDateParamA() {
        return this.dateParamA;
    }

    public AbcStructA setStructParamA(AbcStructB structParamA) {
        this.structParamA = structParamA;
        return this;
    }
    public AbcStructB getStructParamA() {
        return this.structParamA;
    }

}
