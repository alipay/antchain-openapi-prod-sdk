// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class OfflineRegisterResult extends TeaModel {
    // 取证文件
    @NameInMap("evidence_file")
    public EvidenceFile evidenceFile;

    // 线下取证ID
    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("offline_evidence_id")
    @Validation(required = true)
    public String offlineEvidenceId;

    // 错误码
    /**
     * <strong>example:</strong>
     * <p>NOTARY_OFFLINE_REGISTER_ERROR</p>
     */
    @NameInMap("error_code")
    public String errorCode;

    // 错误信息
    /**
     * <strong>example:</strong>
     * <p>公证处线下取证存证失败</p>
     */
    @NameInMap("error_message")
    public String errorMessage;

    // 取证状态
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 取证时间
    /**
     * <strong>example:</strong>
     * <p>1713770769000</p>
     */
    @NameInMap("evidence_time")
    public Long evidenceTime;

    // 委托取证ID
    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("evidence_assignment_id")
    public String evidenceAssignmentId;

    // 取证用户ID
    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("evidence_user_id")
    public String evidenceUserId;

    // 取证名称
    /**
     * <strong>example:</strong>
     * <p>取证名称</p>
     */
    @NameInMap("evidence_name")
    public String evidenceName;

    // 公证处code
    /**
     * <strong>example:</strong>
     * <p>LU_JIANG</p>
     */
    @NameInMap("notary_office_code")
    public String notaryOfficeCode;

    // 公证处名称
    /**
     * <strong>example:</strong>
     * <p>鹭江公证处</p>
     */
    @NameInMap("notary_office_name")
    public String notaryOfficeName;

    // 经度
    /**
     * <strong>example:</strong>
     * <p>23.35</p>
     */
    @NameInMap("longitude")
    public String longitude;

    // 纬度
    /**
     * <strong>example:</strong>
     * <p>23.35</p>
     */
    @NameInMap("latitude")
    public String latitude;

    // 位置
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("location")
    public String location;

    // 取证开始时间
    /**
     * <strong>example:</strong>
     * <p>1713770769000</p>
     */
    @NameInMap("evidence_start_time")
    public Long evidenceStartTime;

    // 取证结束时间
    /**
     * <strong>example:</strong>
     * <p>1713770769000</p>
     */
    @NameInMap("evidence_end_time")
    public Long evidenceEndTime;

    // 取证类型
    /**
     * <strong>example:</strong>
     * <p>OFFLINE_PICTURE</p>
     */
    @NameInMap("evidence_type")
    @Validation(required = true)
    public String evidenceType;

    // 存证编号
    /**
     * <strong>example:</strong>
     * <p>8240401000000013980</p>
     */
    @NameInMap("certificate_no")
    public String certificateNo;

    // 	
    // 上链时间
    /**
     * <strong>example:</strong>
     * <p>1713771170000</p>
     */
    @NameInMap("certificate_time")
    public Long certificateTime;

    // 证据hash
    /**
     * <strong>example:</strong>
     * <p>2ed3532c4438f82eef7cdf6a54e7ac11</p>
     */
    @NameInMap("evidence_hash")
    public String evidenceHash;

    // 链上交易hash
    /**
     * <strong>example:</strong>
     * <p>b251a2d54ea254165c9baf13e8366635b1c90d4a449a35fcdce7b332054c8aac</p>
     */
    @NameInMap("evidence_tx_hash")
    public String evidenceTxHash;

    // 证书文件下载地址
    /**
     * <strong>example:</strong>
     * <p><a href="https://www.baidu.com">https://www.baidu.com</a></p>
     */
    @NameInMap("certificate_file_url")
    public String certificateFileUrl;

    // 备注
    /**
     * <strong>example:</strong>
     * <p>备注</p>
     */
    @NameInMap("memo")
    public String memo;

    public static OfflineRegisterResult build(java.util.Map<String, ?> map) throws Exception {
        OfflineRegisterResult self = new OfflineRegisterResult();
        return TeaModel.build(map, self);
    }

    public OfflineRegisterResult setEvidenceFile(EvidenceFile evidenceFile) {
        this.evidenceFile = evidenceFile;
        return this;
    }
    public EvidenceFile getEvidenceFile() {
        return this.evidenceFile;
    }

    public OfflineRegisterResult setOfflineEvidenceId(String offlineEvidenceId) {
        this.offlineEvidenceId = offlineEvidenceId;
        return this;
    }
    public String getOfflineEvidenceId() {
        return this.offlineEvidenceId;
    }

    public OfflineRegisterResult setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public OfflineRegisterResult setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public OfflineRegisterResult setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public OfflineRegisterResult setEvidenceTime(Long evidenceTime) {
        this.evidenceTime = evidenceTime;
        return this;
    }
    public Long getEvidenceTime() {
        return this.evidenceTime;
    }

    public OfflineRegisterResult setEvidenceAssignmentId(String evidenceAssignmentId) {
        this.evidenceAssignmentId = evidenceAssignmentId;
        return this;
    }
    public String getEvidenceAssignmentId() {
        return this.evidenceAssignmentId;
    }

    public OfflineRegisterResult setEvidenceUserId(String evidenceUserId) {
        this.evidenceUserId = evidenceUserId;
        return this;
    }
    public String getEvidenceUserId() {
        return this.evidenceUserId;
    }

    public OfflineRegisterResult setEvidenceName(String evidenceName) {
        this.evidenceName = evidenceName;
        return this;
    }
    public String getEvidenceName() {
        return this.evidenceName;
    }

    public OfflineRegisterResult setNotaryOfficeCode(String notaryOfficeCode) {
        this.notaryOfficeCode = notaryOfficeCode;
        return this;
    }
    public String getNotaryOfficeCode() {
        return this.notaryOfficeCode;
    }

    public OfflineRegisterResult setNotaryOfficeName(String notaryOfficeName) {
        this.notaryOfficeName = notaryOfficeName;
        return this;
    }
    public String getNotaryOfficeName() {
        return this.notaryOfficeName;
    }

    public OfflineRegisterResult setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public OfflineRegisterResult setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public OfflineRegisterResult setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public OfflineRegisterResult setEvidenceStartTime(Long evidenceStartTime) {
        this.evidenceStartTime = evidenceStartTime;
        return this;
    }
    public Long getEvidenceStartTime() {
        return this.evidenceStartTime;
    }

    public OfflineRegisterResult setEvidenceEndTime(Long evidenceEndTime) {
        this.evidenceEndTime = evidenceEndTime;
        return this;
    }
    public Long getEvidenceEndTime() {
        return this.evidenceEndTime;
    }

    public OfflineRegisterResult setEvidenceType(String evidenceType) {
        this.evidenceType = evidenceType;
        return this;
    }
    public String getEvidenceType() {
        return this.evidenceType;
    }

    public OfflineRegisterResult setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
        return this;
    }
    public String getCertificateNo() {
        return this.certificateNo;
    }

    public OfflineRegisterResult setCertificateTime(Long certificateTime) {
        this.certificateTime = certificateTime;
        return this;
    }
    public Long getCertificateTime() {
        return this.certificateTime;
    }

    public OfflineRegisterResult setEvidenceHash(String evidenceHash) {
        this.evidenceHash = evidenceHash;
        return this;
    }
    public String getEvidenceHash() {
        return this.evidenceHash;
    }

    public OfflineRegisterResult setEvidenceTxHash(String evidenceTxHash) {
        this.evidenceTxHash = evidenceTxHash;
        return this;
    }
    public String getEvidenceTxHash() {
        return this.evidenceTxHash;
    }

    public OfflineRegisterResult setCertificateFileUrl(String certificateFileUrl) {
        this.certificateFileUrl = certificateFileUrl;
        return this;
    }
    public String getCertificateFileUrl() {
        return this.certificateFileUrl;
    }

    public OfflineRegisterResult setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

}
