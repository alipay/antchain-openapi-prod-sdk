// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class QueryPdcpOwndataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务数据类型
    @NameInMap("data_type")
    @Validation(required = true)
    public String dataType;

    // 拥有数据的用户
    @NameInMap("user_did")
    public String userDid;

    // 当前分页，默认1
    @NameInMap("page_number")
    public Long pageNumber;

    // 分页大小，默认20
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryPdcpOwndataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPdcpOwndataRequest self = new QueryPdcpOwndataRequest();
        return TeaModel.build(map, self);
    }

    public QueryPdcpOwndataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPdcpOwndataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryPdcpOwndataRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public QueryPdcpOwndataRequest setUserDid(String userDid) {
        this.userDid = userDid;
        return this;
    }
    public String getUserDid() {
        return this.userDid;
    }

    public QueryPdcpOwndataRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryPdcpOwndataRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
