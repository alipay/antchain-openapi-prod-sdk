// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dubhe.models;

import com.aliyun.tea.*;

public class SyncRiskplusDubbridgeEcmonitorRequest extends TeaModel {
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

    // 异常客户明细
    @NameInMap("cust_list")
    @Validation(required = true)
    public LoanMonitorCust custList;

    public static SyncRiskplusDubbridgeEcmonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncRiskplusDubbridgeEcmonitorRequest self = new SyncRiskplusDubbridgeEcmonitorRequest();
        return TeaModel.build(map, self);
    }

    public SyncRiskplusDubbridgeEcmonitorRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncRiskplusDubbridgeEcmonitorRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncRiskplusDubbridgeEcmonitorRequest setBusinessScene(String businessScene) {
        this.businessScene = businessScene;
        return this;
    }
    public String getBusinessScene() {
        return this.businessScene;
    }

    public SyncRiskplusDubbridgeEcmonitorRequest setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
        return this;
    }
    public String getTransactionNo() {
        return this.transactionNo;
    }

    public SyncRiskplusDubbridgeEcmonitorRequest setCustList(LoanMonitorCust custList) {
        this.custList = custList;
        return this;
    }
    public LoanMonitorCust getCustList() {
        return this.custList;
    }

}
