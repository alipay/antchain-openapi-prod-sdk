// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class PushRefinanceInvalidorderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否受让成功
    @NameInMap("accept_success")
    public Boolean acceptSuccess;

    public static PushRefinanceInvalidorderResponse build(java.util.Map<String, ?> map) throws Exception {
        PushRefinanceInvalidorderResponse self = new PushRefinanceInvalidorderResponse();
        return TeaModel.build(map, self);
    }

    public PushRefinanceInvalidorderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushRefinanceInvalidorderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushRefinanceInvalidorderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushRefinanceInvalidorderResponse setAcceptSuccess(Boolean acceptSuccess) {
        this.acceptSuccess = acceptSuccess;
        return this;
    }
    public Boolean getAcceptSuccess() {
        return this.acceptSuccess;
    }

}
