// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateSilentauthAuthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业统一社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 企业名称，须与工商登记一致
    @NameInMap("merchant_name")
    @Validation(required = true)
    public String merchantName;

    // 法定代表人姓名，RSA公钥加密传输
    @NameInMap("merchant_legal_name")
    @Validation(required = true)
    public String merchantLegalName;

    // 法定代表人证件号，RSA公钥加密传输
    @NameInMap("merchant_legal_id_number")
    @Validation(required = true)
    public String merchantLegalIdNumber;

    // 授权方式：ONLINE 线上（默认）、OFFLINE 线下
    @NameInMap("authorized_way")
    @Validation(required = true)
    public String authorizedWay;

    // 签署完成跳转地址，仅 ONLINE 生效
    @NameInMap("return_url")
    public String returnUrl;

    // 经办人实名认证流程ID，OFFLINE 时必填
    @NameInMap("user_flowid")
    public String userFlowid;

    public static CreateSilentauthAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSilentauthAuthRequest self = new CreateSilentauthAuthRequest();
        return TeaModel.build(map, self);
    }

    public CreateSilentauthAuthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSilentauthAuthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateSilentauthAuthRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public CreateSilentauthAuthRequest setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public CreateSilentauthAuthRequest setMerchantLegalName(String merchantLegalName) {
        this.merchantLegalName = merchantLegalName;
        return this;
    }
    public String getMerchantLegalName() {
        return this.merchantLegalName;
    }

    public CreateSilentauthAuthRequest setMerchantLegalIdNumber(String merchantLegalIdNumber) {
        this.merchantLegalIdNumber = merchantLegalIdNumber;
        return this;
    }
    public String getMerchantLegalIdNumber() {
        return this.merchantLegalIdNumber;
    }

    public CreateSilentauthAuthRequest setAuthorizedWay(String authorizedWay) {
        this.authorizedWay = authorizedWay;
        return this;
    }
    public String getAuthorizedWay() {
        return this.authorizedWay;
    }

    public CreateSilentauthAuthRequest setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }
    public String getReturnUrl() {
        return this.returnUrl;
    }

    public CreateSilentauthAuthRequest setUserFlowid(String userFlowid) {
        this.userFlowid = userFlowid;
        return this;
    }
    public String getUserFlowid() {
        return this.userFlowid;
    }

}
