// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d34765e5ce404706a4e60e213daf08f5.models;

import com.aliyun.tea.*;

public class BindDemoAaaBbbCccResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    public static BindDemoAaaBbbCccResponse build(java.util.Map<String, ?> map) throws Exception {
        BindDemoAaaBbbCccResponse self = new BindDemoAaaBbbCccResponse();
        return TeaModel.build(map, self);
    }

    public BindDemoAaaBbbCccResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BindDemoAaaBbbCccResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BindDemoAaaBbbCccResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

}
