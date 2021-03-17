// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class GetRcpMgrRequest extends TeaModel {
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

    // 房产链解抵押单号
    @NameInMap("mg_release_order_no")
    @Validation(required = true)
    public String mgReleaseOrderNo;

    public static GetRcpMgrRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRcpMgrRequest self = new GetRcpMgrRequest();
        return TeaModel.build(map, self);
    }

    public GetRcpMgrRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetRcpMgrRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetRcpMgrRequest setBankNo(String bankNo) {
        this.bankNo = bankNo;
        return this;
    }
    public String getBankNo() {
        return this.bankNo;
    }

    public GetRcpMgrRequest setMgReleaseOrderNo(String mgReleaseOrderNo) {
        this.mgReleaseOrderNo = mgReleaseOrderNo;
        return this;
    }
    public String getMgReleaseOrderNo() {
        return this.mgReleaseOrderNo;
    }

}
