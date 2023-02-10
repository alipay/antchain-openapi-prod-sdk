// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class QueryPdcpDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权记录编码
    @NameInMap("authentication_no")
    public String authenticationNo;

    // 数据类型
    @NameInMap("data_type")
    @Validation(required = true)
    public String dataType;

    // 当前页面
    @NameInMap("page_number")
    public Long pageNumber;

    // 页面大小
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryPdcpDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPdcpDataRequest self = new QueryPdcpDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryPdcpDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPdcpDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryPdcpDataRequest setAuthenticationNo(String authenticationNo) {
        this.authenticationNo = authenticationNo;
        return this;
    }
    public String getAuthenticationNo() {
        return this.authenticationNo;
    }

    public QueryPdcpDataRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public QueryPdcpDataRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryPdcpDataRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
