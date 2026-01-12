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
    @NameInMap("customer_no")
    public String customerNo;

    // 绑卡流水
    @NameInMap("bind_serial_no")
    @Validation(required = true)
    public String bindSerialNo;

    // 绑卡验证码
    @NameInMap("bind_valid_code")
    @Validation(required = true)
    public String bindValidCode;

    // 银行卡号
    @NameInMap("bank_card_no")
    @Validation(required = true)
    public String bankCardNo;

    // 渠道号
    @NameInMap("channel_code")
    @Validation(required = true)
    public String channelCode;

    // 业务类型
    @NameInMap("prod_type")
    public String prodType;

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

    public VerifyDubbridgeCustomerBankcardRequest setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
        return this;
    }
    public String getCustomerNo() {
        return this.customerNo;
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

    public VerifyDubbridgeCustomerBankcardRequest setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
        return this;
    }
    public String getBankCardNo() {
        return this.bankCardNo;
    }

    public VerifyDubbridgeCustomerBankcardRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public VerifyDubbridgeCustomerBankcardRequest setProdType(String prodType) {
        this.prodType = prodType;
        return this;
    }
    public String getProdType() {
        return this.prodType;
    }

}
