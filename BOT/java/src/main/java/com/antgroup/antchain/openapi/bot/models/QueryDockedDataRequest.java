// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryDockedDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 1. 已对接的接口名 ; 
    // 2. docked_method可通过 实例化SDK中的Request模型后获取，例如：
    // String dockedMethod = new CreateDeviceDatamodelRequest().getMethod();
    @NameInMap("docked_method")
    @Validation(required = true)
    public String dockedMethod;

    // 关键key为chainDeviceId 时不填
    @NameInMap("scene")
    public String scene;

    // 1. 接口中的关键key ，例如 deviceId ；
    // 2. key为chainDeviceId时，scene字段不填
    // 
    @NameInMap("key")
    public java.util.List<String> key;

    public static QueryDockedDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDockedDataRequest self = new QueryDockedDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryDockedDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDockedDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDockedDataRequest setDockedMethod(String dockedMethod) {
        this.dockedMethod = dockedMethod;
        return this;
    }
    public String getDockedMethod() {
        return this.dockedMethod;
    }

    public QueryDockedDataRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public QueryDockedDataRequest setKey(java.util.List<String> key) {
        this.key = key;
        return this;
    }
    public java.util.List<String> getKey() {
        return this.key;
    }

}
