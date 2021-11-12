// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class UpdateIpAccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 链上账户id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 商户账户名称
    @NameInMap("merchant_alias_name")
    @Validation(required = true)
    public String merchantAliasName;

    // 商户类型(本期仅支持: 1:企业, 6:个人商户)
    @NameInMap("merchant_type")
    public Long merchantType;

    // 商户证件类型，201--统一社会信用证--营业执照号；
    @NameInMap("merchant_cert_type")
    public Long merchantCertType;

    // 本期支持统一社会信用证代码
    @NameInMap("merchant_cert_number")
    public String merchantCertNumber;

    // 联系人信息
    @NameInMap("contact_info")
    public IPContactInfo contactInfo;

    // 商户经营地址
    @NameInMap("contact_address")
    public IPAddressInfo contactAddress;

    // 备注信息
    @NameInMap("memo")
    public String memo;

    // 店铺名称
    @NameInMap("shop_name")
    public String shopName;

    // 更多联系信息，用于运营联系商家
    // 注：更新时如果为空，则联系人信息被覆盖为空，更新时为空相当于删除功能
    @NameInMap("additional_contact_info")
    public java.util.List<SimpleContactInfo> additionalContactInfo;

    public static UpdateIpAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpAccountRequest self = new UpdateIpAccountRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIpAccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateIpAccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateIpAccountRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public UpdateIpAccountRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public UpdateIpAccountRequest setMerchantAliasName(String merchantAliasName) {
        this.merchantAliasName = merchantAliasName;
        return this;
    }
    public String getMerchantAliasName() {
        return this.merchantAliasName;
    }

    public UpdateIpAccountRequest setMerchantType(Long merchantType) {
        this.merchantType = merchantType;
        return this;
    }
    public Long getMerchantType() {
        return this.merchantType;
    }

    public UpdateIpAccountRequest setMerchantCertType(Long merchantCertType) {
        this.merchantCertType = merchantCertType;
        return this;
    }
    public Long getMerchantCertType() {
        return this.merchantCertType;
    }

    public UpdateIpAccountRequest setMerchantCertNumber(String merchantCertNumber) {
        this.merchantCertNumber = merchantCertNumber;
        return this;
    }
    public String getMerchantCertNumber() {
        return this.merchantCertNumber;
    }

    public UpdateIpAccountRequest setContactInfo(IPContactInfo contactInfo) {
        this.contactInfo = contactInfo;
        return this;
    }
    public IPContactInfo getContactInfo() {
        return this.contactInfo;
    }

    public UpdateIpAccountRequest setContactAddress(IPAddressInfo contactAddress) {
        this.contactAddress = contactAddress;
        return this;
    }
    public IPAddressInfo getContactAddress() {
        return this.contactAddress;
    }

    public UpdateIpAccountRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public UpdateIpAccountRequest setShopName(String shopName) {
        this.shopName = shopName;
        return this;
    }
    public String getShopName() {
        return this.shopName;
    }

    public UpdateIpAccountRequest setAdditionalContactInfo(java.util.List<SimpleContactInfo> additionalContactInfo) {
        this.additionalContactInfo = additionalContactInfo;
        return this;
    }
    public java.util.List<SimpleContactInfo> getAdditionalContactInfo() {
        return this.additionalContactInfo;
    }

}
