// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_565b634e3a95498e8d64367689cda6ad.models;

import com.aliyun.tea.*;

public class QueryDemoAdAsdAsdResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    public static QueryDemoAdAsdAsdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoAdAsdAsdResponse self = new QueryDemoAdAsdAsdResponse();
        return TeaModel.build(map, self);
    }

    public QueryDemoAdAsdAsdResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDemoAdAsdAsdResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDemoAdAsdAsdResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

}
