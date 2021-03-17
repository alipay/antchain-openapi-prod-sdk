// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryContractTradedetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合同id
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    // out_trade_no
    @NameInMap("out_trade_no")
    @Validation(required = true)
    public String outTradeNo;

    public static QueryContractTradedetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryContractTradedetailRequest self = new QueryContractTradedetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryContractTradedetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryContractTradedetailRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryContractTradedetailRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public QueryContractTradedetailRequest setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
        return this;
    }
    public String getOutTradeNo() {
        return this.outTradeNo;
    }

}
