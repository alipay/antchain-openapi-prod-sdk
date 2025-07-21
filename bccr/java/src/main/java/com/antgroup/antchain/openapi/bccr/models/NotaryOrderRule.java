// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class NotaryOrderRule extends TeaModel {
    // 公证出证支持公证书类型
    /**
     * <strong>example:</strong>
     * <p>PAPER,E_PAPER,BOTH</p>
     */
    @NameInMap("order_type")
    public String orderType;

    public static NotaryOrderRule build(java.util.Map<String, ?> map) throws Exception {
        NotaryOrderRule self = new NotaryOrderRule();
        return TeaModel.build(map, self);
    }

    public NotaryOrderRule setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

}
