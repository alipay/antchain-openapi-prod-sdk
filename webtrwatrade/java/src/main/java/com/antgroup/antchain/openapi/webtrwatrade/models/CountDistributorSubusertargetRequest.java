// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class CountDistributorSubusertargetRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 项目id
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    public static CountDistributorSubusertargetRequest build(java.util.Map<String, ?> map) throws Exception {
        CountDistributorSubusertargetRequest self = new CountDistributorSubusertargetRequest();
        return TeaModel.build(map, self);
    }

    public CountDistributorSubusertargetRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CountDistributorSubusertargetRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CountDistributorSubusertargetRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
