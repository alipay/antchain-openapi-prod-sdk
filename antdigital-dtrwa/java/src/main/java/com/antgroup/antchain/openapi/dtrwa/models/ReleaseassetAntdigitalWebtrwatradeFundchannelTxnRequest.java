// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtrwa.models;

import com.aliyun.tea.*;

public class ReleaseassetAntdigitalWebtrwatradeFundchannelTxnRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单ID
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    public static ReleaseassetAntdigitalWebtrwatradeFundchannelTxnRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseassetAntdigitalWebtrwatradeFundchannelTxnRequest self = new ReleaseassetAntdigitalWebtrwatradeFundchannelTxnRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseassetAntdigitalWebtrwatradeFundchannelTxnRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReleaseassetAntdigitalWebtrwatradeFundchannelTxnRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ReleaseassetAntdigitalWebtrwatradeFundchannelTxnRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
