// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_58d0e6ac9a1f4c75b8220234c093d952.models;

import com.aliyun.tea.*;

public class BindDemoAsdAsdResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    public static BindDemoAsdAsdResponse build(java.util.Map<String, ?> map) throws Exception {
        BindDemoAsdAsdResponse self = new BindDemoAsdAsdResponse();
        return TeaModel.build(map, self);
    }

    public BindDemoAsdAsdResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BindDemoAsdAsdResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BindDemoAsdAsdResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

}
