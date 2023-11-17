// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_be9ae52241c747408ac24bec8f036d74.models;

import com.aliyun.tea.*;

public class GetAntchainPdcpProjectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 项目唯一标识
    @NameInMap("project_id")
    @Validation(required = true, minLength = 1)
    public String projectId;

    public static GetAntchainPdcpProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAntchainPdcpProjectRequest self = new GetAntchainPdcpProjectRequest();
        return TeaModel.build(map, self);
    }

    public GetAntchainPdcpProjectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAntchainPdcpProjectRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetAntchainPdcpProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
