// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class ImportSaasTestTestbRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 李四
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 18
    @NameInMap("age")
    @Validation(required = true)
    public Long age;

    public static ImportSaasTestTestbRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportSaasTestTestbRequest self = new ImportSaasTestTestbRequest();
        return TeaModel.build(map, self);
    }

    public ImportSaasTestTestbRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportSaasTestTestbRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportSaasTestTestbRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ImportSaasTestTestbRequest setAge(Long age) {
        this.age = age;
        return this;
    }
    public Long getAge() {
        return this.age;
    }

}
