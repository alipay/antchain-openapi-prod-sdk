// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class QueryChaininsightAddresshistogramrxRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 地址
    @NameInMap("hex_address")
    @Validation(required = true)
    public String hexAddress;

    // 开始时间戳，毫秒
    @NameInMap("start_time")
    @Validation(required = true)
    public Long startTime;

    // 结束时间戳，毫秒
    @NameInMap("end_time")
    @Validation(required = true)
    public Long endTime;

    public static QueryChaininsightAddresshistogramrxRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryChaininsightAddresshistogramrxRequest self = new QueryChaininsightAddresshistogramrxRequest();
        return TeaModel.build(map, self);
    }

    public QueryChaininsightAddresshistogramrxRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryChaininsightAddresshistogramrxRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryChaininsightAddresshistogramrxRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryChaininsightAddresshistogramrxRequest setHexAddress(String hexAddress) {
        this.hexAddress = hexAddress;
        return this;
    }
    public String getHexAddress() {
        return this.hexAddress;
    }

    public QueryChaininsightAddresshistogramrxRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryChaininsightAddresshistogramrxRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

}
