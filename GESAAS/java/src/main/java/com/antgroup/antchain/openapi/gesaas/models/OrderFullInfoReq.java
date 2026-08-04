// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class OrderFullInfoReq extends TeaModel {
    // 订单号
    // 
    /**
     * <strong>example:</strong>
     * <p>1798234932684395</p>
     */
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 手机号
    /**
     * <strong>example:</strong>
     * <p>15629827201</p>
     */
    @NameInMap("mobile_phone")
    @Validation(required = true)
    public String mobilePhone;

    // 产品ID=实际产品ID#版本 prod#1	
    // 
    /**
     * <strong>example:</strong>
     * <p>prod#1</p>
     */
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    // 商户的统一社会信用代码
    /**
     * <strong>example:</strong>
     * <p>2088xxx</p>
     */
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 商户公司名字
    /**
     * <strong>example:</strong>
     * <p>蚂蚁云创xxx有限公司</p>
     */
    @NameInMap("merchant_name")
    @Validation(required = true)
    public String merchantName;

    // 业务场景 默认为CHARGING_BY_TERM 
    // CHARGING_BY_ORDER : 整单结算 
    // CHARGING_BY_TERM : 分期结算
    //  CHARGING_BY_TERM_INDIRECT : 间联模式使用，分期结算
    //  CHARGING_BY_PROFIT : 分润结算
    /**
     * <strong>example:</strong>
     * <p>CHARGING_BY_TERM</p>
     */
    @NameInMap("biz_scene")
    @Validation(required = true)
    public String bizScene;

    // 业务类型 LEASE : 租赁 （默认） INSTALLMENT: 分期付款	
    // 
    /**
     * <strong>example:</strong>
     * <p>INSTALLMENT</p>
     */
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 签署模式 NONE : 灵活签约
    /**
     * <strong>example:</strong>
     * <p>NONE</p>
     */
    @NameInMap("sign_mode")
    @Validation(required = true)
    public String signMode;

    // 主订单信息
    @NameInMap("order_info")
    @Validation(required = true)
    public OrderInfoReq orderInfo;

    // 订单还款计划
    @NameInMap("promise_info")
    @Validation(required = true)
    public OrderPromise promiseInfo;

    public static OrderFullInfoReq build(java.util.Map<String, ?> map) throws Exception {
        OrderFullInfoReq self = new OrderFullInfoReq();
        return TeaModel.build(map, self);
    }

    public OrderFullInfoReq setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public OrderFullInfoReq setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }
    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public OrderFullInfoReq setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public OrderFullInfoReq setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public OrderFullInfoReq setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public OrderFullInfoReq setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

    public OrderFullInfoReq setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public OrderFullInfoReq setSignMode(String signMode) {
        this.signMode = signMode;
        return this;
    }
    public String getSignMode() {
        return this.signMode;
    }

    public OrderFullInfoReq setOrderInfo(OrderInfoReq orderInfo) {
        this.orderInfo = orderInfo;
        return this;
    }
    public OrderInfoReq getOrderInfo() {
        return this.orderInfo;
    }

    public OrderFullInfoReq setPromiseInfo(OrderPromise promiseInfo) {
        this.promiseInfo = promiseInfo;
        return this;
    }
    public OrderPromise getPromiseInfo() {
        return this.promiseInfo;
    }

}
