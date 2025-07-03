// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.corlab.models;

import com.aliyun.tea.*;

public class ProductContext extends TeaModel {
    // 产品code
    /**
     * <strong>example:</strong>
     * <p>aft_v4</p>
     */
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 模版code
    /**
     * <strong>example:</strong>
     * <p>tb-default</p>
     */
    @NameInMap("template_code")
    @Validation(required = true)
    public String templateCode;

    // 模版内容,数组
    @NameInMap("template_context")
    @Validation(required = true)
    public java.util.List<TemplateContext> templateContext;

    // 产品模型结果字段
    /**
     * <strong>example:</strong>
     * <p>[&quot;aft_v3_score&quot;,&quot;aft_v4_score&quot;]</p>
     */
    @NameInMap("score_fields")
    @Validation(required = true)
    public java.util.List<String> scoreFields;

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

    public ProductContext setScoreFields(java.util.List<String> scoreFields) {
        this.scoreFields = scoreFields;
        return this;
    }
    public java.util.List<String> getScoreFields() {
        return this.scoreFields;
    }

}
