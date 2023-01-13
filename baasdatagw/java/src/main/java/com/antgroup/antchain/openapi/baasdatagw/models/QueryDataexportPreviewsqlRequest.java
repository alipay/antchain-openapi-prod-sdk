// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class QueryDataexportPreviewsqlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // -
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // -
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // -
    @NameInMap("trigger")
    @Validation(required = true)
    public Trigger trigger;

    public static QueryDataexportPreviewsqlRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDataexportPreviewsqlRequest self = new QueryDataexportPreviewsqlRequest();
        return TeaModel.build(map, self);
    }

    public QueryDataexportPreviewsqlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDataexportPreviewsqlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDataexportPreviewsqlRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryDataexportPreviewsqlRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryDataexportPreviewsqlRequest setTrigger(Trigger trigger) {
        this.trigger = trigger;
        return this;
    }
    public Trigger getTrigger() {
        return this.trigger;
    }

}
