// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class StaticDataModuleDetail extends TeaModel {
    // 描述
    /**
     * <strong>example:</strong>
     * <p>企业</p>
     */
    @NameInMap("property_text")
    @Validation(required = true)
    public String propertyText;

    // 商户类型
    /**
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("property_value")
    @Validation(required = true)
    public String propertyValue;

    // 图标
    /**
     * <strong>example:</strong>
     * <p>图标</p>
     */
    @NameInMap("icon")
    public String icon;

    // 置灰图标
    /**
     * <strong>example:</strong>
     * <p>置灰图标</p>
     */
    @NameInMap("grey_icon")
    public String greyIcon;

    // 叶子结点，目前存的一级类目下的二级类目
    /**
     * <strong>example:</strong>
     * <p>[{&quot;propertyText&quot;:&quot;123&quot;,&quot;propertyValue&quot;:&quot;123&quot;}]</p>
     */
    @NameInMap("children_detail_list")
    public String childrenDetailList;

    // 是否有叶子结点
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("has_children")
    public Boolean hasChildren;

    public static StaticDataModuleDetail build(java.util.Map<String, ?> map) throws Exception {
        StaticDataModuleDetail self = new StaticDataModuleDetail();
        return TeaModel.build(map, self);
    }

    public StaticDataModuleDetail setPropertyText(String propertyText) {
        this.propertyText = propertyText;
        return this;
    }
    public String getPropertyText() {
        return this.propertyText;
    }

    public StaticDataModuleDetail setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
        return this;
    }
    public String getPropertyValue() {
        return this.propertyValue;
    }

    public StaticDataModuleDetail setIcon(String icon) {
        this.icon = icon;
        return this;
    }
    public String getIcon() {
        return this.icon;
    }

    public StaticDataModuleDetail setGreyIcon(String greyIcon) {
        this.greyIcon = greyIcon;
        return this;
    }
    public String getGreyIcon() {
        return this.greyIcon;
    }

    public StaticDataModuleDetail setChildrenDetailList(String childrenDetailList) {
        this.childrenDetailList = childrenDetailList;
        return this;
    }
    public String getChildrenDetailList() {
        return this.childrenDetailList;
    }

    public StaticDataModuleDetail setHasChildren(Boolean hasChildren) {
        this.hasChildren = hasChildren;
        return this;
    }
    public Boolean getHasChildren() {
        return this.hasChildren;
    }

}
