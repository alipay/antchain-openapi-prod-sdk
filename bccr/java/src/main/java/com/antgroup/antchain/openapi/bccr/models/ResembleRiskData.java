// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class ResembleRiskData extends TeaModel {
    // 识别结果
    @NameInMap("code")
    @Validation(required = true)
    public Long code;

    // 重复作品ID
    @NameInMap("work_id")
    @Validation(required = true)
    public String workId;

    // 相似值百分比
    @NameInMap("resemble")
    @Validation(required = true)
    public String resemble;

    // 相似作品下载链接
    @NameInMap("work_download_url")
    @Validation(required = true)
    public String workDownloadUrl;

    // 风险等级
    @NameInMap("risk_level")
    @Validation(required = true)
    public Long riskLevel;

    public static ResembleRiskData build(java.util.Map<String, ?> map) throws Exception {
        ResembleRiskData self = new ResembleRiskData();
        return TeaModel.build(map, self);
    }

    public ResembleRiskData setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ResembleRiskData setWorkId(String workId) {
        this.workId = workId;
        return this;
    }
    public String getWorkId() {
        return this.workId;
    }

    public ResembleRiskData setResemble(String resemble) {
        this.resemble = resemble;
        return this;
    }
    public String getResemble() {
        return this.resemble;
    }

    public ResembleRiskData setWorkDownloadUrl(String workDownloadUrl) {
        this.workDownloadUrl = workDownloadUrl;
        return this;
    }
    public String getWorkDownloadUrl() {
        return this.workDownloadUrl;
    }

    public ResembleRiskData setRiskLevel(Long riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Long getRiskLevel() {
        return this.riskLevel;
    }

}
