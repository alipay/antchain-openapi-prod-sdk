// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryChainDataexportTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链id
    @NameInMap("ant_chain_id")
    @Validation(required = true)
    public String antChainId;

    // 联盟id
    @NameInMap("consortium_id")
    @Validation(required = true)
    public String consortiumId;

    public static QueryChainDataexportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryChainDataexportTaskRequest self = new QueryChainDataexportTaskRequest();
        return TeaModel.build(map, self);
    }

    public QueryChainDataexportTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryChainDataexportTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryChainDataexportTaskRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public QueryChainDataexportTaskRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

}
