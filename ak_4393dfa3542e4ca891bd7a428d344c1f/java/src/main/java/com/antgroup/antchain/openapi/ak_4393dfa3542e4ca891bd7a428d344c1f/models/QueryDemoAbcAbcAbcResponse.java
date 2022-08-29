// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_4393dfa3542e4ca891bd7a428d344c1f.models;

import com.aliyun.tea.*;

public class QueryDemoAbcAbcAbcResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    public static QueryDemoAbcAbcAbcResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoAbcAbcAbcResponse self = new QueryDemoAbcAbcAbcResponse();
        return TeaModel.build(map, self);
    }

    public QueryDemoAbcAbcAbcResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDemoAbcAbcAbcResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDemoAbcAbcAbcResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

}
