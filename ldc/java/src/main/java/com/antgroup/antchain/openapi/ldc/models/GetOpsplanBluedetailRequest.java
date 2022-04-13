// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GetOpsplanBluedetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // antcloud.ldc.opsplan.detail.query 接口返回的 group_collection_list. app_group_list.id
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    public static GetOpsplanBluedetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOpsplanBluedetailRequest self = new GetOpsplanBluedetailRequest();
        return TeaModel.build(map, self);
    }

    public GetOpsplanBluedetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetOpsplanBluedetailRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
