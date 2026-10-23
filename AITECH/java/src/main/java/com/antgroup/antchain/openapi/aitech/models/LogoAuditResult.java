// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class LogoAuditResult extends TeaModel {
    // 检测到LOGO个数
    @NameInMap("detect_num")
    @Validation(required = true)
    public Long detectNum;

    // LOGO详情
    @NameInMap("details")
    @Validation(required = true)
    public java.util.List<LogoDetail> details;

    public static LogoAuditResult build(java.util.Map<String, ?> map) throws Exception {
        LogoAuditResult self = new LogoAuditResult();
        return TeaModel.build(map, self);
    }

    public LogoAuditResult setDetectNum(Long detectNum) {
        this.detectNum = detectNum;
        return this;
    }
    public Long getDetectNum() {
        return this.detectNum;
    }

    public LogoAuditResult setDetails(java.util.List<LogoDetail> details) {
        this.details = details;
        return this;
    }
    public java.util.List<LogoDetail> getDetails() {
        return this.details;
    }

}
