// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_167e8dce4d72499db8ec84dd3132baa6.models;

import com.aliyun.tea.*;

public class ImportDemoSaasTestTestbRequest extends TeaModel {
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

    public static ImportDemoSaasTestTestbRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportDemoSaasTestTestbRequest self = new ImportDemoSaasTestTestbRequest();
        return TeaModel.build(map, self);
    }

    public ImportDemoSaasTestTestbRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportDemoSaasTestTestbRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportDemoSaasTestTestbRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ImportDemoSaasTestTestbRequest setAge(Long age) {
        this.age = age;
        return this;
    }
    public Long getAge() {
        return this.age;
    }

}
