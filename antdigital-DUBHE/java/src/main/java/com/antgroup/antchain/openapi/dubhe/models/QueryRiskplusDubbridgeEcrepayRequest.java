// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dubhe.models;

import com.aliyun.tea.*;

public class QueryRiskplusDubbridgeEcrepayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务场景
    @NameInMap("business_scene")
    @Validation(required = true)
    public String businessScene;

    // 交易流水号 UUID
    @NameInMap("transaction_no")
    @Validation(required = true)
    public String transactionNo;

    // 客户ID
    @NameInMap("user_id")
    public String userId;

    // 合同编号
    @NameInMap("contract_no")
    @Validation(required = true)
    public String contractNo;

    // 借据号
    @NameInMap("loan_no")
    public String loanNo;

    // 币种
    @NameInMap("currency")
    @Validation(required = true)
    public String currency;

    // 查询开始时间 yyyy/MM/dd,不传时查询借据下所有还款记录
    @NameInMap("startdate")
    public String startdate;

    // 查询截至时间 yyyy/MM/dd,不传时查询借据下所有还款记录
    @NameInMap("enddate")
    public String enddate;

    public static QueryRiskplusDubbridgeEcrepayRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRiskplusDubbridgeEcrepayRequest self = new QueryRiskplusDubbridgeEcrepayRequest();
        return TeaModel.build(map, self);
    }

    public QueryRiskplusDubbridgeEcrepayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRiskplusDubbridgeEcrepayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRiskplusDubbridgeEcrepayRequest setBusinessScene(String businessScene) {
        this.businessScene = businessScene;
        return this;
    }
    public String getBusinessScene() {
        return this.businessScene;
    }

    public QueryRiskplusDubbridgeEcrepayRequest setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
        return this;
    }
    public String getTransactionNo() {
        return this.transactionNo;
    }

    public QueryRiskplusDubbridgeEcrepayRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryRiskplusDubbridgeEcrepayRequest setContractNo(String contractNo) {
        this.contractNo = contractNo;
        return this;
    }
    public String getContractNo() {
        return this.contractNo;
    }

    public QueryRiskplusDubbridgeEcrepayRequest setLoanNo(String loanNo) {
        this.loanNo = loanNo;
        return this;
    }
    public String getLoanNo() {
        return this.loanNo;
    }

    public QueryRiskplusDubbridgeEcrepayRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public QueryRiskplusDubbridgeEcrepayRequest setStartdate(String startdate) {
        this.startdate = startdate;
        return this;
    }
    public String getStartdate() {
        return this.startdate;
    }

    public QueryRiskplusDubbridgeEcrepayRequest setEnddate(String enddate) {
        this.enddate = enddate;
        return this;
    }
    public String getEnddate() {
        return this.enddate;
    }

}
