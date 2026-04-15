// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class TestClass extends TeaModel {
    // 1
    /**
     * <strong>example:</strong>
     * <p>testclass</p>
     */
    @NameInMap("test")
    @Validation(required = true)
    public String test;

    // 2
    /**
     * <strong>example:</strong>
     * <p>testclass</p>
     */
    @NameInMap("demo")
    @Validation(required = true)
    public String demo;

    // 3
    /**
     * <strong>example:</strong>
     * <p>id2</p>
     */
    @NameInMap("demo1")
    @Validation(required = true)
    public String demo1;

    // 22
    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("demo2")
    @Validation(required = true)
    public String demo2;

    public static TestClass build(java.util.Map<String, ?> map) throws Exception {
        TestClass self = new TestClass();
        return TeaModel.build(map, self);
    }

    public TestClass setTest(String test) {
        this.test = test;
        return this;
    }
    public String getTest() {
        return this.test;
    }

    public TestClass setDemo(String demo) {
        this.demo = demo;
        return this;
    }
    public String getDemo() {
        return this.demo;
    }

    public TestClass setDemo1(String demo1) {
        this.demo1 = demo1;
        return this;
    }
    public String getDemo1() {
        return this.demo1;
    }

    public TestClass setDemo2(String demo2) {
        this.demo2 = demo2;
        return this;
    }
    public String getDemo2() {
        return this.demo2;
    }

}
