// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class GetEcarPlaformauthtokenRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 三方平台的客户ID
    @NameInMap("customer_id")
    public String customerId;

    // 碳账户编号，碳矩阵为客户分配的碳账户编号，跟前面三方平台的客户customer_id必须任意传一个参数，优先使用customer_id查询客户
    @NameInMap("carbon_account_no")
    public String carbonAccountNo;

    public static GetEcarPlaformauthtokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEcarPlaformauthtokenRequest self = new GetEcarPlaformauthtokenRequest();
        return TeaModel.build(map, self);
    }

    public GetEcarPlaformauthtokenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetEcarPlaformauthtokenRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetEcarPlaformauthtokenRequest setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public GetEcarPlaformauthtokenRequest setCarbonAccountNo(String carbonAccountNo) {
        this.carbonAccountNo = carbonAccountNo;
        return this;
    }
    public String getCarbonAccountNo() {
        return this.carbonAccountNo;
    }

}
