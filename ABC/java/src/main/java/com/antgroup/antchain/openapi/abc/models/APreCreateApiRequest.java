// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.abc.models;

import com.aliyun.tea.*;

public class APreCreateApiRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求时间
    @NameInMap("time")
    @Validation(required = true)
    public String time;

    // 请求发起人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 请求编号
    @NameInMap("count")
    @Validation(required = true)
    public Long count;

    // 原始信息
    @NameInMap("origin_info")
    @Validation(required = true)
    public String originInfo;

    public static APreCreateApiRequest build(java.util.Map<String, ?> map) throws Exception {
        APreCreateApiRequest self = new APreCreateApiRequest();
        return TeaModel.build(map, self);
    }

    public APreCreateApiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public APreCreateApiRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public APreCreateApiRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public APreCreateApiRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public APreCreateApiRequest setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public APreCreateApiRequest setOriginInfo(String originInfo) {
        this.originInfo = originInfo;
        return this;
    }
    public String getOriginInfo() {
        return this.originInfo;
    }

}
