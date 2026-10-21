// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class CardInfo extends TeaModel {
    // 1
    @NameInMap("demo_info")
    @Validation(required = true)
    public DemoClass demoInfo;

    // 测试
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("name")
    public String name;

    public static CardInfo build(java.util.Map<String, ?> map) throws Exception {
        CardInfo self = new CardInfo();
        return TeaModel.build(map, self);
    }

    public CardInfo setDemoInfo(DemoClass demoInfo) {
        this.demoInfo = demoInfo;
        return this;
    }
    public DemoClass getDemoInfo() {
        return this.demoInfo;
    }

    public CardInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
