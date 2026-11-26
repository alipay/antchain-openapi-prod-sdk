// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class ListBlockchainBotIotagentModelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 可选能力位过滤（如 TEXT）；缺省返回全部启用模型，非法值 PARAM_INVALID 拒绝
    @NameInMap("capability")
    public String capability;

    public static ListBlockchainBotIotagentModelRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBlockchainBotIotagentModelRequest self = new ListBlockchainBotIotagentModelRequest();
        return TeaModel.build(map, self);
    }

    public ListBlockchainBotIotagentModelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListBlockchainBotIotagentModelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListBlockchainBotIotagentModelRequest setCapability(String capability) {
        this.capability = capability;
        return this;
    }
    public String getCapability() {
        return this.capability;
    }

}
