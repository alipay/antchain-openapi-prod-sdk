// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class ListUniversalsaasDigitalhumanStreamResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 实时流信息列表
    @NameInMap("data")
    public java.util.List<AvatarStreamInfo> data;

    public static ListUniversalsaasDigitalhumanStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUniversalsaasDigitalhumanStreamResponse self = new ListUniversalsaasDigitalhumanStreamResponse();
        return TeaModel.build(map, self);
    }

    public ListUniversalsaasDigitalhumanStreamResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListUniversalsaasDigitalhumanStreamResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListUniversalsaasDigitalhumanStreamResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListUniversalsaasDigitalhumanStreamResponse setData(java.util.List<AvatarStreamInfo> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AvatarStreamInfo> getData() {
        return this.data;
    }

}
