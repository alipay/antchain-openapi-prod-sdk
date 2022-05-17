// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.osp.models;

import com.aliyun.tea.*;

public class GetInstancesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 共享中间件实例id
    @NameInMap("instance_id")
    public String instanceId;

    // 租户name
    @NameInMap("middleware_tenant")
    public String middlewareTenant;

    // workspace name
    @NameInMap("middleware_workspace")
    public String middlewareWorkspace;

    public static GetInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstancesRequest self = new GetInstancesRequest();
        return TeaModel.build(map, self);
    }

    public GetInstancesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetInstancesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetInstancesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstancesRequest setMiddlewareTenant(String middlewareTenant) {
        this.middlewareTenant = middlewareTenant;
        return this;
    }
    public String getMiddlewareTenant() {
        return this.middlewareTenant;
    }

    public GetInstancesRequest setMiddlewareWorkspace(String middlewareWorkspace) {
        this.middlewareWorkspace = middlewareWorkspace;
        return this;
    }
    public String getMiddlewareWorkspace() {
        return this.middlewareWorkspace;
    }

}
