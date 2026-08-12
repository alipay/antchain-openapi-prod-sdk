// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dsg.models;

import com.aliyun.tea.*;

public class QueryDocumentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 要识别的文本
    @NameInMap("document")
    @Validation(required = true)
    public String document;

    // 租户 ID,用于接口鉴权
    @NameInMap("tenant_id")
    public String tenantId;

    // 企业 ID,用于接口鉴权
    @NameInMap("enterprise_id")
    public String enterpriseId;

    public static QueryDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDocumentRequest self = new QueryDocumentRequest();
        return TeaModel.build(map, self);
    }

    public QueryDocumentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDocumentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDocumentRequest setDocument(String document) {
        this.document = document;
        return this;
    }
    public String getDocument() {
        return this.document;
    }

    public QueryDocumentRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryDocumentRequest setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public String getEnterpriseId() {
        return this.enterpriseId;
    }

}
