// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class QueryCdsqTireinsuranceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 平台名称
    @NameInMap("partner_code")
    @Validation(required = true)
    public String partnerCode;

    // 交易流水号
    @NameInMap("transaction_no")
    @Validation(required = true)
    public String transactionNo;

    // 场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    public static QueryCdsqTireinsuranceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCdsqTireinsuranceRequest self = new QueryCdsqTireinsuranceRequest();
        return TeaModel.build(map, self);
    }

    public QueryCdsqTireinsuranceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCdsqTireinsuranceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCdsqTireinsuranceRequest setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
        return this;
    }
    public String getPartnerCode() {
        return this.partnerCode;
    }

    public QueryCdsqTireinsuranceRequest setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
        return this;
    }
    public String getTransactionNo() {
        return this.transactionNo;
    }

    public QueryCdsqTireinsuranceRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

}
