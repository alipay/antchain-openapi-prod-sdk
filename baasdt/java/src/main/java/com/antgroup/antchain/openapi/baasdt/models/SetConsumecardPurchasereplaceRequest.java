// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class SetConsumecardPurchasereplaceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 是否同意换货。true同意，false拒绝
    @NameInMap("accept")
    @Validation(required = true)
    public Boolean accept;

    // 请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequest baseRequest;

    // 交易ID
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 附言
    @NameInMap("remark")
    public String remark;

    public static SetConsumecardPurchasereplaceRequest build(java.util.Map<String, ?> map) throws Exception {
        SetConsumecardPurchasereplaceRequest self = new SetConsumecardPurchasereplaceRequest();
        return TeaModel.build(map, self);
    }

    public SetConsumecardPurchasereplaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetConsumecardPurchasereplaceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetConsumecardPurchasereplaceRequest setAccept(Boolean accept) {
        this.accept = accept;
        return this;
    }
    public Boolean getAccept() {
        return this.accept;
    }

    public SetConsumecardPurchasereplaceRequest setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public SetConsumecardPurchasereplaceRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SetConsumecardPurchasereplaceRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
