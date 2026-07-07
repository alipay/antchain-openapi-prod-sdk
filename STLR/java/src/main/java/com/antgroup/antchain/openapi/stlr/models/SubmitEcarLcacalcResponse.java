// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class SubmitEcarLcacalcResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 速算记录编号
    @NameInMap("record_no")
    public String recordNo;

    public static SubmitEcarLcacalcResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitEcarLcacalcResponse self = new SubmitEcarLcacalcResponse();
        return TeaModel.build(map, self);
    }

    public SubmitEcarLcacalcResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SubmitEcarLcacalcResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SubmitEcarLcacalcResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SubmitEcarLcacalcResponse setRecordNo(String recordNo) {
        this.recordNo = recordNo;
        return this;
    }
    public String getRecordNo() {
        return this.recordNo;
    }

}
