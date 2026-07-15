// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateBclInsuranceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // bcl订单id
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 32, minLength = 16)
    public String orderId;

    // 保司code
    @NameInMap("insurance_code")
    @Validation(required = true, maxLength = 32, minLength = 8)
    public String insuranceCode;

    // 投保人信息
    @NameInMap("holder")
    @Validation(required = true)
    public BclInsuranceUserInfo holder;

    // 被保人信息
    @NameInMap("insured")
    @Validation(required = true)
    public BclInsuranceUserInfo insured;

    public static CreateBclInsuranceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBclInsuranceRequest self = new CreateBclInsuranceRequest();
        return TeaModel.build(map, self);
    }

    public CreateBclInsuranceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBclInsuranceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBclInsuranceRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateBclInsuranceRequest setInsuranceCode(String insuranceCode) {
        this.insuranceCode = insuranceCode;
        return this;
    }
    public String getInsuranceCode() {
        return this.insuranceCode;
    }

    public CreateBclInsuranceRequest setHolder(BclInsuranceUserInfo holder) {
        this.holder = holder;
        return this;
    }
    public BclInsuranceUserInfo getHolder() {
        return this.holder;
    }

    public CreateBclInsuranceRequest setInsured(BclInsuranceUserInfo insured) {
        this.insured = insured;
        return this;
    }
    public BclInsuranceUserInfo getInsured() {
        return this.insured;
    }

}
