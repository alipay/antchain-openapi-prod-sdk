// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.qqq.models;

import com.aliyun.tea.*;

public class AbcDemoStruct extends TeaModel {
    // 字符串属性
    /**
     * <strong>example:</strong>
     * <p>str</p>
     */
    @NameInMap("some_string")
    @Validation(maxLength = 100, minLength = 10)
    public String someString;

    // Long型属性
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("some_number")
    @Validation(required = true, maximum = 100, minimum = 1)
    public Long someNumber;

    // 布尔型
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("some_boolean")
    @Validation(required = true)
    public Boolean someBoolean;

    // ISO8601格式字符串：yyyy-MM-dd_T_HH:mm:ss_Z_
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("some_date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String someDate;

    // 字符串数组
    /**
     * <strong>example:</strong>
     * <p>somestring</p>
     */
    @NameInMap("some_string_list")
    public java.util.List<String> someStringList;

    // 子结构体
    /**
     * <strong>example:</strong>
     * <p>{ &quot;name&quot;: &quot;value&quot; }</p>
     */
    @NameInMap("some_struct")
    @Validation(required = true)
    public SubDemoStruct someStruct;

    // 结构体数组
    /**
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;: &quot;value&quot;}]</p>
     */
    @NameInMap("some_struct_list")
    @Validation(required = true)
    public java.util.List<SubDemoStruct> someStructList;

    public static AbcDemoStruct build(java.util.Map<String, ?> map) throws Exception {
        AbcDemoStruct self = new AbcDemoStruct();
        return TeaModel.build(map, self);
    }

    public AbcDemoStruct setSomeString(String someString) {
        this.someString = someString;
        return this;
    }
    public String getSomeString() {
        return this.someString;
    }

    public AbcDemoStruct setSomeNumber(Long someNumber) {
        this.someNumber = someNumber;
        return this;
    }
    public Long getSomeNumber() {
        return this.someNumber;
    }

    public AbcDemoStruct setSomeBoolean(Boolean someBoolean) {
        this.someBoolean = someBoolean;
        return this;
    }
    public Boolean getSomeBoolean() {
        return this.someBoolean;
    }

    public AbcDemoStruct setSomeDate(String someDate) {
        this.someDate = someDate;
        return this;
    }
    public String getSomeDate() {
        return this.someDate;
    }

    public AbcDemoStruct setSomeStringList(java.util.List<String> someStringList) {
        this.someStringList = someStringList;
        return this;
    }
    public java.util.List<String> getSomeStringList() {
        return this.someStringList;
    }

    public AbcDemoStruct setSomeStruct(SubDemoStruct someStruct) {
        this.someStruct = someStruct;
        return this;
    }
    public SubDemoStruct getSomeStruct() {
        return this.someStruct;
    }

    public AbcDemoStruct setSomeStructList(java.util.List<SubDemoStruct> someStructList) {
        this.someStructList = someStructList;
        return this;
    }
    public java.util.List<SubDemoStruct> getSomeStructList() {
        return this.someStructList;
    }

}
