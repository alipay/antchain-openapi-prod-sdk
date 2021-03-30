// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CreateCreditIssuetransferResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 转让申请成功金额
    @NameInMap("success_apply_amt")
    public String successApplyAmt;

    // 请求时传入的全局业务号
    @NameInMap("out_biz_no")
    public String outBizNo;

    public static CreateCreditIssuetransferResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCreditIssuetransferResponse self = new CreateCreditIssuetransferResponse();
        return TeaModel.build(map, self);
    }

    public CreateCreditIssuetransferResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateCreditIssuetransferResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateCreditIssuetransferResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateCreditIssuetransferResponse setSuccessApplyAmt(String successApplyAmt) {
        this.successApplyAmt = successApplyAmt;
        return this;
    }
    public String getSuccessApplyAmt() {
        return this.successApplyAmt;
    }

    public CreateCreditIssuetransferResponse setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

}
