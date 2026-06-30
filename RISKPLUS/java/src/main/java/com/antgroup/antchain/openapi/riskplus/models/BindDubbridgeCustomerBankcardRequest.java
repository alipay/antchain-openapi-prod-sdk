// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class BindDubbridgeCustomerBankcardRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 客户编号
    @NameInMap("customer_no")
    @Validation(required = true)
    public String customerNo;

    // 银行卡号
    @NameInMap("bank_card_no")
    @Validation(required = true)
    public String bankCardNo;

    // 渠道描述，具体请见分配
    @NameInMap("channel_code")
    @Validation(required = true)
    public String channelCode;

    // 客户名称
    @NameInMap("custom_name")
    public String customName;

    // 资产方用户唯一标识
    @NameInMap("open_id")
    public String openId;

    // 身份证号
    @NameInMap("card_no")
    public String cardNo;

    // 手机号
    @NameInMap("mobile")
    public String mobile;

    // 业务类型
    @NameInMap("prod_type")
    public String prodType;

    // 银行编码
    @NameInMap("bank_code")
    public String bankCode;

    public static BindDubbridgeCustomerBankcardRequest build(java.util.Map<String, ?> map) throws Exception {
        BindDubbridgeCustomerBankcardRequest self = new BindDubbridgeCustomerBankcardRequest();
        return TeaModel.build(map, self);
    }

    public BindDubbridgeCustomerBankcardRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindDubbridgeCustomerBankcardRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BindDubbridgeCustomerBankcardRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public BindDubbridgeCustomerBankcardRequest setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
        return this;
    }
    public String getCustomerNo() {
        return this.customerNo;
    }

    public BindDubbridgeCustomerBankcardRequest setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
        return this;
    }
    public String getBankCardNo() {
        return this.bankCardNo;
    }

    public BindDubbridgeCustomerBankcardRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public BindDubbridgeCustomerBankcardRequest setCustomName(String customName) {
        this.customName = customName;
        return this;
    }
    public String getCustomName() {
        return this.customName;
    }

    public BindDubbridgeCustomerBankcardRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public BindDubbridgeCustomerBankcardRequest setCardNo(String cardNo) {
        this.cardNo = cardNo;
        return this;
    }
    public String getCardNo() {
        return this.cardNo;
    }

    public BindDubbridgeCustomerBankcardRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public BindDubbridgeCustomerBankcardRequest setProdType(String prodType) {
        this.prodType = prodType;
        return this;
    }
    public String getProdType() {
        return this.prodType;
    }

    public BindDubbridgeCustomerBankcardRequest setBankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }
    public String getBankCode() {
        return this.bankCode;
    }

}
