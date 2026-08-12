// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class ApiaAntdigitalTestliuyzpCliCreateRequest extends TeaModel {
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

    public static ApiaAntdigitalTestliuyzpCliCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        ApiaAntdigitalTestliuyzpCliCreateRequest self = new ApiaAntdigitalTestliuyzpCliCreateRequest();
        return TeaModel.build(map, self);
    }

    public ApiaAntdigitalTestliuyzpCliCreateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApiaAntdigitalTestliuyzpCliCreateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApiaAntdigitalTestliuyzpCliCreateRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

    public ApiaAntdigitalTestliuyzpCliCreateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ApiaAntdigitalTestliuyzpCliCreateRequest setAge(Long age) {
        this.age = age;
        return this;
    }
    public Long getAge() {
        return this.age;
    }

}
