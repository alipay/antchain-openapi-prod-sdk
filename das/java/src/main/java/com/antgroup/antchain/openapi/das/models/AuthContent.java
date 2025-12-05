// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class AuthContent extends TeaModel {
    // 产品code列表
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
     * <p>SOCIAL_INSURANCE</p>
     */
    @NameInMap("auth_content_code")
    @Validation(required = true)
    public String authContentCode;

    // C端展示授权内容名称
    /**
     * <strong>example:</strong>
     * <p>社保</p>
     */
    @NameInMap("auth_content_name")
    @Validation(required = true)
    public String authContentName;

    public static AuthContent build(java.util.Map<String, ?> map) throws Exception {
        AuthContent self = new AuthContent();
        return TeaModel.build(map, self);
    }

    public AuthContent setProductCodeList(java.util.List<String> productCodeList) {
        this.productCodeList = productCodeList;
        return this;
    }
    public java.util.List<String> getProductCodeList() {
        return this.productCodeList;
    }

    public AuthContent setProductParam(String productParam) {
        this.productParam = productParam;
        return this;
    }
    public String getProductParam() {
        return this.productParam;
    }

    public AuthContent setAuthContentCode(String authContentCode) {
        this.authContentCode = authContentCode;
        return this;
    }
    public String getAuthContentCode() {
        return this.authContentCode;
    }

    public AuthContent setAuthContentName(String authContentName) {
        this.authContentName = authContentName;
        return this;
    }
    public String getAuthContentName() {
        return this.authContentName;
    }

}
