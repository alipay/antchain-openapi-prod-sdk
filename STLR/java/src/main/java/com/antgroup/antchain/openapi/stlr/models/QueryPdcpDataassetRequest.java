// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class QueryPdcpDataassetRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 当前页码，默认1
    @NameInMap("page_number")
    public Long pageNumber;

    // 页面大小，默认20
    @NameInMap("page_size")
    public Long pageSize;

    // 数据类型
    @NameInMap("data_type_no")
    public String dataTypeNo;

    // 数据资产所有者
    @NameInMap("user_did")
    public String userDid;

    public static QueryPdcpDataassetRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPdcpDataassetRequest self = new QueryPdcpDataassetRequest();
        return TeaModel.build(map, self);
    }

    public QueryPdcpDataassetRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPdcpDataassetRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryPdcpDataassetRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryPdcpDataassetRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryPdcpDataassetRequest setDataTypeNo(String dataTypeNo) {
        this.dataTypeNo = dataTypeNo;
        return this;
    }
    public String getDataTypeNo() {
        return this.dataTypeNo;
    }

    public QueryPdcpDataassetRequest setUserDid(String userDid) {
        this.userDid = userDid;
        return this;
    }
    public String getUserDid() {
        return this.userDid;
    }

}
