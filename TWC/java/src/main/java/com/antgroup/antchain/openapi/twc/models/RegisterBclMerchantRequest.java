// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class RegisterBclMerchantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商家实体名称
    // 要与证件的名称相同，会在用户签署代扣协议时或者支付宝扣款账单中展示，请规范填写，最大长度：128
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 商家实体别名
    // 会在用户签署代扣协议时或者支付宝扣款账单中展示，请规范填写，最大长度：128  
    // 如果need_proxy_withholding为true则必填
    @NameInMap("alias_name")
    public String aliasName;

    // 商家实体类型：
    // 1.企业：ENTERPRISE
    // 当前暂时只支持企业
    @NameInMap("merchant_type")
    @Validation(required = true)
    public String merchantType;

    // 商家营业执照号
    // 最大长度20
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 法人名称
    // 最大长度64
    @NameInMap("legal_name")
    @Validation(required = true)
    public String legalName;

    // 法人身份证号
    // 最大长度：18
    // 当前暂时只支持中国大陆个人身份证
    @NameInMap("legal_cert_no")
    @Validation(required = true)
    public String legalCertNo;

    // 商户联系人信息
    // 当前只支持一个联系人
    // 如果need_proxy_withholding为true则必填
    @NameInMap("contact_infos")
    public java.util.List<BclContactInfo> contactInfos;

    // 商家实体支付宝账号
    // 用作结算账号。本字段支付宝账号实名信息要求与商户名称cert_name同名，且是实名认证支付宝企业账户，最大长度：64
    // 如果need_proxy_withholding为true则必填
    @NameInMap("alipay_logon_id")
    public String alipayLogonId;

    // 租赁经营类型
    // 1.数码/娱乐设备租赁：DIGITAL_LEASE
    // 2.共享充电宝及其他共享租赁：SHARE_LEASE
    // 3.汽车租赁：CAR_LEASE
    @NameInMap("management_type")
    @Validation(required = true)
    public String managementType;

    // 是否需要使用租赁代扣
    // true 为需要使用
    // false 为不需要使用
    @NameInMap("need_proxy_withholding")
    @Validation(required = true)
    public Boolean needProxyWithholding;

    // 客户端token：
    // 幂等号，用来保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。更多详情，请参见如何保证幂等性。
    @NameInMap("client_token")
    @Validation(required = true)
    public String clientToken;

    public static RegisterBclMerchantRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterBclMerchantRequest self = new RegisterBclMerchantRequest();
        return TeaModel.build(map, self);
    }

    public RegisterBclMerchantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RegisterBclMerchantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RegisterBclMerchantRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RegisterBclMerchantRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public RegisterBclMerchantRequest setMerchantType(String merchantType) {
        this.merchantType = merchantType;
        return this;
    }
    public String getMerchantType() {
        return this.merchantType;
    }

    public RegisterBclMerchantRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public RegisterBclMerchantRequest setLegalName(String legalName) {
        this.legalName = legalName;
        return this;
    }
    public String getLegalName() {
        return this.legalName;
    }

    public RegisterBclMerchantRequest setLegalCertNo(String legalCertNo) {
        this.legalCertNo = legalCertNo;
        return this;
    }
    public String getLegalCertNo() {
        return this.legalCertNo;
    }

    public RegisterBclMerchantRequest setContactInfos(java.util.List<BclContactInfo> contactInfos) {
        this.contactInfos = contactInfos;
        return this;
    }
    public java.util.List<BclContactInfo> getContactInfos() {
        return this.contactInfos;
    }

    public RegisterBclMerchantRequest setAlipayLogonId(String alipayLogonId) {
        this.alipayLogonId = alipayLogonId;
        return this;
    }
    public String getAlipayLogonId() {
        return this.alipayLogonId;
    }

    public RegisterBclMerchantRequest setManagementType(String managementType) {
        this.managementType = managementType;
        return this;
    }
    public String getManagementType() {
        return this.managementType;
    }

    public RegisterBclMerchantRequest setNeedProxyWithholding(Boolean needProxyWithholding) {
        this.needProxyWithholding = needProxyWithholding;
        return this;
    }
    public Boolean getNeedProxyWithholding() {
        return this.needProxyWithholding;
    }

    public RegisterBclMerchantRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
