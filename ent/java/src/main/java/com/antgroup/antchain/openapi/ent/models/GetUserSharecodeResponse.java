// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class GetUserSharecodeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 分享码
    @NameInMap("share_code")
    public String shareCode;

    public static GetUserSharecodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserSharecodeResponse self = new GetUserSharecodeResponse();
        return TeaModel.build(map, self);
    }

    public GetUserSharecodeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetUserSharecodeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetUserSharecodeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetUserSharecodeResponse setShareCode(String shareCode) {
        this.shareCode = shareCode;
        return this;
    }
    public String getShareCode() {
        return this.shareCode;
    }

}
