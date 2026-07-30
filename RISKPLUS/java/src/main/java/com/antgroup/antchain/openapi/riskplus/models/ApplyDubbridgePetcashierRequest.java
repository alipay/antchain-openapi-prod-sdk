// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ApplyDubbridgePetcashierRequest extends TeaModel {
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

    // 门店id
    @NameInMap("store_id")
    @Validation(required = true)
    public String storeId;

    // 原始订单号
    @NameInMap("biz_order_no")
    @Validation(required = true)
    public String bizOrderNo;

    // 商家社信码
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 收银台模板渠道社信码
    @NameInMap("template_scene_cert_no")
    public String templateSceneCertNo;

    // 交易金额
    @NameInMap("amount")
    @Validation(required = true)
    public String amount;

    // 订单标题
    @NameInMap("subject")
    @Validation(required = true)
    public String subject;

    // 商品SKU
    @NameInMap("sku")
    public String sku;

    // 买家Id
    @NameInMap("buyer_id")
    public String buyerId;

    // 时间戳
    @NameInMap("timestamp")
    @Validation(required = true)
    public String timestamp;

    // 2026-07-20 00:16:35
    @NameInMap("expire_time")
    public String expireTime;

    // 支付机构编码
    @NameInMap("pay_institution_code")
    public String payInstitutionCode;

    // 交易场景
    @NameInMap("pay_scene")
    @Validation(required = true)
    public String payScene;

    // 支付后返回地址
    @NameInMap("return_url")
    public String returnUrl;

    // 是否开启分账
    @NameInMap("enable_transfer")
    public String enableTransfer;

    // 渠道扩展信息
    @NameInMap("ext_info")
    public PetCashierApplyExtInfo extInfo;

    public static ApplyDubbridgePetcashierRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyDubbridgePetcashierRequest self = new ApplyDubbridgePetcashierRequest();
        return TeaModel.build(map, self);
    }

    public ApplyDubbridgePetcashierRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyDubbridgePetcashierRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyDubbridgePetcashierRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public ApplyDubbridgePetcashierRequest setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

    public ApplyDubbridgePetcashierRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public ApplyDubbridgePetcashierRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public ApplyDubbridgePetcashierRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public ApplyDubbridgePetcashierRequest setTemplateSceneCertNo(String templateSceneCertNo) {
        this.templateSceneCertNo = templateSceneCertNo;
        return this;
    }
    public String getTemplateSceneCertNo() {
        return this.templateSceneCertNo;
    }

    public ApplyDubbridgePetcashierRequest setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public ApplyDubbridgePetcashierRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public ApplyDubbridgePetcashierRequest setSku(String sku) {
        this.sku = sku;
        return this;
    }
    public String getSku() {
        return this.sku;
    }

    public ApplyDubbridgePetcashierRequest setBuyerId(String buyerId) {
        this.buyerId = buyerId;
        return this;
    }
    public String getBuyerId() {
        return this.buyerId;
    }

    public ApplyDubbridgePetcashierRequest setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public ApplyDubbridgePetcashierRequest setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public ApplyDubbridgePetcashierRequest setPayInstitutionCode(String payInstitutionCode) {
        this.payInstitutionCode = payInstitutionCode;
        return this;
    }
    public String getPayInstitutionCode() {
        return this.payInstitutionCode;
    }

    public ApplyDubbridgePetcashierRequest setPayScene(String payScene) {
        this.payScene = payScene;
        return this;
    }
    public String getPayScene() {
        return this.payScene;
    }

    public ApplyDubbridgePetcashierRequest setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }
    public String getReturnUrl() {
        return this.returnUrl;
    }

    public ApplyDubbridgePetcashierRequest setEnableTransfer(String enableTransfer) {
        this.enableTransfer = enableTransfer;
        return this;
    }
    public String getEnableTransfer() {
        return this.enableTransfer;
    }

    public ApplyDubbridgePetcashierRequest setExtInfo(PetCashierApplyExtInfo extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public PetCashierApplyExtInfo getExtInfo() {
        return this.extInfo;
    }

}
