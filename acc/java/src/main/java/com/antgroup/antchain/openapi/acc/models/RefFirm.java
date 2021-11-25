// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class RefFirm extends TeaModel {
    // 企业Id
    // 
    // 
    @NameInMap("firm_user_id")
    @Validation(required = true)
    public Long firmUserId;

    // did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 	
    // 企业所在地
    @NameInMap("firm_address")
    @Validation(required = true)
    public String firmAddress;

    // 企业认证状态
    @NameInMap("firm_cert_status")
    @Validation(required = true)
    public String firmCertStatus;

    // 行业类型
    @NameInMap("industry_type")
    @Validation(required = true)
    public String industryType;

    // 企业营业执照注册号
    // 
    // 
    @NameInMap("cert_reg_no")
    @Validation(required = true)
    public String certRegNo;

    // 营业执照文件osskey
    // 
    // 
    @NameInMap("cert_reg_file_id")
    @Validation(required = true)
    public String certRegFileId;

    // 营业文件类型(JPEG,JPG)
    // 
    // 
    @NameInMap("cert_reg_file_type")
    @Validation(required = true)
    public String certRegFileType;

    // 法定代表人证件类型
    @NameInMap("lp_cert_type")
    @Validation(required = true)
    public String lpCertType;

    // 法人证件号码	
    // 
    @NameInMap("lp_cert_no")
    @Validation(required = true)
    public String lpCertNo;

    // 法人姓名
    // 
    // 
    @NameInMap("lp_name")
    @Validation(required = true)
    public String lpName;

    // 法人身份证正面图片字节信息，osskeyId
    // 
    // 
    @NameInMap("lp_cert_file_front_id")
    @Validation(required = true)
    public String lpCertFileFrontId;

    // 法人身份证正面图片文件类型
    // 
    // 
    @NameInMap("lp_cert_file_front_type")
    @Validation(required = true)
    public String lpCertFileFrontType;

    // 企业法人证件反面图片，osskeyId
    // 
    // 
    @NameInMap("lp_cert_file_reverse_id")
    @Validation(required = true)
    public String lpCertFileReverseId;

    // 法人身份证反面图片文件类型
    // 
    // 
    @NameInMap("lp_cert_file_reverse_type")
    @Validation(required = true)
    public String lpCertFileReverseType;

    // 施工资质
    // 
    // 
    @NameInMap("constructions")
    @Validation(required = true)
    public java.util.List<Construction> constructions;

    // 企业名称
    // 
    // 
    @NameInMap("firm_name")
    @Validation(required = true)
    public String firmName;

    // 关联关系 （参见附录三）
    // 
    // 
    @NameInMap("refer_type")
    @Validation(required = true)
    public String referType;

    // 资信-财报
    // 
    // 
    @NameInMap("account_results")
    @Validation(required = true)
    public java.util.List<AccountResult> accountResults;

    // 资信-担保
    // 
    // 
    @NameInMap("assures")
    @Validation(required = true)
    public java.util.List<Assure> assures;

    // 奖项
    // 
    // 
    @NameInMap("awards")
    @Validation(required = true)
    public java.util.List<Award> awards;

    // 银行授信
    // 
    // 
    @NameInMap("bank_cert")
    @Validation(required = true)
    public BankCert bankCert;

    // 类型
    @NameInMap("firm_type")
    @Validation(required = true)
    public String firmType;

    // 银行授信状态
    @NameInMap("bank_cert_status")
    public Boolean bankCertStatus;

    // 资质证书状态
    @NameInMap("construction_status")
    public Boolean constructionStatus;

    // 资信-财报状态
    @NameInMap("account_result_status")
    @Validation(required = true)
    public Boolean accountResultStatus;

    // 奖项状态
    @NameInMap("award_status")
    public Boolean awardStatus;

    public static RefFirm build(java.util.Map<String, ?> map) throws Exception {
        RefFirm self = new RefFirm();
        return TeaModel.build(map, self);
    }

    public RefFirm setFirmUserId(Long firmUserId) {
        this.firmUserId = firmUserId;
        return this;
    }
    public Long getFirmUserId() {
        return this.firmUserId;
    }

    public RefFirm setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public RefFirm setFirmAddress(String firmAddress) {
        this.firmAddress = firmAddress;
        return this;
    }
    public String getFirmAddress() {
        return this.firmAddress;
    }

    public RefFirm setFirmCertStatus(String firmCertStatus) {
        this.firmCertStatus = firmCertStatus;
        return this;
    }
    public String getFirmCertStatus() {
        return this.firmCertStatus;
    }

    public RefFirm setIndustryType(String industryType) {
        this.industryType = industryType;
        return this;
    }
    public String getIndustryType() {
        return this.industryType;
    }

    public RefFirm setCertRegNo(String certRegNo) {
        this.certRegNo = certRegNo;
        return this;
    }
    public String getCertRegNo() {
        return this.certRegNo;
    }

    public RefFirm setCertRegFileId(String certRegFileId) {
        this.certRegFileId = certRegFileId;
        return this;
    }
    public String getCertRegFileId() {
        return this.certRegFileId;
    }

    public RefFirm setCertRegFileType(String certRegFileType) {
        this.certRegFileType = certRegFileType;
        return this;
    }
    public String getCertRegFileType() {
        return this.certRegFileType;
    }

    public RefFirm setLpCertType(String lpCertType) {
        this.lpCertType = lpCertType;
        return this;
    }
    public String getLpCertType() {
        return this.lpCertType;
    }

    public RefFirm setLpCertNo(String lpCertNo) {
        this.lpCertNo = lpCertNo;
        return this;
    }
    public String getLpCertNo() {
        return this.lpCertNo;
    }

    public RefFirm setLpName(String lpName) {
        this.lpName = lpName;
        return this;
    }
    public String getLpName() {
        return this.lpName;
    }

    public RefFirm setLpCertFileFrontId(String lpCertFileFrontId) {
        this.lpCertFileFrontId = lpCertFileFrontId;
        return this;
    }
    public String getLpCertFileFrontId() {
        return this.lpCertFileFrontId;
    }

    public RefFirm setLpCertFileFrontType(String lpCertFileFrontType) {
        this.lpCertFileFrontType = lpCertFileFrontType;
        return this;
    }
    public String getLpCertFileFrontType() {
        return this.lpCertFileFrontType;
    }

    public RefFirm setLpCertFileReverseId(String lpCertFileReverseId) {
        this.lpCertFileReverseId = lpCertFileReverseId;
        return this;
    }
    public String getLpCertFileReverseId() {
        return this.lpCertFileReverseId;
    }

    public RefFirm setLpCertFileReverseType(String lpCertFileReverseType) {
        this.lpCertFileReverseType = lpCertFileReverseType;
        return this;
    }
    public String getLpCertFileReverseType() {
        return this.lpCertFileReverseType;
    }

    public RefFirm setConstructions(java.util.List<Construction> constructions) {
        this.constructions = constructions;
        return this;
    }
    public java.util.List<Construction> getConstructions() {
        return this.constructions;
    }

    public RefFirm setFirmName(String firmName) {
        this.firmName = firmName;
        return this;
    }
    public String getFirmName() {
        return this.firmName;
    }

    public RefFirm setReferType(String referType) {
        this.referType = referType;
        return this;
    }
    public String getReferType() {
        return this.referType;
    }

    public RefFirm setAccountResults(java.util.List<AccountResult> accountResults) {
        this.accountResults = accountResults;
        return this;
    }
    public java.util.List<AccountResult> getAccountResults() {
        return this.accountResults;
    }

    public RefFirm setAssures(java.util.List<Assure> assures) {
        this.assures = assures;
        return this;
    }
    public java.util.List<Assure> getAssures() {
        return this.assures;
    }

    public RefFirm setAwards(java.util.List<Award> awards) {
        this.awards = awards;
        return this;
    }
    public java.util.List<Award> getAwards() {
        return this.awards;
    }

    public RefFirm setBankCert(BankCert bankCert) {
        this.bankCert = bankCert;
        return this;
    }
    public BankCert getBankCert() {
        return this.bankCert;
    }

    public RefFirm setFirmType(String firmType) {
        this.firmType = firmType;
        return this;
    }
    public String getFirmType() {
        return this.firmType;
    }

    public RefFirm setBankCertStatus(Boolean bankCertStatus) {
        this.bankCertStatus = bankCertStatus;
        return this;
    }
    public Boolean getBankCertStatus() {
        return this.bankCertStatus;
    }

    public RefFirm setConstructionStatus(Boolean constructionStatus) {
        this.constructionStatus = constructionStatus;
        return this;
    }
    public Boolean getConstructionStatus() {
        return this.constructionStatus;
    }

    public RefFirm setAccountResultStatus(Boolean accountResultStatus) {
        this.accountResultStatus = accountResultStatus;
        return this;
    }
    public Boolean getAccountResultStatus() {
        return this.accountResultStatus;
    }

    public RefFirm setAwardStatus(Boolean awardStatus) {
        this.awardStatus = awardStatus;
        return this;
    }
    public Boolean getAwardStatus() {
        return this.awardStatus;
    }

}
