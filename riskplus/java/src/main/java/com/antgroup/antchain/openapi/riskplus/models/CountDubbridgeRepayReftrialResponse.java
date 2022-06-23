// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CountDubbridgeRepayReftrialResponse extends TeaModel {
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
    public RepayRef repayRefList;

    public static CountDubbridgeRepayReftrialResponse build(java.util.Map<String, ?> map) throws Exception {
        CountDubbridgeRepayReftrialResponse self = new CountDubbridgeRepayReftrialResponse();
        return TeaModel.build(map, self);
    }

    public CountDubbridgeRepayReftrialResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CountDubbridgeRepayReftrialResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CountDubbridgeRepayReftrialResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CountDubbridgeRepayReftrialResponse setRepayRefList(RepayRef repayRefList) {
        this.repayRefList = repayRefList;
        return this;
    }
    public RepayRef getRepayRefList() {
        return this.repayRefList;
    }

}
