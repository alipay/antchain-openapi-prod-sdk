// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeReceiptOverdueRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合同编码
    @NameInMap("contract_no")
    @Validation(required = true)
    public String contractNo;

    // 渠道编码
    @NameInMap("channel_code")
    @Validation(required = true)
    public String channelCode;

    public static QueryDubbridgeReceiptOverdueRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeReceiptOverdueRequest self = new QueryDubbridgeReceiptOverdueRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeReceiptOverdueRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeReceiptOverdueRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeReceiptOverdueRequest setContractNo(String contractNo) {
        this.contractNo = contractNo;
        return this;
    }
    public String getContractNo() {
        return this.contractNo;
    }

    public QueryDubbridgeReceiptOverdueRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

}
