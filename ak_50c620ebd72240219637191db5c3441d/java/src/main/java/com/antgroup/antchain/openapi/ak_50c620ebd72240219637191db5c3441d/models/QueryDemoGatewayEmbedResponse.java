// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_50c620ebd72240219637191db5c3441d.models;

import com.aliyun.tea.*;

public class QueryDemoGatewayEmbedResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    public static QueryDemoGatewayEmbedResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoGatewayEmbedResponse self = new QueryDemoGatewayEmbedResponse();
        return TeaModel.build(map, self);
    }

    public QueryDemoGatewayEmbedResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDemoGatewayEmbedResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDemoGatewayEmbedResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

}
