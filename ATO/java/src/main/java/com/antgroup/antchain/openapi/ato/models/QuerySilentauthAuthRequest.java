// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QuerySilentauthAuthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权流程ID，与企业四要素二选一
    @NameInMap("auth_id")
    public String authId;

    // 统一社会信用代码，auth_id 为空时必填
    @NameInMap("merchant_id")
    public String merchantId;

    // 企业名称，auth_id 为空时必填
    @NameInMap("merchant_name")
    public String merchantName;

    // 法定代表人姓名，RSA加密，auth_id 为空时必填
    @NameInMap("merchant_legal_name")
    public String merchantLegalName;

    // 法定代表人证件号，RSA加密，auth_id 为空时必填
    @NameInMap("merchant_legal_id_number")
    public String merchantLegalIdNumber;

    public static QuerySilentauthAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySilentauthAuthRequest self = new QuerySilentauthAuthRequest();
        return TeaModel.build(map, self);
    }

    public QuerySilentauthAuthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySilentauthAuthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySilentauthAuthRequest setAuthId(String authId) {
        this.authId = authId;
        return this;
    }
    public String getAuthId() {
        return this.authId;
    }

    public QuerySilentauthAuthRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public QuerySilentauthAuthRequest setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public QuerySilentauthAuthRequest setMerchantLegalName(String merchantLegalName) {
        this.merchantLegalName = merchantLegalName;
        return this;
    }
    public String getMerchantLegalName() {
        return this.merchantLegalName;
    }

    public QuerySilentauthAuthRequest setMerchantLegalIdNumber(String merchantLegalIdNumber) {
        this.merchantLegalIdNumber = merchantLegalIdNumber;
        return this;
    }
    public String getMerchantLegalIdNumber() {
        return this.merchantLegalIdNumber;
    }

}
