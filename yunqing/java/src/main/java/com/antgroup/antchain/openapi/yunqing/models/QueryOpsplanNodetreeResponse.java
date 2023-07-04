// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class QueryOpsplanNodetreeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 发布单节点树，为json string
    @NameInMap("node_tree")
    public String nodeTree;

    public static QueryOpsplanNodetreeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOpsplanNodetreeResponse self = new QueryOpsplanNodetreeResponse();
        return TeaModel.build(map, self);
    }

    public QueryOpsplanNodetreeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryOpsplanNodetreeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryOpsplanNodetreeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryOpsplanNodetreeResponse setNodeTree(String nodeTree) {
        this.nodeTree = nodeTree;
        return this;
    }
    public String getNodeTree() {
        return this.nodeTree;
    }

}
