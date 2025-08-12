// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_63625f64df2048aca9ff5bea9e227854.models;

import com.aliyun.tea.*;

public class PersonalLabelCustomization extends TeaModel {
    // 标签需求类型。0,1-只需要这些标签，2-不需要这些标签，默认0
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("filter_type")
    public Long filterType;

    // 需要个性化处理的一级标签
    @NameInMap("custom_label_v1")
    public java.util.List<String> customLabelV1;

    // 需要个性化处理的二级标签
    @NameInMap("custom_label_v2")
    public java.util.List<String> customLabelV2;

    public static PersonalLabelCustomization build(java.util.Map<String, ?> map) throws Exception {
        PersonalLabelCustomization self = new PersonalLabelCustomization();
        return TeaModel.build(map, self);
    }

    public PersonalLabelCustomization setFilterType(Long filterType) {
        this.filterType = filterType;
        return this;
    }
    public Long getFilterType() {
        return this.filterType;
    }

    public PersonalLabelCustomization setCustomLabelV1(java.util.List<String> customLabelV1) {
        this.customLabelV1 = customLabelV1;
        return this;
    }
    public java.util.List<String> getCustomLabelV1() {
        return this.customLabelV1;
    }

    public PersonalLabelCustomization setCustomLabelV2(java.util.List<String> customLabelV2) {
        this.customLabelV2 = customLabelV2;
        return this;
    }
    public java.util.List<String> getCustomLabelV2() {
        return this.customLabelV2;
    }

}
