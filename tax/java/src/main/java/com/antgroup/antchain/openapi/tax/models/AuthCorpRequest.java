// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class AuthCorpRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业注册地址和电话号码
    @NameInMap("corp_address_phone_no")
    @Validation(required = true)
    public String corpAddressPhoneNo;

    // 企业银行账号
    @NameInMap("corp_bank_no")
    @Validation(required = true)
    public String corpBankNo;

    // 填写公司名称
    @NameInMap("corp_name")
    @Validation(required = true)
    public String corpName;

    // 企业授权秘钥
    @NameInMap("corp_private_key")
    @Validation(required = true)
    public String corpPrivateKey;

    // 企业纳税人识别号
    @NameInMap("corp_tax_id")
    @Validation(required = true)
    public String corpTaxId;

    public static AuthCorpRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthCorpRequest self = new AuthCorpRequest();
        return TeaModel.build(map, self);
    }

    public AuthCorpRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AuthCorpRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AuthCorpRequest setCorpAddressPhoneNo(String corpAddressPhoneNo) {
        this.corpAddressPhoneNo = corpAddressPhoneNo;
        return this;
    }
    public String getCorpAddressPhoneNo() {
        return this.corpAddressPhoneNo;
    }

    public AuthCorpRequest setCorpBankNo(String corpBankNo) {
        this.corpBankNo = corpBankNo;
        return this;
    }
    public String getCorpBankNo() {
        return this.corpBankNo;
    }

    public AuthCorpRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public AuthCorpRequest setCorpPrivateKey(String corpPrivateKey) {
        this.corpPrivateKey = corpPrivateKey;
        return this;
    }
    public String getCorpPrivateKey() {
        return this.corpPrivateKey;
    }

    public AuthCorpRequest setCorpTaxId(String corpTaxId) {
        this.corpTaxId = corpTaxId;
        return this;
    }
    public String getCorpTaxId() {
        return this.corpTaxId;
    }

}
