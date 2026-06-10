// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosy.models;

import com.aliyun.tea.*;

public class DemoClasses extends TeaModel {
    // 字符串测试
    /**
     * <strong>example:</strong>
     * <p>some string</p>
     */
    @NameInMap("some_string")
    @Validation(required = true)
    public String someString;

    // 日期测试
    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("some_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String someDate;

    // Boolean测试
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("some_boolean")
    @Validation(required = true)
    public Boolean someBoolean;

    // 整数测试
    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("some_int")
    @Validation(required = true, maximum = 2000, minimum = 1)
    public Long someInt;

    // 列表测试
    @NameInMap("some_list")
    @Validation(required = true)
    public java.util.List<String> someList;

    public static DemoClasses build(java.util.Map<String, ?> map) throws Exception {
        DemoClasses self = new DemoClasses();
        return TeaModel.build(map, self);
    }

    public DemoClasses setSomeString(String someString) {
        this.someString = someString;
        return this;
    }
    public String getSomeString() {
        return this.someString;
    }

    public DemoClasses setSomeDate(String someDate) {
        this.someDate = someDate;
        return this;
    }
    public String getSomeDate() {
        return this.someDate;
    }

    public DemoClasses setSomeBoolean(Boolean someBoolean) {
        this.someBoolean = someBoolean;
        return this;
    }
    public Boolean getSomeBoolean() {
        return this.someBoolean;
    }

    public DemoClasses setSomeInt(Long someInt) {
        this.someInt = someInt;
        return this;
    }
    public Long getSomeInt() {
        return this.someInt;
    }

    public DemoClasses setSomeList(java.util.List<String> someList) {
        this.someList = someList;
        return this;
    }
    public java.util.List<String> getSomeList() {
        return this.someList;
    }

}
