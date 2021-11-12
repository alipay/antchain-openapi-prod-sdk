// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class Application extends TeaModel {
    // 应用英文名
    @NameInMap("application_name")
    public String applicationName;

    // 应用所属的产品的产品码
    @NameInMap("product_code")
    public String productCode;

    public static Application build(java.util.Map<String, ?> map) throws Exception {
        Application self = new Application();
        return TeaModel.build(map, self);
    }

    public Application setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public Application setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
