// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.friskdescion.models;

import com.aliyun.tea.*;

public class ProductExtContext extends TeaModel {
    // 产品code
    /**
     * <strong>example:</strong>
     * <p>MD-CpFJeF0DAAABl4MFvUs</p>
     */
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 产品名
    /**
     * <strong>example:</strong>
     * <p>小微分</p>
     */
    @NameInMap("product_name")
    @Validation(required = true)
    public String productName;

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

    // 返回样本模版文件下载url
    /**
     * <strong>example:</strong>
     * <p><a href="http://oss">http://oss</a></p>
     */
    @NameInMap("template_file_down_url")
    @Validation(required = true)
    public String templateFileDownUrl;

    public static ProductExtContext build(java.util.Map<String, ?> map) throws Exception {
        ProductExtContext self = new ProductExtContext();
        return TeaModel.build(map, self);
    }

    public ProductExtContext setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ProductExtContext setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public ProductExtContext setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public ProductExtContext setTemplateContext(java.util.List<TemplateContext> templateContext) {
        this.templateContext = templateContext;
        return this;
    }
    public java.util.List<TemplateContext> getTemplateContext() {
        return this.templateContext;
    }

    public ProductExtContext setScoreFields(java.util.List<String> scoreFields) {
        this.scoreFields = scoreFields;
        return this;
    }
    public java.util.List<String> getScoreFields() {
        return this.scoreFields;
    }

    public ProductExtContext setTemplateFileDownUrl(String templateFileDownUrl) {
        this.templateFileDownUrl = templateFileDownUrl;
        return this;
    }
    public String getTemplateFileDownUrl() {
        return this.templateFileDownUrl;
    }

}
