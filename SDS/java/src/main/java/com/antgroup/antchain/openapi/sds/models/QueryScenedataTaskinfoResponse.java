// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sds.models;

import com.aliyun.tea.*;

public class QueryScenedataTaskinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // -1-无效，0-待处理，1-处理中，2-处理完成
    @NameInMap("task_status")
    public String taskStatus;

    // 业务日期
    @NameInMap("biz_date")
    public String bizDate;

    // 场景
    @NameInMap("scene")
    public String scene;

    // 任务类型
    @NameInMap("task_type")
    public String taskType;

    // 批次所属租户id
    @NameInMap("tenant_id")
    public String tenantId;

    // 来源标识
    @NameInMap("source_mark")
    public String sourceMark;

    // 任务创建时间
    @NameInMap("create_time")
    public String createTime;

    // 批次统计结果信息
    @NameInMap("result")
    public TaskDetailResult result;

    public static QueryScenedataTaskinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryScenedataTaskinfoResponse self = new QueryScenedataTaskinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryScenedataTaskinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryScenedataTaskinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryScenedataTaskinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryScenedataTaskinfoResponse setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public QueryScenedataTaskinfoResponse setBizDate(String bizDate) {
        this.bizDate = bizDate;
        return this;
    }
    public String getBizDate() {
        return this.bizDate;
    }

    public QueryScenedataTaskinfoResponse setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public QueryScenedataTaskinfoResponse setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public QueryScenedataTaskinfoResponse setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryScenedataTaskinfoResponse setSourceMark(String sourceMark) {
        this.sourceMark = sourceMark;
        return this;
    }
    public String getSourceMark() {
        return this.sourceMark;
    }

    public QueryScenedataTaskinfoResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public QueryScenedataTaskinfoResponse setResult(TaskDetailResult result) {
        this.result = result;
        return this;
    }
    public TaskDetailResult getResult() {
        return this.result;
    }

}
