// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryChainContractProjectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
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

    public static QueryChainContractProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryChainContractProjectRequest self = new QueryChainContractProjectRequest();
        return TeaModel.build(map, self);
    }

    public QueryChainContractProjectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryChainContractProjectRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryChainContractProjectRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public QueryChainContractProjectRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryChainContractProjectRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryChainContractProjectRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
