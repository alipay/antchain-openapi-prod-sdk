// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class GetDmsInstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // ddd
    @NameInMap("curr_tenant")
    @Validation(required = true)
    public String currTenant;

    // ss
    @NameInMap("curr_workspace")
    @Validation(required = true)
    public String currWorkspace;

    public static GetDmsInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDmsInstanceRequest self = new GetDmsInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetDmsInstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetDmsInstanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetDmsInstanceRequest setCurrTenant(String currTenant) {
        this.currTenant = currTenant;
        return this;
    }
    public String getCurrTenant() {
        return this.currTenant;
    }

    public GetDmsInstanceRequest setCurrWorkspace(String currWorkspace) {
        this.currWorkspace = currWorkspace;
        return this;
    }
    public String getCurrWorkspace() {
        return this.currWorkspace;
    }

}
