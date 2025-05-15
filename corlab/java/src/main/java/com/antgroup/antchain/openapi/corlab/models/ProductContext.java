// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.corlab.models;

import com.aliyun.tea.*;

public class ProductContext extends TeaModel {
    // 产品code
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 模版code
    @NameInMap("template_code")
    @Validation(required = true)
    public String templateCode;

    // 模版内容,数组
    @NameInMap("template_context")
    @Validation(required = true)
    public java.util.List<TemplateContext> templateContext;

    public static ProductContext build(java.util.Map<String, ?> map) throws Exception {
        ProductContext self = new ProductContext();
        return TeaModel.build(map, self);
    }

    public ProductContext setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ProductContext setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public ProductContext setTemplateContext(java.util.List<TemplateContext> templateContext) {
        this.templateContext = templateContext;
        return this;
    }
    public java.util.List<TemplateContext> getTemplateContext() {
        return this.templateContext;
    }

}
