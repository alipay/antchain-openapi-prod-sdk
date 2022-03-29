// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class LoadSofamqConnectorconfigsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据源的类型，代表是来源还是去向，只有两种，对应的值是source 和 sink
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 具体的来源或者去向的类型
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static LoadSofamqConnectorconfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        LoadSofamqConnectorconfigsRequest self = new LoadSofamqConnectorconfigsRequest();
        return TeaModel.build(map, self);
    }

    public LoadSofamqConnectorconfigsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public LoadSofamqConnectorconfigsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public LoadSofamqConnectorconfigsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public LoadSofamqConnectorconfigsRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
