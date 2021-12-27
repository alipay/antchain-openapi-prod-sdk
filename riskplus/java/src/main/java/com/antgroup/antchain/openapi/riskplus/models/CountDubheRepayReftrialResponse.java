// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CountDubheRepayReftrialResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 还款计划试算结果
    @NameInMap("repay_ref_list")
    public java.util.List<RepayRef> repayRefList;

    public static CountDubheRepayReftrialResponse build(java.util.Map<String, ?> map) throws Exception {
        CountDubheRepayReftrialResponse self = new CountDubheRepayReftrialResponse();
        return TeaModel.build(map, self);
    }

    public CountDubheRepayReftrialResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CountDubheRepayReftrialResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CountDubheRepayReftrialResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CountDubheRepayReftrialResponse setRepayRefList(java.util.List<RepayRef> repayRefList) {
        this.repayRefList = repayRefList;
        return this;
    }
    public java.util.List<RepayRef> getRepayRefList() {
        return this.repayRefList;
    }

}
