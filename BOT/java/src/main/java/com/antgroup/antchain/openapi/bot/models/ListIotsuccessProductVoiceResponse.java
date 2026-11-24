// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ListIotsuccessProductVoiceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    @NameInMap("items")
    @Validation(required = true)
    public java.util.List<OpenApiVoiceInfo> items;

    public static ListIotsuccessProductVoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIotsuccessProductVoiceResponse self = new ListIotsuccessProductVoiceResponse();
        return TeaModel.build(map, self);
    }

    public ListIotsuccessProductVoiceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListIotsuccessProductVoiceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListIotsuccessProductVoiceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListIotsuccessProductVoiceResponse setItems(java.util.List<OpenApiVoiceInfo> items) {
        this.items = items;
        return this;
    }
    public java.util.List<OpenApiVoiceInfo> getItems() {
        return this.items;
    }

}
