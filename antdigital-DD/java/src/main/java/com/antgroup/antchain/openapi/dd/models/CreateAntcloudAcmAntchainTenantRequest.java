// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class CreateAntcloudAcmAntchainTenantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 企业名称或个人名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 客户类型
    // PERSON("个人","1"),
    // ENTERPRISE("企业","2")
    @NameInMap("user_type")
    @Validation(required = true)
    public String userType;

    // 证件号
    @NameInMap("cert_no")
    public String certNo;

    // 证件类型
    @NameInMap("cert_type")
    public String certType;

    // 法人姓名
    @NameInMap("real_name")
    public String realName;

    // 法人证件号
    @NameInMap("artificial_person_cert_no")
    public String artificialPersonCertNo;

    // 法人证件类型
    @NameInMap("artificial_person_cert_type")
    public String artificialPersonCertType;

    // 支付宝登录号
    @NameInMap("login_name")
    public String loginName;

    // 支付宝uid(租户id)
    @NameInMap("tenant_id")
    public String tenantId;

    // 业务场景码
    @NameInMap("bussiness_code")
    @Validation(required = true)
    public String bussinessCode;

    // 在平台上的角色，比如服务提供方，服务消费方，合作机构，资金提供方
    @NameInMap("bussiness_role")
    public String bussinessRole;

    // 是否支付宝账户入驻
    @NameInMap("is_alipay_tenant")
    @Validation(required = true)
    public Boolean isAlipayTenant;

    // 是否认证过，不填默认未认证
    @NameInMap("antchain_certified")
    public Boolean antchainCertified;

    // 外部系统的会员ID，用于幂等
    @NameInMap("source_user_id")
    public String sourceUserId;

    // 注册区域
    @NameInMap("register_area")
    public String registerArea;

    public static CreateAntcloudAcmAntchainTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAntcloudAcmAntchainTenantRequest self = new CreateAntcloudAcmAntchainTenantRequest();
        return TeaModel.build(map, self);
    }

    public CreateAntcloudAcmAntchainTenantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAntcloudAcmAntchainTenantRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAntcloudAcmAntchainTenantRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public CreateAntcloudAcmAntchainTenantRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CreateAntcloudAcmAntchainTenantRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public CreateAntcloudAcmAntchainTenantRequest setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public CreateAntcloudAcmAntchainTenantRequest setArtificialPersonCertNo(String artificialPersonCertNo) {
        this.artificialPersonCertNo = artificialPersonCertNo;
        return this;
    }
    public String getArtificialPersonCertNo() {
        return this.artificialPersonCertNo;
    }

    public CreateAntcloudAcmAntchainTenantRequest setArtificialPersonCertType(String artificialPersonCertType) {
        this.artificialPersonCertType = artificialPersonCertType;
        return this;
    }
    public String getArtificialPersonCertType() {
        return this.artificialPersonCertType;
    }

    public CreateAntcloudAcmAntchainTenantRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public CreateAntcloudAcmAntchainTenantRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateAntcloudAcmAntchainTenantRequest setBussinessCode(String bussinessCode) {
        this.bussinessCode = bussinessCode;
        return this;
    }
    public String getBussinessCode() {
        return this.bussinessCode;
    }

    public CreateAntcloudAcmAntchainTenantRequest setBussinessRole(String bussinessRole) {
        this.bussinessRole = bussinessRole;
        return this;
    }
    public String getBussinessRole() {
        return this.bussinessRole;
    }

    public CreateAntcloudAcmAntchainTenantRequest setIsAlipayTenant(Boolean isAlipayTenant) {
        this.isAlipayTenant = isAlipayTenant;
        return this;
    }
    public Boolean getIsAlipayTenant() {
        return this.isAlipayTenant;
    }

    public CreateAntcloudAcmAntchainTenantRequest setAntchainCertified(Boolean antchainCertified) {
        this.antchainCertified = antchainCertified;
        return this;
    }
    public Boolean getAntchainCertified() {
        return this.antchainCertified;
    }

    public CreateAntcloudAcmAntchainTenantRequest setSourceUserId(String sourceUserId) {
        this.sourceUserId = sourceUserId;
        return this;
    }
    public String getSourceUserId() {
        return this.sourceUserId;
    }

    public CreateAntcloudAcmAntchainTenantRequest setRegisterArea(String registerArea) {
        this.registerArea = registerArea;
        return this;
    }
    public String getRegisterArea() {
        return this.registerArea;
    }

}
