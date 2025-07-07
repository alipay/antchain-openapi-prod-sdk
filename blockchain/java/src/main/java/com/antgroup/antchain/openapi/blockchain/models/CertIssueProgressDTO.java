// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CertIssueProgressDTO extends TeaModel {
    // 证书实例id
    /**
     * <strong>example:</strong>
     * <p>b99e641b2d6d45ac90600fd958e8bc3a</p>
     */
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 存证ID，如果颁发失败，此值为null
    /**
     * <strong>example:</strong>
     * <p>vc:mychain:xxxxxx</p>
     */
    @NameInMap("vc_id")
    @Validation(required = true)
    public String vcId;

    // 因校验异常停止任务（不会继续校验文件内容和颁发证书） -3
    // 因校验内容不正确停止颁发任务(会校验完所有的行但不执行颁发) -2
    // 已手动取消（可重试状态下手动取消任务，取消状态下可以启动新的颁发任务） -1
    // 可重试 0
    // 执行中（初始状态） 1
    // 已成功完成 2
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // is_error=true时的错误描述
    /**
     * <strong>example:</strong>
     * <p>标题格式不正确</p>
     */
    @NameInMap("error_message")
    @Validation(required = true)
    public String errorMessage;

    // 证书的字段标题列表
    /**
     * <strong>example:</strong>
     * <p>[身份证号,姓名,证书字段1]</p>
     */
    @NameInMap("titles")
    @Validation(required = true)
    public java.util.List<String> titles;

    // 颁发进度百分比
    /**
     * <strong>example:</strong>
     * <p>0-100</p>
     */
    @NameInMap("progress_percent")
    @Validation(required = true)
    public Long progressPercent;

    // 当前批次数据总行数（不含标题）
    /**
     * <strong>example:</strong>
     * <p>0-5000</p>
     */
    @NameInMap("total_num")
    @Validation(required = true)
    public String totalNum;

    // 颁发证书当前执行的阶段，VERIFY：校验文件中，ISSUE：颁发中
    /**
     * <strong>example:</strong>
     * <p>VERIFY、ISSUE</p>
     */
    @NameInMap("cur_task_type")
    @Validation(required = true)
    public String curTaskType;

    // 颁发开始的时间戳
    /**
     * <strong>example:</strong>
     * <p>18123123123123</p>
     */
    @NameInMap("start_time_millis")
    @Validation(required = true)
    public Long startTimeMillis;

    // 颁发结束的时间戳
    /**
     * <strong>example:</strong>
     * <p>182371293192831</p>
     */
    @NameInMap("end_time_millis")
    @Validation(required = true)
    public Long endTimeMillis;

    // 校验错误描述列表
    @NameInMap("error_details")
    @Validation(required = true)
    public java.util.List<TemplateInstanceErrorDetailDTO> errorDetails;

    public static CertIssueProgressDTO build(java.util.Map<String, ?> map) throws Exception {
        CertIssueProgressDTO self = new CertIssueProgressDTO();
        return TeaModel.build(map, self);
    }

    public CertIssueProgressDTO setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CertIssueProgressDTO setVcId(String vcId) {
        this.vcId = vcId;
        return this;
    }
    public String getVcId() {
        return this.vcId;
    }

    public CertIssueProgressDTO setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public CertIssueProgressDTO setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CertIssueProgressDTO setTitles(java.util.List<String> titles) {
        this.titles = titles;
        return this;
    }
    public java.util.List<String> getTitles() {
        return this.titles;
    }

    public CertIssueProgressDTO setProgressPercent(Long progressPercent) {
        this.progressPercent = progressPercent;
        return this;
    }
    public Long getProgressPercent() {
        return this.progressPercent;
    }

    public CertIssueProgressDTO setTotalNum(String totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public String getTotalNum() {
        return this.totalNum;
    }

    public CertIssueProgressDTO setCurTaskType(String curTaskType) {
        this.curTaskType = curTaskType;
        return this;
    }
    public String getCurTaskType() {
        return this.curTaskType;
    }

    public CertIssueProgressDTO setStartTimeMillis(Long startTimeMillis) {
        this.startTimeMillis = startTimeMillis;
        return this;
    }
    public Long getStartTimeMillis() {
        return this.startTimeMillis;
    }

    public CertIssueProgressDTO setEndTimeMillis(Long endTimeMillis) {
        this.endTimeMillis = endTimeMillis;
        return this;
    }
    public Long getEndTimeMillis() {
        return this.endTimeMillis;
    }

    public CertIssueProgressDTO setErrorDetails(java.util.List<TemplateInstanceErrorDetailDTO> errorDetails) {
        this.errorDetails = errorDetails;
        return this;
    }
    public java.util.List<TemplateInstanceErrorDetailDTO> getErrorDetails() {
        return this.errorDetails;
    }

}
