// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class AuthProductGroup extends TeaModel {
    // 产品code列表
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("product_code_list")
    @Validation(required = true)
    public java.util.List<String> productCodeList;

    // 数据产品入参,JSON数组
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("product_param")
    @Validation(required = true)
    public String productParam;

    // C端展示授权内容code
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("auth_content_code")
    @Validation(required = true)
    public String authContentCode;

    public static AuthProductGroup build(java.util.Map<String, ?> map) throws Exception {
        AuthProductGroup self = new AuthProductGroup();
        return TeaModel.build(map, self);
    }

    public AuthProductGroup setProductCodeList(java.util.List<String> productCodeList) {
        this.productCodeList = productCodeList;
        return this;
    }
    public java.util.List<String> getProductCodeList() {
        return this.productCodeList;
    }

    public AuthProductGroup setProductParam(String productParam) {
        this.productParam = productParam;
        return this;
    }
    public String getProductParam() {
        return this.productParam;
    }

    public AuthProductGroup setAuthContentCode(String authContentCode) {
        this.authContentCode = authContentCode;
        return this;
    }
    public String getAuthContentCode() {
        return this.authContentCode;
    }

}
