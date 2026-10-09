// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.qmbrain.models;

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

    // 创建完成后的执行状态，固定返回 RUNNING。
    @NameInMap("status")
    public String status;

    // 用户须知，用于展示本平台的使用须知。
    @NameInMap("user_notice")
    public String userNotice;

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

    public QueryFlowRunResponse setUserNotice(String userNotice) {
        this.userNotice = userNotice;
        return this;
    }
    public String getUserNotice() {
        return this.userNotice;
    }

}
