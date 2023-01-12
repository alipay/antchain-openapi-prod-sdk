// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class SkipGrayTaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 进程信息
    @NameInMap("process_definition")
    public String processDefinition;

    public static SkipGrayTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SkipGrayTaskResponse self = new SkipGrayTaskResponse();
        return TeaModel.build(map, self);
    }

    public SkipGrayTaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SkipGrayTaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SkipGrayTaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SkipGrayTaskResponse setProcessDefinition(String processDefinition) {
        this.processDefinition = processDefinition;
        return this;
    }
    public String getProcessDefinition() {
        return this.processDefinition;
    }

}
