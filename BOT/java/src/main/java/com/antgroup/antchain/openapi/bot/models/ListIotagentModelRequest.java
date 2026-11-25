// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ListIotagentModelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 可选能力位过滤（如 TEXT）；缺省返回全部启用模型，非法值 PARAM_INVALID 拒绝
    @NameInMap("capability")
    public String capability;

    public static ListIotagentModelRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIotagentModelRequest self = new ListIotagentModelRequest();
        return TeaModel.build(map, self);
    }

    public ListIotagentModelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListIotagentModelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListIotagentModelRequest setCapability(String capability) {
        this.capability = capability;
        return this;
    }
    public String getCapability() {
        return this.capability;
    }

}
