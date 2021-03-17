// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class GetRcpHqRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 房产链内部银行编号
    @NameInMap("bank_no")
    @Validation(required = true)
    public String bankNo;

    // 房产查询单号
    @NameInMap("hq_order_no")
    @Validation(required = true)
    public String hqOrderNo;

    public static GetRcpHqRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRcpHqRequest self = new GetRcpHqRequest();
        return TeaModel.build(map, self);
    }

    public GetRcpHqRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetRcpHqRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetRcpHqRequest setBankNo(String bankNo) {
        this.bankNo = bankNo;
        return this;
    }
    public String getBankNo() {
        return this.bankNo;
    }

    public GetRcpHqRequest setHqOrderNo(String hqOrderNo) {
        this.hqOrderNo = hqOrderNo;
        return this;
    }
    public String getHqOrderNo() {
        return this.hqOrderNo;
    }

}
