// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ApplyDubbridgePetcashierGeneralRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 渠道编码
    @NameInMap("channel_code")
    @Validation(required = true)
    public String channelCode;

    // 流量平台
    @NameInMap("traffic_platform")
    @Validation(required = true)
    public String trafficPlatform;

    // 买家Id
    @NameInMap("buyer_id")
    @Validation(required = true)
    public String buyerId;

    // 业务订单号
    @NameInMap("biz_order_no")
    @Validation(required = true)
    public String bizOrderNo;

    // 订单金额，单位元，两位小数
    @NameInMap("amount")
    @Validation(required = true)
    public String amount;

    // 产品模式：PET_PACKAGE-领宠模式（活体+商城套餐）、PET-单活体、GOODS-单商品、MEMBER-会员订阅
    @NameInMap("product_mode")
    @Validation(required = true)
    public String productMode;

    // 订单标题
    @NameInMap("subject")
    @Validation(required = true)
    public String subject;

    // 时间戳
    @NameInMap("timestamp")
    @Validation(required = true)
    public String timestamp;

    // 过期时间
    @NameInMap("expire_time")
    public String expireTime;

    // 支付场景
    @NameInMap("pay_scene")
    @Validation(required = true)
    public String payScene;

    // 订单归属主体，入驻到平台的id
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 支付机构编码
    @NameInMap("pay_institution_code")
    @Validation(required = true)
    public String payInstitutionCode;

    // 支付后返回地址
    @NameInMap("return_url")
    public String returnUrl;

    // 商品明细数组
    @NameInMap("product_list")
    @Validation(required = true)
    public java.util.List<ProductItem> productList;

    // 扩展信息，JSON串
    @NameInMap("ext_info")
    public String extInfo;

    public static ApplyDubbridgePetcashierGeneralRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyDubbridgePetcashierGeneralRequest self = new ApplyDubbridgePetcashierGeneralRequest();
        return TeaModel.build(map, self);
    }

    public ApplyDubbridgePetcashierGeneralRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyDubbridgePetcashierGeneralRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyDubbridgePetcashierGeneralRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public ApplyDubbridgePetcashierGeneralRequest setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

    public ApplyDubbridgePetcashierGeneralRequest setBuyerId(String buyerId) {
        this.buyerId = buyerId;
        return this;
    }
    public String getBuyerId() {
        return this.buyerId;
    }

    public ApplyDubbridgePetcashierGeneralRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public ApplyDubbridgePetcashierGeneralRequest setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public ApplyDubbridgePetcashierGeneralRequest setProductMode(String productMode) {
        this.productMode = productMode;
        return this;
    }
    public String getProductMode() {
        return this.productMode;
    }

    public ApplyDubbridgePetcashierGeneralRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public ApplyDubbridgePetcashierGeneralRequest setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public ApplyDubbridgePetcashierGeneralRequest setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public ApplyDubbridgePetcashierGeneralRequest setPayScene(String payScene) {
        this.payScene = payScene;
        return this;
    }
    public String getPayScene() {
        return this.payScene;
    }

    public ApplyDubbridgePetcashierGeneralRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public ApplyDubbridgePetcashierGeneralRequest setPayInstitutionCode(String payInstitutionCode) {
        this.payInstitutionCode = payInstitutionCode;
        return this;
    }
    public String getPayInstitutionCode() {
        return this.payInstitutionCode;
    }

    public ApplyDubbridgePetcashierGeneralRequest setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }
    public String getReturnUrl() {
        return this.returnUrl;
    }

    public ApplyDubbridgePetcashierGeneralRequest setProductList(java.util.List<ProductItem> productList) {
        this.productList = productList;
        return this;
    }
    public java.util.List<ProductItem> getProductList() {
        return this.productList;
    }

    public ApplyDubbridgePetcashierGeneralRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
