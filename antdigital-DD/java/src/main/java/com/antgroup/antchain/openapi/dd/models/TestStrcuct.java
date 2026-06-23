// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class TestStrcuct extends TeaModel {
    // ss
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("name")
    public String name;

    public static TestStrcuct build(java.util.Map<String, ?> map) throws Exception {
        TestStrcuct self = new TestStrcuct();
        return TeaModel.build(map, self);
    }

    public TestStrcuct setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
