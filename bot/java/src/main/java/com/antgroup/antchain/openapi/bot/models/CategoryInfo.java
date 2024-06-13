// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CategoryInfo extends TeaModel {
    // 品类名称
    @NameInMap("category_name")
    @Validation(required = true)
    public String categoryName;

    // 品类编码
    @NameInMap("category_code")
    @Validation(required = true)
    public String categoryCode;

    // 描述内容
    @NameInMap("remark")
    public String remark;

    // 行业
    @NameInMap("industry")
    @Validation(required = true)
    public String industry;

    // 场景
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    public static CategoryInfo build(java.util.Map<String, ?> map) throws Exception {
        CategoryInfo self = new CategoryInfo();
        return TeaModel.build(map, self);
    }

    public CategoryInfo setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }
    public String getCategoryName() {
        return this.categoryName;
    }

    public CategoryInfo setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }
    public String getCategoryCode() {
        return this.categoryCode;
    }

    public CategoryInfo setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CategoryInfo setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public CategoryInfo setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
