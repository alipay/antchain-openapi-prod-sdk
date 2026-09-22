// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class OpenNode extends TeaModel {
    // node ID
    /**
     * <strong>example:</strong>
     * <p>N1</p>
     */
    @NameInMap("node_id")
    @Validation(required = true)
    public String nodeId;

    // parent node ID
    @NameInMap("parent_node_id")
    @Validation(required = true)
    public String parentNodeId;

    // slot key
    /**
     * <strong>example:</strong>
     * <p>system:root</p>
     */
    @NameInMap("slot_key")
    @Validation(required = true)
    public String slotKey;

    // slot value
    /**
     * <strong>example:</strong>
     * <p>根节点</p>
     */
    @NameInMap("slot_value")
    @Validation(required = true)
    public String slotValue;

    // level
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("level")
    @Validation(required = true)
    public Long level;

    // sort订单
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("sort_order")
    @Validation(required = true)
    public Long sortOrder;

    // gmt create
    /**
     * <strong>example:</strong>
     * <p>2026-08-01 10:00:00</p>
     */
    @NameInMap("gmt_create")
    @Validation(required = true)
    public String gmtCreate;

    // children
    /**
     * <strong>example:</strong>
     * <p>[{&quot;node_id&quot;:&quot;N2&quot;,&quot;parent_node_id&quot;:&quot;N1&quot;,&quot;slot_key&quot;:&quot;province&quot;,&quot;slot_value&quot;:&quot;山东&quot;,&quot;level&quot;:1,&quot;sort_order&quot;:0,&quot;gmt_create&quot;:&quot;2026-08-01 10:00:00&quot;,&quot;children&quot;:[]}]</p>
     */
    @NameInMap("children")
    @Validation(required = true)
    public String children;

    public static OpenNode build(java.util.Map<String, ?> map) throws Exception {
        OpenNode self = new OpenNode();
        return TeaModel.build(map, self);
    }

    public OpenNode setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public OpenNode setParentNodeId(String parentNodeId) {
        this.parentNodeId = parentNodeId;
        return this;
    }
    public String getParentNodeId() {
        return this.parentNodeId;
    }

    public OpenNode setSlotKey(String slotKey) {
        this.slotKey = slotKey;
        return this;
    }
    public String getSlotKey() {
        return this.slotKey;
    }

    public OpenNode setSlotValue(String slotValue) {
        this.slotValue = slotValue;
        return this;
    }
    public String getSlotValue() {
        return this.slotValue;
    }

    public OpenNode setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public OpenNode setSortOrder(Long sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public Long getSortOrder() {
        return this.sortOrder;
    }

    public OpenNode setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public OpenNode setChildren(String children) {
        this.children = children;
        return this;
    }
    public String getChildren() {
        return this.children;
    }

}
