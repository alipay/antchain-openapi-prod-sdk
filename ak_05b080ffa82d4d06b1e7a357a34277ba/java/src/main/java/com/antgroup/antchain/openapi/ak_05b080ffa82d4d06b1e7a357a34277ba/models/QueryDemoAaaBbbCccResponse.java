// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_05b080ffa82d4d06b1e7a357a34277ba.models;

import com.aliyun.tea.*;

public class QueryDemoAaaBbbCccResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    public static QueryDemoAaaBbbCccResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoAaaBbbCccResponse self = new QueryDemoAaaBbbCccResponse();
        return TeaModel.build(map, self);
    }

    public QueryDemoAaaBbbCccResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDemoAaaBbbCccResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDemoAaaBbbCccResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

}
