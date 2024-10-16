// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class QRCodeAuditResult extends TeaModel {
    // 检测到二维码个数
    @NameInMap("detect_num")
    @Validation(required = true)
    public Long detectNum;

    // 二维码详情
    @NameInMap("details")
    @Validation(required = true)
    public java.util.List<QRCodeDetail> details;

    public static QRCodeAuditResult build(java.util.Map<String, ?> map) throws Exception {
        QRCodeAuditResult self = new QRCodeAuditResult();
        return TeaModel.build(map, self);
    }

    public QRCodeAuditResult setDetectNum(Long detectNum) {
        this.detectNum = detectNum;
        return this;
    }
    public Long getDetectNum() {
        return this.detectNum;
    }

    public QRCodeAuditResult setDetails(java.util.List<QRCodeDetail> details) {
        this.details = details;
        return this;
    }
    public java.util.List<QRCodeDetail> getDetails() {
        return this.details;
    }

}
