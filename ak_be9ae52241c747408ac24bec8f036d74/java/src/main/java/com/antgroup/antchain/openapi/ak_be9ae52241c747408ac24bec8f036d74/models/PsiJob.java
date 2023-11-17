// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_be9ae52241c747408ac24bec8f036d74.models;

import com.aliyun.tea.*;

public class PsiJob extends TeaModel {
    // 项目ID
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 执行任务ID
    @NameInMap("job_id")
    @Validation(required = true)
    public String jobId;

    // 发起任务的租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 任务提交时间（毫秒）
    @NameInMap("gmt_create")
    @Validation(required = true)
    public Long gmtCreate;

    // 任务真正开始执行的unix 时间戳（毫秒）
    @NameInMap("gmt_exec_start")
    @Validation(required = true)
    public Long gmtExecStart;

    // 任务最终执行完成时间（毫秒）
    @NameInMap("gmt_exec_end")
    @Validation(required = true)
    public Long gmtExecEnd;

    // 任务名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 任务类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 项目类型
    @NameInMap("project_type")
    @Validation(required = true)
    public String projectType;

    // 项目描述信息
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 任务执行状态，EXECUTING执行中，SUCCESS执行成功，FAILED执行失败
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 任务执行结果信息，若执行失败则返回错误日志
    @NameInMap("result_msg")
    public String resultMsg;

    // 参与方配置参数，参考结构体定义
    @NameInMap("participant_list")
    @Validation(required = true)
    public java.util.List<PsiParticipantConfig> participantList;

    public static PsiJob build(java.util.Map<String, ?> map) throws Exception {
        PsiJob self = new PsiJob();
        return TeaModel.build(map, self);
    }

    public PsiJob setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public PsiJob setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public PsiJob setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public PsiJob setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public PsiJob setGmtExecStart(Long gmtExecStart) {
        this.gmtExecStart = gmtExecStart;
        return this;
    }
    public Long getGmtExecStart() {
        return this.gmtExecStart;
    }

    public PsiJob setGmtExecEnd(Long gmtExecEnd) {
        this.gmtExecEnd = gmtExecEnd;
        return this;
    }
    public Long getGmtExecEnd() {
        return this.gmtExecEnd;
    }

    public PsiJob setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PsiJob setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public PsiJob setProjectType(String projectType) {
        this.projectType = projectType;
        return this;
    }
    public String getProjectType() {
        return this.projectType;
    }

    public PsiJob setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PsiJob setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PsiJob setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PsiJob setParticipantList(java.util.List<PsiParticipantConfig> participantList) {
        this.participantList = participantList;
        return this;
    }
    public java.util.List<PsiParticipantConfig> getParticipantList() {
        return this.participantList;
    }

}
