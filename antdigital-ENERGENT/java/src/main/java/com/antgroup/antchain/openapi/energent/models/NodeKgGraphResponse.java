// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class NodeKgGraphResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 节点详情JSON(KbGraphNode字段定义含邻域与属性)
    @NameInMap("node")
    public String node;

    public static NodeKgGraphResponse build(java.util.Map<String, ?> map) throws Exception {
        NodeKgGraphResponse self = new NodeKgGraphResponse();
        return TeaModel.build(map, self);
    }

    public NodeKgGraphResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public NodeKgGraphResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public NodeKgGraphResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public NodeKgGraphResponse setNode(String node) {
        this.node = node;
        return this;
    }
    public String getNode() {
        return this.node;
    }

}
