// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryOpsplanProgressResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 应用执行进度
    @NameInMap("app_execute_progress")
    public java.util.List<ExecuteProgress> appExecuteProgress;

    // 发布单进度
    @NameInMap("execute_progress")
    public ExecuteProgress executeProgress;

    public static QueryOpsplanProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOpsplanProgressResponse self = new QueryOpsplanProgressResponse();
        return TeaModel.build(map, self);
    }

    public QueryOpsplanProgressResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryOpsplanProgressResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryOpsplanProgressResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryOpsplanProgressResponse setAppExecuteProgress(java.util.List<ExecuteProgress> appExecuteProgress) {
        this.appExecuteProgress = appExecuteProgress;
        return this;
    }
    public java.util.List<ExecuteProgress> getAppExecuteProgress() {
        return this.appExecuteProgress;
    }

    public QueryOpsplanProgressResponse setExecuteProgress(ExecuteProgress executeProgress) {
        this.executeProgress = executeProgress;
        return this;
    }
    public ExecuteProgress getExecuteProgress() {
        return this.executeProgress;
    }

}
