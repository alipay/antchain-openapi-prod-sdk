// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtts.models;

import com.aliyun.tea.*;

public class QueryDacCustodyaddressRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 区块链名称
    @NameInMap("blockchain")
    @Validation(required = true)
    public String blockchain;

    // 外部客户唯一id
    @NameInMap("external_customer_id")
    @Validation(required = true)
    public String externalCustomerId;

    public static QueryDacCustodyaddressRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDacCustodyaddressRequest self = new QueryDacCustodyaddressRequest();
        return TeaModel.build(map, self);
    }

    public QueryDacCustodyaddressRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDacCustodyaddressRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDacCustodyaddressRequest setBlockchain(String blockchain) {
        this.blockchain = blockchain;
        return this;
    }
    public String getBlockchain() {
        return this.blockchain;
    }

    public QueryDacCustodyaddressRequest setExternalCustomerId(String externalCustomerId) {
        this.externalCustomerId = externalCustomerId;
        return this;
    }
    public String getExternalCustomerId() {
        return this.externalCustomerId;
    }

}
