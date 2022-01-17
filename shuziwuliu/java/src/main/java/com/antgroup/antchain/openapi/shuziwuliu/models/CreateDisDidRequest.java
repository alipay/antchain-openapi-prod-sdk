// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CreateDisDidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 个人身份证号。当组织类型为个人时，此字段为必填项
    @NameInMap("cert_no")
    public String certNo;

    // 企业名称。当组织类型为企业时，此字段为必填项
    @NameInMap("ep_cert_name")
    public String epCertName;

    // 企业信用号码。当组织类型为企业时，此字段为必填项
    @NameInMap("ep_cert_no")
    public String epCertNo;

    // 扩展字段
    @NameInMap("extension_info")
    public String extensionInfo;

    // 企业法人姓名。当申请企业类型网络货运平台或者子平台时，此字段为必填项
    @NameInMap("legal_person_cert_name")
    public String legalPersonCertName;

    // 企业法人身份证号码。当申请企业类型网络货运平台或者子平台时，此字段为必填项
    @NameInMap("legal_person_cert_no")
    public String legalPersonCertNo;

    // 个人手机号码。当组织类型为个人时，此字段为必填项
    @NameInMap("mobile")
    public String mobile;

    // 个人姓名。当组织类型为个人时，此字段为必填项
    @NameInMap("name")
    public String name;

    // 组织类型。企业或者个人，二选一填入
    @NameInMap("organization_type")
    @Validation(required = true)
    public String organizationType;

    // 所属平台did。如果为空时，表示创建根平台，允许申请网络货运平台或者3pl角色。创建除根平台外的其他身份时，所属平台did必须填写。
    @NameInMap("platform_did")
    public String platformDid;

    // 角色类型。
    // 当组织类型为个人时，可填角色：货主、司机、承运商；
    // 当组织类型为企业时，可填角色：网络货运平台、道路运输企业/3pl、货主、子平台、承运商、托盘方
    @NameInMap("role_type")
    @Validation(required = true)
    public String roleType;

    public static CreateDisDidRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDisDidRequest self = new CreateDisDidRequest();
        return TeaModel.build(map, self);
    }

    public CreateDisDidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDisDidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDisDidRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CreateDisDidRequest setEpCertName(String epCertName) {
        this.epCertName = epCertName;
        return this;
    }
    public String getEpCertName() {
        return this.epCertName;
    }

    public CreateDisDidRequest setEpCertNo(String epCertNo) {
        this.epCertNo = epCertNo;
        return this;
    }
    public String getEpCertNo() {
        return this.epCertNo;
    }

    public CreateDisDidRequest setExtensionInfo(String extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }
    public String getExtensionInfo() {
        return this.extensionInfo;
    }

    public CreateDisDidRequest setLegalPersonCertName(String legalPersonCertName) {
        this.legalPersonCertName = legalPersonCertName;
        return this;
    }
    public String getLegalPersonCertName() {
        return this.legalPersonCertName;
    }

    public CreateDisDidRequest setLegalPersonCertNo(String legalPersonCertNo) {
        this.legalPersonCertNo = legalPersonCertNo;
        return this;
    }
    public String getLegalPersonCertNo() {
        return this.legalPersonCertNo;
    }

    public CreateDisDidRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public CreateDisDidRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDisDidRequest setOrganizationType(String organizationType) {
        this.organizationType = organizationType;
        return this;
    }
    public String getOrganizationType() {
        return this.organizationType;
    }

    public CreateDisDidRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public CreateDisDidRequest setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }
    public String getRoleType() {
        return this.roleType;
    }

}
