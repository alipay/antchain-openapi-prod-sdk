// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d3c4f09125a14cd587057c405561809a.models;

import com.aliyun.tea.*;

public class ListAntdigitalWebtrwatradeIssuerProjectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 开始时间 (时间戳)（毫秒）
    @NameInMap("start_time_mills")
    public Long startTimeMills;

    // 结束时间 (时间戳)（毫秒）
    @NameInMap("end_time_mills")
    public Long endTimeMills;

    public static ListAntdigitalWebtrwatradeIssuerProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAntdigitalWebtrwatradeIssuerProjectRequest self = new ListAntdigitalWebtrwatradeIssuerProjectRequest();
        return TeaModel.build(map, self);
    }

    public ListAntdigitalWebtrwatradeIssuerProjectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListAntdigitalWebtrwatradeIssuerProjectRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListAntdigitalWebtrwatradeIssuerProjectRequest setStartTimeMills(Long startTimeMills) {
        this.startTimeMills = startTimeMills;
        return this;
    }
    public Long getStartTimeMills() {
        return this.startTimeMills;
    }

    public ListAntdigitalWebtrwatradeIssuerProjectRequest setEndTimeMills(Long endTimeMills) {
        this.endTimeMills = endTimeMills;
        return this;
    }
    public Long getEndTimeMills() {
        return this.endTimeMills;
    }

}
