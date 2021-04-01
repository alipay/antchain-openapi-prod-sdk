// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ExecConsumecardBillpayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequest baseRequest;

    // 账单ID 
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 需要支付的金额(单位:元,精确到分)
    @NameInMap("pay_price")
    @Validation(required = true)
    public String payPrice;

    // 附言(不要超过500个字符)
    @NameInMap("remark")
    public String remark;

    public static ExecConsumecardBillpayRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecConsumecardBillpayRequest self = new ExecConsumecardBillpayRequest();
        return TeaModel.build(map, self);
    }

    public ExecConsumecardBillpayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecConsumecardBillpayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecConsumecardBillpayRequest setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public ExecConsumecardBillpayRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ExecConsumecardBillpayRequest setPayPrice(String payPrice) {
        this.payPrice = payPrice;
        return this;
    }
    public String getPayPrice() {
        return this.payPrice;
    }

    public ExecConsumecardBillpayRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
