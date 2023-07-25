// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class SignAntsaasStaffingcContractSendResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 发起签约返回结果
    @NameInMap("response")
    public ContractSignResponse response;

    public static SignAntsaasStaffingcContractSendResponse build(java.util.Map<String, ?> map) throws Exception {
        SignAntsaasStaffingcContractSendResponse self = new SignAntsaasStaffingcContractSendResponse();
        return TeaModel.build(map, self);
    }

    public SignAntsaasStaffingcContractSendResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SignAntsaasStaffingcContractSendResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SignAntsaasStaffingcContractSendResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SignAntsaasStaffingcContractSendResponse setResponse(ContractSignResponse response) {
        this.response = response;
        return this;
    }
    public ContractSignResponse getResponse() {
        return this.response;
    }

}
