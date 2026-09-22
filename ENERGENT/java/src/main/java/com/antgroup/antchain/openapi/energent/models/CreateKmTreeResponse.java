// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class CreateKmTreeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 知识库ID
    @NameInMap("tree_id")
    public String treeId;

    // 根节点ID
    @NameInMap("root_node_id")
    public String rootNodeId;

    public static CreateKmTreeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKmTreeResponse self = new CreateKmTreeResponse();
        return TeaModel.build(map, self);
    }

    public CreateKmTreeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateKmTreeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateKmTreeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateKmTreeResponse setTreeId(String treeId) {
        this.treeId = treeId;
        return this;
    }
    public String getTreeId() {
        return this.treeId;
    }

    public CreateKmTreeResponse setRootNodeId(String rootNodeId) {
        this.rootNodeId = rootNodeId;
        return this;
    }
    public String getRootNodeId() {
        return this.rootNodeId;
    }

}
