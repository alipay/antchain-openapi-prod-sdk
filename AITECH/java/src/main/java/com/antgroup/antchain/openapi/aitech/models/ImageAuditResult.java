// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class ImageAuditResult extends TeaModel {
    // 任务ID
    /**
     * <strong>example:</strong>
     * <p>任务ID</p>
     */
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // 数据ID
    /**
     * <strong>example:</strong>
     * <p>数据ID</p>
     */
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // LOGO审核结果
    @NameInMap("logo_audit_result")
    @Validation(required = true)
    public LogoAuditResult logoAuditResult;

    // QRCode审核结果
    @NameInMap("qr_code_audit_result")
    @Validation(required = true)
    public QRCodeAuditResult qrCodeAuditResult;

    public static ImageAuditResult build(java.util.Map<String, ?> map) throws Exception {
        ImageAuditResult self = new ImageAuditResult();
        return TeaModel.build(map, self);
    }

    public ImageAuditResult setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ImageAuditResult setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public ImageAuditResult setLogoAuditResult(LogoAuditResult logoAuditResult) {
        this.logoAuditResult = logoAuditResult;
        return this;
    }
    public LogoAuditResult getLogoAuditResult() {
        return this.logoAuditResult;
    }

    public ImageAuditResult setQrCodeAuditResult(QRCodeAuditResult qrCodeAuditResult) {
        this.qrCodeAuditResult = qrCodeAuditResult;
        return this;
    }
    public QRCodeAuditResult getQrCodeAuditResult() {
        return this.qrCodeAuditResult;
    }

}
