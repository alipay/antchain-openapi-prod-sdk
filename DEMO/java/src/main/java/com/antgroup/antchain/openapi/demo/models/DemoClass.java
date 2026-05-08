// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class DemoClass extends TeaModel {
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
    @Validation(required = true)
    public Long someInt;

    // 列表测试
    @NameInMap("some_list")
    @Validation(required = true)
    public java.util.List<String> someList;

    // test
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("some_object")
    @Validation(required = true)
    public AnotherClass someObject;

    public static DemoClass build(java.util.Map<String, ?> map) throws Exception {
        DemoClass self = new DemoClass();
        return TeaModel.build(map, self);
    }

    public DemoClass setSomeString(String someString) {
        this.someString = someString;
        return this;
    }
    public String getSomeString() {
        return this.someString;
    }

    public DemoClass setSomeDate(String someDate) {
        this.someDate = someDate;
        return this;
    }
    public String getSomeDate() {
        return this.someDate;
    }

    public DemoClass setSomeBoolean(Boolean someBoolean) {
        this.someBoolean = someBoolean;
        return this;
    }
    public Boolean getSomeBoolean() {
        return this.someBoolean;
    }

    public DemoClass setSomeInt(Long someInt) {
        this.someInt = someInt;
        return this;
    }
    public Long getSomeInt() {
        return this.someInt;
    }

    public DemoClass setSomeList(java.util.List<String> someList) {
        this.someList = someList;
        return this;
    }
    public java.util.List<String> getSomeList() {
        return this.someList;
    }

    public DemoClass setSomeObject(AnotherClass someObject) {
        this.someObject = someObject;
        return this;
    }
    public AnotherClass getSomeObject() {
        return this.someObject;
    }

}
