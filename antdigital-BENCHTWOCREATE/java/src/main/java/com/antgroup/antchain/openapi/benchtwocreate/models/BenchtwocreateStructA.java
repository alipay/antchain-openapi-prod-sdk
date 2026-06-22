// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.benchtwocreate.models;

import com.aliyun.tea.*;

public class BenchtwocreateStructA extends TeaModel {
    // 【名字】
    /**
     * <strong>example:</strong>
     * <p>建国</p>
     */
    @NameInMap("first_name")
    public String firstName;

    // 【姓】
    /**
     * <strong>example:</strong>
     * <p>张</p>
     */
    @NameInMap("last_name")
    public String lastName;

    public static BenchtwocreateStructA build(java.util.Map<String, ?> map) throws Exception {
        BenchtwocreateStructA self = new BenchtwocreateStructA();
        return TeaModel.build(map, self);
    }

    public BenchtwocreateStructA setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    public String getFirstName() {
        return this.firstName;
    }

    public BenchtwocreateStructA setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    public String getLastName() {
        return this.lastName;
    }

}
