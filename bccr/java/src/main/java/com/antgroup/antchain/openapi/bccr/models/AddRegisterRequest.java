// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class AddRegisterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 文件oss id
    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // 是否自动创建公证书,默认否
    @NameInMap("create_certificate")
    public Boolean createCertificate;

    // 证书类型
    @NameInMap("certificate_type")
    public String certificateType;

    // 是否创建证据包，默认否
    @NameInMap("create_package")
    public Boolean createPackage;

    // 公证处id
    @NameInMap("org_id")
    public String orgId;

    // 文件名称
    @NameInMap("name")
    @Validation(required = true, maxLength = 128)
    public String name;

    // 文件类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 备注
    @NameInMap("memo")
    @Validation(maxLength = 512)
    public String memo;

    // 证件名称
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    // 证件号码
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 证件类型
    @NameInMap("cert_type")
    @Validation(required = true)
    public String certType;

    // 电话号码
    @NameInMap("phone_num")
    public String phoneNum;

    // 作品信息
    @NameInMap("works_info")
    public WorksInfo worksInfo;

    // 是否创建权利声明书（默认否，选是需要rightsInfo传递对应信息）
    @NameInMap("create_statement")
    public Boolean createStatement;

    // 企业经办人姓名（如果certType为BUSINESS_LICENSE并且createStatement为true则必传）
    @NameInMap("manager_name")
    @Validation(maxLength = 32)
    public String managerName;

    // 企业经办人身份证号（如果certType为BUSINESS_LICENSE并且createStatement为true则必传）
    @NameInMap("manager_no")
    @Validation(maxLength = 30)
    public String managerNo;

    // 权利信息
    @NameInMap("rights_info")
    public RightsInfo rightsInfo;

    // 附属证据信息（最多5个文件，传递的是FileId）
    @NameInMap("ancillary_evidence")
    public java.util.List<String> ancillaryEvidence;

    // 著作权人信息
    @NameInMap("copyright_owner_info")
    public CopyrightCertInfo copyrightOwnerInfo;

    // 幂等
    @NameInMap("client_token")
    public String clientToken;

    // 同步账号信息
    @NameInMap("sync_info")
    public AccountData syncInfo;

    // 代理信息
    @NameInMap("proxy_info")
    public ProxyData proxyInfo;

    public static AddRegisterRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRegisterRequest self = new AddRegisterRequest();
        return TeaModel.build(map, self);
    }

    public AddRegisterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddRegisterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddRegisterRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public AddRegisterRequest setCreateCertificate(Boolean createCertificate) {
        this.createCertificate = createCertificate;
        return this;
    }
    public Boolean getCreateCertificate() {
        return this.createCertificate;
    }

    public AddRegisterRequest setCertificateType(String certificateType) {
        this.certificateType = certificateType;
        return this;
    }
    public String getCertificateType() {
        return this.certificateType;
    }

    public AddRegisterRequest setCreatePackage(Boolean createPackage) {
        this.createPackage = createPackage;
        return this;
    }
    public Boolean getCreatePackage() {
        return this.createPackage;
    }

    public AddRegisterRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public AddRegisterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddRegisterRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AddRegisterRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public AddRegisterRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public AddRegisterRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public AddRegisterRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public AddRegisterRequest setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }
    public String getPhoneNum() {
        return this.phoneNum;
    }

    public AddRegisterRequest setWorksInfo(WorksInfo worksInfo) {
        this.worksInfo = worksInfo;
        return this;
    }
    public WorksInfo getWorksInfo() {
        return this.worksInfo;
    }

    public AddRegisterRequest setCreateStatement(Boolean createStatement) {
        this.createStatement = createStatement;
        return this;
    }
    public Boolean getCreateStatement() {
        return this.createStatement;
    }

    public AddRegisterRequest setManagerName(String managerName) {
        this.managerName = managerName;
        return this;
    }
    public String getManagerName() {
        return this.managerName;
    }

    public AddRegisterRequest setManagerNo(String managerNo) {
        this.managerNo = managerNo;
        return this;
    }
    public String getManagerNo() {
        return this.managerNo;
    }

    public AddRegisterRequest setRightsInfo(RightsInfo rightsInfo) {
        this.rightsInfo = rightsInfo;
        return this;
    }
    public RightsInfo getRightsInfo() {
        return this.rightsInfo;
    }

    public AddRegisterRequest setAncillaryEvidence(java.util.List<String> ancillaryEvidence) {
        this.ancillaryEvidence = ancillaryEvidence;
        return this;
    }
    public java.util.List<String> getAncillaryEvidence() {
        return this.ancillaryEvidence;
    }

    public AddRegisterRequest setCopyrightOwnerInfo(CopyrightCertInfo copyrightOwnerInfo) {
        this.copyrightOwnerInfo = copyrightOwnerInfo;
        return this;
    }
    public CopyrightCertInfo getCopyrightOwnerInfo() {
        return this.copyrightOwnerInfo;
    }

    public AddRegisterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddRegisterRequest setSyncInfo(AccountData syncInfo) {
        this.syncInfo = syncInfo;
        return this;
    }
    public AccountData getSyncInfo() {
        return this.syncInfo;
    }

    public AddRegisterRequest setProxyInfo(ProxyData proxyInfo) {
        this.proxyInfo = proxyInfo;
        return this;
    }
    public ProxyData getProxyInfo() {
        return this.proxyInfo;
    }

}
