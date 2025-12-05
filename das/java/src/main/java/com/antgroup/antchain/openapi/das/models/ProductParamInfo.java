// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class ProductParamInfo extends TeaModel {
    // 产品码
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 参数key
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("param_key")
    @Validation(required = true)
    public String paramKey;

    // 参数类型
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("param_type")
    @Validation(required = true)
    public String paramType;

    // 参数描述
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("param_desc")
    @Validation(required = true)
    public String paramDesc;

    // 是否可空
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("nullable")
    @Validation(required = true)
    public Boolean nullable;

    public static ProductParamInfo build(java.util.Map<String, ?> map) throws Exception {
        ProductParamInfo self = new ProductParamInfo();
        return TeaModel.build(map, self);
    }

    public ProductParamInfo setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ProductParamInfo setParamKey(String paramKey) {
        this.paramKey = paramKey;
        return this;
    }
    public String getParamKey() {
        return this.paramKey;
    }

    public ProductParamInfo setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public ProductParamInfo setParamDesc(String paramDesc) {
        this.paramDesc = paramDesc;
        return this;
    }
    public String getParamDesc() {
        return this.paramDesc;
    }

    public ProductParamInfo setNullable(Boolean nullable) {
        this.nullable = nullable;
        return this;
    }
    public Boolean getNullable() {
        return this.nullable;
    }

}
