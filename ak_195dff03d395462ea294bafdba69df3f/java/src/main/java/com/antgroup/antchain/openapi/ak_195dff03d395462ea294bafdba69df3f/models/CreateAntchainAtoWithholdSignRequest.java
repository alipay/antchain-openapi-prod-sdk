// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class CreateAntchainAtoWithholdSignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id 长度不可超过50
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 50)
    public String orderId;

    // 支付宝商户id，使用签约能力前时候进行向平台申请
    @NameInMap("alipay_merchant_id")
    @Validation(maxLength = 20)
    public String alipayMerchantId;

    // 支付宝商户名称，会展示在支付并签约界面
    @NameInMap("alipay_merchant_name")
    @Validation(maxLength = 50)
    public String alipayMerchantName;

    // 支付宝商户服务名称，会展示在支付并签约界面
    @NameInMap("alipay_merchant_service_name")
    @Validation(maxLength = 50)
    public String alipayMerchantServiceName;

    // 支付宝商户服务描述，会展示在支付并签约界面
    @NameInMap("alipay_merchant_service_description")
    @Validation(maxLength = 150)
    public String alipayMerchantServiceDescription;

    // 支付宝uid，非必填
    @NameInMap("alipay_user_id")
    @Validation(maxLength = 128)
    public String alipayUserId;

    // 签约完成后的跳转地址，注意只有在h5跳转场景下才有意义其他场景通过方法回调处理业务；无需使用此字段。
    @NameInMap("return_url")
    @Validation(maxLength = 256)
    public String returnUrl;

    // 支付宝用户 open_id，非必填
    @NameInMap("user_open_id")
    @Validation(maxLength = 128, minLength = 16)
    public String userOpenId;

    // 商户支付宝应用 id
    @NameInMap("merchant_app_id")
    @Validation(maxLength = 32)
    public String merchantAppId;

    public static CreateAntchainAtoWithholdSignRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAntchainAtoWithholdSignRequest self = new CreateAntchainAtoWithholdSignRequest();
        return TeaModel.build(map, self);
    }

    public CreateAntchainAtoWithholdSignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAntchainAtoWithholdSignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAntchainAtoWithholdSignRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateAntchainAtoWithholdSignRequest setAlipayMerchantId(String alipayMerchantId) {
        this.alipayMerchantId = alipayMerchantId;
        return this;
    }
    public String getAlipayMerchantId() {
        return this.alipayMerchantId;
    }

    public CreateAntchainAtoWithholdSignRequest setAlipayMerchantName(String alipayMerchantName) {
        this.alipayMerchantName = alipayMerchantName;
        return this;
    }
    public String getAlipayMerchantName() {
        return this.alipayMerchantName;
    }

    public CreateAntchainAtoWithholdSignRequest setAlipayMerchantServiceName(String alipayMerchantServiceName) {
        this.alipayMerchantServiceName = alipayMerchantServiceName;
        return this;
    }
    public String getAlipayMerchantServiceName() {
        return this.alipayMerchantServiceName;
    }

    public CreateAntchainAtoWithholdSignRequest setAlipayMerchantServiceDescription(String alipayMerchantServiceDescription) {
        this.alipayMerchantServiceDescription = alipayMerchantServiceDescription;
        return this;
    }
    public String getAlipayMerchantServiceDescription() {
        return this.alipayMerchantServiceDescription;
    }

    public CreateAntchainAtoWithholdSignRequest setAlipayUserId(String alipayUserId) {
        this.alipayUserId = alipayUserId;
        return this;
    }
    public String getAlipayUserId() {
        return this.alipayUserId;
    }

    public CreateAntchainAtoWithholdSignRequest setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }
    public String getReturnUrl() {
        return this.returnUrl;
    }

    public CreateAntchainAtoWithholdSignRequest setUserOpenId(String userOpenId) {
        this.userOpenId = userOpenId;
        return this;
    }
    public String getUserOpenId() {
        return this.userOpenId;
    }

    public CreateAntchainAtoWithholdSignRequest setMerchantAppId(String merchantAppId) {
        this.merchantAppId = merchantAppId;
        return this;
    }
    public String getMerchantAppId() {
        return this.merchantAppId;
    }

}
