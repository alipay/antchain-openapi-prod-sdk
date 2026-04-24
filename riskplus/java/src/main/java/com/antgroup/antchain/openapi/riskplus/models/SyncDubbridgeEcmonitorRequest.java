// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class SyncDubbridgeEcmonitorRequest extends TeaModel {
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

    public static SyncDubbridgeEcmonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncDubbridgeEcmonitorRequest self = new SyncDubbridgeEcmonitorRequest();
        return TeaModel.build(map, self);
    }

    public SyncDubbridgeEcmonitorRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncDubbridgeEcmonitorRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncDubbridgeEcmonitorRequest setBusinessScene(String businessScene) {
        this.businessScene = businessScene;
        return this;
    }
    public String getBusinessScene() {
        return this.businessScene;
    }

    public SyncDubbridgeEcmonitorRequest setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
        return this;
    }
    public String getTransactionNo() {
        return this.transactionNo;
    }

    public SyncDubbridgeEcmonitorRequest setCustList(LoanMonitorCust custList) {
        this.custList = custList;
        return this;
    }
    public LoanMonitorCust getCustList() {
        return this.custList;
    }

}
