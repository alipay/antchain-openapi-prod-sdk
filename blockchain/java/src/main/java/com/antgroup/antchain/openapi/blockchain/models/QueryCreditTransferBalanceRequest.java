// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryCreditTransferBalanceRequest extends TeaModel {
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

    // 需发行信用流转的运费，运费最多精确到小数点后2位
    @NameInMap("freight")
    @Validation(required = true)
    public String freight;

    // 业务发起方分布式数字身
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    public static QueryCreditTransferBalanceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditTransferBalanceRequest self = new QueryCreditTransferBalanceRequest();
        return TeaModel.build(map, self);
    }

    public QueryCreditTransferBalanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCreditTransferBalanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCreditTransferBalanceRequest setConsignorDid(String consignorDid) {
        this.consignorDid = consignorDid;
        return this;
    }
    public String getConsignorDid() {
        return this.consignorDid;
    }

    public QueryCreditTransferBalanceRequest setFreight(String freight) {
        this.freight = freight;
        return this;
    }
    public String getFreight() {
        return this.freight;
    }

    public QueryCreditTransferBalanceRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

}
