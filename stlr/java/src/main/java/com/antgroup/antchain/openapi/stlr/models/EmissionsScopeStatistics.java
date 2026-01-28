// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class EmissionsScopeStatistics extends TeaModel {
    // 盘查范围编码
    /**
     * <strong>example:</strong>
     * <p>002</p>
     */
    @NameInMap("inventory_scope_no")
    @Validation(required = true)
    public String inventoryScopeNo;

    // 盘查范围名称
    /**
     * <strong>example:</strong>
     * <p>范围一</p>
     */
    @NameInMap("inventory_scope_name")
    @Validation(required = true)
    public String inventoryScopeName;

    // 碳排放量
    /**
     * <strong>example:</strong>
     * <p>222.33</p>
     */
    @NameInMap("emissions")
    @Validation(required = true)
    public Long emissions;

    // 排放占比
    /**
     * <strong>example:</strong>
     * <p>0.11</p>
     */
    @NameInMap("percentage")
    @Validation(required = true)
    public Long percentage;

    // 范围下各分类排放数据
    @NameInMap("category_emissions_list")
    @Validation(required = true)
    public java.util.List<EmissionsCategoryStatistics> categoryEmissionsList;

    public static EmissionsScopeStatistics build(java.util.Map<String, ?> map) throws Exception {
        EmissionsScopeStatistics self = new EmissionsScopeStatistics();
        return TeaModel.build(map, self);
    }

    public EmissionsScopeStatistics setInventoryScopeNo(String inventoryScopeNo) {
        this.inventoryScopeNo = inventoryScopeNo;
        return this;
    }
    public String getInventoryScopeNo() {
        return this.inventoryScopeNo;
    }

    public EmissionsScopeStatistics setInventoryScopeName(String inventoryScopeName) {
        this.inventoryScopeName = inventoryScopeName;
        return this;
    }
    public String getInventoryScopeName() {
        return this.inventoryScopeName;
    }

    public EmissionsScopeStatistics setEmissions(Long emissions) {
        this.emissions = emissions;
        return this;
    }
    public Long getEmissions() {
        return this.emissions;
    }

    public EmissionsScopeStatistics setPercentage(Long percentage) {
        this.percentage = percentage;
        return this;
    }
    public Long getPercentage() {
        return this.percentage;
    }

    public EmissionsScopeStatistics setCategoryEmissionsList(java.util.List<EmissionsCategoryStatistics> categoryEmissionsList) {
        this.categoryEmissionsList = categoryEmissionsList;
        return this;
    }
    public java.util.List<EmissionsCategoryStatistics> getCategoryEmissionsList() {
        return this.categoryEmissionsList;
    }

}
