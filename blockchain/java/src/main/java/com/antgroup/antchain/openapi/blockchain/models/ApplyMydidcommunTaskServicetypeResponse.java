// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ApplyMydidcommunTaskServicetypeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 用于查询异步处理流程的任务ID
    @NameInMap("task_id")
    public String taskId;

    public static ApplyMydidcommunTaskServicetypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyMydidcommunTaskServicetypeResponse self = new ApplyMydidcommunTaskServicetypeResponse();
        return TeaModel.build(map, self);
    }

    public ApplyMydidcommunTaskServicetypeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyMydidcommunTaskServicetypeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyMydidcommunTaskServicetypeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyMydidcommunTaskServicetypeResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
