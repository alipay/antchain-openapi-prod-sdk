// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class GetRtopCompanyMonitorRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 地区类型
    @NameInMap("company_name")
    @Validation(required = true)
    public String companyName;

    public static GetRtopCompanyMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRtopCompanyMonitorRequest self = new GetRtopCompanyMonitorRequest();
        return TeaModel.build(map, self);
    }

    public GetRtopCompanyMonitorRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetRtopCompanyMonitorRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetRtopCompanyMonitorRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

}
