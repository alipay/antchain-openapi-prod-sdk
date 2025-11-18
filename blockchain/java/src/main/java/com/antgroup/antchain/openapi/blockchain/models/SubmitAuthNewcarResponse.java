// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class SubmitAuthNewcarResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // OK
    // NO_DEMAND 无线索需求，需要重试
    // INVALID 无效，不要重试
    @NameInMap("push_result_code")
    public String pushResultCode;

    public static SubmitAuthNewcarResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAuthNewcarResponse self = new SubmitAuthNewcarResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAuthNewcarResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SubmitAuthNewcarResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SubmitAuthNewcarResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SubmitAuthNewcarResponse setPushResultCode(String pushResultCode) {
        this.pushResultCode = pushResultCode;
        return this;
    }
    public String getPushResultCode() {
        return this.pushResultCode;
    }

}
