// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class AddStatisticsPortTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链id
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    // 结束块高
    @NameInMap("end")
    @Validation(required = true)
    public Long end;

    // 开始块高
    @NameInMap("start")
    @Validation(required = true)
    public Long start;

    public static AddStatisticsPortTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        AddStatisticsPortTaskRequest self = new AddStatisticsPortTaskRequest();
        return TeaModel.build(map, self);
    }

    public AddStatisticsPortTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddStatisticsPortTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddStatisticsPortTaskRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public AddStatisticsPortTaskRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public AddStatisticsPortTaskRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
