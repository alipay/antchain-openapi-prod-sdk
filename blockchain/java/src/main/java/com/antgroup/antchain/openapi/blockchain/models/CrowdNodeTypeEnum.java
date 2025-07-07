// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CrowdNodeTypeEnum extends TeaModel {
    // 组合节点
    /**
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("group")
    public String group;

    // 条件节点
    /**
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("condition")
    public String condition;

    public static CrowdNodeTypeEnum build(java.util.Map<String, ?> map) throws Exception {
        CrowdNodeTypeEnum self = new CrowdNodeTypeEnum();
        return TeaModel.build(map, self);
    }

    public CrowdNodeTypeEnum setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public CrowdNodeTypeEnum setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

}
