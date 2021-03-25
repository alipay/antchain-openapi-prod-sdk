// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryContractOrganizationsealsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 机构id
    @NameInMap("org_id")
    @Validation(required = true)
    public String orgId;

    // 分页起始位置
    @NameInMap("offset")
    @Validation(required = true)
    public Long offset;

    // 单页数量
    @NameInMap("size")
    @Validation(required = true)
    public Long size;

    public static QueryContractOrganizationsealsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryContractOrganizationsealsRequest self = new QueryContractOrganizationsealsRequest();
        return TeaModel.build(map, self);
    }

    public QueryContractOrganizationsealsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryContractOrganizationsealsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryContractOrganizationsealsRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public QueryContractOrganizationsealsRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public QueryContractOrganizationsealsRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
