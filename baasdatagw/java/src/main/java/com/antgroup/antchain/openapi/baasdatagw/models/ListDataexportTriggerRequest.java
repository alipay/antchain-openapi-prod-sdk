// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ListDataexportTriggerRequest extends TeaModel {
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

    public static ListDataexportTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataexportTriggerRequest self = new ListDataexportTriggerRequest();
        return TeaModel.build(map, self);
    }

    public ListDataexportTriggerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListDataexportTriggerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListDataexportTriggerRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListDataexportTriggerRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
