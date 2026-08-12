// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class AbcStructB extends TeaModel {
    // string_b
    /**
     * <strong>example:</strong>
     * <p>string_b</p>
     */
    @NameInMap("string_param_b")
    public String stringParamB;

    // number_b
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("number_param_b")
    public Long numberParamB;

    // boolean_b
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("boolean_param_b")
    public Boolean booleanParamB;

    // date_b
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("date_param_b")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String dateParamB;

    // array_b
    /**
     * <strong>example:</strong>
     * <p>array_param</p>
     */
    @NameInMap("array_param_b")
    public java.util.List<AbcStructC> arrayParamB;

    // struct_b
    /**
     * <strong>example:</strong>
     * <p>struct_param</p>
     */
    @NameInMap("struct_param_b")
    public AbcStructC structParamB;

    public static AbcStructB build(java.util.Map<String, ?> map) throws Exception {
        AbcStructB self = new AbcStructB();
        return TeaModel.build(map, self);
    }

    public AbcStructB setStringParamB(String stringParamB) {
        this.stringParamB = stringParamB;
        return this;
    }
    public String getStringParamB() {
        return this.stringParamB;
    }

    public AbcStructB setNumberParamB(Long numberParamB) {
        this.numberParamB = numberParamB;
        return this;
    }
    public Long getNumberParamB() {
        return this.numberParamB;
    }

    public AbcStructB setBooleanParamB(Boolean booleanParamB) {
        this.booleanParamB = booleanParamB;
        return this;
    }
    public Boolean getBooleanParamB() {
        return this.booleanParamB;
    }

    public AbcStructB setDateParamB(String dateParamB) {
        this.dateParamB = dateParamB;
        return this;
    }
    public String getDateParamB() {
        return this.dateParamB;
    }

    public AbcStructB setArrayParamB(java.util.List<AbcStructC> arrayParamB) {
        this.arrayParamB = arrayParamB;
        return this;
    }
    public java.util.List<AbcStructC> getArrayParamB() {
        return this.arrayParamB;
    }

    public AbcStructB setStructParamB(AbcStructC structParamB) {
        this.structParamB = structParamB;
        return this;
    }
    public AbcStructC getStructParamB() {
        return this.structParamB;
    }

}
