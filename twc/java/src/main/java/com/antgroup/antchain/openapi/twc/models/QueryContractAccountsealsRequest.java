// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryContractAccountsealsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 分页起始位置
    @NameInMap("offset")
    @Validation(required = true)
    public Long offset;

    // 单页数量
    @NameInMap("size")
    @Validation(required = true)
    public Long size;

    public static QueryContractAccountsealsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryContractAccountsealsRequest self = new QueryContractAccountsealsRequest();
        return TeaModel.build(map, self);
    }

    public QueryContractAccountsealsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryContractAccountsealsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryContractAccountsealsRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public QueryContractAccountsealsRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public QueryContractAccountsealsRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
