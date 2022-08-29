// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class AddDciUserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户名称
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    // 证件类型
    @NameInMap("certificate_type")
    @Validation(required = true)
    public String certificateType;

    // 证件号
    @NameInMap("certificate_number")
    @Validation(required = true)
    public String certificateNumber;

    // 证件有效期限起始日期
    @NameInMap("certificate_start_time")
    public String certificateStartTime;

    // 证件有效期限终止日期
    @NameInMap("certificate_end_time")
    public String certificateEndTime;

    // 证件正面OSS fileId
    @NameInMap("certificate_front_file_id")
    @Validation(required = true)
    public String certificateFrontFileId;

    // 证件反面OSS fileId
    @NameInMap("certificate_back_file_id")
    public String certificateBackFileId;

    // 法人名称
    @NameInMap("legal_person_cert_name")
    public String legalPersonCertName;

    // 法人证件类型
    @NameInMap("legal_person_cert_type")
    public String legalPersonCertType;

    // 法人证件号
    @NameInMap("legal_person_cert_no")
    public String legalPersonCertNo;

    // 手机号
    @NameInMap("phone")
    @Validation(required = true)
    public String phone;

    // 地址
    @NameInMap("address")
    @Validation(required = true)
    public String address;

    // 用户身份开始时间
    @NameInMap("identity_start_time")
    @Validation(required = true)
    public String identityStartTime;

    // 所属地区
    @NameInMap("area_type")
    @Validation(required = true)
    public String areaType;

    // 代理信息
    @NameInMap("proxy_data")
    @Validation(required = true)
    public ProxyData proxyData;

    // 幂等字段
    @NameInMap("client_token")
    @Validation(required = true)
    public String clientToken;

    // 用户名称废弃
    @NameInMap("user_name")
    public String userName;

    // 证件正面OSS fileId废弃
    @NameInMap("certificate_front_file_path")
    public String certificateFrontFilePath;

    // 证件反面OSS filePath废弃
    @NameInMap("certificate_back_file_path")
    public String certificateBackFilePath;

    // 用户类型废弃
    @NameInMap("user_type")
    public String userType;

    public static AddDciUserRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDciUserRequest self = new AddDciUserRequest();
        return TeaModel.build(map, self);
    }

    public AddDciUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddDciUserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddDciUserRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public AddDciUserRequest setCertificateType(String certificateType) {
        this.certificateType = certificateType;
        return this;
    }
    public String getCertificateType() {
        return this.certificateType;
    }

    public AddDciUserRequest setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
        return this;
    }
    public String getCertificateNumber() {
        return this.certificateNumber;
    }

    public AddDciUserRequest setCertificateStartTime(String certificateStartTime) {
        this.certificateStartTime = certificateStartTime;
        return this;
    }
    public String getCertificateStartTime() {
        return this.certificateStartTime;
    }

    public AddDciUserRequest setCertificateEndTime(String certificateEndTime) {
        this.certificateEndTime = certificateEndTime;
        return this;
    }
    public String getCertificateEndTime() {
        return this.certificateEndTime;
    }

    public AddDciUserRequest setCertificateFrontFileId(String certificateFrontFileId) {
        this.certificateFrontFileId = certificateFrontFileId;
        return this;
    }
    public String getCertificateFrontFileId() {
        return this.certificateFrontFileId;
    }

    public AddDciUserRequest setCertificateBackFileId(String certificateBackFileId) {
        this.certificateBackFileId = certificateBackFileId;
        return this;
    }
    public String getCertificateBackFileId() {
        return this.certificateBackFileId;
    }

    public AddDciUserRequest setLegalPersonCertName(String legalPersonCertName) {
        this.legalPersonCertName = legalPersonCertName;
        return this;
    }
    public String getLegalPersonCertName() {
        return this.legalPersonCertName;
    }

    public AddDciUserRequest setLegalPersonCertType(String legalPersonCertType) {
        this.legalPersonCertType = legalPersonCertType;
        return this;
    }
    public String getLegalPersonCertType() {
        return this.legalPersonCertType;
    }

    public AddDciUserRequest setLegalPersonCertNo(String legalPersonCertNo) {
        this.legalPersonCertNo = legalPersonCertNo;
        return this;
    }
    public String getLegalPersonCertNo() {
        return this.legalPersonCertNo;
    }

    public AddDciUserRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public AddDciUserRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public AddDciUserRequest setIdentityStartTime(String identityStartTime) {
        this.identityStartTime = identityStartTime;
        return this;
    }
    public String getIdentityStartTime() {
        return this.identityStartTime;
    }

    public AddDciUserRequest setAreaType(String areaType) {
        this.areaType = areaType;
        return this;
    }
    public String getAreaType() {
        return this.areaType;
    }

    public AddDciUserRequest setProxyData(ProxyData proxyData) {
        this.proxyData = proxyData;
        return this;
    }
    public ProxyData getProxyData() {
        return this.proxyData;
    }

    public AddDciUserRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddDciUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public AddDciUserRequest setCertificateFrontFilePath(String certificateFrontFilePath) {
        this.certificateFrontFilePath = certificateFrontFilePath;
        return this;
    }
    public String getCertificateFrontFilePath() {
        return this.certificateFrontFilePath;
    }

    public AddDciUserRequest setCertificateBackFilePath(String certificateBackFilePath) {
        this.certificateBackFilePath = certificateBackFilePath;
        return this;
    }
    public String getCertificateBackFilePath() {
        return this.certificateBackFilePath;
    }

    public AddDciUserRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
