// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class NodeTopItem extends TeaModel {
    // 主机名称
    @NameInMap("node")
    @Validation(required = true)
    public String node;

    // 应用TopN统计值，有可能有小数，使用前转换为数值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static NodeTopItem build(java.util.Map<String, ?> map) throws Exception {
        NodeTopItem self = new NodeTopItem();
        return TeaModel.build(map, self);
    }

    public NodeTopItem setNode(String node) {
        this.node = node;
        return this;
    }
    public String getNode() {
        return this.node;
    }

    public NodeTopItem setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
