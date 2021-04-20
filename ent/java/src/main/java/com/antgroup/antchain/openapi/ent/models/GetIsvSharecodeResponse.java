// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class GetIsvSharecodeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 生成的ISV用户邀请码
    @NameInMap("share_code")
    public String shareCode;

    public static GetIsvSharecodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIsvSharecodeResponse self = new GetIsvSharecodeResponse();
        return TeaModel.build(map, self);
    }

    public GetIsvSharecodeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetIsvSharecodeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetIsvSharecodeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetIsvSharecodeResponse setShareCode(String shareCode) {
        this.shareCode = shareCode;
        return this;
    }
    public String getShareCode() {
        return this.shareCode;
    }

}
