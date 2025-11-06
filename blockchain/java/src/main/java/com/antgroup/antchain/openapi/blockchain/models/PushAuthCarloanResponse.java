// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class PushAuthCarloanResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否推送成功
    @NameInMap("push_success")
    public Boolean pushSuccess;

    public static PushAuthCarloanResponse build(java.util.Map<String, ?> map) throws Exception {
        PushAuthCarloanResponse self = new PushAuthCarloanResponse();
        return TeaModel.build(map, self);
    }

    public PushAuthCarloanResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushAuthCarloanResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushAuthCarloanResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushAuthCarloanResponse setPushSuccess(Boolean pushSuccess) {
        this.pushSuccess = pushSuccess;
        return this;
    }
    public Boolean getPushSuccess() {
        return this.pushSuccess;
    }

}
