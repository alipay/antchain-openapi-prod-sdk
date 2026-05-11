// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yfptspu.models;

import com.aliyun.tea.*;

public class VerifyAntchainDemosdkApiListRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 3000
    @NameInMap("timeout")
    public String timeout;

    // 请求编号
    @NameInMap("count")
    public Long count;

    // 请求时间
    @NameInMap("time")
    public String time;

    // 请求描述
    @NameInMap("desc")
    public String desc;

    // 操作人
    @NameInMap("operator")
    public String operator;

    public static VerifyAntchainDemosdkApiListRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyAntchainDemosdkApiListRequest self = new VerifyAntchainDemosdkApiListRequest();
        return TeaModel.build(map, self);
    }

    public VerifyAntchainDemosdkApiListRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyAntchainDemosdkApiListRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyAntchainDemosdkApiListRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

    public VerifyAntchainDemosdkApiListRequest setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public VerifyAntchainDemosdkApiListRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public VerifyAntchainDemosdkApiListRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public VerifyAntchainDemosdkApiListRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
