// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SubmitSignFlowResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 签署合同单号
    @NameInMap("sign_no")
    public String signNo;

    // 电子签署流程ID
    @NameInMap("flow_id")
    public String flowId;

    // 签署用户ID
    @NameInMap("account_id")
    public String accountId;

    // 签署信息，包括短链接、长链接、小程序链接等。
    @NameInMap("sign_info")
    public String signInfo;

    public static SubmitSignFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitSignFlowResponse self = new SubmitSignFlowResponse();
        return TeaModel.build(map, self);
    }

    public SubmitSignFlowResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SubmitSignFlowResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SubmitSignFlowResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SubmitSignFlowResponse setSignNo(String signNo) {
        this.signNo = signNo;
        return this;
    }
    public String getSignNo() {
        return this.signNo;
    }

    public SubmitSignFlowResponse setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public SubmitSignFlowResponse setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public SubmitSignFlowResponse setSignInfo(String signInfo) {
        this.signInfo = signInfo;
        return this;
    }
    public String getSignInfo() {
        return this.signInfo;
    }

}
