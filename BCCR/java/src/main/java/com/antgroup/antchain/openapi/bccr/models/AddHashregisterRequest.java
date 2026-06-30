// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class AddHashregisterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 文件SHA256 hash
    @NameInMap("hash")
    @Validation(required = true)
    public String hash;

    // 文件大小
    @NameInMap("length")
    @Validation(required = true)
    public Long length;

    // hash算法
    @NameInMap("hash_type")
    @Validation(required = true)
    public String hashType;

    // 文件类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 文件名称
    @NameInMap("name")
    @Validation(required = true, maxLength = 128)
    public String name;

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

    // 是否自动创建公证保管函
    @NameInMap("create_certificate")
    public Boolean createCertificate;

    // 证书类型
    @NameInMap("certificate_type")
    public String certificateType;

    // 是否创建证据包，默认否
    @NameInMap("create_package")
    public Boolean createPackage;

    // 	
    // 公证处Id
    @NameInMap("org_id")
    public String orgId;

    // 电话号码
    @NameInMap("phone_num")
    public String phoneNum;

    // 作品信息
    @NameInMap("works_info")
    public WorksInfo worksInfo;

    // 是否创建权利声明书（默认否，选是需要rightsInfo传递对应信息）
    @NameInMap("create_statement")
    public Boolean createStatement;

    // 权利信息
    @NameInMap("rights_info")
    public RightsInfo rightsInfo;

    // 企业经办人姓名（如果certType为BUSINESS_LICENSE并且createStatement为true则必传）
    @NameInMap("manager_name")
    @Validation(maxLength = 32)
    public String managerName;

    // 企业经办人身份证号（如果certType为BUSINESS_LICENSE并且createStatement为true则必传）
    @NameInMap("manager_no")
    @Validation(maxLength = 30)
    public String managerNo;

    // 附属证据信息（最多5个文件，传递的是FileId）
    @NameInMap("ancillary_evidence")
    public java.util.List<String> ancillaryEvidence;

    // 著作权人信息
    @NameInMap("copyright_owner_info")
    public CopyrightCertInfo copyrightOwnerInfo;

    // 幂等字段
    @NameInMap("client_token")
    public String clientToken;

    // 特征文件oss id
    @NameInMap("feature_file_id")
    public String featureFileId;

    // 代理信息
    @NameInMap("proxy_info")
    public ProxyData proxyInfo;

    public static AddHashregisterRequest build(java.util.Map<String, ?> map) throws Exception {
        AddHashregisterRequest self = new AddHashregisterRequest();
        return TeaModel.build(map, self);
    }

    public AddHashregisterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddHashregisterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddHashregisterRequest setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

    public AddHashregisterRequest setLength(Long length) {
        this.length = length;
        return this;
    }
    public Long getLength() {
        return this.length;
    }

    public AddHashregisterRequest setHashType(String hashType) {
        this.hashType = hashType;
        return this;
    }
    public String getHashType() {
        return this.hashType;
    }

    public AddHashregisterRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AddHashregisterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddHashregisterRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public AddHashregisterRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public AddHashregisterRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public AddHashregisterRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public AddHashregisterRequest setCreateCertificate(Boolean createCertificate) {
        this.createCertificate = createCertificate;
        return this;
    }
    public Boolean getCreateCertificate() {
        return this.createCertificate;
    }

    public AddHashregisterRequest setCertificateType(String certificateType) {
        this.certificateType = certificateType;
        return this;
    }
    public String getCertificateType() {
        return this.certificateType;
    }

    public AddHashregisterRequest setCreatePackage(Boolean createPackage) {
        this.createPackage = createPackage;
        return this;
    }
    public Boolean getCreatePackage() {
        return this.createPackage;
    }

    public AddHashregisterRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public AddHashregisterRequest setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }
    public String getPhoneNum() {
        return this.phoneNum;
    }

    public AddHashregisterRequest setWorksInfo(WorksInfo worksInfo) {
        this.worksInfo = worksInfo;
        return this;
    }
    public WorksInfo getWorksInfo() {
        return this.worksInfo;
    }

    public AddHashregisterRequest setCreateStatement(Boolean createStatement) {
        this.createStatement = createStatement;
        return this;
    }
    public Boolean getCreateStatement() {
        return this.createStatement;
    }

    public AddHashregisterRequest setRightsInfo(RightsInfo rightsInfo) {
        this.rightsInfo = rightsInfo;
        return this;
    }
    public RightsInfo getRightsInfo() {
        return this.rightsInfo;
    }

    public AddHashregisterRequest setManagerName(String managerName) {
        this.managerName = managerName;
        return this;
    }
    public String getManagerName() {
        return this.managerName;
    }

    public AddHashregisterRequest setManagerNo(String managerNo) {
        this.managerNo = managerNo;
        return this;
    }
    public String getManagerNo() {
        return this.managerNo;
    }

    public AddHashregisterRequest setAncillaryEvidence(java.util.List<String> ancillaryEvidence) {
        this.ancillaryEvidence = ancillaryEvidence;
        return this;
    }
    public java.util.List<String> getAncillaryEvidence() {
        return this.ancillaryEvidence;
    }

    public AddHashregisterRequest setCopyrightOwnerInfo(CopyrightCertInfo copyrightOwnerInfo) {
        this.copyrightOwnerInfo = copyrightOwnerInfo;
        return this;
    }
    public CopyrightCertInfo getCopyrightOwnerInfo() {
        return this.copyrightOwnerInfo;
    }

    public AddHashregisterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddHashregisterRequest setFeatureFileId(String featureFileId) {
        this.featureFileId = featureFileId;
        return this;
    }
    public String getFeatureFileId() {
        return this.featureFileId;
    }

    public AddHashregisterRequest setProxyInfo(ProxyData proxyInfo) {
        this.proxyInfo = proxyInfo;
        return this;
    }
    public ProxyData getProxyInfo() {
        return this.proxyInfo;
    }

}
