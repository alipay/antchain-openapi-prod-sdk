// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class OperateLcaprojectTracebindingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 项目编码
    @NameInMap("project_no")
    @Validation(required = true)
    public String projectNo;

    public static OperateLcaprojectTracebindingRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateLcaprojectTracebindingRequest self = new OperateLcaprojectTracebindingRequest();
        return TeaModel.build(map, self);
    }

    public OperateLcaprojectTracebindingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateLcaprojectTracebindingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateLcaprojectTracebindingRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OperateLcaprojectTracebindingRequest setProjectNo(String projectNo) {
        this.projectNo = projectNo;
        return this;
    }
    public String getProjectNo() {
        return this.projectNo;
    }

}
