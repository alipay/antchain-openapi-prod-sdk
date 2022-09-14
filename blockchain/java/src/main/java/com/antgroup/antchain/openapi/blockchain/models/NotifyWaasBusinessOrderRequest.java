// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class NotifyWaasBusinessOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务合作方id
    @NameInMap("business_id")
    @Validation(required = true)
    public String businessId;

    // 转账用户的did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 业务转账订单id
    @NameInMap("business_order_id")
    @Validation(required = true)
    public String businessOrderId;

    // 订单结果
    @NameInMap("result")
    @Validation(required = true)
    public String result;

    // 结果描述
    @NameInMap("result_message")
    public String resultMessage;

    public static NotifyWaasBusinessOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyWaasBusinessOrderRequest self = new NotifyWaasBusinessOrderRequest();
        return TeaModel.build(map, self);
    }

    public NotifyWaasBusinessOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public NotifyWaasBusinessOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public NotifyWaasBusinessOrderRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public NotifyWaasBusinessOrderRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public NotifyWaasBusinessOrderRequest setBusinessOrderId(String businessOrderId) {
        this.businessOrderId = businessOrderId;
        return this;
    }
    public String getBusinessOrderId() {
        return this.businessOrderId;
    }

    public NotifyWaasBusinessOrderRequest setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public NotifyWaasBusinessOrderRequest setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

}
