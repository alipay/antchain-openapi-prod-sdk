// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class CheckOmngRiskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 手机号
    @NameInMap("mobile_phone")
    @Validation(required = true)
    public String mobilePhone;

    // 产品ID=实际产品ID#版本
    // prod#1
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    // 商户的统一社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 商户公司名字
    @NameInMap("merchant_name")
    @Validation(required = true)
    public String merchantName;

    // 业务场景
    // 默认为CHARGING_BY_TERM
    // 
    //  CHARGING_BY_ORDER : 整单结算 
    // CHARGING_BY_TERM : 分期结算
    //  CHARGING_BY_TERM_INDIRECT : 间联模式使用，分期结算 
    // CHARGING_BY_PROFIT : 分润结算
    @NameInMap("biz_scene")
    public String bizScene;

    // 业务类型
    // LEASE : 租赁 （默认） 
    // INSTALLMENT: 分期付款
    // 
    @NameInMap("biz_type")
    public String bizType;

    // 签署模式
    //  NONE : 灵活签约
    @NameInMap("sign_mode")
    public String signMode;

    // 主订单信息
    @NameInMap("order_info")
    @Validation(required = true)
    public OrderInfoReq orderInfo;

    // 订单还款计划
    @NameInMap("promise_info")
    @Validation(required = true)
    public OrderPromise promiseInfo;

    public static CheckOmngRiskRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckOmngRiskRequest self = new CheckOmngRiskRequest();
        return TeaModel.build(map, self);
    }

    public CheckOmngRiskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckOmngRiskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckOmngRiskRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CheckOmngRiskRequest setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }
    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public CheckOmngRiskRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public CheckOmngRiskRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public CheckOmngRiskRequest setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public CheckOmngRiskRequest setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

    public CheckOmngRiskRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CheckOmngRiskRequest setSignMode(String signMode) {
        this.signMode = signMode;
        return this;
    }
    public String getSignMode() {
        return this.signMode;
    }

    public CheckOmngRiskRequest setOrderInfo(OrderInfoReq orderInfo) {
        this.orderInfo = orderInfo;
        return this;
    }
    public OrderInfoReq getOrderInfo() {
        return this.orderInfo;
    }

    public CheckOmngRiskRequest setPromiseInfo(OrderPromise promiseInfo) {
        this.promiseInfo = promiseInfo;
        return this;
    }
    public OrderPromise getPromiseInfo() {
        return this.promiseInfo;
    }

}
