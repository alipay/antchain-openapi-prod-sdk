// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryMcpEndpointResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // mcp服务连接点
    @NameInMap("mcp_endpoint")
    public String mcpEndpoint;

    public static QueryMcpEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMcpEndpointResponse self = new QueryMcpEndpointResponse();
        return TeaModel.build(map, self);
    }

    public QueryMcpEndpointResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMcpEndpointResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMcpEndpointResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMcpEndpointResponse setMcpEndpoint(String mcpEndpoint) {
        this.mcpEndpoint = mcpEndpoint;
        return this;
    }
    public String getMcpEndpoint() {
        return this.mcpEndpoint;
    }

}
