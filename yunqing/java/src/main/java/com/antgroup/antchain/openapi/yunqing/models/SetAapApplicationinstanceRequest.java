// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class SetAapApplicationinstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 规格修改
    @NameInMap("resource_spec")
    @Validation(required = true)
    public ResourceSpec resourceSpec;

    // 命名空间
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 产品实例名称
    @NameInMap("product_instance_name")
    @Validation(required = true)
    public String productInstanceName;

    // 产品code
    @NameInMap("prod_code")
    @Validation(required = true)
    public String prodCode;

    // 应用名称
    @NameInMap("app_code")
    @Validation(required = true)
    public String appCode;

    // 站点code
    @NameInMap("site_code")
    @Validation(required = true)
    public String siteCode;

    public static SetAapApplicationinstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAapApplicationinstanceRequest self = new SetAapApplicationinstanceRequest();
        return TeaModel.build(map, self);
    }

    public SetAapApplicationinstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetAapApplicationinstanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetAapApplicationinstanceRequest setResourceSpec(ResourceSpec resourceSpec) {
        this.resourceSpec = resourceSpec;
        return this;
    }
    public ResourceSpec getResourceSpec() {
        return this.resourceSpec;
    }

    public SetAapApplicationinstanceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SetAapApplicationinstanceRequest setProductInstanceName(String productInstanceName) {
        this.productInstanceName = productInstanceName;
        return this;
    }
    public String getProductInstanceName() {
        return this.productInstanceName;
    }

    public SetAapApplicationinstanceRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public SetAapApplicationinstanceRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public SetAapApplicationinstanceRequest setSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }
    public String getSiteCode() {
        return this.siteCode;
    }

}
