// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class StartTestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // TestApi入参
    @NameInMap("data")
    @Validation(required = true)
    public TestStruct data;

    // 额外字段
    @NameInMap("extra")
    public String extra;

    public static StartTestRequest build(java.util.Map<String, ?> map) throws Exception {
        StartTestRequest self = new StartTestRequest();
        return TeaModel.build(map, self);
    }

    public StartTestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartTestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartTestRequest setData(TestStruct data) {
        this.data = data;
        return this;
    }
    public TestStruct getData() {
        return this.data;
    }

    public StartTestRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

}
