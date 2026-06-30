// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubheReceiptOverdueRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合同编号
    @NameInMap("contract_no")
    @Validation(required = true)
    public String contractNo;

    // 渠道号
    @NameInMap("channel_code")
    @Validation(required = true)
    public String channelCode;

    public static QueryDubheReceiptOverdueRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubheReceiptOverdueRequest self = new QueryDubheReceiptOverdueRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubheReceiptOverdueRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubheReceiptOverdueRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubheReceiptOverdueRequest setContractNo(String contractNo) {
        this.contractNo = contractNo;
        return this;
    }
    public String getContractNo() {
        return this.contractNo;
    }

    public QueryDubheReceiptOverdueRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

}
