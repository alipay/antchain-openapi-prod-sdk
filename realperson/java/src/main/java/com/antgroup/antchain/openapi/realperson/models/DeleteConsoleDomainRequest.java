// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class DeleteConsoleDomainRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 控制台场景id
    @NameInMap("scene_id")
    @Validation(required = true)
    public String sceneId;

    public static DeleteConsoleDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteConsoleDomainRequest self = new DeleteConsoleDomainRequest();
        return TeaModel.build(map, self);
    }

    public DeleteConsoleDomainRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteConsoleDomainRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteConsoleDomainRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
