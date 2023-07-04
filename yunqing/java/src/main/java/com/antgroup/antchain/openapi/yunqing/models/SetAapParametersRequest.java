// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class SetAapParametersRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // site code
    @NameInMap("site_code")
    @Validation(required = true)
    public String siteCode;

    // namespace
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // prod code
    @NameInMap("prod_code")
    @Validation(required = true)
    public String prodCode;

    // product_instance_name
    @NameInMap("product_instance_name")
    @Validation(required = true)
    public String productInstanceName;

    // 应用code
    @NameInMap("app_code")
    @Validation(required = true)
    public String appCode;

    // 更新的应用参数
    @NameInMap("app_envs")
    @Validation(required = true)
    public java.util.List<AppEnv> appEnvs;

    public static SetAapParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAapParametersRequest self = new SetAapParametersRequest();
        return TeaModel.build(map, self);
    }

    public SetAapParametersRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetAapParametersRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetAapParametersRequest setSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }
    public String getSiteCode() {
        return this.siteCode;
    }

    public SetAapParametersRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SetAapParametersRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public SetAapParametersRequest setProductInstanceName(String productInstanceName) {
        this.productInstanceName = productInstanceName;
        return this;
    }
    public String getProductInstanceName() {
        return this.productInstanceName;
    }

    public SetAapParametersRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public SetAapParametersRequest setAppEnvs(java.util.List<AppEnv> appEnvs) {
        this.appEnvs = appEnvs;
        return this;
    }
    public java.util.List<AppEnv> getAppEnvs() {
        return this.appEnvs;
    }

}
