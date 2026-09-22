// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class CreateKmTreeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 知识库名称
    @NameInMap("name")
    @Validation(required = true)
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

    public static CreateKmTreeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKmTreeRequest self = new CreateKmTreeRequest();
        return TeaModel.build(map, self);
    }

    public CreateKmTreeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateKmTreeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateKmTreeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateKmTreeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateKmTreeRequest setIcon(String icon) {
        this.icon = icon;
        return this;
    }
    public String getIcon() {
        return this.icon;
    }

    public CreateKmTreeRequest setSchemaJson(String schemaJson) {
        this.schemaJson = schemaJson;
        return this;
    }
    public String getSchemaJson() {
        return this.schemaJson;
    }

    public CreateKmTreeRequest setGraphEnabled(Boolean graphEnabled) {
        this.graphEnabled = graphEnabled;
        return this;
    }
    public Boolean getGraphEnabled() {
        return this.graphEnabled;
    }

}
