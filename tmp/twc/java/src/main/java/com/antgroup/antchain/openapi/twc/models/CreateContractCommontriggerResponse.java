// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateContractCommontriggerResponse extends TeaModel {
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

    // 错误信息描述
    @NameInMap("err_message")
    public String errMessage;

    // 合同id
    @NameInMap("flow_id")
    public String flowId;

    // 商户在智能合同平台id
    @NameInMap("platform_tuid")
    public String platformTuid;

    // 用户在智能合同平台的id
    @NameInMap("user_tuid")
    public String userTuid;

    public static CreateContractCommontriggerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateContractCommontriggerResponse self = new CreateContractCommontriggerResponse();
        return TeaModel.build(map, self);
    }

    public CreateContractCommontriggerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateContractCommontriggerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateContractCommontriggerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateContractCommontriggerResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public CreateContractCommontriggerResponse setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public CreateContractCommontriggerResponse setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public CreateContractCommontriggerResponse setPlatformTuid(String platformTuid) {
        this.platformTuid = platformTuid;
        return this;
    }
    public String getPlatformTuid() {
        return this.platformTuid;
    }

    public CreateContractCommontriggerResponse setUserTuid(String userTuid) {
        this.userTuid = userTuid;
        return this;
    }
    public String getUserTuid() {
        return this.userTuid;
    }

}
