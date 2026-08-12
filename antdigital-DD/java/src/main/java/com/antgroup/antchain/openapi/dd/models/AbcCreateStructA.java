// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class AbcCreateStructA extends TeaModel {
    // 【姓名】
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("name")
    public String name;

    // 【年龄】
    /**
     * <strong>example:</strong>
     * <p>18</p>
     */
    @NameInMap("age")
    public Long age;

    public static AbcCreateStructA build(java.util.Map<String, ?> map) throws Exception {
        AbcCreateStructA self = new AbcCreateStructA();
        return TeaModel.build(map, self);
    }

    public AbcCreateStructA setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AbcCreateStructA setAge(Long age) {
        this.age = age;
        return this;
    }
    public Long getAge() {
        return this.age;
    }

}
