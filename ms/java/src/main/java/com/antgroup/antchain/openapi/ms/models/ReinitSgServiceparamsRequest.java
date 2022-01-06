// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ReinitSgServiceparamsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // JSON格式，服务提供者信息
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    // 服务id
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static ReinitSgServiceparamsRequest build(java.util.Map<String, ?> map) throws Exception {
        ReinitSgServiceparamsRequest self = new ReinitSgServiceparamsRequest();
        return TeaModel.build(map, self);
    }

    public ReinitSgServiceparamsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReinitSgServiceparamsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ReinitSgServiceparamsRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ReinitSgServiceparamsRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public ReinitSgServiceparamsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
