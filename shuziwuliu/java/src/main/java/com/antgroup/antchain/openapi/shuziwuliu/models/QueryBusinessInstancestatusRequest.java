// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryBusinessInstancestatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 实例对应的租户id
    @NameInMap("instance_tenant")
    @Validation(required = true)
    public String instanceTenant;

    public static QueryBusinessInstancestatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBusinessInstancestatusRequest self = new QueryBusinessInstancestatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryBusinessInstancestatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBusinessInstancestatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBusinessInstancestatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryBusinessInstancestatusRequest setInstanceTenant(String instanceTenant) {
        this.instanceTenant = instanceTenant;
        return this;
    }
    public String getInstanceTenant() {
        return this.instanceTenant;
    }

}
