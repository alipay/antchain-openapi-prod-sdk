// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class UpdateDciUserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // dci用户ID
    @NameInMap("dci_user_id")
    @Validation(required = true)
    public String dciUserId;

    // 证件正面oss fileId
    @NameInMap("cert_front_file_id")
    @Validation(required = true)
    public String certFrontFileId;

    // 证件背面oss fileId
    @NameInMap("cert_back_file_id")
    public String certBackFileId;

    // 手机号
    @NameInMap("phone")
    public String phone;

    // 客户端令牌
    @NameInMap("client_token")
    public String clientToken;

    // 版权认证方式:UGC-用户生成内容，AIGC-AI生成内容，SOFTWARE_WORKS-软件作品认证，如果不传默认为UGC
    @NameInMap("copyright_certification_type")
    public String copyrightCertificationType;

    // 法人信息
    @NameInMap("legal_person_info")
    public EnterpriseLegalPersonInfo legalPersonInfo;

    // true,false
    @NameInMap("long_term_valid")
    public Boolean longTermValid;

    // 证件有效期开始时间
    @NameInMap("certificate_start_time")
    public String certificateStartTime;

    // 证件有效期终止时间
    @NameInMap("certificate_end_time")
    public String certificateEndTime;

    // 成立日期或出生日期
    @NameInMap("identity_start_time")
    public String identityStartTime;

    // 地址信息
    @NameInMap("address")
    public String address;

    // 著作权人名称
    @NameInMap("cert_name")
    public String certName;

    // 著作权人证件号
    @NameInMap("certificate_number")
    public String certificateNumber;

    // 著作权人证件类型
    @NameInMap("certificate_type")
    public String certificateType;

    public static UpdateDciUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDciUserRequest self = new UpdateDciUserRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDciUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDciUserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateDciUserRequest setDciUserId(String dciUserId) {
        this.dciUserId = dciUserId;
        return this;
    }
    public String getDciUserId() {
        return this.dciUserId;
    }

    public UpdateDciUserRequest setCertFrontFileId(String certFrontFileId) {
        this.certFrontFileId = certFrontFileId;
        return this;
    }
    public String getCertFrontFileId() {
        return this.certFrontFileId;
    }

    public UpdateDciUserRequest setCertBackFileId(String certBackFileId) {
        this.certBackFileId = certBackFileId;
        return this;
    }
    public String getCertBackFileId() {
        return this.certBackFileId;
    }

    public UpdateDciUserRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public UpdateDciUserRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateDciUserRequest setCopyrightCertificationType(String copyrightCertificationType) {
        this.copyrightCertificationType = copyrightCertificationType;
        return this;
    }
    public String getCopyrightCertificationType() {
        return this.copyrightCertificationType;
    }

    public UpdateDciUserRequest setLegalPersonInfo(EnterpriseLegalPersonInfo legalPersonInfo) {
        this.legalPersonInfo = legalPersonInfo;
        return this;
    }
    public EnterpriseLegalPersonInfo getLegalPersonInfo() {
        return this.legalPersonInfo;
    }

    public UpdateDciUserRequest setLongTermValid(Boolean longTermValid) {
        this.longTermValid = longTermValid;
        return this;
    }
    public Boolean getLongTermValid() {
        return this.longTermValid;
    }

    public UpdateDciUserRequest setCertificateStartTime(String certificateStartTime) {
        this.certificateStartTime = certificateStartTime;
        return this;
    }
    public String getCertificateStartTime() {
        return this.certificateStartTime;
    }

    public UpdateDciUserRequest setCertificateEndTime(String certificateEndTime) {
        this.certificateEndTime = certificateEndTime;
        return this;
    }
    public String getCertificateEndTime() {
        return this.certificateEndTime;
    }

    public UpdateDciUserRequest setIdentityStartTime(String identityStartTime) {
        this.identityStartTime = identityStartTime;
        return this;
    }
    public String getIdentityStartTime() {
        return this.identityStartTime;
    }

    public UpdateDciUserRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public UpdateDciUserRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public UpdateDciUserRequest setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
        return this;
    }
    public String getCertificateNumber() {
        return this.certificateNumber;
    }

    public UpdateDciUserRequest setCertificateType(String certificateType) {
        this.certificateType = certificateType;
        return this;
    }
    public String getCertificateType() {
        return this.certificateType;
    }

}
