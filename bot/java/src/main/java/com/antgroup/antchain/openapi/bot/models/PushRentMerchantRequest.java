// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PushRentMerchantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业法人名称(个人可空)
    @NameInMap("legal_person_name")
    public String legalPersonName;

    // 企业法人证件号(个人可空)
    @NameInMap("legal_persion_idcard")
    public String legalPersionIdcard;

    // 企业名称(个人名称)
    @NameInMap("merchant_name")
    @Validation(required = true)
    public String merchantName;

    // 企业社会信用代码(个人身份证)
    @NameInMap("merchant_credit_no")
    @Validation(required = true)
    public String merchantCreditNo;

    // 支付宝监管户账号
    @NameInMap("alipay_account")
    public String alipayAccount;

    // 个人或企业
    // 个人：P
    // 企业：E
    @NameInMap("merchant_type")
    @Validation(required = true)
    public String merchantType;

    // 企业联系人
    @NameInMap("contacts")
    public String contacts;

    // 企业位置
    @NameInMap("addr")
    public String addr;

    public static PushRentMerchantRequest build(java.util.Map<String, ?> map) throws Exception {
        PushRentMerchantRequest self = new PushRentMerchantRequest();
        return TeaModel.build(map, self);
    }

    public PushRentMerchantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushRentMerchantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushRentMerchantRequest setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
        return this;
    }
    public String getLegalPersonName() {
        return this.legalPersonName;
    }

    public PushRentMerchantRequest setLegalPersionIdcard(String legalPersionIdcard) {
        this.legalPersionIdcard = legalPersionIdcard;
        return this;
    }
    public String getLegalPersionIdcard() {
        return this.legalPersionIdcard;
    }

    public PushRentMerchantRequest setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public PushRentMerchantRequest setMerchantCreditNo(String merchantCreditNo) {
        this.merchantCreditNo = merchantCreditNo;
        return this;
    }
    public String getMerchantCreditNo() {
        return this.merchantCreditNo;
    }

    public PushRentMerchantRequest setAlipayAccount(String alipayAccount) {
        this.alipayAccount = alipayAccount;
        return this;
    }
    public String getAlipayAccount() {
        return this.alipayAccount;
    }

    public PushRentMerchantRequest setMerchantType(String merchantType) {
        this.merchantType = merchantType;
        return this;
    }
    public String getMerchantType() {
        return this.merchantType;
    }

    public PushRentMerchantRequest setContacts(String contacts) {
        this.contacts = contacts;
        return this;
    }
    public String getContacts() {
        return this.contacts;
    }

    public PushRentMerchantRequest setAddr(String addr) {
        this.addr = addr;
        return this;
    }
    public String getAddr() {
        return this.addr;
    }

}
