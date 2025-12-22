// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class RefinanceOrderInfoResponse extends TeaModel {
    // 订单id
    /**
     * <strong>example:</strong>
     * <p>20220118123123123</p>
     */
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 合约id
    /**
     * <strong>example:</strong>
     * <p>ABCDEFGH_IJKLMNO_dfadfadfafdadfadfsdffdadf</p>
     */
    @NameInMap("application_id")
    @Validation(required = true)
    public String applicationId;

    public static RefinanceOrderInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        RefinanceOrderInfoResponse self = new RefinanceOrderInfoResponse();
        return TeaModel.build(map, self);
    }

    public RefinanceOrderInfoResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public RefinanceOrderInfoResponse setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

}
