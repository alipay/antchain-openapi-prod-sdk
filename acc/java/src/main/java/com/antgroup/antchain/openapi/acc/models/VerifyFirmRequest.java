// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class VerifyFirmRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 账号id
    @NameInMap("user_id")
    @Validation(required = true)
    public Long userId;

    // 企业名称
    @NameInMap("firm_name")
    public String firmName;

    // 企业类型
    @NameInMap("firm_type")
    public String firmType;

    // 企业营业执照注册号
    @NameInMap("cert_reg_no")
    public String certRegNo;

    // 企业营业执照图片，osskey
    @NameInMap("cert_reg_file_id")
    public String certRegFileId;

    // 法人证件类型
    @NameInMap("lp_cert_type")
    public String lpCertType;

    // 证件号码
    @NameInMap("lp_cert_no")
    public String lpCertNo;

    // 企业法人证件正面图片
    @NameInMap("lp_cert_file_front_id")
    public String lpCertFileFrontId;

    // 企业法人证件反面图片
    // 
    // 
    @NameInMap("lp_cert_file_reverse_id")
    public String lpCertFileReverseId;

    // JPEG,JPG
    @NameInMap("cert_reg_file_type")
    public String certRegFileType;

    // JPG
    @NameInMap("lp_cert_file_front_type")
    public String lpCertFileFrontType;

    // 身份证反面文件类型
    @NameInMap("lp_cert_file_reverse_type")
    public String lpCertFileReverseType;

    // 法人姓名
    @NameInMap("lp_name")
    public String lpName;

    // 租户信息
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 行业类型
    @NameInMap("industry_type")
    public String industryType;

    // 公司所在地
    @NameInMap("firm_address")
    public String firmAddress;

    // 提交类型
    @NameInMap("operation_type")
    @Validation(required = true)
    public String operationType;

    public static VerifyFirmRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyFirmRequest self = new VerifyFirmRequest();
        return TeaModel.build(map, self);
    }

    public VerifyFirmRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyFirmRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyFirmRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public VerifyFirmRequest setFirmName(String firmName) {
        this.firmName = firmName;
        return this;
    }
    public String getFirmName() {
        return this.firmName;
    }

    public VerifyFirmRequest setFirmType(String firmType) {
        this.firmType = firmType;
        return this;
    }
    public String getFirmType() {
        return this.firmType;
    }

    public VerifyFirmRequest setCertRegNo(String certRegNo) {
        this.certRegNo = certRegNo;
        return this;
    }
    public String getCertRegNo() {
        return this.certRegNo;
    }

    public VerifyFirmRequest setCertRegFileId(String certRegFileId) {
        this.certRegFileId = certRegFileId;
        return this;
    }
    public String getCertRegFileId() {
        return this.certRegFileId;
    }

    public VerifyFirmRequest setLpCertType(String lpCertType) {
        this.lpCertType = lpCertType;
        return this;
    }
    public String getLpCertType() {
        return this.lpCertType;
    }

    public VerifyFirmRequest setLpCertNo(String lpCertNo) {
        this.lpCertNo = lpCertNo;
        return this;
    }
    public String getLpCertNo() {
        return this.lpCertNo;
    }

    public VerifyFirmRequest setLpCertFileFrontId(String lpCertFileFrontId) {
        this.lpCertFileFrontId = lpCertFileFrontId;
        return this;
    }
    public String getLpCertFileFrontId() {
        return this.lpCertFileFrontId;
    }

    public VerifyFirmRequest setLpCertFileReverseId(String lpCertFileReverseId) {
        this.lpCertFileReverseId = lpCertFileReverseId;
        return this;
    }
    public String getLpCertFileReverseId() {
        return this.lpCertFileReverseId;
    }

    public VerifyFirmRequest setCertRegFileType(String certRegFileType) {
        this.certRegFileType = certRegFileType;
        return this;
    }
    public String getCertRegFileType() {
        return this.certRegFileType;
    }

    public VerifyFirmRequest setLpCertFileFrontType(String lpCertFileFrontType) {
        this.lpCertFileFrontType = lpCertFileFrontType;
        return this;
    }
    public String getLpCertFileFrontType() {
        return this.lpCertFileFrontType;
    }

    public VerifyFirmRequest setLpCertFileReverseType(String lpCertFileReverseType) {
        this.lpCertFileReverseType = lpCertFileReverseType;
        return this;
    }
    public String getLpCertFileReverseType() {
        return this.lpCertFileReverseType;
    }

    public VerifyFirmRequest setLpName(String lpName) {
        this.lpName = lpName;
        return this;
    }
    public String getLpName() {
        return this.lpName;
    }

    public VerifyFirmRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public VerifyFirmRequest setIndustryType(String industryType) {
        this.industryType = industryType;
        return this;
    }
    public String getIndustryType() {
        return this.industryType;
    }

    public VerifyFirmRequest setFirmAddress(String firmAddress) {
        this.firmAddress = firmAddress;
        return this;
    }
    public String getFirmAddress() {
        return this.firmAddress;
    }

    public VerifyFirmRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

}
