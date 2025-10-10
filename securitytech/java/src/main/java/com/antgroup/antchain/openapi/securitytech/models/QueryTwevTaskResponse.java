// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryTwevTaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 任务结果
    @NameInMap("task_result")
    public String taskResult;

    // json，扩展预留
    @NameInMap("extra_info")
    public String extraInfo;

    public static QueryTwevTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTwevTaskResponse self = new QueryTwevTaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryTwevTaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTwevTaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTwevTaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTwevTaskResponse setTaskResult(String taskResult) {
        this.taskResult = taskResult;
        return this;
    }
    public String getTaskResult() {
        return this.taskResult;
    }

    public QueryTwevTaskResponse setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

}
