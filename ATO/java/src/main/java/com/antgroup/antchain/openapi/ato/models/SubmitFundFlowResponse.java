// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SubmitFundFlowResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 签署编号
    @NameInMap("sign_no")
    public String signNo;

    // 签署信息，包括短链接、长链接、小程序链接等。
    @NameInMap("sign_info")
    public String signInfo;

    public static SubmitFundFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitFundFlowResponse self = new SubmitFundFlowResponse();
        return TeaModel.build(map, self);
    }

    public SubmitFundFlowResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SubmitFundFlowResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SubmitFundFlowResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SubmitFundFlowResponse setSignNo(String signNo) {
        this.signNo = signNo;
        return this;
    }
    public String getSignNo() {
        return this.signNo;
    }

    public SubmitFundFlowResponse setSignInfo(String signInfo) {
        this.signInfo = signInfo;
        return this;
    }
    public String getSignInfo() {
        return this.signInfo;
    }

}
