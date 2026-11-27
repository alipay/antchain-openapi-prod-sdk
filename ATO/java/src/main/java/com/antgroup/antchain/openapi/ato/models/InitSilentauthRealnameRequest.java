// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class InitSilentauthRealnameRequest extends TeaModel {
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

    public static InitSilentauthRealnameRequest build(java.util.Map<String, ?> map) throws Exception {
        InitSilentauthRealnameRequest self = new InitSilentauthRealnameRequest();
        return TeaModel.build(map, self);
    }

    public InitSilentauthRealnameRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitSilentauthRealnameRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitSilentauthRealnameRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public InitSilentauthRealnameRequest setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public InitSilentauthRealnameRequest setMerchantLegalName(String merchantLegalName) {
        this.merchantLegalName = merchantLegalName;
        return this;
    }
    public String getMerchantLegalName() {
        return this.merchantLegalName;
    }

    public InitSilentauthRealnameRequest setMerchantLegalIdNumber(String merchantLegalIdNumber) {
        this.merchantLegalIdNumber = merchantLegalIdNumber;
        return this;
    }
    public String getMerchantLegalIdNumber() {
        return this.merchantLegalIdNumber;
    }

}
