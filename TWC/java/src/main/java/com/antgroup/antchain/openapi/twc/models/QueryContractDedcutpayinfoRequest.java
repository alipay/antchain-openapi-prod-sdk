// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryContractDedcutpayinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 支付宝外部交易号
    @NameInMap("out_order_no")
    @Validation(required = true)
    public String outOrderNo;

    public static QueryContractDedcutpayinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryContractDedcutpayinfoRequest self = new QueryContractDedcutpayinfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryContractDedcutpayinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryContractDedcutpayinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryContractDedcutpayinfoRequest setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
        return this;
    }
    public String getOutOrderNo() {
        return this.outOrderNo;
    }

}
