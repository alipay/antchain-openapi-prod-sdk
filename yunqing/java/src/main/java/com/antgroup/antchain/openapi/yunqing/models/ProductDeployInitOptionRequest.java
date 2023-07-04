// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class ProductDeployInitOptionRequest extends TeaModel {
    // 站点code
    @NameInMap("site_code")
    @Validation(required = true)
    public String siteCode;

    // 需要部署的产品实例元数据
    @NameInMap("product_instances")
    @Validation(required = true)
    public java.util.List<ProductInstanceMeta> productInstances;

    public static ProductDeployInitOptionRequest build(java.util.Map<String, ?> map) throws Exception {
        ProductDeployInitOptionRequest self = new ProductDeployInitOptionRequest();
        return TeaModel.build(map, self);
    }

    public ProductDeployInitOptionRequest setSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }
    public String getSiteCode() {
        return this.siteCode;
    }

    public ProductDeployInitOptionRequest setProductInstances(java.util.List<ProductInstanceMeta> productInstances) {
        this.productInstances = productInstances;
        return this;
    }
    public java.util.List<ProductInstanceMeta> getProductInstances() {
        return this.productInstances;
    }

}
