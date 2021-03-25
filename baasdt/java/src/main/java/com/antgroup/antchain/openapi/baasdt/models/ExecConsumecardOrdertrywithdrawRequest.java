// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ExecConsumecardOrdertrywithdrawRequest extends TeaModel {
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
    public Long endBlockNumber;

    // 需要提现的订单Id列表(不要超过100个Id)
    @NameInMap("order_id_list")
    public java.util.List<String> orderIdList;

    // 需要提现的订单分布的区块起始高度
    @NameInMap("start_block_number")
    public Long startBlockNumber;

    public static ExecConsumecardOrdertrywithdrawRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecConsumecardOrdertrywithdrawRequest self = new ExecConsumecardOrdertrywithdrawRequest();
        return TeaModel.build(map, self);
    }

    public ExecConsumecardOrdertrywithdrawRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecConsumecardOrdertrywithdrawRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecConsumecardOrdertrywithdrawRequest setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public ExecConsumecardOrdertrywithdrawRequest setEndBlockNumber(Long endBlockNumber) {
        this.endBlockNumber = endBlockNumber;
        return this;
    }
    public Long getEndBlockNumber() {
        return this.endBlockNumber;
    }

    public ExecConsumecardOrdertrywithdrawRequest setOrderIdList(java.util.List<String> orderIdList) {
        this.orderIdList = orderIdList;
        return this;
    }
    public java.util.List<String> getOrderIdList() {
        return this.orderIdList;
    }

    public ExecConsumecardOrdertrywithdrawRequest setStartBlockNumber(Long startBlockNumber) {
        this.startBlockNumber = startBlockNumber;
        return this;
    }
    public Long getStartBlockNumber() {
        return this.startBlockNumber;
    }

}
