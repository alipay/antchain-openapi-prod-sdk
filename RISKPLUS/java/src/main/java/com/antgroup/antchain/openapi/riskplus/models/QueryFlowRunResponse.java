// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryFlowRunResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 内部 flow 执行单号，Flow 执行单号，问题定位时使用。
    @NameInMap("run_no")
    public String runNo;

    // 本次执行对应的 Flow code。
    @NameInMap("flow_code")
    public String flowCode;

    // Flow 状态，仅支持 RUNNING、SUCCESS、FAILED。
    @NameInMap("status")
    public String status;

    // Flow 执行产出列表，每个元素为 FlowRunOutput 结构。仅当 status=SUCCESS 时返回产出内容；可包含文本、数字、布尔值、JSON 和文件。FILE 类型的 value 为短期有效的 HTTPS 下载地址。存在多个产出或多个文件时返回多个列表元素；RUNNING 或 FAILED 状态下返回空列表。
    @NameInMap("outputs")
    public java.util.List<FlowRunOutput> outputs;

    public static QueryFlowRunResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFlowRunResponse self = new QueryFlowRunResponse();
        return TeaModel.build(map, self);
    }

    public QueryFlowRunResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryFlowRunResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryFlowRunResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryFlowRunResponse setRunNo(String runNo) {
        this.runNo = runNo;
        return this;
    }
    public String getRunNo() {
        return this.runNo;
    }

    public QueryFlowRunResponse setFlowCode(String flowCode) {
        this.flowCode = flowCode;
        return this;
    }
    public String getFlowCode() {
        return this.flowCode;
    }

    public QueryFlowRunResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryFlowRunResponse setOutputs(java.util.List<FlowRunOutput> outputs) {
        this.outputs = outputs;
        return this;
    }
    public java.util.List<FlowRunOutput> getOutputs() {
        return this.outputs;
    }

}
