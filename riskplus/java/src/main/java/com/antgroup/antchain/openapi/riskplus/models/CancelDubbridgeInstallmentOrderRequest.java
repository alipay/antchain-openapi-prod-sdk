// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CancelDubbridgeInstallmentOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号：request请求单号，每次请求唯一，如uuid
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 待支付的购物订单编号
    @NameInMap("biz_order_no")
    @Validation(required = true)
    public String bizOrderNo;

    // 渠道方唯一标识
    @NameInMap("open_id")
    public String openId;

    // 天枢客户号
    @NameInMap("customer_no")
    public String customerNo;

    public static CancelDubbridgeInstallmentOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelDubbridgeInstallmentOrderRequest self = new CancelDubbridgeInstallmentOrderRequest();
        return TeaModel.build(map, self);
    }

    public CancelDubbridgeInstallmentOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelDubbridgeInstallmentOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelDubbridgeInstallmentOrderRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public CancelDubbridgeInstallmentOrderRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public CancelDubbridgeInstallmentOrderRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public CancelDubbridgeInstallmentOrderRequest setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
        return this;
    }
    public String getCustomerNo() {
        return this.customerNo;
    }

}
