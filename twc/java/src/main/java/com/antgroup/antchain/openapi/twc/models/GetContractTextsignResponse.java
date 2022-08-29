// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class GetContractTextsignResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 业务结果码, 成功: 0
    @NameInMap("code")
    public Long code;

    // 业务结果信息
    @NameInMap("message")
    public String message;

    // 签名结果值
    @NameInMap("sign_result")
    public String signResult;

    // 签名流程id
    @NameInMap("flow_id")
    public String flowId;

    public static GetContractTextsignResponse build(java.util.Map<String, ?> map) throws Exception {
        GetContractTextsignResponse self = new GetContractTextsignResponse();
        return TeaModel.build(map, self);
    }

    public GetContractTextsignResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetContractTextsignResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetContractTextsignResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetContractTextsignResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetContractTextsignResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetContractTextsignResponse setSignResult(String signResult) {
        this.signResult = signResult;
        return this;
    }
    public String getSignResult() {
        return this.signResult;
    }

    public GetContractTextsignResponse setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

}
