// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.caasplatform.models;

import com.aliyun.tea.*;

public class DescribeExtendTxqrcodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合约服务ID
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // 业务幂等id(和tx_hash二者必须选其一)
    @NameInMap("order_id")
    public String orderId;

    // 交易hash(和order_id二者必须选其一)
    @NameInMap("tx_hash")
    public String txHash;

    public static DescribeExtendTxqrcodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExtendTxqrcodeRequest self = new DescribeExtendTxqrcodeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExtendTxqrcodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DescribeExtendTxqrcodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DescribeExtendTxqrcodeRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public DescribeExtendTxqrcodeRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public DescribeExtendTxqrcodeRequest setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
