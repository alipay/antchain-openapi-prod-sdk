// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d55db67c8e5a4e799ff51ac9e5bcede3.models;

import com.aliyun.tea.*;

public class QueryBaasChainContractProjectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // consortium_id
    @NameInMap("consortium_id")
    @Validation(required = true)
    public String consortiumId;

    // page_number
    @NameInMap("page_number")
    @Validation(required = true)
    public Long pageNumber;

    // page_size
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // region_id
    @NameInMap("region_id")
    public String regionId;

    public static QueryBaasChainContractProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBaasChainContractProjectRequest self = new QueryBaasChainContractProjectRequest();
        return TeaModel.build(map, self);
    }

    public QueryBaasChainContractProjectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBaasChainContractProjectRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBaasChainContractProjectRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public QueryBaasChainContractProjectRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryBaasChainContractProjectRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryBaasChainContractProjectRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
