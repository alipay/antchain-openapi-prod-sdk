// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class ApplyFundAssertorderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 任务状态
    // ● RUNNING:生成中
    // ● SUCCESS:已生成
    // ● FAILED:失败
    @NameInMap("task_status")
    public String taskStatus;

    public static ApplyFundAssertorderResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyFundAssertorderResponse self = new ApplyFundAssertorderResponse();
        return TeaModel.build(map, self);
    }

    public ApplyFundAssertorderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyFundAssertorderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyFundAssertorderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyFundAssertorderResponse setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

}
