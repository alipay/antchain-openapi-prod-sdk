// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryCreditTransferApplyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 货主分布式数字身份
    @NameInMap("consignor_did")
    @Validation(required = true)
    public String consignorDid;

    // 业务发起方分布式数字身
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    public static QueryCreditTransferApplyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditTransferApplyRequest self = new QueryCreditTransferApplyRequest();
        return TeaModel.build(map, self);
    }

    public QueryCreditTransferApplyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCreditTransferApplyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCreditTransferApplyRequest setConsignorDid(String consignorDid) {
        this.consignorDid = consignorDid;
        return this;
    }
    public String getConsignorDid() {
        return this.consignorDid;
    }

    public QueryCreditTransferApplyRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

}
