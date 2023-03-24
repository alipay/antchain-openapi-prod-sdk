// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commonrcsmart.models;

import com.aliyun.tea.*;

public class ContentRiskDetailVO extends TeaModel {
    // 风险等级
    @NameInMap("risk_level")
    public String riskLevel;

    // 风险提示
    @NameInMap("notice")
    public String notice;

    // 命中词
    @NameInMap("viola_words")
    public String violaWords;

    public static ContentRiskDetailVO build(java.util.Map<String, ?> map) throws Exception {
        ContentRiskDetailVO self = new ContentRiskDetailVO();
        return TeaModel.build(map, self);
    }

    public ContentRiskDetailVO setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public ContentRiskDetailVO setNotice(String notice) {
        this.notice = notice;
        return this;
    }
    public String getNotice() {
        return this.notice;
    }

    public ContentRiskDetailVO setViolaWords(String violaWords) {
        this.violaWords = violaWords;
        return this;
    }
    public String getViolaWords() {
        return this.violaWords;
    }

}
