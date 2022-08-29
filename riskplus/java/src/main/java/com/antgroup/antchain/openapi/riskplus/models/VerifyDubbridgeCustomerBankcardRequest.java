// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class VerifyDubbridgeCustomerBankcardRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号
    @NameInMap("order_no")
    public String orderNo;

    // 客户号
    @NameInMap("custom_no")
    public String customNo;

    // 绑卡流水
    @NameInMap("bind_serial_no")
    @Validation(required = true)
    public String bindSerialNo;

    // 绑卡验证码
    @NameInMap("bind_valid_code")
    @Validation(required = true)
    public String bindValidCode;

    public static VerifyDubbridgeCustomerBankcardRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyDubbridgeCustomerBankcardRequest self = new VerifyDubbridgeCustomerBankcardRequest();
        return TeaModel.build(map, self);
    }

    public VerifyDubbridgeCustomerBankcardRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyDubbridgeCustomerBankcardRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyDubbridgeCustomerBankcardRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public VerifyDubbridgeCustomerBankcardRequest setCustomNo(String customNo) {
        this.customNo = customNo;
        return this;
    }
    public String getCustomNo() {
        return this.customNo;
    }

    public VerifyDubbridgeCustomerBankcardRequest setBindSerialNo(String bindSerialNo) {
        this.bindSerialNo = bindSerialNo;
        return this;
    }
    public String getBindSerialNo() {
        return this.bindSerialNo;
    }

    public VerifyDubbridgeCustomerBankcardRequest setBindValidCode(String bindValidCode) {
        this.bindValidCode = bindValidCode;
        return this;
    }
    public String getBindValidCode() {
        return this.bindValidCode;
    }

}
