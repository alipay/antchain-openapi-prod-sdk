// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class GetMiddlewareInstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // curr_tenant
    @NameInMap("curr_tenant")
    @Validation(required = true)
    public String currTenant;

    // curr_workspace
    @NameInMap("curr_workspace")
    @Validation(required = true)
    public String currWorkspace;

    public static GetMiddlewareInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMiddlewareInstanceRequest self = new GetMiddlewareInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetMiddlewareInstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetMiddlewareInstanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetMiddlewareInstanceRequest setCurrTenant(String currTenant) {
        this.currTenant = currTenant;
        return this;
    }
    public String getCurrTenant() {
        return this.currTenant;
    }

    public GetMiddlewareInstanceRequest setCurrWorkspace(String currWorkspace) {
        this.currWorkspace = currWorkspace;
        return this;
    }
    public String getCurrWorkspace() {
        return this.currWorkspace;
    }

}
