// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class QueryAapProductinstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // site_code
    @NameInMap("site_code")
    @Validation(required = true)
    public String siteCode;

    // name space
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

    public static QueryAapProductinstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAapProductinstanceRequest self = new QueryAapProductinstanceRequest();
        return TeaModel.build(map, self);
    }

    public QueryAapProductinstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAapProductinstanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAapProductinstanceRequest setSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }
    public String getSiteCode() {
        return this.siteCode;
    }

    public QueryAapProductinstanceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryAapProductinstanceRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QueryAapProductinstanceRequest setProductInstanceName(String productInstanceName) {
        this.productInstanceName = productInstanceName;
        return this;
    }
    public String getProductInstanceName() {
        return this.productInstanceName;
    }

}
