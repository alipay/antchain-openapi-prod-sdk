// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class GetRcpMgRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 银行编号
    @NameInMap("bank_no")
    @Validation(required = true)
    public String bankNo;

    // 抵押单号
    @NameInMap("mg_order_no")
    @Validation(required = true)
    public String mgOrderNo;

    public static GetRcpMgRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRcpMgRequest self = new GetRcpMgRequest();
        return TeaModel.build(map, self);
    }

    public GetRcpMgRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetRcpMgRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetRcpMgRequest setBankNo(String bankNo) {
        this.bankNo = bankNo;
        return this;
    }
    public String getBankNo() {
        return this.bankNo;
    }

    public GetRcpMgRequest setMgOrderNo(String mgOrderNo) {
        this.mgOrderNo = mgOrderNo;
        return this;
    }
    public String getMgOrderNo() {
        return this.mgOrderNo;
    }

}
