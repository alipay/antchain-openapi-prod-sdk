// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp.models;

import com.aliyun.tea.*;

public class ExecContractReconciliationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 供应商
    @NameInMap("sup_code")
    @Validation(required = true)
    public String supCode;

    // 结算时间
    @NameInMap("score_date")
    @Validation(required = true)
    public String scoreDate;

    public static ExecContractReconciliationRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecContractReconciliationRequest self = new ExecContractReconciliationRequest();
        return TeaModel.build(map, self);
    }

    public ExecContractReconciliationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecContractReconciliationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecContractReconciliationRequest setSupCode(String supCode) {
        this.supCode = supCode;
        return this;
    }
    public String getSupCode() {
        return this.supCode;
    }

    public ExecContractReconciliationRequest setScoreDate(String scoreDate) {
        this.scoreDate = scoreDate;
        return this;
    }
    public String getScoreDate() {
        return this.scoreDate;
    }

}
