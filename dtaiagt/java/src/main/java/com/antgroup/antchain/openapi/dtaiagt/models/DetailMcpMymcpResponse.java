// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class DetailMcpMymcpResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // MCP详情接口返回Result
    @NameInMap("data")
    public MCPDetailCommonResult data;

    public static DetailMcpMymcpResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailMcpMymcpResponse self = new DetailMcpMymcpResponse();
        return TeaModel.build(map, self);
    }

    public DetailMcpMymcpResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailMcpMymcpResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailMcpMymcpResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailMcpMymcpResponse setData(MCPDetailCommonResult data) {
        this.data = data;
        return this;
    }
    public MCPDetailCommonResult getData() {
        return this.data;
    }

}
