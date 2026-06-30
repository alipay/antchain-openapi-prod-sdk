// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class DetailDubbridgeEcloanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务场景
    @NameInMap("business_scene")
    @Validation(required = true)
    public String businessScene;

    // 交易流水号
    @NameInMap("transaction_no")
    @Validation(required = true)
    public String transactionNo;

    // 合同号
    @NameInMap("contract_no")
    @Validation(required = true)
    public String contractNo;

    // 借据号
    @NameInMap("loan_no")
    public String loanNo;

    public static DetailDubbridgeEcloanRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailDubbridgeEcloanRequest self = new DetailDubbridgeEcloanRequest();
        return TeaModel.build(map, self);
    }

    public DetailDubbridgeEcloanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DetailDubbridgeEcloanRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DetailDubbridgeEcloanRequest setBusinessScene(String businessScene) {
        this.businessScene = businessScene;
        return this;
    }
    public String getBusinessScene() {
        return this.businessScene;
    }

    public DetailDubbridgeEcloanRequest setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
        return this;
    }
    public String getTransactionNo() {
        return this.transactionNo;
    }

    public DetailDubbridgeEcloanRequest setContractNo(String contractNo) {
        this.contractNo = contractNo;
        return this;
    }
    public String getContractNo() {
        return this.contractNo;
    }

    public DetailDubbridgeEcloanRequest setLoanNo(String loanNo) {
        this.loanNo = loanNo;
        return this;
    }
    public String getLoanNo() {
        return this.loanNo;
    }

}
