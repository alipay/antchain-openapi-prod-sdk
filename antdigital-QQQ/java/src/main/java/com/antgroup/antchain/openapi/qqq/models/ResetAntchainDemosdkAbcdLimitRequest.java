// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.qqq.models;

import com.aliyun.tea.*;

public class ResetAntchainDemosdkAbcdLimitRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 超时时间
    @NameInMap("timeout")
    public String timeout;

    // 请求编号
    @NameInMap("count")
    public String count;

    // 请求时间
    @NameInMap("time")
    public String time;

    // 请求描述
    @NameInMap("desc")
    public String desc;

    // 操作者
    @NameInMap("operator")
    public String operator;

    public static ResetAntchainDemosdkAbcdLimitRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetAntchainDemosdkAbcdLimitRequest self = new ResetAntchainDemosdkAbcdLimitRequest();
        return TeaModel.build(map, self);
    }

    public ResetAntchainDemosdkAbcdLimitRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ResetAntchainDemosdkAbcdLimitRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ResetAntchainDemosdkAbcdLimitRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

    public ResetAntchainDemosdkAbcdLimitRequest setCount(String count) {
        this.count = count;
        return this;
    }
    public String getCount() {
        return this.count;
    }

    public ResetAntchainDemosdkAbcdLimitRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public ResetAntchainDemosdkAbcdLimitRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public ResetAntchainDemosdkAbcdLimitRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
