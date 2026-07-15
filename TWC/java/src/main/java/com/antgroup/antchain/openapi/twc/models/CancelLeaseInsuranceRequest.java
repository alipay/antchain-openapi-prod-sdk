// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CancelLeaseInsuranceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租赁订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 人保扩展信息，订单投保时的保司为人保时，此字段必填
    @NameInMap("renbao_ext_info")
    public RenbaoExtInfo renbaoExtInfo;

    public static CancelLeaseInsuranceRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelLeaseInsuranceRequest self = new CancelLeaseInsuranceRequest();
        return TeaModel.build(map, self);
    }

    public CancelLeaseInsuranceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelLeaseInsuranceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelLeaseInsuranceRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CancelLeaseInsuranceRequest setRenbaoExtInfo(RenbaoExtInfo renbaoExtInfo) {
        this.renbaoExtInfo = renbaoExtInfo;
        return this;
    }
    public RenbaoExtInfo getRenbaoExtInfo() {
        return this.renbaoExtInfo;
    }

}
