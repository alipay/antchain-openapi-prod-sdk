// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class QueryAapApplicationinstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // sitecode
    // 
    @NameInMap("site_code")
    @Validation(required = true)
    public String siteCode;

    // namespace
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 产品code
    @NameInMap("prod_code")
    @Validation(required = true)
    public String prodCode;

    // 产品实例name
    @NameInMap("product_instance_name")
    @Validation(required = true)
    public String productInstanceName;

    // app name
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    public static QueryAapApplicationinstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAapApplicationinstanceRequest self = new QueryAapApplicationinstanceRequest();
        return TeaModel.build(map, self);
    }

    public QueryAapApplicationinstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAapApplicationinstanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAapApplicationinstanceRequest setSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }
    public String getSiteCode() {
        return this.siteCode;
    }

    public QueryAapApplicationinstanceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryAapApplicationinstanceRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QueryAapApplicationinstanceRequest setProductInstanceName(String productInstanceName) {
        this.productInstanceName = productInstanceName;
        return this;
    }
    public String getProductInstanceName() {
        return this.productInstanceName;
    }

    public QueryAapApplicationinstanceRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

}
