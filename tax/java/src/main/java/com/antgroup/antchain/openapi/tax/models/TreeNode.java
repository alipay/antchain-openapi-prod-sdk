// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class TreeNode extends TeaModel {
    // 节点id，按树的前序排列
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 父节点id，不存在为null
    @NameInMap("parent_node_id")
    @Validation(required = true)
    public String parentNodeId;

    // 深度
    @NameInMap("depth")
    @Validation(required = true)
    public Long depth;

    // 是否叶子结点
    @NameInMap("is_leef_node")
    @Validation(required = true)
    public String isLeefNode;

    // 模版
    @NameInMap("card")
    @Validation(required = true)
    public Card card;

    public static TreeNode build(java.util.Map<String, ?> map) throws Exception {
        TreeNode self = new TreeNode();
        return TeaModel.build(map, self);
    }

    public TreeNode setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public TreeNode setParentNodeId(String parentNodeId) {
        this.parentNodeId = parentNodeId;
        return this;
    }
    public String getParentNodeId() {
        return this.parentNodeId;
    }

    public TreeNode setDepth(Long depth) {
        this.depth = depth;
        return this;
    }
    public Long getDepth() {
        return this.depth;
    }

    public TreeNode setIsLeefNode(String isLeefNode) {
        this.isLeefNode = isLeefNode;
        return this;
    }
    public String getIsLeefNode() {
        return this.isLeefNode;
    }

    public TreeNode setCard(Card card) {
        this.card = card;
        return this;
    }
    public Card getCard() {
        return this.card;
    }

}
