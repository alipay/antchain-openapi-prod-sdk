// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetGrayProcessResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 进程信息
    @NameInMap("process_definition")
    public String processDefinition;

    public static GetGrayProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGrayProcessResponse self = new GetGrayProcessResponse();
        return TeaModel.build(map, self);
    }

    public GetGrayProcessResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetGrayProcessResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetGrayProcessResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetGrayProcessResponse setProcessDefinition(String processDefinition) {
        this.processDefinition = processDefinition;
        return this;
    }
    public String getProcessDefinition() {
        return this.processDefinition;
    }

}
