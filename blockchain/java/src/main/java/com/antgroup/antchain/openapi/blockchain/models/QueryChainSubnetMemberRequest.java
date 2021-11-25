// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryChainSubnetMemberRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 子链id
    @NameInMap("ant_chain_id")
    public String antChainId;

    // 联盟id
    @NameInMap("consortium_id")
    public String consortiumId;

    // 分页编号
    @NameInMap("page_number")
    public String pageNumber;

    // 分页大小
    @NameInMap("page_size")
    public String pageSize;

    public static QueryChainSubnetMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryChainSubnetMemberRequest self = new QueryChainSubnetMemberRequest();
        return TeaModel.build(map, self);
    }

    public QueryChainSubnetMemberRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryChainSubnetMemberRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryChainSubnetMemberRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public QueryChainSubnetMemberRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public QueryChainSubnetMemberRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public QueryChainSubnetMemberRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
