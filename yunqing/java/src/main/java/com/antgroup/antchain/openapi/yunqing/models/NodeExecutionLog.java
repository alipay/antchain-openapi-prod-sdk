// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class NodeExecutionLog extends TeaModel {
    // 当前节点的动作
    @NameInMap("node_action")
    @Validation(required = true)
    public String nodeAction;

    // 当前节点的执行日志信息
    @NameInMap("message")
    @Validation(required = true)
    public String message;

    public static NodeExecutionLog build(java.util.Map<String, ?> map) throws Exception {
        NodeExecutionLog self = new NodeExecutionLog();
        return TeaModel.build(map, self);
    }

    public NodeExecutionLog setNodeAction(String nodeAction) {
        this.nodeAction = nodeAction;
        return this;
    }
    public String getNodeAction() {
        return this.nodeAction;
    }

    public NodeExecutionLog setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
