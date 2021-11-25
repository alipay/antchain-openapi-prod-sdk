// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class Construction extends TeaModel {
    // 证书编号
    // 
    // 
    @NameInMap("cert_num")
    @Validation(required = true)
    public String certNum;

    // 发证机关
    // 
    // 
    @NameInMap("issuing_authority")
    @Validation(required = true)
    public String issuingAuthority;

    // 资质类别
    @NameInMap("cert_type")
    @Validation(required = true)
    public String certType;

    // 等级
    @NameInMap("level")
    @Validation(required = true)
    public String level;

    // 有效期开始日期（yyyy-MM-dd）
    // 
    // 
    @NameInMap("effect_start_date")
    @Validation(required = true)
    public String effectStartDate;

    // 有效期结束日期（yyyy-MM-dd）
    // 
    // 
    @NameInMap("effect_end_date")
    @Validation(required = true)
    public String effectEndDate;

    // 文件
    @NameInMap("file_defines")
    public java.util.List<FileDefine> fileDefines;

    // key
    @NameInMap("construction_id")
    @Validation(required = true)
    public String constructionId;

    // 证件名称
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    public static Construction build(java.util.Map<String, ?> map) throws Exception {
        Construction self = new Construction();
        return TeaModel.build(map, self);
    }

    public Construction setCertNum(String certNum) {
        this.certNum = certNum;
        return this;
    }
    public String getCertNum() {
        return this.certNum;
    }

    public Construction setIssuingAuthority(String issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
        return this;
    }
    public String getIssuingAuthority() {
        return this.issuingAuthority;
    }

    public Construction setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public Construction setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public Construction setEffectStartDate(String effectStartDate) {
        this.effectStartDate = effectStartDate;
        return this;
    }
    public String getEffectStartDate() {
        return this.effectStartDate;
    }

    public Construction setEffectEndDate(String effectEndDate) {
        this.effectEndDate = effectEndDate;
        return this;
    }
    public String getEffectEndDate() {
        return this.effectEndDate;
    }

    public Construction setFileDefines(java.util.List<FileDefine> fileDefines) {
        this.fileDefines = fileDefines;
        return this;
    }
    public java.util.List<FileDefine> getFileDefines() {
        return this.fileDefines;
    }

    public Construction setConstructionId(String constructionId) {
        this.constructionId = constructionId;
        return this;
    }
    public String getConstructionId() {
        return this.constructionId;
    }

    public Construction setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

}
