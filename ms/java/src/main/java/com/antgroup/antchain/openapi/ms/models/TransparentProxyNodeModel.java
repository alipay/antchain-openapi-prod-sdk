// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class TransparentProxyNodeModel extends TeaModel {
    // ip地址
    @NameInMap("ip")
    @Validation(required = true)
    public String ip;

    // 节点类型
    @NameInMap("node_type")
    @Validation(required = true)
    public String nodeType;

    // 节点ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    public static TransparentProxyNodeModel build(java.util.Map<String, ?> map) throws Exception {
        TransparentProxyNodeModel self = new TransparentProxyNodeModel();
        return TeaModel.build(map, self);
    }

    public TransparentProxyNodeModel setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public TransparentProxyNodeModel setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public TransparentProxyNodeModel setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
