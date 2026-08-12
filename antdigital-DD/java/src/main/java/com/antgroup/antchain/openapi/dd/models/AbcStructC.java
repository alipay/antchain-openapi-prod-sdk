// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class AbcStructC extends TeaModel {
    // string_c
    /**
     * <strong>example:</strong>
     * <p>string_c</p>
     */
    @NameInMap("string_param_c")
    public String stringParamC;

    // number_c
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("number_param_c")
    public Long numberParamC;

    // boolean_c
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("boolean_param_c")
    public Boolean booleanParamC;

    // date_c
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("date_param_c")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String dateParamC;

    // string_c
    /**
     * <strong>example:</strong>
     * <p>string_c</p>
     */
    @NameInMap("array_param_c")
    public java.util.List<String> arrayParamC;

    public static AbcStructC build(java.util.Map<String, ?> map) throws Exception {
        AbcStructC self = new AbcStructC();
        return TeaModel.build(map, self);
    }

    public AbcStructC setStringParamC(String stringParamC) {
        this.stringParamC = stringParamC;
        return this;
    }
    public String getStringParamC() {
        return this.stringParamC;
    }

    public AbcStructC setNumberParamC(Long numberParamC) {
        this.numberParamC = numberParamC;
        return this;
    }
    public Long getNumberParamC() {
        return this.numberParamC;
    }

    public AbcStructC setBooleanParamC(Boolean booleanParamC) {
        this.booleanParamC = booleanParamC;
        return this;
    }
    public Boolean getBooleanParamC() {
        return this.booleanParamC;
    }

    public AbcStructC setDateParamC(String dateParamC) {
        this.dateParamC = dateParamC;
        return this;
    }
    public String getDateParamC() {
        return this.dateParamC;
    }

    public AbcStructC setArrayParamC(java.util.List<String> arrayParamC) {
        this.arrayParamC = arrayParamC;
        return this;
    }
    public java.util.List<String> getArrayParamC() {
        return this.arrayParamC;
    }

}
