// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class CardInfos extends TeaModel {
    // x
    @NameInMap("domian_info")
    @Validation(required = true)
    public Identity domianInfo;

    // 12
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("test")
    @Validation(required = true)
    public String test;

    public static CardInfos build(java.util.Map<String, ?> map) throws Exception {
        CardInfos self = new CardInfos();
        return TeaModel.build(map, self);
    }

    public CardInfos setDomianInfo(Identity domianInfo) {
        this.domianInfo = domianInfo;
        return this;
    }
    public Identity getDomianInfo() {
        return this.domianInfo;
    }

    public CardInfos setTest(String test) {
        this.test = test;
        return this;
    }
    public String getTest() {
        return this.test;
    }

}
