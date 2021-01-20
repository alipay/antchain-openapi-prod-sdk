// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ErrorTaskExecutionNode extends TeaModel {
    // 节点 ID
    @NameInMap("node_id")
    public String nodeId;

    // 节点名
    @NameInMap("node_name")
    public String nodeName;

    // 错误码
    @NameInMap("code")
    public String code;

    // 错误信息
    @NameInMap("message")
    public String message;

    public static ErrorTaskExecutionNode build(java.util.Map<String, ?> map) throws Exception {
        ErrorTaskExecutionNode self = new ErrorTaskExecutionNode();
        return TeaModel.build(map, self);
    }

    public ErrorTaskExecutionNode setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public ErrorTaskExecutionNode setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public ErrorTaskExecutionNode setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ErrorTaskExecutionNode setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
