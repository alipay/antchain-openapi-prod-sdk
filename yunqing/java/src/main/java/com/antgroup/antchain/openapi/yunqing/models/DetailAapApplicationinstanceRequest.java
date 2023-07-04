// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class DetailAapApplicationinstanceRequest extends TeaModel {
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

    // 产品实例名称
    @NameInMap("product_instance_name")
    @Validation(required = true)
    public String productInstanceName;

    // 应用code
    @NameInMap("app_code")
    @Validation(required = true)
    public String appCode;

    public static DetailAapApplicationinstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailAapApplicationinstanceRequest self = new DetailAapApplicationinstanceRequest();
        return TeaModel.build(map, self);
    }

    public DetailAapApplicationinstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DetailAapApplicationinstanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DetailAapApplicationinstanceRequest setSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }
    public String getSiteCode() {
        return this.siteCode;
    }

    public DetailAapApplicationinstanceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DetailAapApplicationinstanceRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public DetailAapApplicationinstanceRequest setProductInstanceName(String productInstanceName) {
        this.productInstanceName = productInstanceName;
        return this;
    }
    public String getProductInstanceName() {
        return this.productInstanceName;
    }

    public DetailAapApplicationinstanceRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

}
