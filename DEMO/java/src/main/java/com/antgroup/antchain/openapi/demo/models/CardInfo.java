// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class CardInfo extends TeaModel {
    // 1233
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("persion_info")
    public Person persionInfo;

    // 12
    /**
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("id_card")
    public String idCard;

    public static CardInfo build(java.util.Map<String, ?> map) throws Exception {
        CardInfo self = new CardInfo();
        return TeaModel.build(map, self);
    }

    public CardInfo setPersionInfo(Person persionInfo) {
        this.persionInfo = persionInfo;
        return this;
    }
    public Person getPersionInfo() {
        return this.persionInfo;
    }

    public CardInfo setIdCard(String idCard) {
        this.idCard = idCard;
        return this;
    }
    public String getIdCard() {
        return this.idCard;
    }

}
