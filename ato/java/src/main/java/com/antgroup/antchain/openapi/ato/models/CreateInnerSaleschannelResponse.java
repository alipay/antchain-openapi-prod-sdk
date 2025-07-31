// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateInnerSaleschannelResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 创建出来的子渠道信息
    @NameInMap("child_channel")
    public SalesChannel childChannel;

    public static CreateInnerSaleschannelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInnerSaleschannelResponse self = new CreateInnerSaleschannelResponse();
        return TeaModel.build(map, self);
    }

    public CreateInnerSaleschannelResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateInnerSaleschannelResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateInnerSaleschannelResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateInnerSaleschannelResponse setChildChannel(SalesChannel childChannel) {
        this.childChannel = childChannel;
        return this;
    }
    public SalesChannel getChildChannel() {
        return this.childChannel;
    }

}
