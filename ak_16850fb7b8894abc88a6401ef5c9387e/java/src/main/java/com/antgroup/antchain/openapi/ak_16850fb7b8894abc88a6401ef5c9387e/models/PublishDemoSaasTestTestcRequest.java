// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_16850fb7b8894abc88a6401ef5c9387e.models;

import com.aliyun.tea.*;

public class PublishDemoSaasTestTestcRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 张三
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 14
    @NameInMap("age")
    @Validation(required = true)
    public Long age;

    public static PublishDemoSaasTestTestcRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishDemoSaasTestTestcRequest self = new PublishDemoSaasTestTestcRequest();
        return TeaModel.build(map, self);
    }

    public PublishDemoSaasTestTestcRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PublishDemoSaasTestTestcRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PublishDemoSaasTestTestcRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PublishDemoSaasTestTestcRequest setAge(Long age) {
        this.age = age;
        return this;
    }
    public Long getAge() {
        return this.age;
    }

}
