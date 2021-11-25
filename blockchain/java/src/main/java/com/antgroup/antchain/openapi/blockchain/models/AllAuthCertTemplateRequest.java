// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class AllAuthCertTemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 证书模板的分类，目前支持马拉松和荣誉证书，marathon 、honor 、employee
    @NameInMap("category")
    @Validation(required = true)
    public String category;

    public static AllAuthCertTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        AllAuthCertTemplateRequest self = new AllAuthCertTemplateRequest();
        return TeaModel.build(map, self);
    }

    public AllAuthCertTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AllAuthCertTemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AllAuthCertTemplateRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

}
