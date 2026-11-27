// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QuerySilentauthCaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业统一社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 企业名称
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

    public static QuerySilentauthCaRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySilentauthCaRequest self = new QuerySilentauthCaRequest();
        return TeaModel.build(map, self);
    }

    public QuerySilentauthCaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySilentauthCaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySilentauthCaRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public QuerySilentauthCaRequest setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public QuerySilentauthCaRequest setMerchantLegalName(String merchantLegalName) {
        this.merchantLegalName = merchantLegalName;
        return this;
    }
    public String getMerchantLegalName() {
        return this.merchantLegalName;
    }

    public QuerySilentauthCaRequest setMerchantLegalIdNumber(String merchantLegalIdNumber) {
        this.merchantLegalIdNumber = merchantLegalIdNumber;
        return this;
    }
    public String getMerchantLegalIdNumber() {
        return this.merchantLegalIdNumber;
    }

}
