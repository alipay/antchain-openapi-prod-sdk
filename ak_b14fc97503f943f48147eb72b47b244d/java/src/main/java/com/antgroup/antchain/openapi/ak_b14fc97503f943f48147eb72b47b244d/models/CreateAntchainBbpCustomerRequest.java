// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_b14fc97503f943f48147eb72b47b244d.models;

import com.aliyun.tea.*;

public class CreateAntchainBbpCustomerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务渠道，需提前申请产品码
    @NameInMap("biz_code")
    @Validation(required = true)
    public String bizCode;

    // 客户类型：ENTERPRISE-企业, PERSON-个人
    // 
    @NameInMap("customer_type")
    @Validation(required = true)
    public String customerType;

    // 客户名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 客户证件号码，企业/个人均可
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 客户证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
    @NameInMap("cert_type")
    @Validation(required = true)
    public String certType;

    // 法人姓名
    // 
    @NameInMap("legal_person_cert_name")
    public String legalPersonCertName;

    // 法人证件号码
    // 
    @NameInMap("legal_person_cert_no")
    public String legalPersonCertNo;

    // 法人证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
    @NameInMap("legal_person_cert_no_type")
    @Validation(required = true)
    public String legalPersonCertNoType;

    // 是否需要先认证再注册，默认不认证。
    @NameInMap("is_auth")
    @Validation(required = true)
    public Boolean isAuth;

    // 业务角色： 买方，卖方，机构，合作伙伴
    @NameInMap("business_role")
    public String businessRole;

    // 客户支付宝ID，如有则填。
    @NameInMap("alipay_uid")
    public String alipayUid;

    public static CreateAntchainBbpCustomerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAntchainBbpCustomerRequest self = new CreateAntchainBbpCustomerRequest();
        return TeaModel.build(map, self);
    }

    public CreateAntchainBbpCustomerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAntchainBbpCustomerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAntchainBbpCustomerRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public CreateAntchainBbpCustomerRequest setCustomerType(String customerType) {
        this.customerType = customerType;
        return this;
    }
    public String getCustomerType() {
        return this.customerType;
    }

    public CreateAntchainBbpCustomerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAntchainBbpCustomerRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CreateAntchainBbpCustomerRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public CreateAntchainBbpCustomerRequest setLegalPersonCertName(String legalPersonCertName) {
        this.legalPersonCertName = legalPersonCertName;
        return this;
    }
    public String getLegalPersonCertName() {
        return this.legalPersonCertName;
    }

    public CreateAntchainBbpCustomerRequest setLegalPersonCertNo(String legalPersonCertNo) {
        this.legalPersonCertNo = legalPersonCertNo;
        return this;
    }
    public String getLegalPersonCertNo() {
        return this.legalPersonCertNo;
    }

    public CreateAntchainBbpCustomerRequest setLegalPersonCertNoType(String legalPersonCertNoType) {
        this.legalPersonCertNoType = legalPersonCertNoType;
        return this;
    }
    public String getLegalPersonCertNoType() {
        return this.legalPersonCertNoType;
    }

    public CreateAntchainBbpCustomerRequest setIsAuth(Boolean isAuth) {
        this.isAuth = isAuth;
        return this;
    }
    public Boolean getIsAuth() {
        return this.isAuth;
    }

    public CreateAntchainBbpCustomerRequest setBusinessRole(String businessRole) {
        this.businessRole = businessRole;
        return this;
    }
    public String getBusinessRole() {
        return this.businessRole;
    }

    public CreateAntchainBbpCustomerRequest setAlipayUid(String alipayUid) {
        this.alipayUid = alipayUid;
        return this;
    }
    public String getAlipayUid() {
        return this.alipayUid;
    }

}
