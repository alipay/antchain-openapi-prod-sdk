// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cliproduct.models;

import com.aliyun.tea.*;

public class ApioCliCreateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 超时时间
    @NameInMap("timeout")
    @Validation(required = true)
    public String timeout;

    // 姓名
    @NameInMap("name")
    public String name;

    // 年龄
    @NameInMap("age")
    public Long age;

    public static ApioCliCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        ApioCliCreateRequest self = new ApioCliCreateRequest();
        return TeaModel.build(map, self);
    }

    public ApioCliCreateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApioCliCreateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApioCliCreateRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

    public ApioCliCreateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ApioCliCreateRequest setAge(Long age) {
        this.age = age;
        return this;
    }
    public Long getAge() {
        return this.age;
    }

}
