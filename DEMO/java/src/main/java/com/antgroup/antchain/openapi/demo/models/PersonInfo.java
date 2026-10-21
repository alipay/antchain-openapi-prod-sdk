// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class PersonInfo extends TeaModel {
    // 1
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("card_infos")
    @Validation(required = true)
    public CardInfos cardInfos;

    // 123
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static PersonInfo build(java.util.Map<String, ?> map) throws Exception {
        PersonInfo self = new PersonInfo();
        return TeaModel.build(map, self);
    }

    public PersonInfo setCardInfos(CardInfos cardInfos) {
        this.cardInfos = cardInfos;
        return this;
    }
    public CardInfos getCardInfos() {
        return this.cardInfos;
    }

    public PersonInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
