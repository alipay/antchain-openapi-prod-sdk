// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ApplyDubbridgeLoanLxResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 放款结果，
    // 0:放款成功
    // 1:放款失败
    // 2.查无此单
    // 99:处理中
    @NameInMap("loan_result")
    public Long loanResult;

    // 放款结果描述，失败时，需给出的错误描述
    @NameInMap("msg")
    public String msg;

    public static ApplyDubbridgeLoanLxResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyDubbridgeLoanLxResponse self = new ApplyDubbridgeLoanLxResponse();
        return TeaModel.build(map, self);
    }

    public ApplyDubbridgeLoanLxResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyDubbridgeLoanLxResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyDubbridgeLoanLxResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyDubbridgeLoanLxResponse setLoanResult(Long loanResult) {
        this.loanResult = loanResult;
        return this;
    }
    public Long getLoanResult() {
        return this.loanResult;
    }

    public ApplyDubbridgeLoanLxResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

}
