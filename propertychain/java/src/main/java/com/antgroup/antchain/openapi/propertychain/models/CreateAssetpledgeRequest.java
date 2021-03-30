// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class CreateAssetpledgeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 物权id
    @NameInMap("asset_id")
    @Validation(required = true)
    public String assetId;

    // 资金方的id
    @NameInMap("lender_id")
    @Validation(required = true)
    public String lenderId;

    // 申请方的id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 融资协议
    @NameInMap("financial_protocol_id")
    public String financialProtocolId;

    // 质押金额
    @NameInMap("value")
    @Validation(required = true)
    public Long value;

    // 质押时长
    @NameInMap("duration")
    @Validation(required = true)
    public Long duration;

    public static CreateAssetpledgeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAssetpledgeRequest self = new CreateAssetpledgeRequest();
        return TeaModel.build(map, self);
    }

    public CreateAssetpledgeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAssetpledgeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAssetpledgeRequest setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public CreateAssetpledgeRequest setLenderId(String lenderId) {
        this.lenderId = lenderId;
        return this;
    }
    public String getLenderId() {
        return this.lenderId;
    }

    public CreateAssetpledgeRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateAssetpledgeRequest setFinancialProtocolId(String financialProtocolId) {
        this.financialProtocolId = financialProtocolId;
        return this;
    }
    public String getFinancialProtocolId() {
        return this.financialProtocolId;
    }

    public CreateAssetpledgeRequest setValue(Long value) {
        this.value = value;
        return this;
    }
    public Long getValue() {
        return this.value;
    }

    public CreateAssetpledgeRequest setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

}
