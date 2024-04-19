// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class EnterpriseProductOutline extends TeaModel {
    // 产品自定义编码
    // 
    @NameInMap("enterprise_custom_code")
    @Validation(required = true)
    public String enterpriseCustomCode;

    // 产品名称
    // 
    @NameInMap("product_name")
    @Validation(required = true)
    public String productName;

    // 规格型号
    @NameInMap("specification")
    @Validation(required = true)
    public String specification;

    // 产品描述
    @NameInMap("product_description")
    public String productDescription;

    // 产品分类名称
    @NameInMap("product_category_name")
    @Validation(required = true)
    public String productCategoryName;

    // 品牌信息
    @NameInMap("brand_information")
    public String brandInformation;

    public static EnterpriseProductOutline build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseProductOutline self = new EnterpriseProductOutline();
        return TeaModel.build(map, self);
    }

    public EnterpriseProductOutline setEnterpriseCustomCode(String enterpriseCustomCode) {
        this.enterpriseCustomCode = enterpriseCustomCode;
        return this;
    }
    public String getEnterpriseCustomCode() {
        return this.enterpriseCustomCode;
    }

    public EnterpriseProductOutline setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public EnterpriseProductOutline setSpecification(String specification) {
        this.specification = specification;
        return this;
    }
    public String getSpecification() {
        return this.specification;
    }

    public EnterpriseProductOutline setProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }
    public String getProductDescription() {
        return this.productDescription;
    }

    public EnterpriseProductOutline setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
        return this;
    }
    public String getProductCategoryName() {
        return this.productCategoryName;
    }

    public EnterpriseProductOutline setBrandInformation(String brandInformation) {
        this.brandInformation = brandInformation;
        return this;
    }
    public String getBrandInformation() {
        return this.brandInformation;
    }

}
