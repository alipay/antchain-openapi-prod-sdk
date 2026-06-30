// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeEccreditQuotaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 交易流水号，自行设定规则生成
    @NameInMap("transaction_no")
    @Validation(required = true)
    public String transactionNo;

    // 业务场景
    @NameInMap("business_scene")
    @Validation(required = true)
    public String businessScene;

    // 合同编号
    @NameInMap("contract_no")
    @Validation(required = true)
    public String contractNo;

    public static QueryDubbridgeEccreditQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeEccreditQuotaRequest self = new QueryDubbridgeEccreditQuotaRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeEccreditQuotaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeEccreditQuotaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeEccreditQuotaRequest setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
        return this;
    }
    public String getTransactionNo() {
        return this.transactionNo;
    }

    public QueryDubbridgeEccreditQuotaRequest setBusinessScene(String businessScene) {
        this.businessScene = businessScene;
        return this;
    }
    public String getBusinessScene() {
        return this.businessScene;
    }

    public QueryDubbridgeEccreditQuotaRequest setContractNo(String contractNo) {
        this.contractNo = contractNo;
        return this;
    }
    public String getContractNo() {
        return this.contractNo;
    }

}
