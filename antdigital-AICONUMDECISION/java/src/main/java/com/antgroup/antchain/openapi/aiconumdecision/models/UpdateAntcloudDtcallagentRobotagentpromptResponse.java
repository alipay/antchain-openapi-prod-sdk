// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiconumdecision.models;

import com.aliyun.tea.*;

public class UpdateAntcloudDtcallagentRobotagentpromptResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // agentid
    @NameInMap("flow_id")
    public String flowId;

    public static UpdateAntcloudDtcallagentRobotagentpromptResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAntcloudDtcallagentRobotagentpromptResponse self = new UpdateAntcloudDtcallagentRobotagentpromptResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAntcloudDtcallagentRobotagentpromptResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateAntcloudDtcallagentRobotagentpromptResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateAntcloudDtcallagentRobotagentpromptResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateAntcloudDtcallagentRobotagentpromptResponse setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

}
