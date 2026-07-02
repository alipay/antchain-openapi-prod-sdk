// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CancelFundFlowRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 签署合同单号
    @NameInMap("sign_no")
    @Validation(required = true)
    public String signNo;

    // 资方统一社会信用代码
    @NameInMap("fund_id")
    @Validation(required = true)
    public String fundId;

    // 撤销原因
    @NameInMap("revoke_reason")
    public String revokeReason;

    public static CancelFundFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelFundFlowRequest self = new CancelFundFlowRequest();
        return TeaModel.build(map, self);
    }

    public CancelFundFlowRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelFundFlowRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelFundFlowRequest setSignNo(String signNo) {
        this.signNo = signNo;
        return this;
    }
    public String getSignNo() {
        return this.signNo;
    }

    public CancelFundFlowRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public CancelFundFlowRequest setRevokeReason(String revokeReason) {
        this.revokeReason = revokeReason;
        return this;
    }
    public String getRevokeReason() {
        return this.revokeReason;
    }

}
