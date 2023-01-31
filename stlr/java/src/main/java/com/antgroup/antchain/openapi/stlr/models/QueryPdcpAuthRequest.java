// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class QueryPdcpAuthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权记录编码
    @NameInMap("authentication_no")
    public String authenticationNo;

    // 授权方did
    @NameInMap("authorizer_did")
    public String authorizerDid;

    // 模糊匹配
    @NameInMap("authorizer_name")
    public String authorizerName;

    // 被授权方did
    @NameInMap("authorized_did")
    public String authorizedDid;

    // 模糊匹配
    @NameInMap("authorized_name")
    public String authorizedName;

    // 数据协作类型
    @NameInMap("data_transfer_type")
    public String dataTransferType;

    // 授权状态
    @NameInMap("status")
    public String status;

    // 当前页面
    @NameInMap("page_number")
    public Long pageNumber;

    // 页面大小
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryPdcpAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPdcpAuthRequest self = new QueryPdcpAuthRequest();
        return TeaModel.build(map, self);
    }

    public QueryPdcpAuthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPdcpAuthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryPdcpAuthRequest setAuthenticationNo(String authenticationNo) {
        this.authenticationNo = authenticationNo;
        return this;
    }
    public String getAuthenticationNo() {
        return this.authenticationNo;
    }

    public QueryPdcpAuthRequest setAuthorizerDid(String authorizerDid) {
        this.authorizerDid = authorizerDid;
        return this;
    }
    public String getAuthorizerDid() {
        return this.authorizerDid;
    }

    public QueryPdcpAuthRequest setAuthorizerName(String authorizerName) {
        this.authorizerName = authorizerName;
        return this;
    }
    public String getAuthorizerName() {
        return this.authorizerName;
    }

    public QueryPdcpAuthRequest setAuthorizedDid(String authorizedDid) {
        this.authorizedDid = authorizedDid;
        return this;
    }
    public String getAuthorizedDid() {
        return this.authorizedDid;
    }

    public QueryPdcpAuthRequest setAuthorizedName(String authorizedName) {
        this.authorizedName = authorizedName;
        return this;
    }
    public String getAuthorizedName() {
        return this.authorizedName;
    }

    public QueryPdcpAuthRequest setDataTransferType(String dataTransferType) {
        this.dataTransferType = dataTransferType;
        return this;
    }
    public String getDataTransferType() {
        return this.dataTransferType;
    }

    public QueryPdcpAuthRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryPdcpAuthRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryPdcpAuthRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
