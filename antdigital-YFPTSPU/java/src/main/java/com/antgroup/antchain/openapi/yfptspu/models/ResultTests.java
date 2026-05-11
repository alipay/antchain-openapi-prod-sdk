// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yfptspu.models;

import com.aliyun.tea.*;

public class ResultTests extends TeaModel {
    // 姓名
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("name")
    public String name;

    // 年龄
    /**
     * <strong>example:</strong>
     * <p>18</p>
     */
    @NameInMap("age")
    @Validation(required = true)
    public String age;

    public static ResultTests build(java.util.Map<String, ?> map) throws Exception {
        ResultTests self = new ResultTests();
        return TeaModel.build(map, self);
    }

    public ResultTests setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ResultTests setAge(String age) {
        this.age = age;
        return this;
    }
    public String getAge() {
        return this.age;
    }

}
