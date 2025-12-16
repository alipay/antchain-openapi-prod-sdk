// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class ProductParamInfo extends TeaModel {
    // 参数业务类型
    /**
     * <strong>example:</strong>
     * <p>certNo.身份证 name.姓名</p>
     */
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

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

    public static ProductParamInfo build(java.util.Map<String, ?> map) throws Exception {
        ProductParamInfo self = new ProductParamInfo();
        return TeaModel.build(map, self);
    }

    public ProductParamInfo setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
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

}
