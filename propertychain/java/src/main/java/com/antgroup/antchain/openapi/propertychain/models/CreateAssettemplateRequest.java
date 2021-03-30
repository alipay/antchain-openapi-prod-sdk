// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class CreateAssettemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 模板类型id
    @NameInMap("category_id")
    @Validation(required = true)
    public String categoryId;

    // 模板JSON内容
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 模板名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static CreateAssettemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAssettemplateRequest self = new CreateAssettemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateAssettemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAssettemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAssettemplateRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public CreateAssettemplateRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateAssettemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
