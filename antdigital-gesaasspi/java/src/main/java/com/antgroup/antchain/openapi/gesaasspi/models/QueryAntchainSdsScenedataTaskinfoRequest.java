// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaasspi.models;

import com.aliyun.tea.*;

public class QueryAntchainSdsScenedataTaskinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 批次号
    @NameInMap("batch_no")
    @Validation(required = true)
    public String batchNo;

    public static QueryAntchainSdsScenedataTaskinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainSdsScenedataTaskinfoRequest self = new QueryAntchainSdsScenedataTaskinfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainSdsScenedataTaskinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainSdsScenedataTaskinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainSdsScenedataTaskinfoRequest setBatchNo(String batchNo) {
        this.batchNo = batchNo;
        return this;
    }
    public String getBatchNo() {
        return this.batchNo;
    }

}
