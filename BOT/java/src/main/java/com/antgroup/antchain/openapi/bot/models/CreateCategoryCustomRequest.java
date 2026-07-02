// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateCategoryCustomRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 行业
    @NameInMap("industry")
    @Validation(required = true)
    public String industry;

    // 场景
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 品类名称
    @NameInMap("category_name")
    @Validation(required = true)
    public String categoryName;

    // 品类标识符
    @NameInMap("category_code")
    @Validation(required = true)
    public String categoryCode;

    // 描述内容
    @NameInMap("remark")
    public String remark;

    public static CreateCategoryCustomRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCategoryCustomRequest self = new CreateCategoryCustomRequest();
        return TeaModel.build(map, self);
    }

    public CreateCategoryCustomRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateCategoryCustomRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateCategoryCustomRequest setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public CreateCategoryCustomRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public CreateCategoryCustomRequest setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }
    public String getCategoryName() {
        return this.categoryName;
    }

    public CreateCategoryCustomRequest setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }
    public String getCategoryCode() {
        return this.categoryCode;
    }

    public CreateCategoryCustomRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
