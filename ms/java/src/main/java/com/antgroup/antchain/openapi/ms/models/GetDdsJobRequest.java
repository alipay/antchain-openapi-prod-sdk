// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class GetDdsJobRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // job id
    @NameInMap("id")
    @Validation(required = true)
    public Integer id;

    // middleware instance id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static GetDdsJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDdsJobRequest self = new GetDdsJobRequest();
        return TeaModel.build(map, self);
    }

    public GetDdsJobRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetDdsJobRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetDdsJobRequest setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public GetDdsJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
