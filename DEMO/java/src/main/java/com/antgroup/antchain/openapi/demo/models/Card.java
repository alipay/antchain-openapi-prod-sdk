// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class Card extends TeaModel {
    // 卡片名称
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("name")
    public String name;

    public static Card build(java.util.Map<String, ?> map) throws Exception {
        Card self = new Card();
        return TeaModel.build(map, self);
    }

    public Card setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
