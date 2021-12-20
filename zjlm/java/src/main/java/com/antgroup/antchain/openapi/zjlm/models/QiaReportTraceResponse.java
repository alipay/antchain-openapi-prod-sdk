// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.zjlm.models;

import com.aliyun.tea.*;

public class QiaReportTraceResponse extends TeaModel {
    // 任务编号
    @NameInMap("qi_id")
    @Validation(required = true)
    public String qiId;

    // 颁发机构
    @NameInMap("qi_org_name")
    @Validation(required = true)
    public String qiOrgName;

    // 区块链,哈希值
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // 有效期开始
    @NameInMap("qi_start_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String qiStartTime;

    // 有效期结束
    @NameInMap("qi_end_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String qiEndTime;

    // 认证证书资料
    @NameInMap("certification_files")
    @Validation(required = true)
    public java.util.List<FileInfoModelResponse> certificationFiles;

    // 报告类型
    //      * REPORT, 报告认证
    //      * NEWSTANDARD, 新标质检
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 报告状态
    //      * PASS 已通过
    @NameInMap("qi_status")
    @Validation(required = true)
    public String qiStatus;

    // 标签key
    @NameInMap("qi_tag_key")
    @Validation(required = true)
    public String qiTagKey;

    // 标签名
    @NameInMap("qi_tag_name")
    @Validation(required = true)
    public String qiTagName;

    public static QiaReportTraceResponse build(java.util.Map<String, ?> map) throws Exception {
        QiaReportTraceResponse self = new QiaReportTraceResponse();
        return TeaModel.build(map, self);
    }

    public QiaReportTraceResponse setQiId(String qiId) {
        this.qiId = qiId;
        return this;
    }
    public String getQiId() {
        return this.qiId;
    }

    public QiaReportTraceResponse setQiOrgName(String qiOrgName) {
        this.qiOrgName = qiOrgName;
        return this;
    }
    public String getQiOrgName() {
        return this.qiOrgName;
    }

    public QiaReportTraceResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public QiaReportTraceResponse setQiStartTime(String qiStartTime) {
        this.qiStartTime = qiStartTime;
        return this;
    }
    public String getQiStartTime() {
        return this.qiStartTime;
    }

    public QiaReportTraceResponse setQiEndTime(String qiEndTime) {
        this.qiEndTime = qiEndTime;
        return this;
    }
    public String getQiEndTime() {
        return this.qiEndTime;
    }

    public QiaReportTraceResponse setCertificationFiles(java.util.List<FileInfoModelResponse> certificationFiles) {
        this.certificationFiles = certificationFiles;
        return this;
    }
    public java.util.List<FileInfoModelResponse> getCertificationFiles() {
        return this.certificationFiles;
    }

    public QiaReportTraceResponse setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QiaReportTraceResponse setQiStatus(String qiStatus) {
        this.qiStatus = qiStatus;
        return this;
    }
    public String getQiStatus() {
        return this.qiStatus;
    }

    public QiaReportTraceResponse setQiTagKey(String qiTagKey) {
        this.qiTagKey = qiTagKey;
        return this;
    }
    public String getQiTagKey() {
        return this.qiTagKey;
    }

    public QiaReportTraceResponse setQiTagName(String qiTagName) {
        this.qiTagName = qiTagName;
        return this;
    }
    public String getQiTagName() {
        return this.qiTagName;
    }

}
