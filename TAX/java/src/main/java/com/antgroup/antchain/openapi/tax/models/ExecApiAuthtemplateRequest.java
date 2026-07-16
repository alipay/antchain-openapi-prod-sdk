// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class ExecApiAuthtemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // token
    @NameInMap("token")
    @Validation(required = true)
    public String token;

    // 树的模版id
    @NameInMap("tree_template_id")
    @Validation(required = true)
    public String treeTemplateId;

    // 模版对应的版本号
    @NameInMap("tree_version")
    @Validation(required = true)
    public String treeVersion;

    // 对应节点ID
    @NameInMap("node_id")
    @Validation(required = true)
    public String nodeId;

    // 当前卡片所有需要填充元素key
    // 和value值
    @NameInMap("pairs")
    @Validation(required = true)
    public Pair pairs;

    public static ExecApiAuthtemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecApiAuthtemplateRequest self = new ExecApiAuthtemplateRequest();
        return TeaModel.build(map, self);
    }

    public ExecApiAuthtemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecApiAuthtemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecApiAuthtemplateRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public ExecApiAuthtemplateRequest setTreeTemplateId(String treeTemplateId) {
        this.treeTemplateId = treeTemplateId;
        return this;
    }
    public String getTreeTemplateId() {
        return this.treeTemplateId;
    }

    public ExecApiAuthtemplateRequest setTreeVersion(String treeVersion) {
        this.treeVersion = treeVersion;
        return this;
    }
    public String getTreeVersion() {
        return this.treeVersion;
    }

    public ExecApiAuthtemplateRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public ExecApiAuthtemplateRequest setPairs(Pair pairs) {
        this.pairs = pairs;
        return this;
    }
    public Pair getPairs() {
        return this.pairs;
    }

}
