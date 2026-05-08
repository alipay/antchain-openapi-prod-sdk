// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class DemoInfo extends TeaModel {
    // test
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 123
    /**
     * <strong>example:</strong>
     * <p>1123</p>
     */
    @NameInMap("testx")
    public ContentTest testx;

    public static DemoInfo build(java.util.Map<String, ?> map) throws Exception {
        DemoInfo self = new DemoInfo();
        return TeaModel.build(map, self);
    }

    public DemoInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DemoInfo setTestx(ContentTest testx) {
        this.testx = testx;
        return this;
    }
    public ContentTest getTestx() {
        return this.testx;
    }

}
