// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryAcopmAtoWithholdResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 协议生效时间
    @NameInMap("valid_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String validTime;

    // 协议当前状态 1. UNSIGNED：未签约 2. SIG...
    // 
    @NameInMap("status")
    public String status;

    // 协议失效时间
    @NameInMap("invalid_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String invalidTime;

    // 协议签署时间
    @NameInMap("sign_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String signTime;

    public static QueryAcopmAtoWithholdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAcopmAtoWithholdResponse self = new QueryAcopmAtoWithholdResponse();
        return TeaModel.build(map, self);
    }

    public QueryAcopmAtoWithholdResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAcopmAtoWithholdResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAcopmAtoWithholdResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAcopmAtoWithholdResponse setValidTime(String validTime) {
        this.validTime = validTime;
        return this;
    }
    public String getValidTime() {
        return this.validTime;
    }

    public QueryAcopmAtoWithholdResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryAcopmAtoWithholdResponse setInvalidTime(String invalidTime) {
        this.invalidTime = invalidTime;
        return this;
    }
    public String getInvalidTime() {
        return this.invalidTime;
    }

    public QueryAcopmAtoWithholdResponse setSignTime(String signTime) {
        this.signTime = signTime;
        return this;
    }
    public String getSignTime() {
        return this.signTime;
    }

}
