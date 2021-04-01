// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CreateConsumecardGoodscategoryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequest baseRequest;

    // 商品类别描述
    @NameInMap("category_description")
    @Validation(required = true)
    public String categoryDescription;

    // 商品分类id（ffaaaaabbbbbbcccccc，如果存在返回失败）
    @NameInMap("category_id")
    @Validation(required = true)
    public String categoryId;

    // 商品类别名称
    @NameInMap("category_name")
    @Validation(required = true)
    public String categoryName;

    public static CreateConsumecardGoodscategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConsumecardGoodscategoryRequest self = new CreateConsumecardGoodscategoryRequest();
        return TeaModel.build(map, self);
    }

    public CreateConsumecardGoodscategoryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateConsumecardGoodscategoryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateConsumecardGoodscategoryRequest setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public CreateConsumecardGoodscategoryRequest setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
        return this;
    }
    public String getCategoryDescription() {
        return this.categoryDescription;
    }

    public CreateConsumecardGoodscategoryRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public CreateConsumecardGoodscategoryRequest setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }
    public String getCategoryName() {
        return this.categoryName;
    }

}
