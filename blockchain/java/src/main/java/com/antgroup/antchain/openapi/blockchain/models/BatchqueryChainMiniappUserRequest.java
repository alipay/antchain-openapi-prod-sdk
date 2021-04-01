// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class BatchqueryChainMiniappUserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // ant_chain_id
    @NameInMap("ant_chain_id")
    @Validation(required = true)
    public String antChainId;

    // page_number
    @NameInMap("page_number")
    @Validation(required = true)
    public Long pageNumber;

    // page_size
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // q_r_code_type
    @NameInMap("q_r_code_type")
    @Validation(required = true)
    public String qRCodeType;

    public static BatchqueryChainMiniappUserRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryChainMiniappUserRequest self = new BatchqueryChainMiniappUserRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryChainMiniappUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryChainMiniappUserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchqueryChainMiniappUserRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public BatchqueryChainMiniappUserRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public BatchqueryChainMiniappUserRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public BatchqueryChainMiniappUserRequest setQRCodeType(String qRCodeType) {
        this.qRCodeType = qRCodeType;
        return this;
    }
    public String getQRCodeType() {
        return this.qRCodeType;
    }

}
