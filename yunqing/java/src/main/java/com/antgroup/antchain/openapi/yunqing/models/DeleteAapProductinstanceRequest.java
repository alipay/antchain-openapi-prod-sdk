// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class DeleteAapProductinstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 站点code
    @NameInMap("site_code")
    @Validation(required = true)
    public String siteCode;

    // 产品实例所属命名空间
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 产品实例code
    @NameInMap("prod_code")
    @Validation(required = true)
    public String prodCode;

    // 产品实例名称
    @NameInMap("product_instance_name")
    @Validation(required = true)
    public String productInstanceName;

    public static DeleteAapProductinstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAapProductinstanceRequest self = new DeleteAapProductinstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAapProductinstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteAapProductinstanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteAapProductinstanceRequest setSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }
    public String getSiteCode() {
        return this.siteCode;
    }

    public DeleteAapProductinstanceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DeleteAapProductinstanceRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public DeleteAapProductinstanceRequest setProductInstanceName(String productInstanceName) {
        this.productInstanceName = productInstanceName;
        return this;
    }
    public String getProductInstanceName() {
        return this.productInstanceName;
    }

}
