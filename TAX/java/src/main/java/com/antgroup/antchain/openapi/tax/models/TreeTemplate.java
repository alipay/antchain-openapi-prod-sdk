// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class TreeTemplate extends TeaModel {
    // 树节点
    @NameInMap("tree_node")
    @Validation(required = true)
    public TreeNode treeNode;

    // Id
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 版本号
    /**
     * <strong>example:</strong>
     * <p>1.0.8</p>
     */
    @NameInMap("version")
    @Validation(required = true)
    public String version;

    // 向上兼容的最小版本号
    /**
     * <strong>example:</strong>
     * <p>1.0.06</p>
     */
    @NameInMap("compatible_min_version")
    @Validation(required = true)
    public String compatibleMinVersion;

    public static TreeTemplate build(java.util.Map<String, ?> map) throws Exception {
        TreeTemplate self = new TreeTemplate();
        return TeaModel.build(map, self);
    }

    public TreeTemplate setTreeNode(TreeNode treeNode) {
        this.treeNode = treeNode;
        return this;
    }
    public TreeNode getTreeNode() {
        return this.treeNode;
    }

    public TreeTemplate setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public TreeTemplate setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public TreeTemplate setCompatibleMinVersion(String compatibleMinVersion) {
        this.compatibleMinVersion = compatibleMinVersion;
        return this;
    }
    public String getCompatibleMinVersion() {
        return this.compatibleMinVersion;
    }

}
