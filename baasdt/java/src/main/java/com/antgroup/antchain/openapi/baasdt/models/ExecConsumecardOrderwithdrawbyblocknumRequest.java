// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ExecConsumecardOrderwithdrawbyblocknumRequest extends TeaModel {
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

    // 需要提现的订单分布的区块结束高度
    @NameInMap("end_block_number")
    @Validation(required = true)
    public Long endBlockNumber;

    // 需要提现的订单分布的区块起始高度
    @NameInMap("start_block_number")
    @Validation(required = true)
    public Long startBlockNumber;

    public static ExecConsumecardOrderwithdrawbyblocknumRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecConsumecardOrderwithdrawbyblocknumRequest self = new ExecConsumecardOrderwithdrawbyblocknumRequest();
        return TeaModel.build(map, self);
    }

    public ExecConsumecardOrderwithdrawbyblocknumRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecConsumecardOrderwithdrawbyblocknumRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecConsumecardOrderwithdrawbyblocknumRequest setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public ExecConsumecardOrderwithdrawbyblocknumRequest setEndBlockNumber(Long endBlockNumber) {
        this.endBlockNumber = endBlockNumber;
        return this;
    }
    public Long getEndBlockNumber() {
        return this.endBlockNumber;
    }

    public ExecConsumecardOrderwithdrawbyblocknumRequest setStartBlockNumber(Long startBlockNumber) {
        this.startBlockNumber = startBlockNumber;
        return this;
    }
    public Long getStartBlockNumber() {
        return this.startBlockNumber;
    }

}
