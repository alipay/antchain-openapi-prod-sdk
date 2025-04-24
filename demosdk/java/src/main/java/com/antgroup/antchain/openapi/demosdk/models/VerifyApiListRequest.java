// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdk.models;

import com.aliyun.tea.*;

public class VerifyApiListRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 3000
    @NameInMap("timeout")
    @Validation(required = true)
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

    public static VerifyApiListRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyApiListRequest self = new VerifyApiListRequest();
        return TeaModel.build(map, self);
    }

    public VerifyApiListRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyApiListRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyApiListRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

    public VerifyApiListRequest setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public VerifyApiListRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public VerifyApiListRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public VerifyApiListRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
