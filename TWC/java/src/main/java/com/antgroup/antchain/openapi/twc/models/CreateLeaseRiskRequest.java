// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateLeaseRiskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 承租人信息
    @NameInMap("person")
    @Validation(required = true)
    public LesseePerson person;

    // 承租人类型，目前仅支持个人类型
    // PERSONAL 个人
    // ENTERPRISE 企业
    @NameInMap("lessee_type")
    @Validation(required = true)
    public String lesseeType;

    public static CreateLeaseRiskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLeaseRiskRequest self = new CreateLeaseRiskRequest();
        return TeaModel.build(map, self);
    }

    public CreateLeaseRiskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLeaseRiskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLeaseRiskRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateLeaseRiskRequest setPerson(LesseePerson person) {
        this.person = person;
        return this;
    }
    public LesseePerson getPerson() {
        return this.person;
    }

    public CreateLeaseRiskRequest setLesseeType(String lesseeType) {
        this.lesseeType = lesseeType;
        return this;
    }
    public String getLesseeType() {
        return this.lesseeType;
    }

}
