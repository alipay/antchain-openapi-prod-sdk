// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class GetDasEnterprisevcRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权实例biz_uuid
    @NameInMap("auth_instance_biz_uuid")
    @Validation(required = true)
    public String authInstanceBizUuid;

    // 授权企业信息
    @NameInMap("auth_person_enterprise_info")
    @Validation(required = true)
    public AuthPersonEnterpriseInfo authPersonEnterpriseInfo;

    public static GetDasEnterprisevcRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDasEnterprisevcRequest self = new GetDasEnterprisevcRequest();
        return TeaModel.build(map, self);
    }

    public GetDasEnterprisevcRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetDasEnterprisevcRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetDasEnterprisevcRequest setAuthInstanceBizUuid(String authInstanceBizUuid) {
        this.authInstanceBizUuid = authInstanceBizUuid;
        return this;
    }
    public String getAuthInstanceBizUuid() {
        return this.authInstanceBizUuid;
    }

    public GetDasEnterprisevcRequest setAuthPersonEnterpriseInfo(AuthPersonEnterpriseInfo authPersonEnterpriseInfo) {
        this.authPersonEnterpriseInfo = authPersonEnterpriseInfo;
        return this;
    }
    public AuthPersonEnterpriseInfo getAuthPersonEnterpriseInfo() {
        return this.authPersonEnterpriseInfo;
    }

}
