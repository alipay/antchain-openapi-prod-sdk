// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class Award extends TeaModel {
    // 奖项名称
    // 
    // 
    @NameInMap("award_name")
    @Validation(required = true)
    public String awardName;

    // 奖项级别（参见附录十四）
    // 
    // 
    @NameInMap("award_level")
    @Validation(required = true)
    public String awardLevel;

    // 颁发日期（yyyy）
    // 
    // 
    @NameInMap("issue_date")
    @Validation(required = true)
    public String issueDate;

    // 有效开始日期（yyyy-MM-dd）
    // 
    // 
    @NameInMap("effect_start_date")
    @Validation(required = true)
    public String effectStartDate;

    // 有效结束日期（yyyy-MM-dd）
    // 
    // 
    @NameInMap("effect_end_date")
    @Validation(required = true)
    public String effectEndDate;

    // 文件信息，支持上传多个文件
    // 
    // 
    @NameInMap("file_defines")
    @Validation(required = true)
    public java.util.List<FileDefine> fileDefines;

    // key
    @NameInMap("award_id")
    @Validation(required = true)
    public String awardId;

    public static Award build(java.util.Map<String, ?> map) throws Exception {
        Award self = new Award();
        return TeaModel.build(map, self);
    }

    public Award setAwardName(String awardName) {
        this.awardName = awardName;
        return this;
    }
    public String getAwardName() {
        return this.awardName;
    }

    public Award setAwardLevel(String awardLevel) {
        this.awardLevel = awardLevel;
        return this;
    }
    public String getAwardLevel() {
        return this.awardLevel;
    }

    public Award setIssueDate(String issueDate) {
        this.issueDate = issueDate;
        return this;
    }
    public String getIssueDate() {
        return this.issueDate;
    }

    public Award setEffectStartDate(String effectStartDate) {
        this.effectStartDate = effectStartDate;
        return this;
    }
    public String getEffectStartDate() {
        return this.effectStartDate;
    }

    public Award setEffectEndDate(String effectEndDate) {
        this.effectEndDate = effectEndDate;
        return this;
    }
    public String getEffectEndDate() {
        return this.effectEndDate;
    }

    public Award setFileDefines(java.util.List<FileDefine> fileDefines) {
        this.fileDefines = fileDefines;
        return this;
    }
    public java.util.List<FileDefine> getFileDefines() {
        return this.fileDefines;
    }

    public Award setAwardId(String awardId) {
        this.awardId = awardId;
        return this;
    }
    public String getAwardId() {
        return this.awardId;
    }

}
