// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CategoryInfo extends TeaModel {
    // 品类名称
    /**
     * <strong>example:</strong>
     * <p>电力仪表</p>
     */
    @NameInMap("category_name")
    @Validation(required = true)
    public String categoryName;

    // 品类编码
    /**
     * <strong>example:</strong>
     * <p>ant_power_meter</p>
     */
    @NameInMap("category_code")
    @Validation(required = true)
    public String categoryCode;

    // 描述内容
    /**
     * <strong>example:</strong>
     * <p>这是描述</p>
     */
    @NameInMap("remark")
    public String remark;

    // 行业
    /**
     * <strong>example:</strong>
     * <p>工业</p>
     */
    @NameInMap("industry")
    @Validation(required = true)
    public String industry;

    // 场景
    /**
     * <strong>example:</strong>
     * <p>智能工业</p>
     */
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
