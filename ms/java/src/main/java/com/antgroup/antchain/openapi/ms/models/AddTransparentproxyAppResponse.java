// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AddTransparentproxyAppResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 应用结构体
    @NameInMap("data")
    public TransparentProxyAppVo data;

    public static AddTransparentproxyAppResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTransparentproxyAppResponse self = new AddTransparentproxyAppResponse();
        return TeaModel.build(map, self);
    }

    public AddTransparentproxyAppResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AddTransparentproxyAppResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddTransparentproxyAppResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AddTransparentproxyAppResponse setData(TransparentProxyAppVo data) {
        this.data = data;
        return this;
    }
    public TransparentProxyAppVo getData() {
        return this.data;
    }

}
