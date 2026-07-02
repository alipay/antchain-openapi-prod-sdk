// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ListXrXrticketpoolRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 所属业务
    @NameInMap("biz_scene")
    @Validation(required = true)
    public String bizScene;

    public static ListXrXrticketpoolRequest build(java.util.Map<String, ?> map) throws Exception {
        ListXrXrticketpoolRequest self = new ListXrXrticketpoolRequest();
        return TeaModel.build(map, self);
    }

    public ListXrXrticketpoolRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListXrXrticketpoolRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListXrXrticketpoolRequest setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

}
