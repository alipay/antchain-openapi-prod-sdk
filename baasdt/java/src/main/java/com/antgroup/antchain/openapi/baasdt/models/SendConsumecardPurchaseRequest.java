// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class SendConsumecardPurchaseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequest baseRequest;

    // 交易ID
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 附言(发货信息)
    @NameInMap("remark")
    @Validation(required = true)
    public String remark;

    public static SendConsumecardPurchaseRequest build(java.util.Map<String, ?> map) throws Exception {
        SendConsumecardPurchaseRequest self = new SendConsumecardPurchaseRequest();
        return TeaModel.build(map, self);
    }

    public SendConsumecardPurchaseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendConsumecardPurchaseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SendConsumecardPurchaseRequest setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public SendConsumecardPurchaseRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SendConsumecardPurchaseRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
