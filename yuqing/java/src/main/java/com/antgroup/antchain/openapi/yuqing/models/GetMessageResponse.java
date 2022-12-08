// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class GetMessageResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 與情内容
    @NameInMap("yuqing_message")
    public YuqingMessage yuqingMessage;

    public static GetMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMessageResponse self = new GetMessageResponse();
        return TeaModel.build(map, self);
    }

    public GetMessageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetMessageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetMessageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetMessageResponse setYuqingMessage(YuqingMessage yuqingMessage) {
        this.yuqingMessage = yuqingMessage;
        return this;
    }
    public YuqingMessage getYuqingMessage() {
        return this.yuqingMessage;
    }

}
