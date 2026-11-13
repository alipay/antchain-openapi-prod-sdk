// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creativerender.models;

import com.aliyun.tea.*;

public class QueryAntcloudMarketingagentCreativeScriptResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 脚本扩写任务标识，用于查询扩写任务
    @NameInMap("task_id")
    public String taskId;

    // 脚本扩写任务状态，沿用现有任务状态体系
    @NameInMap("status")
    public String status;

    // 扩写后的脚本文本，任务成功时返回
    @NameInMap("expanded_script")
    public String expandedScript;

    // 脚本扩写任务失败码，失败时返回
    @NameInMap("error_code")
    public String errorCode;

    // 脚本扩写任务失败原因，失败时返回
    @NameInMap("error_message")
    public String errorMessage;

    public static QueryAntcloudMarketingagentCreativeScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudMarketingagentCreativeScriptResponse self = new QueryAntcloudMarketingagentCreativeScriptResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudMarketingagentCreativeScriptResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntcloudMarketingagentCreativeScriptResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntcloudMarketingagentCreativeScriptResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntcloudMarketingagentCreativeScriptResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public QueryAntcloudMarketingagentCreativeScriptResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryAntcloudMarketingagentCreativeScriptResponse setExpandedScript(String expandedScript) {
        this.expandedScript = expandedScript;
        return this;
    }
    public String getExpandedScript() {
        return this.expandedScript;
    }

    public QueryAntcloudMarketingagentCreativeScriptResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryAntcloudMarketingagentCreativeScriptResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

}
