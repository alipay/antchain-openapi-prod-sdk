// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateWitnessFlowResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 错误码
    @NameInMap("code")
    public Long code;

    // 流程配置
    @NameInMap("flow_config")
    public WitnessFlowConfig flowConfig;

    // 流程创建响应数据
    @NameInMap("message")
    public String message;

    // 见证流程
    @NameInMap("witness_flow_id")
    public String witnessFlowId;

    public static CreateWitnessFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWitnessFlowResponse self = new CreateWitnessFlowResponse();
        return TeaModel.build(map, self);
    }

    public CreateWitnessFlowResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateWitnessFlowResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateWitnessFlowResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateWitnessFlowResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public CreateWitnessFlowResponse setFlowConfig(WitnessFlowConfig flowConfig) {
        this.flowConfig = flowConfig;
        return this;
    }
    public WitnessFlowConfig getFlowConfig() {
        return this.flowConfig;
    }

    public CreateWitnessFlowResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateWitnessFlowResponse setWitnessFlowId(String witnessFlowId) {
        this.witnessFlowId = witnessFlowId;
        return this;
    }
    public String getWitnessFlowId() {
        return this.witnessFlowId;
    }

}
