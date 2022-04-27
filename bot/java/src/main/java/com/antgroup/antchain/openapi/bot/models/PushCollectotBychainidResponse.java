// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PushCollectotBychainidResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 推送结果
    @NameInMap("push_result")
    public Boolean pushResult;

    public static PushCollectotBychainidResponse build(java.util.Map<String, ?> map) throws Exception {
        PushCollectotBychainidResponse self = new PushCollectotBychainidResponse();
        return TeaModel.build(map, self);
    }

    public PushCollectotBychainidResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushCollectotBychainidResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushCollectotBychainidResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushCollectotBychainidResponse setPushResult(Boolean pushResult) {
        this.pushResult = pushResult;
        return this;
    }
    public Boolean getPushResult() {
        return this.pushResult;
    }

}
