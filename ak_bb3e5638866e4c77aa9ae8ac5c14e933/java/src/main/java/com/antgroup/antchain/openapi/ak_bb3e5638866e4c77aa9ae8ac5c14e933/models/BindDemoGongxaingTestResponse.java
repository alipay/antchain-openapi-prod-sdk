// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_bb3e5638866e4c77aa9ae8ac5c14e933.models;

import com.aliyun.tea.*;

public class BindDemoGongxaingTestResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    public static BindDemoGongxaingTestResponse build(java.util.Map<String, ?> map) throws Exception {
        BindDemoGongxaingTestResponse self = new BindDemoGongxaingTestResponse();
        return TeaModel.build(map, self);
    }

    public BindDemoGongxaingTestResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BindDemoGongxaingTestResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BindDemoGongxaingTestResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

}
