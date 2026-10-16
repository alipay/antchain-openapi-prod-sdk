// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class RegisterCdsqScratchesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 结果码，999999 表示成功
    @NameInMap("response_code")
    public String responseCode;

    // 错误信息，成功时为空
    @NameInMap("response_msg")
    public String responseMsg;

    // 保单服务号
    @NameInMap("policy_no")
    public String policyNo;

    // 保险起期，格式：yyyy-MM-dd HH:mm:ss
    @NameInMap("policy_start")
    public String policyStart;

    // 保险止期，格式：yyyy-MM-dd HH:mm:ss
    @NameInMap("policy_end")
    public String policyEnd;

    public static RegisterCdsqScratchesResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterCdsqScratchesResponse self = new RegisterCdsqScratchesResponse();
        return TeaModel.build(map, self);
    }

    public RegisterCdsqScratchesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RegisterCdsqScratchesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RegisterCdsqScratchesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RegisterCdsqScratchesResponse setResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }
    public String getResponseCode() {
        return this.responseCode;
    }

    public RegisterCdsqScratchesResponse setResponseMsg(String responseMsg) {
        this.responseMsg = responseMsg;
        return this;
    }
    public String getResponseMsg() {
        return this.responseMsg;
    }

    public RegisterCdsqScratchesResponse setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
        return this;
    }
    public String getPolicyNo() {
        return this.policyNo;
    }

    public RegisterCdsqScratchesResponse setPolicyStart(String policyStart) {
        this.policyStart = policyStart;
        return this;
    }
    public String getPolicyStart() {
        return this.policyStart;
    }

    public RegisterCdsqScratchesResponse setPolicyEnd(String policyEnd) {
        this.policyEnd = policyEnd;
        return this;
    }
    public String getPolicyEnd() {
        return this.policyEnd;
    }

}
