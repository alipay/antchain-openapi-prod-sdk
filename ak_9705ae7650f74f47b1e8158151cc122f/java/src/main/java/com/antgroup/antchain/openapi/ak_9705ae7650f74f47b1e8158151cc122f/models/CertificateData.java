// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_9705ae7650f74f47b1e8158151cc122f.models;

import com.aliyun.tea.*;

public class CertificateData extends TeaModel {
    // 任务ID
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // 版权用户UID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // DCI码
    @NameInMap("dci_code")
    @Validation(required = true)
    public String dciCode;

    // 证书下载的链接地址
    @NameInMap("certificate_url")
    @Validation(required = true)
    public String certificateUrl;

    public static CertificateData build(java.util.Map<String, ?> map) throws Exception {
        CertificateData self = new CertificateData();
        return TeaModel.build(map, self);
    }

    public CertificateData setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public CertificateData setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CertificateData setDciCode(String dciCode) {
        this.dciCode = dciCode;
        return this;
    }
    public String getDciCode() {
        return this.dciCode;
    }

    public CertificateData setCertificateUrl(String certificateUrl) {
        this.certificateUrl = certificateUrl;
        return this;
    }
    public String getCertificateUrl() {
        return this.certificateUrl;
    }

}
