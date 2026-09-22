// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class UpdateKmTreeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 知识库ID
    @NameInMap("tree_id")
    @Validation(required = true)
    public String treeId;

    // 知识库名称
    @NameInMap("name")
    public String name;

    // 知识库描述
    @NameInMap("description")
    public String description;

    // 知识库图标
    @NameInMap("icon")
    public String icon;

    // 图谱本体Schema JSON
    @NameInMap("schema_json")
    public String schemaJson;

    // 是否开启图谱编译
    @NameInMap("graph_enabled")
    public Boolean graphEnabled;

    public static UpdateKmTreeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKmTreeRequest self = new UpdateKmTreeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKmTreeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateKmTreeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateKmTreeRequest setTreeId(String treeId) {
        this.treeId = treeId;
        return this;
    }
    public String getTreeId() {
        return this.treeId;
    }

    public UpdateKmTreeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateKmTreeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateKmTreeRequest setIcon(String icon) {
        this.icon = icon;
        return this;
    }
    public String getIcon() {
        return this.icon;
    }

    public UpdateKmTreeRequest setSchemaJson(String schemaJson) {
        this.schemaJson = schemaJson;
        return this;
    }
    public String getSchemaJson() {
        return this.schemaJson;
    }

    public UpdateKmTreeRequest setGraphEnabled(Boolean graphEnabled) {
        this.graphEnabled = graphEnabled;
        return this;
    }
    public Boolean getGraphEnabled() {
        return this.graphEnabled;
    }

}
