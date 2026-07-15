// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agorax.models;

import com.aliyun.tea.*;

public class InitTradeAppRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 接入方 外部业务订单号，接入方 内唯一，创建后不可变
    @NameInMap("out_trade_no")
    @Validation(required = true)
    public String outTradeNo;

    // 支付金额，单位：元，大于 0，最多两位小数
    @NameInMap("total_amount")
    @Validation(required = true)
    public String totalAmount;

    // 商品或权益卡标题
    @NameInMap("subject")
    @Validation(required = true)
    public String subject;

    // 用户登记手机号，中国大陆 11 位手机号
    @NameInMap("registered_mobile")
    public String registeredMobile;

    // 用户登录接口返回的用户唯一标识
    @NameInMap("open_id")
    @Validation(required = true)
    public String openId;

    // 权益档位 ID
    @NameInMap("tier_id")
    @Validation(required = true)
    public String tierId;

    public static InitTradeAppRequest build(java.util.Map<String, ?> map) throws Exception {
        InitTradeAppRequest self = new InitTradeAppRequest();
        return TeaModel.build(map, self);
    }

    public InitTradeAppRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitTradeAppRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitTradeAppRequest setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
        return this;
    }
    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public InitTradeAppRequest setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public String getTotalAmount() {
        return this.totalAmount;
    }

    public InitTradeAppRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public InitTradeAppRequest setRegisteredMobile(String registeredMobile) {
        this.registeredMobile = registeredMobile;
        return this;
    }
    public String getRegisteredMobile() {
        return this.registeredMobile;
    }

    public InitTradeAppRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public InitTradeAppRequest setTierId(String tierId) {
        this.tierId = tierId;
        return this;
    }
    public String getTierId() {
        return this.tierId;
    }

}
