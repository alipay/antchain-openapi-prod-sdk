// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class CreateProductActionRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 操作点ID
    @NameInMap("action_id")
    @Validation(required = true)
    public String actionId;

    // 操作点所属功能分类ID
    @NameInMap("category_id")
    public String categoryId;

    // 操作点描述
    @NameInMap("description")
    public String description;

    // 操作点名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 操作点所属产品
    @NameInMap("product")
    @Validation(required = true)
    public String product;

    public static CreateProductActionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProductActionRequest self = new CreateProductActionRequest();
        return TeaModel.build(map, self);
    }

    public CreateProductActionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateProductActionRequest setActionId(String actionId) {
        this.actionId = actionId;
        return this;
    }
    public String getActionId() {
        return this.actionId;
    }

    public CreateProductActionRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public CreateProductActionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProductActionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateProductActionRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
