// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class LegalInfo extends TeaModel {
    // 法人名称
    /**
     * <strong>example:</strong>
     * <p>法人名称</p>
     */
    @NameInMap("legal_name")
    @Validation(required = true)
    public String legalName;

    // 法人证件号
    /**
     * <strong>example:</strong>
     * <p>法人证件号</p>
     */
    @NameInMap("legal_cert_no")
    @Validation(required = true)
    public String legalCertNo;

    // 法人证件正面（人像面）
    @NameInMap("legal_cert_front_file")
    @Validation(required = true)
    public FileInfo legalCertFrontFile;

    // 法人证件反面
    @NameInMap("legal_cert_back_file")
    @Validation(required = true)
    public FileInfo legalCertBackFile;

    // 法人证件是否长期有效（payChannel =JDPAY必填）
    // true：长期，false：非长期
    // 
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("legal_cert_expire_flag")
    public Boolean legalCertExpireFlag;

    // 法人手机号（payChannel =JDPAY必填）
    /**
     * <strong>example:</strong>
     * <p>15679375832</p>
     */
    @NameInMap("legal_mobile")
    public String legalMobile;

    // 证件有效期开始日期（payChannel =JDPAY必填）
    // legalCertExpireFlag=false/true时都必填，时间格式:yyyy-MM-dd
    /**
     * <strong>example:</strong>
     * <p>2025-10-31</p>
     */
    @NameInMap("legal_effect_date")
    public String legalEffectDate;

    // 证件有效期结束（payChannel =JDPAY选填）
    // legalCertExpireFlag=false时必填，时间格式:yyyy-MM-dd
    /**
     * <strong>example:</strong>
     * <p>2025-10-31</p>
     */
    @NameInMap("legal_expire_date")
    public String legalExpireDate;

    public static LegalInfo build(java.util.Map<String, ?> map) throws Exception {
        LegalInfo self = new LegalInfo();
        return TeaModel.build(map, self);
    }

    public LegalInfo setLegalName(String legalName) {
        this.legalName = legalName;
        return this;
    }
    public String getLegalName() {
        return this.legalName;
    }

    public LegalInfo setLegalCertNo(String legalCertNo) {
        this.legalCertNo = legalCertNo;
        return this;
    }
    public String getLegalCertNo() {
        return this.legalCertNo;
    }

    public LegalInfo setLegalCertFrontFile(FileInfo legalCertFrontFile) {
        this.legalCertFrontFile = legalCertFrontFile;
        return this;
    }
    public FileInfo getLegalCertFrontFile() {
        return this.legalCertFrontFile;
    }

    public LegalInfo setLegalCertBackFile(FileInfo legalCertBackFile) {
        this.legalCertBackFile = legalCertBackFile;
        return this;
    }
    public FileInfo getLegalCertBackFile() {
        return this.legalCertBackFile;
    }

    public LegalInfo setLegalCertExpireFlag(Boolean legalCertExpireFlag) {
        this.legalCertExpireFlag = legalCertExpireFlag;
        return this;
    }
    public Boolean getLegalCertExpireFlag() {
        return this.legalCertExpireFlag;
    }

    public LegalInfo setLegalMobile(String legalMobile) {
        this.legalMobile = legalMobile;
        return this;
    }
    public String getLegalMobile() {
        return this.legalMobile;
    }

    public LegalInfo setLegalEffectDate(String legalEffectDate) {
        this.legalEffectDate = legalEffectDate;
        return this;
    }
    public String getLegalEffectDate() {
        return this.legalEffectDate;
    }

    public LegalInfo setLegalExpireDate(String legalExpireDate) {
        this.legalExpireDate = legalExpireDate;
        return this;
    }
    public String getLegalExpireDate() {
        return this.legalExpireDate;
    }

}
