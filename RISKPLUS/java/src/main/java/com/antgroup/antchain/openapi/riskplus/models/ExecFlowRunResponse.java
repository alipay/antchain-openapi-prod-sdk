// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ExecFlowRunResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 生成的 Flow 执行单号，用于后续内部执行和问题排查。
    @NameInMap("run_no")
    public String runNo;

    // 本次执行对应的已发布 Flow 编码。
    @NameInMap("flow_code")
    public String flowCode;

    // 创建完成后的执行状态，固定返回 RUNNING。
    @NameInMap("status")
    public String status;

    public static ExecFlowRunResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecFlowRunResponse self = new ExecFlowRunResponse();
        return TeaModel.build(map, self);
    }

    public ExecFlowRunResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecFlowRunResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecFlowRunResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecFlowRunResponse setRunNo(String runNo) {
        this.runNo = runNo;
        return this;
    }
    public String getRunNo() {
        return this.runNo;
    }

    public ExecFlowRunResponse setFlowCode(String flowCode) {
        this.flowCode = flowCode;
        return this;
    }
    public String getFlowCode() {
        return this.flowCode;
    }

    public ExecFlowRunResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
