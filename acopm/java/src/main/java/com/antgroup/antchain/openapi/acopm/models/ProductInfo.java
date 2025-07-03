// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class ProductInfo extends TeaModel {
    // 产品码
    /**
     * <strong>example:</strong>
     * <p>YUNQING</p>
     */
    @NameInMap("prod_code")
    @Validation(required = true)
    public String prodCode;

    // sdk版本号
    /**
     * <strong>example:</strong>
     * <p>1.1.3</p>
     */
    @NameInMap("sdk_version")
    @Validation(required = true)
    public String sdkVersion;

    public static ProductInfo build(java.util.Map<String, ?> map) throws Exception {
        ProductInfo self = new ProductInfo();
        return TeaModel.build(map, self);
    }

    public ProductInfo setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public ProductInfo setSdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion;
        return this;
    }
    public String getSdkVersion() {
        return this.sdkVersion;
    }

}
