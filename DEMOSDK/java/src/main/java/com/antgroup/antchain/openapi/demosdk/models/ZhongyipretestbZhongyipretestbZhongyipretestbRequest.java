// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdk.models;

import com.aliyun.tea.*;

public class ZhongyipretestbZhongyipretestbZhongyipretestbRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 1
    @NameInMap("timeout")
    public String timeout;

    // struct_parama
    @NameInMap("struct_parama")
    public TestParamA structParama;

    public static ZhongyipretestbZhongyipretestbZhongyipretestbRequest build(java.util.Map<String, ?> map) throws Exception {
        ZhongyipretestbZhongyipretestbZhongyipretestbRequest self = new ZhongyipretestbZhongyipretestbZhongyipretestbRequest();
        return TeaModel.build(map, self);
    }

    public ZhongyipretestbZhongyipretestbZhongyipretestbRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ZhongyipretestbZhongyipretestbZhongyipretestbRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ZhongyipretestbZhongyipretestbZhongyipretestbRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

    public ZhongyipretestbZhongyipretestbZhongyipretestbRequest setStructParama(TestParamA structParama) {
        this.structParama = structParama;
        return this;
    }
    public TestParamA getStructParama() {
        return this.structParama;
    }

}
