// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_f2ba648e36a44708ab93a511f45f8a19.models;

import com.aliyun.tea.*;

public class BindDemoSssSsSsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    public static BindDemoSssSsSsResponse build(java.util.Map<String, ?> map) throws Exception {
        BindDemoSssSsSsResponse self = new BindDemoSssSsSsResponse();
        return TeaModel.build(map, self);
    }

    public BindDemoSssSsSsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BindDemoSssSsSsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BindDemoSssSsSsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

}
