// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class RetrySgAuthrulegroupsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 服务鉴权黑、白名单 id
    @NameInMap("auth_group_id")
    @Validation(required = true)
    public Long authGroupId;

    // 服务接口 id
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    public static RetrySgAuthrulegroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        RetrySgAuthrulegroupsRequest self = new RetrySgAuthrulegroupsRequest();
        return TeaModel.build(map, self);
    }

    public RetrySgAuthrulegroupsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RetrySgAuthrulegroupsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RetrySgAuthrulegroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RetrySgAuthrulegroupsRequest setAuthGroupId(Long authGroupId) {
        this.authGroupId = authGroupId;
        return this;
    }
    public Long getAuthGroupId() {
        return this.authGroupId;
    }

    public RetrySgAuthrulegroupsRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

}
