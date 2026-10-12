// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dubhe.models;

import com.aliyun.tea.*;

public class PushRiskplusDubbridgeContractsignResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 合同签署同步结果，
    // Y-成功；N-失败
    @NameInMap("push_result")
    public String pushResult;

    public static PushRiskplusDubbridgeContractsignResponse build(java.util.Map<String, ?> map) throws Exception {
        PushRiskplusDubbridgeContractsignResponse self = new PushRiskplusDubbridgeContractsignResponse();
        return TeaModel.build(map, self);
    }

    public PushRiskplusDubbridgeContractsignResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushRiskplusDubbridgeContractsignResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushRiskplusDubbridgeContractsignResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushRiskplusDubbridgeContractsignResponse setPushResult(String pushResult) {
        this.pushResult = pushResult;
        return this;
    }
    public String getPushResult() {
        return this.pushResult;
    }

}
