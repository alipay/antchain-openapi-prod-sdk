// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class FinishBclOrderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 完结申请单号
    @NameInMap("finish_apply_no")
    public String finishApplyNo;

    public static FinishBclOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        FinishBclOrderResponse self = new FinishBclOrderResponse();
        return TeaModel.build(map, self);
    }

    public FinishBclOrderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public FinishBclOrderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public FinishBclOrderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public FinishBclOrderResponse setFinishApplyNo(String finishApplyNo) {
        this.finishApplyNo = finishApplyNo;
        return this;
    }
    public String getFinishApplyNo() {
        return this.finishApplyNo;
    }

}
