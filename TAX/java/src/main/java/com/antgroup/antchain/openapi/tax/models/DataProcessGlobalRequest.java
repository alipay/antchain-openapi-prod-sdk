// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class DataProcessGlobalRequest extends TeaModel {
    // 产品码
    /**
     * <strong>example:</strong>
     * <p>SCIAZDR</p>
     */
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 租户类型
    /**
     * <strong>example:</strong>
     * <p>SCIAZDR</p>
     */
    @NameInMap("inst_code")
    @Validation(required = true)
    public String instCode;

    // 参数
    /**
     * <strong>example:</strong>
     * <p>{&quot;aa&quot;:&quot;aa&quot;}</p>
     */
    @NameInMap("param")
    @Validation(required = true)
    public String param;

    public static DataProcessGlobalRequest build(java.util.Map<String, ?> map) throws Exception {
        DataProcessGlobalRequest self = new DataProcessGlobalRequest();
        return TeaModel.build(map, self);
    }

    public DataProcessGlobalRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DataProcessGlobalRequest setInstCode(String instCode) {
        this.instCode = instCode;
        return this;
    }
    public String getInstCode() {
        return this.instCode;
    }

    public DataProcessGlobalRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

}
