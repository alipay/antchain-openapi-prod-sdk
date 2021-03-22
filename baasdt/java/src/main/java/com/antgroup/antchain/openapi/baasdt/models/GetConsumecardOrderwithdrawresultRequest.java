// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class GetConsumecardOrderwithdrawresultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequest baseRequest;

    // 提现单编号
    @NameInMap("withdraw_biz_id")
    @Validation(required = true)
    public String withdrawBizId;

    public static GetConsumecardOrderwithdrawresultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConsumecardOrderwithdrawresultRequest self = new GetConsumecardOrderwithdrawresultRequest();
        return TeaModel.build(map, self);
    }

    public GetConsumecardOrderwithdrawresultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetConsumecardOrderwithdrawresultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetConsumecardOrderwithdrawresultRequest setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public GetConsumecardOrderwithdrawresultRequest setWithdrawBizId(String withdrawBizId) {
        this.withdrawBizId = withdrawBizId;
        return this;
    }
    public String getWithdrawBizId() {
        return this.withdrawBizId;
    }

}
