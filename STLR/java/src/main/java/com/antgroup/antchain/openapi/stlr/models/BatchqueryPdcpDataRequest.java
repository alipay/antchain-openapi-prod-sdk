// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class BatchqueryPdcpDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务数据类型，查询该数据类型的授权数据
    @NameInMap("data_type")
    @Validation(required = true)
    public String dataType;

    // 授权方身份ID，若指定查询该用户授权的数据
    @NameInMap("authorizer_did")
    public String authorizerDid;

    // 被授权方身份ID，若指定查询授权给该用户的数据
    @NameInMap("authorized_did")
    public String authorizedDid;

    // 当前页面，默认1
    @NameInMap("page_number")
    @Validation(required = true)
    public Long pageNumber;

    // 分页大小，默认20
    @NameInMap("page_size")
    public Long pageSize;

    public static BatchqueryPdcpDataRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryPdcpDataRequest self = new BatchqueryPdcpDataRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryPdcpDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryPdcpDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchqueryPdcpDataRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public BatchqueryPdcpDataRequest setAuthorizerDid(String authorizerDid) {
        this.authorizerDid = authorizerDid;
        return this;
    }
    public String getAuthorizerDid() {
        return this.authorizerDid;
    }

    public BatchqueryPdcpDataRequest setAuthorizedDid(String authorizedDid) {
        this.authorizedDid = authorizedDid;
        return this;
    }
    public String getAuthorizedDid() {
        return this.authorizedDid;
    }

    public BatchqueryPdcpDataRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public BatchqueryPdcpDataRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
