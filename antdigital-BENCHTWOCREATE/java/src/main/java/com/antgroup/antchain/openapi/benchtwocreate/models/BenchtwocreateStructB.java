// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.benchtwocreate.models;

import com.aliyun.tea.*;

public class BenchtwocreateStructB extends TeaModel {
    // 【年龄】
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("age")
    public Long age;

    // 【性别】
    /**
     * <strong>example:</strong>
     * <p>男</p>
     */
    @NameInMap("gender")
    public String gender;

    public static BenchtwocreateStructB build(java.util.Map<String, ?> map) throws Exception {
        BenchtwocreateStructB self = new BenchtwocreateStructB();
        return TeaModel.build(map, self);
    }

    public BenchtwocreateStructB setAge(Long age) {
        this.age = age;
        return this;
    }
    public Long getAge() {
        return this.age;
    }

    public BenchtwocreateStructB setGender(String gender) {
        this.gender = gender;
        return this;
    }
    public String getGender() {
        return this.gender;
    }

}
