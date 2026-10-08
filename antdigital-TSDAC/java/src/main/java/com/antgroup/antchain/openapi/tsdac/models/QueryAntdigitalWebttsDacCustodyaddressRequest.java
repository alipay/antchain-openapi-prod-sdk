// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class QueryAntdigitalWebttsDacCustodyaddressRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 区块链名称
    @NameInMap("blockchain")
    public String blockchain;

    // 企业CIF ID
    @NameInMap("cif_id")
    @Validation(required = true)
    public String cifId;

    // 操作人Operator ID
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    // 页码，默认1
    @NameInMap("page_num")
    public Long pageNum;

    // 每页条数，默认20，最大100
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryAntdigitalWebttsDacCustodyaddressRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntdigitalWebttsDacCustodyaddressRequest self = new QueryAntdigitalWebttsDacCustodyaddressRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntdigitalWebttsDacCustodyaddressRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntdigitalWebttsDacCustodyaddressRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntdigitalWebttsDacCustodyaddressRequest setBlockchain(String blockchain) {
        this.blockchain = blockchain;
        return this;
    }
    public String getBlockchain() {
        return this.blockchain;
    }

    public QueryAntdigitalWebttsDacCustodyaddressRequest setCifId(String cifId) {
        this.cifId = cifId;
        return this;
    }
    public String getCifId() {
        return this.cifId;
    }

    public QueryAntdigitalWebttsDacCustodyaddressRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public QueryAntdigitalWebttsDacCustodyaddressRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryAntdigitalWebttsDacCustodyaddressRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
